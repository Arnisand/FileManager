package com.arnisand.mymanager.ui

import android.app.Application
import com.arnisand.mymanager.di.appModule
import com.arnisand.mymanager.di.repositoryModule
import com.arnisand.mymanager.di.useCaseModule
import com.arnisand.mymanager.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ManagerApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // use AndroidLogger as Koin Logger - default Level.INFO
            androidLogger()

            // use the Android context given there
            androidContext(this@ManagerApplication)
            // module list
            modules(appModule, viewModelModule, useCaseModule, repositoryModule)
        }
    }
}