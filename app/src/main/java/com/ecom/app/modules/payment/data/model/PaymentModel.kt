package com.ecom.app.modules.payment.`data`.model

import com.ecom.app.R
import com.ecom.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyCards: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_cards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_0112)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentoption: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_option)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)

)
