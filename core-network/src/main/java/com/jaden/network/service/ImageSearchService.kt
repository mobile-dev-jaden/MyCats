package com.jaden.network.service

import com.jaden.network.response.ImageInformationList

interface ImageSearchService {

    suspend fun getImages(): ImageInformationList

}
