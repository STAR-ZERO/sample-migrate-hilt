package com.star_zero.migrate_hilt

import android.app.Application
import com.star_zero.migrate_hilt.core.util.AppConfig
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    fun getAppConfig(): AppConfig {
        return AppConfig(BuildConfig.DEBUG)
    }
}
