package com.jaden.mycats.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        items(homeViewModel.homeImageModels) { homeImageModel ->
            Text(text = homeImageModel.uuid.toString())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_HomeScreen() {
    val viewModel: HomeViewModel = hiltViewModel()
    HomeScreen(homeViewModel = viewModel)
}
