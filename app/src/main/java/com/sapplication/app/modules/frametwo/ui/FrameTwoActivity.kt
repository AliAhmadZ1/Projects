package com.sapplication.app.modules.frametwo.ui

import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityFrameTwoBinding
import com.sapplication.app.modules.framefour.ui.FrameFourActivity
import com.sapplication.app.modules.frametwo.`data`.viewmodel.FrameTwoVM
import kotlin.String
import kotlin.Unit

class FrameTwoActivity : BaseActivity<ActivityFrameTwoBinding>(R.layout.activity_frame_two) {
  private val viewModel: FrameTwoVM by viewModels<FrameTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowone.setOnClickListener {
      val destIntent = FrameFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_TWO_ACTIVITY"

  }
}
