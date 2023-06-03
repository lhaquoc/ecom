package com.ecom.app.modules.myorder.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ecom.app.R
import com.ecom.app.appcomponents.base.BaseActivity
import com.ecom.app.databinding.ActivityMyOrderBinding
import com.ecom.app.modules.myorder.`data`.model.MyorderRowModel
import com.ecom.app.modules.myorder.`data`.viewmodel.MyOrderVM
import com.ecom.app.modules.payment.ui.PaymentActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyOrderActivity : BaseActivity<ActivityMyOrderBinding>(R.layout.activity_my_order) {
  private val viewModel: MyOrderVM by viewModels<MyOrderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val myorderAdapter = MyorderAdapter(viewModel.myorderList.value?:mutableListOf())
    binding.recyclerMyorder.adapter = myorderAdapter
    myorderAdapter.setOnItemClickListener(
    object : MyorderAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MyorderRowModel) {
        onClickRecyclerMyorder(view, position, item)
      }
    }
    )
    viewModel.myorderList.observe(this) {
      myorderAdapter.updateData(it)
    }
    binding.myOrderVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumncheckout.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerMyorder(
    view: View,
    position: Int,
    item: MyorderRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_ORDER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyOrderActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
