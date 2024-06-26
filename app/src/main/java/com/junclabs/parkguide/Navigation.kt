package com.junclabs.parkguide

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.junclabs.parkguide.ui.DetailParkScreen
import com.junclabs.parkguide.ui.ParkGuideViewModel
import com.junclabs.parkguide.ui.ParksScreen
import com.junclabs.parkguide.ui.StatesScreen

enum class Screen {
    States, Parks, DetailPark,
}

@Composable
fun Navigation(
    viewModel: ParkGuideViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val uiState by viewModel.uiState.collectAsState()
    NavHost(navController = navController, startDestination = Screen.States.name) {
        composable(route = Screen.States.name) {
            StatesScreen(
                onNavigate = {
                    navController.navigate(it.route)
                },
                viewModel = viewModel,
                uiState = uiState
            )
        }
        composable(route = Screen.Parks.name) {
            ParksScreen(
                onNavigate = {
                    navController.navigate(it.route)
                },
                onNavigateUp = {
                    navController.navigateUp()
                },
                viewModel = viewModel,
                uiState = uiState,
            )
        }
        composable(route = Screen.DetailPark.name) {
            DetailParkScreen(
                onNavigateUp = {
                    navController.navigateUp()
                },
                viewModel = viewModel,
                uiState = uiState
            )
        }
    }
}
