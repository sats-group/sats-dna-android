package com.sats.dna.components.button.internal

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.lerp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.theme.SatsTheme

@Composable
internal fun SatsTextButtonContent(
    label: String,
    size: SatsButtonSize,
    isLoading: Boolean,
    icon: ImageVector?,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(textButtonPadding(size))
            .minSatsButtonSize(size)
            .wrapContentWidth(),
        verticalAlignment = CenterVertically,
    ) {
        val iconContent = remember(isLoading, icon) {
            when {
                isLoading -> SatsTextButtonIconContent.Loading
                icon != null -> SatsTextButtonIconContent.Icon(icon)
                else -> SatsTextButtonIconContent.Empty
            }
        }

        // Note the use of an end padding instead of a horizontal arrangement. The arrangement would
        // still put space between the AnimatedContent and the text, even if its content is empty.
        AnimatedContent(iconContent, label = "Animated icon content") { actualContent ->
            when (actualContent) {
                is SatsTextButtonIconContent.Empty -> Unit

                is SatsTextButtonIconContent.Icon -> {
                    Icon(
                        imageVector = actualContent.imageVector,
                        contentDescription = null,
                        tint = LocalContentColor.current,
                        modifier = Modifier
                            .padding(end = SatsTheme.spacing.s)
                            .size(leadingIconContentSize(size)),
                    )
                }

                is SatsTextButtonIconContent.Loading -> {
                    CircularProgressIndicator(
                        Modifier
                            .padding(end = SatsTheme.spacing.s)
                            .size(leadingIconContentSize(size)),
                        color = LocalContentColor.current,
                        strokeWidth = 1.5.dp,
                    )
                }
            }
        }

        Text(
            text = label,
            maxLines = 1,
            style = textStyle(size),
            textAlign = TextAlign.Center,
            color = LocalContentColor.current,
        )
    }
}

@Composable
private fun textButtonPadding(size: SatsButtonSize): PaddingValues {
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
private fun textStyle(size: SatsButtonSize): TextStyle {
    return animateTextStyleAsState(
        when (size) {
            SatsButtonSize.Small -> SatsTheme.typography.normal.buttonSmall
            SatsButtonSize.Basic -> SatsTheme.typography.normal.buttonBasic
            SatsButtonSize.Large -> SatsTheme.typography.normal.buttonLarge
        },
    ).value
}

@Composable
private fun leadingIconContentSize(size: SatsButtonSize): Dp {
    return animateDpAsState(
        when (size) {
            SatsButtonSize.Small -> 16.dp
            SatsButtonSize.Basic -> 18.dp
            SatsButtonSize.Large -> 24.dp
        },
        label = "Icon content size",
    ).value
}

@Composable
private fun animateTextStyleAsState(targetValue: TextStyle): State<TextStyle> {
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

private sealed interface SatsTextButtonIconContent {
    data class Icon(val imageVector: ImageVector) : SatsTextButtonIconContent
    data object Loading : SatsTextButtonIconContent
    data object Empty : SatsTextButtonIconContent
}
