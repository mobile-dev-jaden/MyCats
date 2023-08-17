package com.jaden.mycats.ui.screens

import androidx.lifecycle.ViewModel
import com.jaden.mycats.ui.models.HomeImageModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(): ViewModel() {

    val homeImageModels = listOf(
        HomeImageModel(""),
        HomeImageModel(""),
        HomeImageModel(""),
        HomeImageModel(""),
    )
}