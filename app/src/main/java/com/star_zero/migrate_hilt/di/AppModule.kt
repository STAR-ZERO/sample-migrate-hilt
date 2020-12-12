package com.star_zero.migrate_hilt.di

import com.star_zero.migrate_hilt.core.repository.SampleRepository
import com.star_zero.migrate_hilt.core.repository.SampleRepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Singleton
    @Binds
    abstract fun bindSampleRepository(repository: SampleRepositoryImpl): SampleRepository
}
