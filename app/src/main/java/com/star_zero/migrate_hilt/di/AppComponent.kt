package com.star_zero.migrate_hilt.di

import android.content.Context
import com.star_zero.migrate_hilt.App
import com.star_zero.migrate_hilt.core.di.NetworkModule
import com.star_zero.migrate_hilt.core.util.AppConfig
import com.star_zero.migrate_hilt.feature.di.FeatureComponent
import com.star_zero.migrate_hilt.feature.di.FeatureModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        NetworkModule::class,
        AppModule::class,
        ActivityModule::class,
        ViewModelModule::class,
        FeatureModule::class,
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance appConfig: AppConfig
        ): AppComponent
    }

    fun featureComponent(): FeatureComponent.Factory
}
