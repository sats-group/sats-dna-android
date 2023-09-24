package com.sats.dna.sample

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.sats.dna.sample.home.HomeScreen
import com.sats.dna.sample.screens.BottomNavigationSampleScreen
import com.sats.dna.sample.screens.ButtonsSampleScreen
import com.sats.dna.sample.screens.CampaignModuleSampleScreen
import com.sats.dna.sample.screens.CardSampleScreen
import com.sats.dna.sample.screens.CheckboxSampleScreen
import com.sats.dna.sample.screens.ChipsSampleScreen
import com.sats.dna.sample.screens.CircularProgressIndicatorSampleScreen
import com.sats.dna.sample.screens.ColorsSampleScreen
import com.sats.dna.sample.screens.CompletedWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.IconsSampleScreen
import com.sats.dna.sample.screens.LabelsSampleScreen
import com.sats.dna.sample.screens.PlaceholdersSampleScreen
import com.sats.dna.sample.screens.ProgressBarsSampleScreen
import com.sats.dna.sample.screens.RadioButtonsSampleScreen
import com.sats.dna.sample.screens.ScheduleSampleScreen
import com.sats.dna.sample.screens.SnackbarSampleScreen
import com.sats.dna.sample.screens.SurfaceSampleScreen
import com.sats.dna.sample.screens.SwitchSampleScreen
import com.sats.dna.sample.screens.TextFieldSampleScreen
import com.sats.dna.sample.screens.TopBarSampleScreen
import com.sats.dna.sample.screens.TypographySampleScreen
import com.sats.dna.sample.screens.UpcomingWorkoutListItemSampleScreen

internal const val MainRoute = "sats-dna"

internal fun NavGraphBuilder.mainGraph(navController: NavController) {
    navigation(startDestination = "/", MainRoute) {
        homeScreen(navController)

        ColorsSampleScreen.navScreen(navController)
        IconsSampleScreen.navScreen(navController)
        TypographySampleScreen.navScreen(navController)

        BottomNavigationSampleScreen.navScreen(navController)
        ButtonsSampleScreen.navScreen(navController)
        CampaignModuleSampleScreen.navScreen(navController)
        CardSampleScreen.navScreen(navController)
        CheckboxSampleScreen.navScreen(navController)
        ChipsSampleScreen.navScreen(navController)
        CircularProgressIndicatorSampleScreen.navScreen(navController)
        CompletedWorkoutListItemSampleScreen.navScreen(navController)
        LabelsSampleScreen.navScreen(navController)
        PlaceholdersSampleScreen.navScreen(navController)
        ProgressBarsSampleScreen.navScreen(navController)
        RadioButtonsSampleScreen.navScreen(navController)
        ScheduleSampleScreen.navScreen(navController)
        SnackbarSampleScreen.navScreen(navController)
        SurfaceSampleScreen.navScreen(navController)
        SwitchSampleScreen.navScreen(navController)
        TextFieldSampleScreen.navScreen(navController)
        TopBarSampleScreen.navScreen(navController)
        UpcomingWorkoutListItemSampleScreen.navScreen(navController)
    }
}

private fun NavGraphBuilder.homeScreen(navController: NavController) {
    composable("/") {
        HomeScreen(navController)
    }
}
