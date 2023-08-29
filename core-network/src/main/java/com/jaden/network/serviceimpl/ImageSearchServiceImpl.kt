package com.jaden.network.serviceimpl

import com.jaden.network.api.ImageSearchApi
import com.jaden.network.response.ImageInformationList
import com.jaden.network.service.ImageSearchService
import javax.inject.Inject

class ImageSearchServiceImpl @Inject constructor(
    private val imageSearchApi: ImageSearchApi
) : ImageSearchService {

    override suspend fun getImages(): ImageInformationList = imageSearchApi.getImages()
}
