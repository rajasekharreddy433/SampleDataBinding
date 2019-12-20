package com.trainning.samplemvvm.model

import androidx.databinding.BaseObservable

data class LoginInfo( var userName: String? , var userPassword: String? ) :BaseObservable()

/*
class LoginInfo : BaseObservable() {
    var userName: String? = null
    var userPassword: String? = null
}*/
