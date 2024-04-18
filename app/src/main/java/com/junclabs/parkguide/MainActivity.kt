package com.junclabs.parkguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.junclabs.parkguide.ui.theme.ParkGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ParkGuideTheme {
                Navigation()
            }
        }
    }
}
