package com.jaden.network.api

import com.jaden.network.models.requests.FavoriteImageRequest
import com.jaden.network.models.response.CommonResponse
import com.jaden.network.models.response.FavoriteImageInformationList
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface FavoriteImageApi {
    @GET("favourites")
    suspend fun getFavoriteImages(): FavoriteImageInformationList

    @POST("favourites")
    suspend fun registerFavoriteImages(
        @Body favoriteImageRequest: FavoriteImageRequest
    ): CommonResponse

    @DELETE("favourites/{favoriteId}")
    suspend fun deleteFavorite(
        @Path("favoriteId") favoriteId: Int
    ): CommonResponse
}
