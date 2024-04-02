package com.junclabs.city.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.junclabs.city.R
import com.junclabs.city.data.Category
import com.junclabs.city.data.DataSource
import com.junclabs.city.util.AppBar

@Composable
fun CityScreen(modifier: Modifier = Modifier, onClick: (Category) -> Unit) {
    Scaffold(topBar = {
        AppBar(
            title = stringResource(id = R.string.app_name), onNavigationIconClick = { }, navigateBack = false
        )
    }) { innerPadding ->

        LazyVerticalGrid(columns = GridCells.Fixed(2), modifier.padding(innerPadding)) {
            items(DataSource.getCategories()) { category ->
                CategoryListItem(category = category, onClick = { onClick(category) })
            }

        }
    }

}