package com.jaden.data.repositories

import android.util.Log
import com.jaden.data.mappers.asEntity
import com.jaden.data.mappers.asModel
import com.jaden.data.models.ImageModel
import com.jaden.data.models.ImageModels
import com.jaden.database.ImageEntity
import com.jaden.database.ImageInformationDao
import com.jaden.network.service.ImageSearchService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

class ImageRepositoryImpl @Inject constructor(
    private val imageSearchService: ImageSearchService,
    private val imageInformationDao: ImageInformationDao
): ImageRepository {

    override fun getImages(
        doOnStart: () -> Unit,
        doOnCompletion: () -> Unit,
    ): Flow<ImageModels> = flow {
        var imageEntityList = imageInformationDao.getAll()

        if (imageEntityList.isEmpty()) {
            val imageInformationList = imageSearchService.getImages()
            imageInformationDao.insertAll(imageInformationList.asEntity())
            imageEntityList = imageInformationDao.getAll()
        }

        emit(imageEntityList.asModel())

    }.flowOn(Dispatchers.IO)
        .onStart { doOnStart() }
        .onCompletion { doOnCompletion() }
        .catch {
            Log.e("Repository", "${it.message}")
            emit(emptyList())
        }

    override fun favoriteImage(imageModel: ImageModel) = flow<Unit> {
        val updatedImageModel = imageModel.updateFavorite()

        val imageEntity = ImageEntity(
            updatedImageModel.getUuid(),
            updatedImageModel.getUrl(),
            updatedImageModel.getFavorite()
        )

        imageInformationDao.updateFavoriteImage(imageEntity)

    }.flowOn(Dispatchers.IO)
}

