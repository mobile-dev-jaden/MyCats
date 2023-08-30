package com.jaden.network.models.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CommonResponse(
    @Json(name = "message")
    val message: String,

    @Json(name = "id")
    val id: Int?

)
