package com.example.dagger.di

import com.example.dagger.DaggerApp
import com.example.dagger.data.PrefsHelper
import com.example.dagger.data.RetrofitIteractor
import com.example.dagger.data.RetrofitRepository
import javax.inject.Inject


//функц помогает инжектить зависимости
  inline fun <T> inject(crossinline block : Injector.() ->T): Lazy<T> = lazy { Injector().block() }
// с помощью этой функции вызываетс зависимость!!

class Injector {

    @Inject
    lateinit var retrofitIteractor : RetrofitIteractor

    @Inject
    lateinit var retrofitRepository: RetrofitRepository


    @Inject
    lateinit var prefence: PrefsHelper

    init {
        DaggerApp.app.mainComponent.inject(this)
    }
}