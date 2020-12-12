package com.star_zero.migrate_hilt.di

import com.star_zero.migrate_hilt.ui.foo.FooFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeFooFragment(): FooFragment
}
