package com.jaden.mycats.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun HomeScreen(homeViewModel: HomeViewModel) {

    val imageModels = homeViewModel.imageModels.collectAsState()

    LazyColumn {
        items(imageModels.value) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(20.dp)
            ) {
                AsyncImage(
                    model = it.getUrl(),
                    contentScale = ContentScale.FillWidth,
                    contentDescription = null, modifier = Modifier.fillMaxWidth()
                )
                Button(
                    onClick = { homeViewModel.favoriteImage(it) },
                    modifier = Modifier
                        .padding(10.dp)
                        .align(Alignment.BottomEnd)
                ) {
                    if (it.getFavorite()) {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = null,
                            tint = Color.Red
                        )
                    } else {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    val imageModels = listOf<String>()

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(imageModels) {
            Text(text = "Example")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_HomeScreen() {
    HomeScreen()
}
