package com.trainning.samplemvvm.listeners

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import com.trainning.samplemvvm.model.LoginInfo
import com.trainning.samplemvvm.viewmodel.LoginViewModel

class LoginClickListener (activity: FragmentActivity?){

   var activity : FragmentActivity? = activity

    fun onLoginClick(loginViewModel: LoginViewModel, loginInfo : LoginInfo) {

        loginViewModel.validateCredentials(loginInfo.userName, loginInfo.userPassword).observe(activity!!,
            Observer<String> { t -> Toast.makeText(activity, t, Toast.LENGTH_LONG).show() })
    }

}