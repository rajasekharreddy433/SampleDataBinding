package com.trainning.samplemvvm


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.trainning.samplemvvm.listeners.LoginClickListener
import com.trainning.samplemvvm.model.LoginInfo
import com.trainning.samplemvvm.viewmodel.LoginViewModel
import kotlin.math.log


/**
 * A simple [Fragment] subclass.
 *
 */
class LoginFragment : Fragment() {

    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(activity!!.application).create(LoginViewModel::class.java)
    }

    lateinit var loginClickListener : LoginClickListener

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val loginBinder : com.trainning.samplemvvm.databinding.FragmentLoginBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        loginClickListener = LoginClickListener(activity = activity)
        loginBinder.model = LoginInfo("","")
        loginBinder.viewModel = loginViewModel
        loginBinder.clickListener = loginClickListener

        return loginBinder.getRoot()
    }


}
