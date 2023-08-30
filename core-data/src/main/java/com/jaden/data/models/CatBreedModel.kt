package com.jaden.data.models

typealias CatBreedModels = List<CatBreedModel>

data class CatBreedModel(
    val id: String,
    val description: String,
    val dogFriendly: Int,
    val energyLevel: Int,
)