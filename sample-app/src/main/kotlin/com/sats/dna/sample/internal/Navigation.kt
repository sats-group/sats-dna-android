package com.sats.dna.sample.internal

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

internal inline fun <reified T : Any> NavGraphBuilder.sampleAppComposable(
    noinline content: @Composable AnimatedContentScope.(NavBackStackEntry) -> Unit,
) {
    composable<T> {
        CompositionLocalProvider(LocalAnimatedContentScope provides this) {
            content(it)
        }
    }
}
