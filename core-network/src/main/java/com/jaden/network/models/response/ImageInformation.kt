package com.jaden.network.models.response

import com.squareup.moshi.Json

typealias ImageInformationList = List<ImageInformation>

data class ImageInformation(
    @Json(name = "breeds")
    val breeds: Breeds,

    @Json(name = "height")
    val height: Int,

    @Json(name = "id")
    val id: String,

    @Json(name = "url")
    val url: String,

    @Json(name = "width")
    val width: Int
)