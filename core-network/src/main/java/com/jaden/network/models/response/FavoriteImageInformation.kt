package com.jaden.network.models.response

import com.squareup.moshi.Json

typealias FavoriteImageInformationList = List<FavoriteImageInformation>

data class FavoriteImageInformation(
    @Json(name = "created_at")
    val createdAt: String,

    @Json(name = "id")
    val id: Int,

    @Json(name = "image")
    val image: Image,

    @Json(name = "image_id")
    val imageId: String,

    @Json(name = "sub_id")
    val subId: String?,

    @Json(name = "user_id")
    val userId: String
)

