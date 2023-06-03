package com.ecom.app.modules.menu.ui

import androidx.activity.viewModels
import com.ecom.app.R
import com.ecom.app.appcomponents.base.BaseActivity
import com.ecom.app.databinding.ActivityMenuBinding
import com.ecom.app.modules.discover.ui.DiscoverActivity
import com.ecom.app.modules.favorite.ui.FavoriteActivity
import com.ecom.app.modules.menu.`data`.viewmodel.MenuVM
import com.ecom.app.modules.shop.ui.ShopActivity
import kotlin.String
import kotlin.Unit

class MenuActivity : BaseActivity<ActivityMenuBinding>(R.layout.activity_menu) {
  private val viewModel: MenuVM by viewModels<MenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtDiscover.setOnClickListener {
      val destIntent = DiscoverActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtFavorites.setOnClickListener {
      val destIntent = FavoriteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtShop.setOnClickListener {
      val destIntent = ShopActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MENU_ACTIVITY"

  }
}
