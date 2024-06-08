package com.junclabs.parkguide

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.junclabs.parkguide.ui.ParkGuideViewModel
import com.junclabs.parkguide.ui.DetailParkScreen
import com.junclabs.parkguide.ui.ParksScreen
import com.junclabs.parkguide.ui.StatesScreen

enum class Screen {
    States, Parks, DetailPark,
}

@Composable
fun Navigation(
    viewModel: ParkGuideViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.States.name) {
        composable(route = Screen.States.name) {
            StatesScreen(
                onStateClick = { navController.navigate(Screen.DetailPark.name) },
                viewModel = viewModel,
                uiState = uiState
            )
        }
        composable(route = Screen.Parks.name) {
            DetailParkScreen(
                onNavigateBack = {
                    navController.popBackStack(
                        Screen.DetailPark.name, inclusive = false
                    )
                },
                uiState = uiState
            )
        }
        composable(route = Screen.DetailPark.name) {
            ParksScreen(
                onParkClick = { navController.navigate(Screen.Parks.name) },
                onNavigateBack = {
                    navController.popBackStack(
                        Screen.States.name, inclusive = false
                    )
                },
                viewModel = viewModel,
                uiState = uiState
            )
        }
    }
}
