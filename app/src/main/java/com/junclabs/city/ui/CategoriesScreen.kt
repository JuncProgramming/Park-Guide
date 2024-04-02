package com.junclabs.city.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.junclabs.city.Screen
import com.junclabs.city.data.Category
import com.junclabs.city.data.DataSource
import com.junclabs.city.data.Place
import com.junclabs.city.util.AppBar

@Composable
fun CategoriesScreen(
    category: Category,
    onPlaceClick: (Place) -> Unit,
    modifier: Modifier = Modifier,
    onNavigationClick: () -> Unit
) {
    Scaffold(topBar = {
        AppBar(
            title = stringResource(id = category.title), onNavigationIconClick = onNavigationClick, navigateBack = true
        )
    }) { innerPadding ->

        LazyVerticalGrid(columns = GridCells.Fixed(2),modifier.padding(innerPadding)) {
            items(DataSource.places) { place ->
                RecommendationListItem(recommendation = place, onClick = { onPlaceClick(place) })
            }

        }
    }
}

