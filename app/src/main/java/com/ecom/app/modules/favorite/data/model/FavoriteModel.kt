package com.ecom.app.modules.favorite.`data`.model

import com.ecom.app.R
import com.ecom.app.appcomponents.di.MyApp
import kotlin.String

data class FavoriteModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFavorite: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCoupon: String? = MyApp.getInstance().resources.getString(R.string.lbl_coupon)

)
