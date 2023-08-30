package com.jaden.network.api

import com.jaden.network.response.CommonResponse
import com.jaden.network.response.FavoriteImageInformationList
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface FavoriteImageApi {
    @GET("favourites")
    suspend fun getFavoriteImages(): FavoriteImageInformationList

    @POST("favourites")
    suspend fun registerFavoriteImages(): CommonResponse

    @DELETE("favourites/{favoriteId}")
    suspend fun deleteFavorite(
        @Path("favoriteId") favoriteId: Int
    ): CommonResponse
}