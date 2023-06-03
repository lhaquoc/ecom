package com.ecom.app.modules.product.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ecom.app.modules.product.`data`.model.ProductModel
import com.ecom.app.modules.product.`data`.model.ProductRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProductVM : ViewModel(), KoinComponent {
  val productModel: MutableLiveData<ProductModel> = MutableLiveData(ProductModel())

  var navArguments: Bundle? = null

  val productList: MutableLiveData<MutableList<ProductRowModel>> = MutableLiveData(mutableListOf())
}
