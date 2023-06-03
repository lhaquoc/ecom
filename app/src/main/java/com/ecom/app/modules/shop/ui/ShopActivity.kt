package com.ecom.app.modules.shop.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ecom.app.R
import com.ecom.app.appcomponents.base.BaseActivity
import com.ecom.app.databinding.ActivityShopBinding
import com.ecom.app.modules.shop.`data`.viewmodel.ShopVM
import kotlin.String
import kotlin.Unit

class ShopActivity : BaseActivity<ActivityShopBinding>(R.layout.activity_shop) {
  private val viewModel: ShopVM by viewModels<ShopVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.shopVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SHOP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShopActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
