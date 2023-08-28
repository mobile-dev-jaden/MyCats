package com.jaden.core_network.modules

import com.jaden.core_network.serviceimpl.ImageSearchServiceImpl
import com.jaden.core_network.api.ImageSearchApi
import com.jaden.core_network.service.ImageSearchService
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