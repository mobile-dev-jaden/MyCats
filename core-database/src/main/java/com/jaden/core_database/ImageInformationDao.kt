package com.jaden.core_database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ImageInformationDao {
	@Query("SELECT * FROM image")
	suspend fun getAll(): List<ImageEntity>

	@Insert
	suspend fun insertAll(vararg imageEntity: ImageEntity)

	@Insert
	suspend fun insertAll(imageEntities: List<ImageEntity>)

	@Update
	suspend fun updateFavoriteImage(vararg imageEntity: ImageEntity)
}