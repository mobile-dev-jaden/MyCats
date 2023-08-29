package com.jaden.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ImageEntity::class], version = 1)
abstract class Database: RoomDatabase() {
	abstract fun imageInformationDao(): ImageInformationDao
}