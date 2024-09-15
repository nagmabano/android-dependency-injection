package com.learning.android.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {

    @Provides
    fun provideCoffees(): Coffee {
        return Coffee()
    }
}