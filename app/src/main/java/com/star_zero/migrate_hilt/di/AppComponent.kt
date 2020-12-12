package com.star_zero.migrate_hilt.di

import com.star_zero.migrate_hilt.App
import dagger.android.AndroidInjector
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@EntryPoint
interface AppComponent : AndroidInjector<App>
