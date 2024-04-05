package com.junclabs.city.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.junclabs.city.data.Place
import com.junclabs.city.util.AppBar

@Composable
fun PlaceScreen(place: Place, modifier: Modifier = Modifier, onNavigationClick: () -> Unit) {
    Scaffold(topBar = {
        AppBar(
            title = stringResource(id = place.title),
            onNavigationIconClick = onNavigationClick,
            navigateBack = true
        )
    }) { innerPadding ->

        Column(
            modifier = modifier
                .padding(12.dp)
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.CenterVertically),

        ) {
            Image(
                painter = painterResource(id = place.image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
            )
            Text(text = stringResource(id = place.description), fontSize = 24.sp)
        }
    }
}