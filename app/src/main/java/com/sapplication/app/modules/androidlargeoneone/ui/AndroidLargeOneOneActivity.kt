package com.sapplication.app.modules.androidlargeoneone.ui

import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityAndroidLargeOneOneBinding
import com.sapplication.app.modules.androidlargeoneone.`data`.viewmodel.AndroidLargeOneOneVM
import kotlin.String
import kotlin.Unit

class AndroidLargeOneOneActivity :
    BaseActivity<ActivityAndroidLargeOneOneBinding>(R.layout.activity_android_large_one_one) {
  private val viewModel: AndroidLargeOneOneVM by viewModels<AndroidLargeOneOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeOneOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_ONE_ONE_ACTIVITY"

  }
}
