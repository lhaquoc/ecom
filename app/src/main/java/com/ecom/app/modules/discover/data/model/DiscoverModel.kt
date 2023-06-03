package com.ecom.app.modules.discover.`data`.model

import com.ecom.app.R
import com.ecom.app.appcomponents.di.MyApp
import kotlin.String

data class DiscoverModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscover: String? = MyApp.getInstance().resources.getString(R.string.lbl_discover)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscoveryourproduc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_discover_your_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShirtSleeve: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt_sleeve)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSweaterLongSleeve: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sweater_long_sl)

)
