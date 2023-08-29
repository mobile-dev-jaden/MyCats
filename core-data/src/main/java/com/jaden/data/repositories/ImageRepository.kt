package com.jaden.data.repositories

import com.jaden.data.models.ImageModel
import com.jaden.data.models.ImageModels
import kotlinx.coroutines.flow.Flow

interface ImageRepository {

    fun getImages(
        doOnStart: () -> Unit = { },
        doOnCompletion: () -> Unit = { },
    ): Flow<ImageModels>

    fun favoriteImage(imageModel: ImageModel): Flow<Unit>
}
