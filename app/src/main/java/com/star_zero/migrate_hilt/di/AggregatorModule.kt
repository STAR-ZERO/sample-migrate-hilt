package com.star_zero.migrate_hilt.di

import com.star_zero.migrate_hilt.core.di.NetworkModule
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module(
    includes = [
        AndroidInjectionModule::class,
        NetworkModule::class,
        AppConfigModule::class,
        AppModule::class,
        ActivityModule::class,
        ViewModelModule::class,
    ]
)
interface AggregatorModule
