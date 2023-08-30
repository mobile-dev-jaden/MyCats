package com.jaden.data.module

import com.jaden.data.repositories.CatBreedsInquiryRepo
import com.jaden.data.repositories.CatBreedsInquiryRepoImpl
import com.jaden.data.repositories.ImageRepository
import com.jaden.data.repositories.ImageRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindsImageRepository(
        imageRepositoryImpl: ImageRepositoryImpl
    ): ImageRepository

    @Binds
    @Singleton
    abstract fun bindsCatBreedsRepository(
        catBreedsInquiryRepoImpl: CatBreedsInquiryRepoImpl
    ): CatBreedsInquiryRepo
}
