package com.star_zero.migrate_hilt.feature.di

import com.star_zero.migrate_hilt.feature.ui.FeatureActivity
import dagger.Subcomponent


@Subcomponent
interface FeatureComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): FeatureComponent
    }

    fun inject(activity: FeatureActivity)
}
