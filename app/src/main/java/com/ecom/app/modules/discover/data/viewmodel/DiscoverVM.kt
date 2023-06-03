package com.ecom.app.modules.discover.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ecom.app.modules.discover.`data`.model.DiscoverModel
import org.koin.core.KoinComponent

class DiscoverVM : ViewModel(), KoinComponent {
  val discoverModel: MutableLiveData<DiscoverModel> = MutableLiveData(DiscoverModel())

  var navArguments: Bundle? = null
}
