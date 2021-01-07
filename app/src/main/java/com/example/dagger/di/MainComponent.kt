package com.example.dagger.di

import com.example.dagger.di.modules.*
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DataModule::class,
        NetworkModule::class,
        IteractorModule::class,
         RepositoryModule::class]
)  //указыва внутри список модулей

interface MainComponent {
    fun inject(injector: Injector)
}