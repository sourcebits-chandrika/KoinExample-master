package com.example.koinexample

import android.app.Application
import com.example.koinexample.koin_module.appmodule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import java.lang.System.setProperty

class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@AppApplication)
            modules(appmodule)
        }
        setProperty("staging_url", "http://staging.domain.com")

    }
}