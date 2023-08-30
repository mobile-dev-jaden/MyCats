package com.jaden.network.serviceimpl

import com.jaden.network.api.FavoriteImageApi
import com.jaden.network.response.CommonResponse
import com.jaden.network.response.FavoriteImageInformationList
import com.jaden.network.service.FavoriteImageService
import javax.inject.Inject

class FavoriteImageServiceImpl @Inject constructor(
    private val favoriteImageApi: FavoriteImageApi
): FavoriteImageService {

    override suspend fun getFavoriteImages(): FavoriteImageInformationList =
        favoriteImageApi.getFavoriteImages()

    override suspend fun registerFavoriteImages(): CommonResponse =
        favoriteImageApi.registerFavoriteImages()

    override suspend fun deleteFavorite(favoriteId: Int): CommonResponse =
        favoriteImageApi.deleteFavorite(favoriteId)
}