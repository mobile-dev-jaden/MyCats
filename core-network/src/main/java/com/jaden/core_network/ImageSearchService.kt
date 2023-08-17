package com.jaden.core_network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject

interface ImageSearchService {
    suspend fun getImages(): Response<List<Any>>
}

interface ImageSearchApi {
    @GET("search/images")
    suspend fun getImages(
        @Query("limit") limit: Int = 20
    ): Response<List<Any>>
}

class ImageSearchServiceImpl @Inject constructor(
    private val imageSearchApi: ImageSearchApi
) : ImageSearchService {

    override suspend fun getImages(): Response<List<Any>> = imageSearchApi.getImages()

}
