package com.jaden.data.mappers

import com.jaden.data.models.ImageModel
import com.jaden.data.models.ImageModels
import com.jaden.database.entities.ImageEntities
import com.jaden.database.entities.ImageEntity
import com.jaden.network.models.response.ImageInformationList

object ImageInformationMapper {

    fun asEntity(imageInformationList: ImageInformationList): ImageEntities =
        imageInformationList.map { imageInformation ->
            ImageEntity(
                uuid = imageInformation.id,
                url = imageInformation.url,
                favorite =  false
            )
        }

    fun asModel(imageEntityList: ImageEntities): ImageModels =
        imageEntityList.map {
            val imageModel = ImageModel(it.uuid, it.url, it.favorite)
            imageModel
        }
}

fun ImageInformationList.asEntity(): ImageEntities =
    ImageInformationMapper.asEntity(this)

fun ImageEntities.asModel(): ImageModels =
    ImageInformationMapper.asModel(this)
