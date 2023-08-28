package com.jaden.mycats.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.jaden.mycats.ui.models.HomeImageModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel) {

    val imageModels by homeViewModel.getImagesFlow().collectAsState(initial = emptyList())

    LazyColumn {
        items(imageModels) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(20.dp)
            ) {
                AsyncImage(
                    model = it.url,
                    contentScale = ContentScale.FillWidth,
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()
                )
                Button(
                    onClick = { /* TODO : do favorite the picture */ },
                    modifier = Modifier
                        .padding(10.dp)
                        .align(Alignment.BottomEnd)
                ) {
                    Icon(Icons.Filled.Favorite, null)
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    val imageModels = listOf(
        HomeImageModel("url 1"),
        HomeImageModel("url 2"),
        HomeImageModel("url 3"),
        HomeImageModel("url 4"),
        HomeImageModel("url 5"),
        HomeImageModel("url 6"),
    )

    LazyColumn {
       items(imageModels) {
           AsyncImage(
               model = it.url,
               contentDescription = null,
           )
       }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_HomeScreen() {
    HomeScreen()
}
