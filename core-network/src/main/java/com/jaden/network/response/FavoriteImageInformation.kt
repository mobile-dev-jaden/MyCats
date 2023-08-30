package com.jaden.network.response

typealias FavoriteImageInformationList = List<FavoriteImageInformation>

data class FavoriteImageInformation(
    val created_at: String,
    val id: Int,
    val image: Image,
    val image_id: String,
    val sub_id: Any,
    val user_id: String
)

