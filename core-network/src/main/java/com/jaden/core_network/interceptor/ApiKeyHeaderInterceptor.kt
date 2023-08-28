package com.jaden.core_network.interceptor

import com.jaden.core_network.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

object ApiKeyHeaderInterceptor: Interceptor {
    private const val X_API_KEY = "x-api-key"

    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request().newBuilder()
            .addHeader(X_API_KEY, BuildConfig.API_KEY)
            .build()

        return chain.proceed(request)
    }
}
