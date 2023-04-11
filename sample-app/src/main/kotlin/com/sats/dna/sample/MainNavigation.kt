@file:OptIn(ExperimentalAnimationApi::class)

package com.sats.dna.sample

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.navigation
import com.sats.dna.sample.colors.ColorsScreen
import com.sats.dna.sample.components.buttons.ButtonsScreen
import com.sats.dna.sample.components.chip.ChipsScreen
import com.sats.dna.sample.components.progressbar.ProgressBarsScreen
import com.sats.dna.sample.home.HomeScreen
import com.sats.dna.sample.icons.IconsScreen
import com.sats.dna.sample.typography.TypographyScreen

internal const val MainRoute = "sats-dna"

internal fun NavGraphBuilder.mainGraph(navController: NavController) {
    navigation(startDestination = "/", MainRoute) {
        homeScreen(navController)
        colorsScreen(navigateUp = navController::navigateUp)
        iconsScreen(navigateUp = navController::navigateUp)
        typographyScreen(navigateUp = navController::navigateUp)

        buttonsScreen(navigateUp = navController::navigateUp)
        chipsScreen(navigateUp = navController::navigateUp)
        progressBarsScreen(navigateUp = navController::navigateUp)
    }
}

private fun NavGraphBuilder.homeScreen(navController: NavController) {
    composable("/") {
        HomeScreen(navController)
    }
}

private fun NavGraphBuilder.colorsScreen(navigateUp: () -> Unit) {
    composable("/colors") {
        ColorsScreen(navigateUp = navigateUp)
    }
}

private fun NavGraphBuilder.typographyScreen(navigateUp: () -> Unit) {
    composable("/typography") {
        TypographyScreen(navigateUp = navigateUp)
    }
}

private fun NavGraphBuilder.iconsScreen(navigateUp: () -> Unit) {
    composable("/icons") {
        IconsScreen(navigateUp = navigateUp)
    }
}

private fun NavGraphBuilder.buttonsScreen(navigateUp: () -> Unit) {
    composable("/components/buttons") {
        ButtonsScreen(navigateUp = navigateUp)
    }
}

private fun NavGraphBuilder.chipsScreen(navigateUp: () -> Unit) {
    composable("/components/chips") {
        ChipsScreen(navigateUp = navigateUp)
    }
}

private fun NavGraphBuilder.progressBarsScreen(navigateUp: () -> Unit) {
    composable("/components/progress-bars") {
        ProgressBarsScreen(navigateUp = navigateUp)
    }
}

internal fun NavController.navigateToColors() {
    navigate("/colors")
}

internal fun NavController.navigateToTypography() {
    navigate("/typography")
}

internal fun NavController.navigateToIcons() {
    navigate("/icons")
}

internal fun NavController.navigateToButtons() {
    navigate("/components/buttons")
}

internal fun NavController.navigateToChips() {
    navigate("/components/chips")
}

internal fun NavController.navigateToProgressBars() {
    navigate("/components/progress-bars")
}
