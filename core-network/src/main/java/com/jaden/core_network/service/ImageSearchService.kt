package com.jaden.core_network.service

import com.jaden.core_network.response.ImageInformationList
import kotlinx.coroutines.flow.Flow

interface ImageSearchService {
    fun getImages(
        onStart: () -> Unit,
        onCompletion: () -> Unit,
    ): Flow<ImageInformationList>
}
