package com.jaden.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.jaden.database.entities.ImageEntities
import com.jaden.database.entities.ImageEntity

@Dao
interface ImageInformationDao {
	@Query("SELECT * FROM image")
	suspend fun getAll(): ImageEntities

	@Insert
	suspend fun insertAll(vararg imageEntity: ImageEntity)

	@Insert
	suspend fun insertAll(imageEntities: ImageEntities)

	@Update
	suspend fun updateFavoriteImage(vararg imageEntity: ImageEntity)
}