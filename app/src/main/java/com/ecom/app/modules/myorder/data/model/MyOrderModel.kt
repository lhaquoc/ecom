package com.ecom.app.modules.myorder.`data`.model

import com.ecom.app.R
import com.ecom.app.appcomponents.di.MyApp
import kotlin.String

data class MyOrderModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyorder: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckout: String? = MyApp.getInstance().resources.getString(R.string.lbl_checkout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_116)

)
