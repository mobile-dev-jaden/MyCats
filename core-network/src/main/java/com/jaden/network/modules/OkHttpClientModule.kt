package com.jaden.network.modules

import com.jaden.network.interceptor.ApiKeyHeaderInterceptor
import com.jaden.network.modules.annotations.ApiKeyContainedOkHttpClient
import com.jaden.network.modules.annotations.DefaultOkHttpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object OkHttpClientModule {

    @Provides
    @Singleton
    @DefaultOkHttpClient
    fun providesDefaultOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder().build()

    @Provides
    @Singleton
    @ApiKeyContainedOkHttpClient
    fun providesApiKeyContainedOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(ApiKeyHeaderInterceptor)
            .build()
}

