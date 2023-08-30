package com.jaden.data.repositories

import android.util.Log
import com.jaden.data.mappers.asEntity
import com.jaden.data.mappers.asModel
import com.jaden.data.models.CatBreedModels
import com.jaden.database.dao.CatBreedsDao
import com.jaden.network.service.CatBreedsInquiryService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class CatBreedsInquiryRepositoryImpl @Inject constructor(
    private val catBreedsDao: CatBreedsDao,
    private val catBreedsInquiryService: CatBreedsInquiryService
): CatBreedsInquiryRepository {

    override fun getBreeds(): Flow<CatBreedModels> = flow {
        var catBreedEntities = catBreedsDao.getBreeds()

        if (catBreedEntities.isEmpty()) {
            val response = catBreedsInquiryService.getCatBreeds()

            catBreedsDao.insertCatBreeds(response.asEntity())
            catBreedEntities = catBreedsDao.getBreeds()
        }
        emit(catBreedEntities.asModel())
    }.flowOn(Dispatchers.IO)
        .catch {
            Log.e("Repository", "${it.message}")
            emit(emptyList())
        }

}