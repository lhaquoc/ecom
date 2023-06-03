package com.ecom.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ecom.app.R
import com.ecom.app.appcomponents.base.BaseActivity
import com.ecom.app.databinding.ActivityHomeBinding
import com.ecom.app.modules.home.`data`.viewmodel.HomeVM
import com.ecom.app.modules.product.ui.ProductActivity
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnbestsellers.setOnClickListener {
      val destIntent = ProductActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
