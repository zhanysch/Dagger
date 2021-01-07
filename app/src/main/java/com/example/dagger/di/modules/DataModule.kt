package com.example.dagger.di.modules

import android.content.Context
import com.example.dagger.data.PrefsHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideSharedPreference(context: Context): PrefsHelper {
        return PrefsHelper(context)
    }
}