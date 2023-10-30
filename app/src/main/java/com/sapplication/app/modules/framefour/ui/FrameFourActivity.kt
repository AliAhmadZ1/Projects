package com.sapplication.app.modules.framefour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityFrameFourBinding
import com.sapplication.app.modules.framefour.`data`.viewmodel.FrameFourVM
import com.sapplication.app.modules.framethree.ui.FrameThreeActivity
import kotlin.String
import kotlin.Unit

class FrameFourActivity : BaseActivity<ActivityFrameFourBinding>(R.layout.activity_frame_four) {
  private val viewModel: FrameFourVM by viewModels<FrameFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btn.setOnClickListener {
      val destIntent = FrameThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
