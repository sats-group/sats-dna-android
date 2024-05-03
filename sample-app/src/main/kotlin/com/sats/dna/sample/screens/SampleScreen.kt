package com.sats.dna.sample.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.sats.dna.sample.internal.LocalAnimatedContentScope

sealed class SampleScreen(
    val name: String,
    val route: String,
    private val screen: @Composable (navController: NavController) -> Unit,
) {
    context(NavGraphBuilder)
    fun navScreen(navController: NavController) {
        composable(this@SampleScreen.route) {
            CompositionLocalProvider(LocalAnimatedContentScope provides this) {
                screen(navController)
            }
        }
    }
}
