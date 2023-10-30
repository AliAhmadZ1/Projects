package com.sapplication.app.modules.androidlargeone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityAndroidLargeOneBinding
import com.sapplication.app.modules.androidlargeone.`data`.viewmodel.AndroidLargeOneVM
import com.sapplication.app.modules.androidlargetwo.ui.AndroidLargeTwoActivity
import com.sapplication.app.modules.framefive.ui.FrameFiveActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeOneActivity :
    BaseActivity<ActivityAndroidLargeOneBinding>(R.layout.activity_android_large_one) {
  private val viewModel: AndroidLargeOneVM by viewModels<AndroidLargeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = AndroidLargeTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageGlobe.setOnClickListener {
        val destIntent = AndroidLargeTwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearRowsignup.setOnClickListener {
        val destIntent = FrameFiveActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "ANDROID_LARGE_ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, AndroidLargeOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
