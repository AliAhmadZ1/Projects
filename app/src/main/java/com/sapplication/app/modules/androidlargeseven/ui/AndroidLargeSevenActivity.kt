package com.sapplication.app.modules.androidlargeseven.ui

import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityAndroidLargeSevenBinding
import com.sapplication.app.modules.androidlargeone.ui.AndroidLargeOneActivity
import com.sapplication.app.modules.androidlargeseven.`data`.viewmodel.AndroidLargeSevenVM
import kotlin.String
import kotlin.Unit

class AndroidLargeSevenActivity :
    BaseActivity<ActivityAndroidLargeSevenBinding>(R.layout.activity_android_large_seven) {
  private val viewModel: AndroidLargeSevenVM by viewModels<AndroidLargeSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowone.setOnClickListener {
      val destIntent = AndroidLargeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_SEVEN_ACTIVITY"

  }
}
