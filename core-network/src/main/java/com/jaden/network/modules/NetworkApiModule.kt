package com.jaden.network.modules

import com.jaden.network.api.CatBreedsInquiryApi
import com.jaden.network.api.FavoriteImageApi
import com.jaden.network.api.ImageSearchApi
import com.jaden.network.modules.annotations.ApiKeyContainedRetrofit
import com.jaden.network.modules.annotations.DefaultRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkApiModule {

    @Provides
    @Singleton
    fun provideImageSearchApi(
        @ApiKeyContainedRetrofit
        retrofit: Retrofit
    ): ImageSearchApi = retrofit.create(ImageSearchApi::class.java)

    @Provides
    @Singleton
    fun provideFavoriteImageApi(
        @ApiKeyContainedRetrofit
        retrofit: Retrofit
    ): FavoriteImageApi = retrofit.create(FavoriteImageApi::class.java)

    @Provides
    @Singleton
    fun provideBreedsInquiryApi(
        @DefaultRetrofit
        retrofit: Retrofit
    ): CatBreedsInquiryApi = retrofit.create(CatBreedsInquiryApi::class.java)
}

