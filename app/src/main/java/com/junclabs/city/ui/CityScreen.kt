package com.junclabs.city.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.junclabs.city.R
import com.junclabs.city.data.Category
import com.junclabs.city.util.AppBar

@Composable
fun CityScreen(
    modifier: Modifier = Modifier,
    onCategoryClick: (Category) -> Unit,
    viewModel: CityViewModel,
    uiState: UiState,
) {
    Scaffold(topBar = {
        AppBar(
            title = stringResource(id = R.string.app_name),
            onNavigationIconClick = { },
            navigateBack = false
        )
    }) { innerPadding ->

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = modifier.padding(innerPadding),
        ) {
            items(uiState.categories) { category ->
                CategoryListItem(category = category,
                    onClick = { onCategoryClick(category); viewModel.updateCurrentCategory(it) })
            }

        }
    }

}