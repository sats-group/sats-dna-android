package com.sats.dna.components.button

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.lerp
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
internal fun buttonPadding(size: SatsButtonSize): PaddingValues {
    val vertical = animateDpAsState(
        when (size) {
            SatsButtonSize.Small -> SatsTheme.spacing.xs
            SatsButtonSize.Basic -> SatsTheme.spacing.xs
            SatsButtonSize.Large -> SatsTheme.spacing.s
        },
        label = "Vertical padding",
    )

    val horizontal = animateDpAsState(
        when (size) {
            SatsButtonSize.Small -> SatsTheme.spacing.xs
            SatsButtonSize.Basic -> SatsTheme.spacing.s
            SatsButtonSize.Large -> SatsTheme.spacing.m
        },
        label = "Horizontal padding",
    )

    return PaddingValues(
        horizontal = horizontal.value,
        vertical = vertical.value,
    )
}

@Composable
internal fun minContentHeight(size: SatsButtonSize): Dp {
    return animateDpAsState(
        when (size) {
            SatsButtonSize.Small -> 16.dp
            SatsButtonSize.Basic -> 24.dp
            SatsButtonSize.Large -> 24.dp
        },
        label = "Content height",
    ).value
}

@Composable
internal fun textStyle(size: SatsButtonSize): TextStyle {
    return animateTextStyleAsState(
        when (size) {
            SatsButtonSize.Small -> SatsTheme.typography.normal.buttonSmall
            SatsButtonSize.Basic -> SatsTheme.typography.normal.buttonBasic
            SatsButtonSize.Large -> SatsTheme.typography.normal.buttonLarge
        },
    ).value
}

@Composable
internal fun animateTextStyleAsState(targetValue: TextStyle): State<TextStyle> {
    val animation = remember { Animatable(0f) }

    var previousTextStyle by remember { mutableStateOf(targetValue) }
    var nextTextStyle by remember { mutableStateOf(targetValue) }

    val textStyleState = remember(animation.value) {
        derivedStateOf {
            lerp(previousTextStyle, nextTextStyle, animation.value)
        }
    }

    LaunchedEffect(targetValue) {
        previousTextStyle = textStyleState.value
        nextTextStyle = targetValue

        animation.snapTo(0f)
        animation.animateTo(1f, animationSpec = spring())
    }

    return textStyleState
}
