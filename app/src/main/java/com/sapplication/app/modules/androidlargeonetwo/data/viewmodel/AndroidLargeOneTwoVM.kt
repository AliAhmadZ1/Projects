package com.sapplication.app.modules.androidlargeonetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.androidlargeonetwo.`data`.model.AndroidLargeOneTwoModel
import org.koin.core.KoinComponent

class AndroidLargeOneTwoVM : ViewModel(), KoinComponent {
  val androidLargeOneTwoModel: MutableLiveData<AndroidLargeOneTwoModel> =
      MutableLiveData(AndroidLargeOneTwoModel())

  var navArguments: Bundle? = null
}
