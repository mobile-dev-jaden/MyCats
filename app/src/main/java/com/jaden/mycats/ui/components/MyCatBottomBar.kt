package com.jaden.mycats.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.jaden.mycats.ui.models.FavoriteScreenRoute
import com.jaden.mycats.ui.models.HomeScreenRoute
import com.jaden.mycats.ui.models.ProfileScreenRoute
import com.jaden.mycats.ui.models.ScreenRoute

private val navigationBarItems = listOf(
    HomeScreenRoute,
    FavoriteScreenRoute,
    ProfileScreenRoute
)

@Composable
fun MyCatBottomBar(navController: NavController) {
    val route = navController.getRoute().route

    NavigationBar {
        navigationBarItems.forEach { screenRoute ->
            NavigationBarItem(
                selected = screenRoute.route == route,
                onClick = { navController.navigate(screenRoute = screenRoute) },
                icon = { Icon(screenRoute.icon, null) }
            )
        }
    }
}

@Composable
fun NavController.getRoute(): ScreenRoute = ScreenRoute
    .mapToScreenRoute(currentBackStackEntryAsState().value?.destination?.route)

fun NavController.navigate(screenRoute: ScreenRoute) = this.navigate(screenRoute.route) {
    graph.startDestinationRoute?.let {
        popUpTo(it) { saveState = true }
    }
    launchSingleTop = true
    restoreState = true
}

@Preview
@Composable
fun Preview_MyCatBottomBar() {
    NavigationBar {
        val currentRoute = HomeScreenRoute
        navigationBarItems.forEach { screenRoute ->
            NavigationBarItem(
                selected = currentRoute == screenRoute,
                onClick = { },
                icon = { Icon(screenRoute.icon, null) },
                label = { Text(screenRoute.label) }
            )
        }
    }
}
