package com.ecom.app.modules.favorite.`data`.model

import com.ecom.app.R
import com.ecom.app.appcomponents.di.MyApp
import kotlin.String

data class FavoriteRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtType: String? = MyApp.getInstance().resources.getString(R.string.lbl_box_tee)

)
