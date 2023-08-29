package com.jaden.network.service

import com.jaden.network.response.ImageInformationList
import kotlinx.coroutines.flow.Flow

interface ImageSearchService {
    fun getImages(
        onStart: () -> Unit,
        onCompletion: () -> Unit,
    ): Flow<ImageInformationList>
}
