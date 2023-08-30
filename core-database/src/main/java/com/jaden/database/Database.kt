package com.jaden.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jaden.database.dao.CatBreedsDao
import com.jaden.database.dao.ImageInformationDao
import com.jaden.database.entities.CatBreedEntity
import com.jaden.database.entities.ImageEntity

@Database(
	entities = [
		ImageEntity::class,
		CatBreedEntity::class
	],
	version = 1
)
abstract class Database: RoomDatabase() {

	abstract fun imageInformationDao(): ImageInformationDao

	abstract fun catBreedsDao(): CatBreedsDao
}