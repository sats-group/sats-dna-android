package com.sats.dna.components.button

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme

@Deprecated("Replace with either SatsIconButton2 or SatsTopAppBarIconButton")
@Composable
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
    SatsIconButton(
        onClick = onClick,
        icon = {
            val isActuallyEnabled = isEnabled && !isLoading
            val contentColor = colors.animatedContentColor(isActuallyEnabled)

            MaterialIcon(icon, contentDescription = null, Modifier.size(24.dp), contentColor)
        },
        onClickLabel = onClickLabel,
        modifier = modifier,
        colors = colors,
        isEnabled = isEnabled,
        isLoading = isLoading,
        isLarge = isLarge,
    )
}

@Composable
private fun SatsIconButton(
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    colors: SatsButtonColor = SatsButtonColor.Primary,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    isLarge: Boolean = false,
) {
    val isActuallyEnabled = isEnabled && !isLoading
    val backgroundColor = colors.animatedContainerColor(isEnabled)

    Box(
        modifier = modifier
            .clip(SatsTheme.shapes.roundedCorners.small)
            .background(backgroundColor)
            .clickable(isActuallyEnabled, onClickLabel, Role.Button, onClick),
        contentAlignment = Alignment.Center,
    ) {
        AnimatedContent(isLoading, Modifier.padding(animatedPadding(isLarge)), label = "Loading state") { isLoading ->
            if (isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(24.dp),
                    color = colors.contentColor,
                    strokeWidth = 2.dp,
                )
            } else {
                icon()
            }
        }
    }
}

@Composable
private fun animatedPadding(isLarge: Boolean) =
    animateDpAsState(
        if (isLarge) SatsTheme.spacing.m else SatsTheme.spacing.xs,
        label = "Padding",
    ).value

@PreviewLightDark
@Composable
private fun SatsIconButtonPreview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
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
