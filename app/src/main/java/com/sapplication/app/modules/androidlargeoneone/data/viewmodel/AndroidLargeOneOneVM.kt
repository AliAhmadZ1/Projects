package com.sapplication.app.modules.androidlargeoneone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.androidlargeoneone.`data`.model.AndroidLargeOneOneModel
import org.koin.core.KoinComponent

class AndroidLargeOneOneVM : ViewModel(), KoinComponent {
  val androidLargeOneOneModel: MutableLiveData<AndroidLargeOneOneModel> =
      MutableLiveData(AndroidLargeOneOneModel())

  var navArguments: Bundle? = null
}
