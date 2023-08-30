package com.jaden.network.service

import com.jaden.network.api.CatBreedsInquiryApi
import com.jaden.network.models.response.CatBreeds
import javax.inject.Inject

interface CatBreedsInquiryService {

    suspend fun getCatBreeds(): CatBreeds
}

class CatBreedsInquiryServiceImpl @Inject constructor(
    private val catBreedsInquiryApi: CatBreedsInquiryApi
): CatBreedsInquiryService {

    override suspend fun getCatBreeds(): CatBreeds = catBreedsInquiryApi.getBreeds()
}