package com.star_zero.migrate_hilt.di

import com.star_zero.migrate_hilt.App
import com.star_zero.migrate_hilt.feature.di.FeatureComponent
import dagger.android.AndroidInjector
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@EntryPoint
interface AppComponent : AndroidInjector<App> {
    fun featureComponent(): FeatureComponent.Factory
}
