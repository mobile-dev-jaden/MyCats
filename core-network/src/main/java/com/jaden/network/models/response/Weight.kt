package com.jaden.network.models.response

import com.squareup.moshi.Json

data class Weight(
    @Json(name = "imperial")
    val imperial: String,

    @Json(name = "metric")
    val metric: String
)