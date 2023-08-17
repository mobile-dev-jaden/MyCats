package com.jaden.mycats.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCatTopBar() {
    TopAppBar(
        title = { Text(text = "My Cats") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Preview_MyCatTopBar() {
    TopAppBar(
        title = { Text(text = "My Cats") }
    )
}
