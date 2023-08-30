package com.jaden.network.models.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

typealias ImageInformationList = List<ImageInformation>

@JsonClass(generateAdapter = true)
data class ImageInformation(
    @Json(name = "breeds")
    val breeds: List<Breed>,

    @Json(name = "height")
    val height: Int,

    @Json(name = "id")
    val id: String,

    @Json(name = "url")
    val url: String,

    @Json(name = "width")
    val width: Int

)