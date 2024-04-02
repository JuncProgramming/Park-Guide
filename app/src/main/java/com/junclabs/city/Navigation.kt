package com.junclabs.city

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.junclabs.city.data.DataSource
import com.junclabs.city.ui.CategoriesScreen
import com.junclabs.city.ui.CityScreen
import com.junclabs.city.ui.PlaceScreen

enum class Screen(@StringRes val title: Int) {
    City(title = R.string.app_name), Recommendations(title = R.string.recommendations), Category(
        title = R.string.category
    ),
}

@Composable
fun Navigation(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Screen.City.name) {
        composable(route = Screen.City.name) {
            CityScreen(onClick = { navController.navigate(Screen.Category.name) })
        }
        composable(route = Screen.Recommendations.name) {
            PlaceScreen(place = DataSource.defaultPlace, onNavigationClick = {
                navController.popBackStack(
                    Screen.Category.name, inclusive = false
                )
            })
        }
        composable(route = Screen.Category.name) {
            CategoriesScreen(category = DataSource.defaultCategory,
                onPlaceClick = { navController.navigate(Screen.Recommendations.name) },
                onNavigationClick = {
                    navController.popBackStack(
                        Screen.City.name, inclusive = false
                    )
                })
        }
    }
}
