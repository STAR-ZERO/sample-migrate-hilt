package com.star_zero.migrate_hilt.feature.di

import androidx.lifecycle.ViewModel
import com.star_zero.migrate_hilt.core.di.ViewModelKey
import com.star_zero.migrate_hilt.feature.ui.FeatureActivity
import com.star_zero.migrate_hilt.feature.ui.FeatureViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module(
    subcomponents = [FeatureComponent::class]
)
abstract class FeatureModule {

    @ContributesAndroidInjector
    abstract fun contributeFeatureActivity(): FeatureActivity

    @Binds
    @IntoMap
    @ViewModelKey(FeatureViewModel::class)
    abstract fun bindFeatureViewModel(viewModel: FeatureViewModel): ViewModel
}
