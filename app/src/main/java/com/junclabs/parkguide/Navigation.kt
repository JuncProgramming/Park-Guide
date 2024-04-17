package com.junclabs.parkguide

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.junclabs.parkguide.ui.CategoriesScreen
import com.junclabs.parkguide.ui.CityScreen
import com.junclabs.parkguide.ui.CityViewModel
import com.junclabs.parkguide.ui.PlaceScreen

enum class Screen {
    City, Recommendations, Category,
}

@Composable
fun Navigation(
    viewModel: CityViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.City.name) {
        composable(route = Screen.City.name) {
            CityScreen(
                onCategoryClick = { navController.navigate(Screen.Category.name) },
                viewModel = viewModel,
                uiState = uiState
            )
        }
        composable(route = Screen.Recommendations.name) {
            PlaceScreen(
                onNavigateBack = {
                    navController.popBackStack(
                        Screen.Category.name, inclusive = false
                    )
                },
                uiState = uiState
            )
        }
        composable(route = Screen.Category.name) {
            CategoriesScreen(
                onPlaceClick = { navController.navigate(Screen.Recommendations.name) },
                onNavigateBack = {
                    navController.popBackStack(
                        Screen.City.name, inclusive = false
                    )
                },
                viewModel = viewModel,
                uiState = uiState
            )
        }
    }
}
