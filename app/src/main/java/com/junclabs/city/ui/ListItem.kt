package com.junclabs.city.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.junclabs.city.data.Category
import com.junclabs.city.data.Place

@Composable
fun CategoryListItem(
    category: Category, onClick: (Category) -> Unit, modifier: Modifier = Modifier
) {
    Card(
        modifier
            .fillMaxWidth()
            .size(150.dp)
            .clickable { onClick(category) }) {
        Box(
            modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            Text(text = stringResource(id = category.title), fontWeight = FontWeight.W600)
        }
    }
}

@Composable
fun PlaceListItem(
    place: Place, onClick: (Place) -> Unit, modifier: Modifier = Modifier
) {
    Card(
        modifier
            .fillMaxWidth()
            .size(150.dp)
            .clickable { onClick(place) }) {
        Box(
            modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            Text(text = stringResource(id = place.title), fontWeight = FontWeight.W600)
        }
    }
}
