package com.jaden.network.api

import com.jaden.network.models.response.CatBreeds
import retrofit2.http.GET

interface CatBreedsInquiryApi {

    @GET("breeds")
    suspend fun getBreeds(): CatBreeds
}
