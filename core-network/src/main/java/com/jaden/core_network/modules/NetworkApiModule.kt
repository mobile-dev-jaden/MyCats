package com.jaden.core_network.modules

import com.jaden.core_network.api.ImageSearchApi
import com.jaden.core_network.modules.annotations.ApiKeyContainedRetrofit
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
}

