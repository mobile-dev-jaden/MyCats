package com.jaden.network.modules

import com.jaden.network.service.CatBreedsInquiryService
import com.jaden.network.service.CatBreedsInquiryServiceImpl
import com.jaden.network.service.FavoriteImageService
import com.jaden.network.service.ImageSearchService
import com.jaden.network.serviceimpl.FavoriteImageServiceImpl
import com.jaden.network.serviceimpl.ImageSearchServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkServiceModule {

    @Binds
    @Singleton
    abstract fun bindsImageSearchService(
        imageSearchServiceImpl: ImageSearchServiceImpl
    ): ImageSearchService

    @Binds
    @Singleton
    abstract fun bindsFavoriteImageService(
        favoriteImageServiceImpl: FavoriteImageServiceImpl
    ): FavoriteImageService

    @Binds
    @Singleton
    abstract fun bindsCatBreedsInquiryService(
        catBreedsInquiryServiceImpl: CatBreedsInquiryServiceImpl
    ): CatBreedsInquiryService
}