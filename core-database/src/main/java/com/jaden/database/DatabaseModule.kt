package com.jaden.database

import android.content.Context
import androidx.room.Room
import com.jaden.database.dao.CatBreedsDao
import com.jaden.database.dao.ImageInformationDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

	@Singleton
	@Provides
	fun providesDatabase(
		@ApplicationContext
		context: Context
	): Database = Room
		.databaseBuilder(
			context = context,
			klass = Database::class.java,
			name = "image-database"
		)
		.build()

	@Singleton
	@Provides
	fun providesImageInformationDao(
		database: Database
	): ImageInformationDao = database.imageInformationDao()

	@Singleton
	@Provides
	fun providesCatBreedsDao(
		database: Database
	): CatBreedsDao = database.catBreedsDao()
}
