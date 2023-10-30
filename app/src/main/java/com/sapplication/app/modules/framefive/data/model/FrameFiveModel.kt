package com.sapplication.app.modules.framefive.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRegistrationty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_registration_ty)

)
