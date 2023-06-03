package com.ecom.app.modules.shop.`data`.model

import com.ecom.app.R
import com.ecom.app.appcomponents.di.MyApp
import kotlin.String

data class ShopModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShop: String? = MyApp.getInstance().resources.getString(R.string.lbl_shop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHollywoodHairstyles: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hollywood_hairs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSurgeShort: String? = MyApp.getInstance().resources.getString(R.string.lbl_surge_short)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_68_usd2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_sweat_jogger_fr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_68_usd2)

)
