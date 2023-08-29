package com.jaden.network.serviceimpl

import com.jaden.network.api.ImageSearchApi
import com.jaden.network.response.ImageInformationList
import com.jaden.network.service.ImageSearchService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

class ImageSearchServiceImpl @Inject constructor(
    private val imageSearchApi: ImageSearchApi
) : ImageSearchService {

    override fun getImages(
        onStart: () -> Unit,
        onCompletion: () -> Unit
    ): Flow<ImageInformationList> = flow {
        val imageInformationList = imageSearchApi.getImages()
        emit(imageInformationList)
    }
        .flowOn(Dispatchers.IO)
        .onStart { onStart() }
        .onCompletion { onCompletion() }
}
