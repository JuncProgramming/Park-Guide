package com.junclabs.parkguide.test

import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.junclabs.parkguide.Navigation
import com.junclabs.parkguide.Screen
import com.junclabs.parkguide.ui.theme.ParkGuideTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class ParkGuideNavigationTests {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private lateinit var navController: TestNavHostController

    @Before
    fun setupNavHost() {
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current).apply {
                navigatorProvider.addNavigator(ComposeNavigator())
            }
            ParkGuideTheme {
                Navigation(navController = navController)
            }
        }
    }

    @Test
    fun startDestinationAppearsCorrectly() {
        navController.assertCurrentRouteName(Screen.States.name)
    }

    @Test
    fun startDestinationAppearsCorrectlyAfterNavigatingFromParksScreen() {
        composeTestRule.runOnUiThread {
            navController.setCurrentDestination(Screen.Parks.name)
            navController.navigateUp()
        }
        navController.assertCurrentRouteName(Screen.States.name)
    }

    @Test
    fun startDestinationAppearsCorrectlyAfterNavigatingFromDetailParkScreen() {
        composeTestRule.runOnUiThread {
            navController.setCurrentDestination(Screen.DetailPark.name)
            navController.navigateUp()
            navController.navigateUp()
        }
        navController.assertCurrentRouteName(Screen.States.name)
    }
}