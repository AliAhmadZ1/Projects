package com.sapplication.app.modules.androidlargefour.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateastuden: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_a_studen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameStudent: String? = MyApp.getInstance().resources.getString(R.string.lbl_name_student)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumberID: String? = MyApp.getInstance().resources.getString(R.string.lbl_number_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumberphone: String? = MyApp.getInstance().resources.getString(R.string.lbl_number_phone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_brith_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
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
  var etRectangleOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleThreeValue: String? = null
)
