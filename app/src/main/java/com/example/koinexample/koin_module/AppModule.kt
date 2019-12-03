package com.example.koinexample.koin_module

import com.example.koinexample.login_repositories.LoginRepository
import com.example.koinexample.login_repositories.loginRepositoryImpl
import com.example.koinexample.viewmodels.LoginViewmodel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appmodule = module {

    single<LoginRepository> { loginRepositoryImpl() }

    viewModel { LoginViewmodel(get()) }
}