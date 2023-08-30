package com.jaden.data.mappers

import com.jaden.data.models.ImageModel
import com.jaden.data.models.ImageModels
import com.jaden.database.ImageEntity
import com.jaden.database.ImageEntityList
import com.jaden.network.models.response.ImageInformationList

object ImageInformationMapper {

    fun asEntity(imageInformationList: ImageInformationList): ImageEntityList =
        imageInformationList.map { imageInformation ->
            ImageEntity(
                uuid = imageInformation.id,
                url = imageInformation.url,
                favorite =  false
            )
        }

    fun asModel(imageEntityList: ImageEntityList): ImageModels =
        imageEntityList.map {
            val imageModel = ImageModel(it.uuid, it.url, it.favorite)
            imageModel
        }
}

fun ImageInformationList.asEntity(): ImageEntityList =
    ImageInformationMapper.asEntity(this)

fun ImageEntityList.asModel(): ImageModels =
    ImageInformationMapper.asModel(this)
