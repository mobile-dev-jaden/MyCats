package com.jaden.network.modules

import com.jaden.core_network.BuildConfig
import com.jaden.network.modules.annotations.ApiKeyContainedOkHttpClient
import com.jaden.network.modules.annotations.ApiKeyContainedRetrofit
import com.jaden.network.modules.annotations.DefaultOkHttpClient
import com.jaden.network.modules.annotations.DefaultRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
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
