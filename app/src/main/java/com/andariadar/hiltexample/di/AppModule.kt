package com.andariadar.hiltexample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideExample() {

    }
}


