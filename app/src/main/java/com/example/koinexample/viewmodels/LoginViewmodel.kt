package com.example.koinexample.viewmodels

import androidx.lifecycle.ViewModel
import com.example.koinexample.login_repositories.LoginRepository

class LoginViewmodel(val loginRepository: LoginRepository) : ViewModel() {
    val data = loginRepository.getLoginDetails()
    fun getLoginDetails(): String {
        return data
    }
}