package com.ecom.app.modules.product.`data`.model

import com.ecom.app.R
import com.ecom.app.appcomponents.di.MyApp
import kotlin.String

data class ProductModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBoyfriendTee: String? = MyApp.getInstance().resources.getString(R.string.lbl_boyfriend_tee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_xl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddtocart: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart)

)
