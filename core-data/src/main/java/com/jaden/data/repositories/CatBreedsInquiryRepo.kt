package com.jaden.data.repositories

import com.jaden.data.models.CatBreedModels
import kotlinx.coroutines.flow.Flow

interface CatBreedsInquiryRepo {

    fun getBreeds(): Flow<CatBreedModels>
}