package com.jaden.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ImageInformationDao {
	companion object {
		private const val IS_FAVORITE = 1
	}

	@Query("SELECT * FROM image")
	suspend fun getAll(): List<ImageEntity>

	@Query("SELECT * FROM image WHERE favorite = $IS_FAVORITE")
	suspend fun getFavorites(): List<ImageEntity>

	@Insert
	suspend fun insertAll(vararg imageEntity: ImageEntity)

	@Insert
	suspend fun insertAll(imageEntities: List<ImageEntity>)

	@Update
	suspend fun updateFavoriteImage(vararg imageEntity: ImageEntity)
}