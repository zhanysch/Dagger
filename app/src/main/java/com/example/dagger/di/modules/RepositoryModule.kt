package com.example.dagger.di.modules

import com.example.dagger.data.*
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideRepository(service : RetrofitIteractor): RetrofitRepository {
        return RetrofititRepositoryImpl(service)
    }
}