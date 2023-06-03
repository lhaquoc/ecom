package com.ecom.app.modules.myorder.`data`.model

import com.ecom.app.R
import com.ecom.app.appcomponents.di.MyApp
import kotlin.String

data class MyorderRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVERTLUNEBoyfriend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vertlune_boyfri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYellowsizeCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_yellow_size_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_58)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1x: String? = MyApp.getInstance().resources.getString(R.string.lbl_1x)

)
