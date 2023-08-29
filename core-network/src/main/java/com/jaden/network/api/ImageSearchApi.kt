package com.jaden.network.api

import com.jaden.network.response.ImageInformationList
import retrofit2.http.GET
import retrofit2.http.Query

interface ImageSearchApi {
    @GET("images/search")
    suspend fun getImages(
        @Query("limit") limit: Int = 20
    ): ImageInformationList
}
