package com.jaden.mycats.ui.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ScreenRoute(
    val label: String,
    val icon: ImageVector,
    val route: String
) {
    companion object {
        fun mapToScreenRoute(route: String?): ScreenRoute = when (route) {
            HomeScreenRoute.route -> HomeScreenRoute
            FavoriteScreenRoute.route -> FavoriteScreenRoute
            ProfileScreenRoute.route -> ProfileScreenRoute
            else -> HomeScreenRoute
        }
    }
}

object HomeScreenRoute: ScreenRoute("Home", Icons.Filled.Home, "home")
object FavoriteScreenRoute: ScreenRoute("Favorite", Icons.Filled.Favorite, "favorite")
object ProfileScreenRoute: ScreenRoute("Profile", Icons.Filled.Person, "profile")
