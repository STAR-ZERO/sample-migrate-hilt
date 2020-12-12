package com.star_zero.migrate_hilt

import com.star_zero.migrate_hilt.core.util.AppConfig
import com.star_zero.migrate_hilt.di.AppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import dagger.hilt.EntryPoints
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : DaggerApplication() {

    private val appComponent: AppComponent by lazy {
        EntryPoints.get(this, AppComponent::class.java)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return appComponent
    }

    fun getAppConfig(): AppConfig {
        return AppConfig(BuildConfig.DEBUG)
    }
}
