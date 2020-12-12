package com.star_zero.migrate_hilt

import com.star_zero.migrate_hilt.core.util.AppConfig
import com.star_zero.migrate_hilt.di.AppComponent
import com.star_zero.migrate_hilt.di.DaggerAppComponent
import com.star_zero.migrate_hilt.feature.di.FeatureComponent
import com.star_zero.migrate_hilt.feature.di.FeatureComponentProvider
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App : DaggerApplication(), FeatureComponentProvider {

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(
            this,
            AppConfig(BuildConfig.DEBUG)
        )
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return appComponent
    }

    override fun provideFeatureComponent(): FeatureComponent {
        return appComponent.featureComponent().create()
    }
}
