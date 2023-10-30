package com.sapplication.app.modules.androidlargethree.ui

import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityAndroidLargeThreeBinding
import com.sapplication.app.modules.androidlargethree.`data`.viewmodel.AndroidLargeThreeVM
import com.sapplication.app.modules.androidlargetwo.ui.AndroidLargeTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeThreeActivity :
    BaseActivity<ActivityAndroidLargeThreeBinding>(R.layout.activity_android_large_three) {
  private val viewModel: AndroidLargeThreeVM by viewModels<AndroidLargeThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowtwo.setOnClickListener {
      val destIntent = AndroidLargeTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_THREE_ACTIVITY"

  }
}
