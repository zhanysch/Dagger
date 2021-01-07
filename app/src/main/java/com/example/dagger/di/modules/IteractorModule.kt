package com.example.dagger.di.modules

import com.example.dagger.data.RetrofitApi
import com.example.dagger.data.RetrofitIteractor
import com.example.dagger.data.RetrofitIteractorImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class IteractorModule {

    @Provides
    @Singleton
    fun provideIteractor(service : RetrofitApi): RetrofitIteractor {
        return RetrofitIteractorImpl(service)
    }
}