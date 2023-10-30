package com.sapplication.app.modules.framethree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityFrameThreeBinding
import com.sapplication.app.modules.framefour.ui.FrameFourActivity
import com.sapplication.app.modules.framethree.`data`.viewmodel.FrameThreeVM
import kotlin.String
import kotlin.Unit

class FrameThreeActivity : BaseActivity<ActivityFrameThreeBinding>(R.layout.activity_frame_three) {
  private val viewModel: FrameThreeVM by viewModels<FrameThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowone.setOnClickListener {
      val destIntent = FrameFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
