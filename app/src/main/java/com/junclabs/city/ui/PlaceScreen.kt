package com.junclabs.city.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.junclabs.city.Screen
import com.junclabs.city.data.Place
import com.junclabs.city.util.AppBar

@Composable
fun PlaceScreen(place: Place, modifier: Modifier = Modifier, onNavigationClick: () -> Unit) {
    Scaffold(topBar = {
        AppBar(
            title = stringResource(id = place.title), onNavigationIconClick = onNavigationClick, navigateBack = true
        )
    }) { innerPadding ->

        Column(modifier.padding(innerPadding)) {
            Image(painter = painterResource(id = place.image), contentDescription = null)
            Text(text = stringResource(id = place.description))
        }
    }
}