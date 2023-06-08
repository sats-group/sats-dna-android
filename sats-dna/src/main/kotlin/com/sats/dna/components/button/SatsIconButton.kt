package com.sats.dna.components.button

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
@OptIn(ExperimentalAnimationApi::class)
fun SatsIconButton(
    onClick: () -> Unit,
    icon: Painter,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    colors: SatsButtonColor = SatsButtonColor.Primary,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    isLarge: Boolean = false,
) {
    val isActuallyEnabled = isEnabled && !isLoading
    val backgroundColor = animatedBackgroundColor(isEnabled, colors)

    Box(
        modifier = modifier
            .clip(SatsTheme.shapes.roundedCorners.small)
            .background(backgroundColor)
            .clickable(isActuallyEnabled, onClickLabel, Role.Button, onClick),
        contentAlignment = Alignment.Center,
    ) {
        val contentColor = animatedContentColor(isActuallyEnabled, colors)

        AnimatedContent(isLoading, Modifier.padding(animatedPadding(isLarge)), label = "Loading state") { isLoading ->
            if (isLoading) {
                CircularProgressIndicator(Modifier.size(24.dp), contentColor, strokeWidth = 2.dp)
            } else {
                Icon(icon, contentDescription = null, Modifier.size(24.dp), contentColor)
            }
        }
    }
}

@Composable
private fun animatedBackgroundColor(isEnabled: Boolean, colors: SatsButtonColor) =
    animateColorAsState(
        if (isEnabled) colors.backgroundColor else colors.disabledBackgroundColor,
        label = "Color",
    ).value

@Composable
private fun animatedContentColor(isEnabled: Boolean, colors: SatsButtonColor) =
    animateColorAsState(
        if (isEnabled) colors.contentColor else colors.disabledContentColor,
        label = "Color",
    ).value

@Composable
private fun animatedPadding(isLarge: Boolean) =
    animateDpAsState(
        if (isLarge) SatsTheme.spacing.m else SatsTheme.spacing.xs,
        label = "Padding",
    ).value

@LightDarkPreview
@Composable
private fun Preview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsIconButton(
                onClick = {},
                icon = SatsTheme.icons.barbell,
                onClickLabel = null,
                modifier = Modifier.padding(SatsTheme.spacing.s),
                colors = color,
            )
        }
    }
}