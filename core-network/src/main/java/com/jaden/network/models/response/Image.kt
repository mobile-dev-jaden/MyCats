package com.jaden.network.models.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Image(
    @Json(name = "id")
    val id: String,

    @Json(name = "url")
    val url: String

)
