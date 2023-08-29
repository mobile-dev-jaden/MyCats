package com.jaden.mycats.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jaden.data.models.ImageModel
import com.jaden.data.models.ImageModels
import com.jaden.data.repositories.ImageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val imageRepository: ImageRepository
): ViewModel() {

    private val _imageModels: MutableStateFlow<ImageModels> = MutableStateFlow(emptyList())
    val imageModels: StateFlow<ImageModels> = _imageModels

    init { fetchImages() }

    private fun fetchImages() = viewModelScope.launch {
        imageRepository.getImages().collectLatest {
            _imageModels.emit(it)
        }
    }

    fun favoriteImage(imageModel: ImageModel) = viewModelScope.launch {
        imageRepository.favoriteImage(imageModel)
            .onCompletion { fetchImages() }
            .collect()
    }

}