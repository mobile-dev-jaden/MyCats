package com.jaden.network.service

import com.jaden.network.models.response.CommonResponse
import com.jaden.network.models.response.FavoriteImageInformationList

interface FavoriteImageService {

    suspend fun getFavoriteImages(): FavoriteImageInformationList

    suspend fun registerFavoriteImages(imageId: String): CommonResponse

    suspend fun deleteFavorite(favoriteId: Int): CommonResponse
}
