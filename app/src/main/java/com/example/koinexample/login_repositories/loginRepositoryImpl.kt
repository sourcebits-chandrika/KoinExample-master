package com.example.koinexample.login_repositories

import android.util.Log
import com.example.koinexample.login_models.UserData

class loginRepositoryImpl : LoginRepository {
    override fun getLoginDetails(): String {
        return "RepositoryData¶"
    }
}