package com.example.dagger

import android.app.Application
import com.example.dagger.di.DaggerMainComponent
import com.example.dagger.di.MainComponent
import com.example.dagger.di.modules.AppModule

class DaggerApp: Application() {

    lateinit var mainComponent: MainComponent

    override fun onCreate() {
        super.onCreate()
        app = this
        mainComponent = DaggerMainComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    companion object{
        lateinit var app : DaggerApp
    }
}