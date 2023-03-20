@file:OptIn(ExperimentalAnimationApi::class)

package com.sats.dna.sample

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.navigation
import com.sats.dna.sample.colors.ColorsScreen
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

internal fun NavController.navigateToColors() {
    navigate("/colors")
}

internal fun NavController.navigateToTypography() {
    navigate("/typography")
}

internal fun NavController.navigateToIcons() {
    navigate("/icons")
}