package com.jaden.core_network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    @Singleton
    @DefaultRetrofit
    fun providesDefaultRetrofit(
        @DefaultOkHttpClient
        defaultOkHttpClient: OkHttpClient
    ): Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(defaultOkHttpClient)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    @Provides
    @Singleton
    @ApiKeyContainedRetrofit
    fun providesApiKeyContainedRetrofit(
        @ApiKeyContainedOkHttpClient
        apiKeyContainedOkHttpClient: OkHttpClient
    ): Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(apiKeyContainedOkHttpClient)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultRetrofit

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApiKeyContainedRetrofit
