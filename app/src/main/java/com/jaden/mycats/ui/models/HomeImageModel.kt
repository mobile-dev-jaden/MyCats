package com.jaden.mycats.ui.models

import java.util.UUID

data class HomeImageModel(
    private val imageUrl: String
) {
    val url = imageUrl
    val uuid = UUID.randomUUID()
}