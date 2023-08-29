package com.jaden.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "image")
data class ImageEntity(
	@PrimaryKey val uuid: String,
	@ColumnInfo(name = "url") val url: String,
	@ColumnInfo(name = "favorite") val favorite: Boolean
)