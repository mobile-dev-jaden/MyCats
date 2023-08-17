package com.jaden.core_network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkServiceModule {

    @Provides
    @Singleton
    fun provideImageSearchService(
        imageSearchApi: ImageSearchApi
    ): ImageSearchService = ImageSearchServiceImpl(imageSearchApi)
}