package com.jaden.mycats.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.jaden.mycats.ui.models.ScreenRoute

@Composable
fun NavController.getRoute(): ScreenRoute = ScreenRoute
    .mapToScreenRoute(currentBackStackEntryAsState().value?.destination?.route)

fun NavController.navigate(screenRoute: ScreenRoute) = navigate(screenRoute.route) {
    graph.startDestinationRoute?.let {
        popUpTo(it) { saveState = true }
    }
    launchSingleTop = true
    restoreState = true
}