package com.star_zero.migrate_hilt.di

import com.star_zero.migrate_hilt.core.repository.SampleRepository
import com.star_zero.migrate_hilt.core.repository.SampleRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class AppModule {

    @Singleton
    @Binds
    abstract fun bindSampleRepository(repository: SampleRepositoryImpl): SampleRepository
}
