package com.ecom.app.modules.discover.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ecom.app.R
import com.ecom.app.appcomponents.base.BaseActivity
import com.ecom.app.databinding.ActivityDiscoverBinding
import com.ecom.app.modules.discover.`data`.viewmodel.DiscoverVM
import com.ecom.app.modules.home.ui.HomeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DiscoverActivity : BaseActivity<ActivityDiscoverBinding>(R.layout.activity_discover) {
  private val viewModel: DiscoverVM by viewModels<DiscoverVM>()

  private val REQUEST_CODE_HOME_ACTIVITY: Int = 189


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.discoverVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "DISCOVER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DiscoverActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
