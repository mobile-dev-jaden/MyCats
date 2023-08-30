package com.jaden.network.models.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

typealias FavoriteImageInformationList = List<FavoriteImageInformation>

@JsonClass(generateAdapter = true)
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
    val subId: Any,

    @Json(name = "user_id")
    val userId: String
)

