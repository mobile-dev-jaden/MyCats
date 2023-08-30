package com.jaden.network.models.response

import com.squareup.moshi.Json

data class Image(
    @Json(name = "id")
    val id: String,

    @Json(name = "url")
    val url: String,

    @Json(name = "width")
    val width: Int?,

    @Json(name = "height")
    val height: Int?,
)
