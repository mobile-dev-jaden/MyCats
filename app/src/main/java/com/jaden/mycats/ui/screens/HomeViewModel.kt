package com.jaden.mycats.ui.screens

import android.util.Log
import androidx.lifecycle.ViewModel
import com.jaden.network.response.ImageInformationList
import com.jaden.network.service.ImageSearchService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val imageSearchService: ImageSearchService,
): ViewModel() {

    fun getImagesFlow(): Flow<ImageInformationList> = try {
        imageSearchService.getImages({
            Log.d("Home View Model", "On Start flow")
        }, {
            Log.d("Home View Model", "On Complete flow")
        })
    } catch (exception: Exception) {
        Log.d("", "Error :: ${exception.message}")
        emptyFlow()
    }

}