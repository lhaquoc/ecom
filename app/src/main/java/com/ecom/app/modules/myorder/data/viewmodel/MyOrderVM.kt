package com.ecom.app.modules.myorder.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ecom.app.modules.myorder.`data`.model.MyOrderModel
import com.ecom.app.modules.myorder.`data`.model.MyorderRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyOrderVM : ViewModel(), KoinComponent {
  val myOrderModel: MutableLiveData<MyOrderModel> = MutableLiveData(MyOrderModel())

  var navArguments: Bundle? = null

  val myorderList: MutableLiveData<MutableList<MyorderRowModel>> = MutableLiveData(mutableListOf())
}
