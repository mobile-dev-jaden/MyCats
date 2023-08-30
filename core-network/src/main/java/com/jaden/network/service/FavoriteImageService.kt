package com.jaden.network.service

import com.jaden.network.response.CommonResponse
import com.jaden.network.response.FavoriteImageInformationList

interface FavoriteImageService {

    suspend fun getFavoriteImages(): FavoriteImageInformationList

    suspend fun registerFavoriteImages(): CommonResponse

    suspend fun deleteFavorite(favoriteId: Int): CommonResponse
}
