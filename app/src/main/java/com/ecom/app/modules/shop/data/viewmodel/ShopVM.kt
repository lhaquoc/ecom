package com.ecom.app.modules.shop.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ecom.app.modules.shop.`data`.model.ShopModel
import org.koin.core.KoinComponent

class ShopVM : ViewModel(), KoinComponent {
  val shopModel: MutableLiveData<ShopModel> = MutableLiveData(ShopModel())

  var navArguments: Bundle? = null
}
