package com.star_zero.migrate_hilt.di

import com.star_zero.migrate_hilt.ui.foo.FooFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeFooFragment(): FooFragment
}
