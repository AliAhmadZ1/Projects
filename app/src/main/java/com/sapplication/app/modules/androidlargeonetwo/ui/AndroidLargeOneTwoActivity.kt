package com.sapplication.app.modules.androidlargeonetwo.ui

import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityAndroidLargeOneTwoBinding
import com.sapplication.app.modules.androidlargeonetwo.`data`.viewmodel.AndroidLargeOneTwoVM
import kotlin.String
import kotlin.Unit

class AndroidLargeOneTwoActivity :
    BaseActivity<ActivityAndroidLargeOneTwoBinding>(R.layout.activity_android_large_one_two) {
  private val viewModel: AndroidLargeOneTwoVM by viewModels<AndroidLargeOneTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeOneTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_ONE_TWO_ACTIVITY"

  }
}
