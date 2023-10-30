package com.sapplication.app.modules.framefive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityFrameFiveBinding
import com.sapplication.app.modules.androidlargefive.ui.AndroidLargeFiveActivity
import com.sapplication.app.modules.androidlargefour.ui.AndroidLargeFourActivity
import com.sapplication.app.modules.framefive.`data`.viewmodel.FrameFiveVM
import kotlin.String
import kotlin.Unit

class FrameFiveActivity : BaseActivity<ActivityFrameFiveBinding>(R.layout.activity_frame_five) {
  private val viewModel: FrameFiveVM by viewModels<FrameFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnStudent.setOnClickListener {
      val destIntent = AndroidLargeFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSchool.setOnClickListener {
      val destIntent = AndroidLargeFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
