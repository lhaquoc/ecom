package com.ecom.app.modules.home.`data`.model

import com.ecom.app.R
import com.ecom.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetStyle: String? = MyApp.getInstance().resources.getString(R.string.lbl_street_style)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBIGSEASONALSALEOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_big_seasonal_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSAVEUPTO: String? = MyApp.getInstance().resources.getString(R.string.lbl_save_up_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBestSellers: String? = MyApp.getInstance().resources.getString(R.string.lbl_bestsellers2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFuelyourworkoutOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fuel_your_worko)

)
