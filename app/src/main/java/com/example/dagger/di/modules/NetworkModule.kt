package com.example.dagger.di.modules

import com.example.dagger.data.RetrofitApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


/// этот класс наподобие модуля как в Koin
@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient): RetrofitApi {
      return  Retrofit.Builder()
            .baseUrl("https://api.sambo.beta.trinitydigital.ru/")
            .addConverterFactory(GsonConverterFactory.create())
          .client(client)
            .build()
            .create(RetrofitApi::class.java)
    }
       // всегда при Dagger при функции RetrofitBuilder & OkhttP делать rebuildproject
    @Provides
    @Singleton
    fun provideOkHttp(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor())
            .build()
    }
}