package com.sapplication.app.modules.androidlargefive.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateaschool: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_a_school)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSchoolname: String? = MyApp.getInstance().resources.getString(R.string.lbl_school_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSchoolnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_school_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegion: String? = MyApp.getInstance().resources.getString(R.string.lbl_region)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_agree_to_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleFiveValue: String? = null
)
