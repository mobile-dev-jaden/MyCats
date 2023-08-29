package com.jaden.network.response

typealias ImageInformationList = List<ImageInformation>

data class ImageInformation(
    val breeds: List<Breed>,
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)