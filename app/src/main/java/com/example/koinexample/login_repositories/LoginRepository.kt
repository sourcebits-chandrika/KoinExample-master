package com.example.koinexample.login_repositories

import com.example.koinexample.login_models.UserData

interface LoginRepository {
    fun getLoginDetails(): String
}