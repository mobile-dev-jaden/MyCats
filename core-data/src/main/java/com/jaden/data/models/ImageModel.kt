package com.jaden.data.models

typealias ImageModels = List<ImageModel>

data class ImageModel constructor(
    private val uuid: String,
    private val url: String,
    private val favorite: Boolean
) {
    fun getUuid(): String = uuid

    fun getUrl(): String = url

    fun getFavorite(): Boolean = favorite

    fun updateFavorite(): ImageModel = copy(
        ImageModel(uuid, url, favorite.not() /*toggle*/)
    )

    private fun copy(imageModel: ImageModel) = ImageModel(
        imageModel.uuid,
        imageModel.url,
        imageModel.favorite
    )
}