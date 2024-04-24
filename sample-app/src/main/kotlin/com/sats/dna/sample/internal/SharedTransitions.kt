@file:OptIn(ExperimentalSharedTransitionApi::class)

package com.sats.dna.sample.internal

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier

@Composable
internal fun Modifier.trySharedBounds(key: String): Modifier {
    val sharedTransitionScope = LocalSharedTransitionScope.current ?: return this
    val animatedContentScope = LocalAnimatedContentScope.current ?: return this

    return with(sharedTransitionScope) {
        val state = rememberSharedContentState(key)
        sharedBounds(state, animatedContentScope)
    }
}

internal val LocalAnimatedContentScope = compositionLocalOf<AnimatedContentScope?> { null }
internal val LocalSharedTransitionScope = compositionLocalOf<SharedTransitionScope?> { null }
