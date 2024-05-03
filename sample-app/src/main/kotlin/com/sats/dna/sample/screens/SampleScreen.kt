package com.sats.dna.sample.screens

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.sats.dna.sample.internal.LocalAnimatedContentScope

sealed class SampleScreen(
    private val screen: @Composable (navController: NavController) -> Unit,
) {
    context(NavGraphBuilder, AnimatedContentScope)
    @Composable
    fun Content(navController: NavController) {
        CompositionLocalProvider(LocalAnimatedContentScope provides this@AnimatedContentScope) {
            screen(navController)
        }
    }
}
