package com.star_zero.migrate_hilt.core.di

import android.content.Context
import com.star_zero.migrate_hilt.core.api.SampleAPI
import com.star_zero.migrate_hilt.core.util.AppConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideAPI(@ApplicationContext context: Context, appConfig: AppConfig): SampleAPI {
        if (appConfig.debug) {
            // do something
        }

        val retrofit = Retrofit.Builder().baseUrl("https://example.com/").build()
        return retrofit.create(SampleAPI::class.java)
    }
}
