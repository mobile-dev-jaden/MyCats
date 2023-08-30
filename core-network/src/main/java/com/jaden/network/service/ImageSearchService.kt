package com.jaden.network.service

import com.jaden.network.models.response.ImageInformationList

interface ImageSearchService {

    suspend fun getImages(): ImageInformationList

}
