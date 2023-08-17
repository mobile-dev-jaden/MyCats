package com.jaden.core_network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import javax.inject.Qualifier
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

object ApiKeyHeaderInterceptor: Interceptor {
    private const val X_API_KEY = "x-api-key"
    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request().newBuilder()
            .addHeader(X_API_KEY, BuildConfig.API_KEY)
            .build()

        return chain.proceed(request)
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultOkHttpClient

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApiKeyContainedOkHttpClient
