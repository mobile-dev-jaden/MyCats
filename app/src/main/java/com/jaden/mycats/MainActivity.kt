package com.jaden.mycats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jaden.mycats.ui.components.MyCatBottomBar
import com.jaden.mycats.ui.components.MyCatScaffold
import com.jaden.mycats.ui.models.FavoriteScreenRoute
import com.jaden.mycats.ui.models.HomeScreenRoute
import com.jaden.mycats.ui.models.ProfileScreenRoute
import com.jaden.mycats.ui.screens.FavoriteScreen
import com.jaden.mycats.ui.screens.HomeScreen
import com.jaden.mycats.ui.screens.ProfileScreen
import com.jaden.mycats.ui.theme.MyCatsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyCatsTheme {
                val navController = rememberNavController()

                MyCatScaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = { MyCatBottomBar(navController = navController) }
                ) { paddingValues ->
                    NavHost(
                        modifier = Modifier
                            .padding(paddingValues)
                            .fillMaxSize(),
                        navController = navController,
                        startDestination = HomeScreenRoute.route,
                    ) {
                        composable(HomeScreenRoute.route) {
                            HomeScreen()
                        }

                        composable(FavoriteScreenRoute.route) {
                            FavoriteScreen()
                        }

                        composable(ProfileScreenRoute.route) {
                            ProfileScreen()
                        }
                    }
                }
            }
        }
    }
}

