package com.star_zero.migrate_hilt.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.star_zero.migrate_hilt.core.di.ViewModelKey
import com.star_zero.migrate_hilt.core.viewmodel.ViewModelFactory
import com.star_zero.migrate_hilt.ui.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}
