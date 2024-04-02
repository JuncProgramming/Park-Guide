package com.junclabs.city.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.junclabs.city.data.Category
import com.junclabs.city.data.Place

@Composable
fun CategoryListItem(
    category: Category, onClick: (Category) -> Unit, modifier: Modifier = Modifier
) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable { onClick(category) }) {
        Card(modifier = modifier) {
            Text(text = stringResource(id = category.title))
        }
    }

}

@Composable
fun RecommendationListItem(
    recommendation: Place, onClick: (Place) -> Unit, modifier: Modifier = Modifier
) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable { onClick(recommendation) }) {
        Card(modifier = modifier) {
            Text(text = stringResource(id = recommendation.title))
        }
    }
}
