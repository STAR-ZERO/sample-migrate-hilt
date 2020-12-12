package com.star_zero.migrate_hilt.di

import android.content.Context
import com.star_zero.migrate_hilt.App
import com.star_zero.migrate_hilt.core.util.AppConfig
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppConfigModule {

    @Singleton
    @Provides
    fun provideAppConfig(context: Context): AppConfig {
        return (context as App).getAppConfig()
    }
}
