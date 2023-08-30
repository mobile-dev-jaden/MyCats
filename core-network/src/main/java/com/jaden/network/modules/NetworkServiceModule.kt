package com.jaden.network.modules

import com.jaden.network.api.FavoriteImageApi
import com.jaden.network.api.ImageSearchApi
import com.jaden.network.service.FavoriteImageService
import com.jaden.network.service.ImageSearchService
import com.jaden.network.serviceimpl.FavoriteImageServiceImpl
import com.jaden.network.serviceimpl.ImageSearchServiceImpl
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

    @Provides
    @Singleton
    fun provideFavoriteImageService(
        favoriteImageApi: FavoriteImageApi
    ): FavoriteImageService = FavoriteImageServiceImpl(favoriteImageApi)
}