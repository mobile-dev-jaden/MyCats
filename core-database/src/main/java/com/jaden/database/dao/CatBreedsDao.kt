package com.jaden.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.jaden.database.entities.CatBreedEntities

@Dao
interface CatBreedsDao {

    @Query("SELECT * FROM cat_breeds")
    suspend fun getBreeds(): CatBreedEntities

    @Insert
    suspend fun insertCatBreeds(catBreedEntities: CatBreedEntities)

    @Query("DELETE FROM cat_breeds")
    suspend fun clearCatBreeds()
}