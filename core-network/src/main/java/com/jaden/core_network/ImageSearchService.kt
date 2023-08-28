package com.jaden.core_network

import com.jaden.core_network.response.ImageInformationList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject

interface ImageSearchService {
    fun getImages(
        onStart: () -> Unit,
        onCompletion: () -> Unit,
    ): Flow<ImageInformationList>
}

interface ImageSearchApi {
    @GET("images/search")
    suspend fun getImages(
        @Query("limit") limit: Int = 20
    ): ImageInformationList
}

class ImageSearchServiceImpl @Inject constructor(
    private val imageSearchApi: ImageSearchApi
) : ImageSearchService {

    override fun getImages(
        onStart: () -> Unit,
        onCompletion: () -> Unit
    ): Flow<ImageInformationList> = flow {
        val imageInformationList = imageSearchApi.getImages()
        emit(imageInformationList)
    }.flowOn(Dispatchers.IO)
        .onStart { onStart() }
        .onCompletion { onCompletion() }
}
