package com.jaden.network.serviceimpl

import com.jaden.network.api.FavoriteImageApi
import com.jaden.network.models.requests.FavoriteImageRequest
import com.jaden.network.models.response.CommonResponse
import com.jaden.network.models.response.FavoriteImageInformationList
import com.jaden.network.service.FavoriteImageService
import javax.inject.Inject

class FavoriteImageServiceImpl @Inject constructor(
    private val favoriteImageApi: FavoriteImageApi
): FavoriteImageService {

    override suspend fun getFavoriteImages(): FavoriteImageInformationList =
        favoriteImageApi.getFavoriteImages()

    override suspend fun registerFavoriteImages(imageId: String): CommonResponse =
        favoriteImageApi.registerFavoriteImages(
            favoriteImageRequest = FavoriteImageRequest(imageId = imageId, subId = null)
        )

    override suspend fun deleteFavorite(favoriteId: Int): CommonResponse =
        favoriteImageApi.deleteFavorite(favoriteId)
}