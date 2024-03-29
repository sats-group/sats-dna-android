package com.sats.dna.components.button

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsSurface
import com.sats.dna.icons.Back
import com.sats.dna.icons.Barbell
import com.sats.dna.icons.BellCherry
import com.sats.dna.icons.Cherry
import com.sats.dna.icons.Notifications
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsIconButton(
    onClick: () -> Unit,
    icon: ImageVector,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    colors: SatsButtonColor = SatsButtonColor.Primary,
    size: SatsButtonSize = SatsButtonSize.Basic,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
) {
    val isActuallyEnabled = isEnabled && !isLoading

    SatsIconButtonLayout(
        onClick = onClick,
        onClickLabel = onClickLabel,
        modifier = modifier,
        containerColor = colors.animatedContainerColor(isActuallyEnabled),
        borderColor = colors.animatedBorderColor(isActuallyEnabled),
        contentColor = colors.animatedContentColor(isActuallyEnabled),
        size = size,
        isEnabled = isActuallyEnabled,
        isLoading = isLoading,
    ) {
        val iconContent = remember(isLoading) {
            if (isLoading) {
                SatsButtonIconContent.Loading
            } else {
                SatsButtonIconContent.Icon(icon)
            }
        }

        val contentColor = colors.animatedContentColor(isActuallyEnabled)

        val iconContentSize = animateDpAsState(
            when (size) {
                SatsButtonSize.Small -> 18.dp
                SatsButtonSize.Basic -> 22.dp
                SatsButtonSize.Large -> 24.dp
            },
            label = "Icon content size",
        ).value

        AnimatedContent(iconContent, label = "Animated icon content") { actualContent ->
            when (actualContent) {
                is SatsButtonIconContent.Empty -> Unit

                is SatsButtonIconContent.Icon -> MaterialIcon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.size(iconContentSize),
                    tint = contentColor,
                )

                is SatsButtonIconContent.Loading -> CircularProgressIndicator(
                    Modifier.size(iconContentSize),
                    color = contentColor,
                    strokeWidth = 1.5.dp,
                )
            }
        }
    }
}

@Composable
fun SatsTopAppBarIconButton(
    onClick: () -> Unit,
    icon: ImageVector,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    tint: Color = SatsButtonColor.Secondary.animatedContentColor(isEnabled),
) {
    SatsTopAppBarIconButton(
        onClick = onClick,
        onClickLabel = onClickLabel,
        modifier = modifier,
        isEnabled = isEnabled,
    ) {
        MaterialIcon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(22.dp),
            tint = tint,
        )
    }
}

@Composable
fun SatsBellIconButton(
    onClick: () -> Unit,
    onClickLabel: String?,
    showCherry: Boolean,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
) {
    SatsTopAppBarIconButton(
        onClick = onClick,
        onClickLabel = onClickLabel,
        modifier = modifier,
        isEnabled = isEnabled,
    ) {
        val colors = SatsButtonColor.Secondary
        val contentColor = colors.animatedContentColor(isEnabled)
        val iconContentSize = 22.dp

        if (showCherry) {
            MaterialIcon(
                imageVector = SatsIcons.BellCherry,
                contentDescription = null,
                modifier = Modifier.size(iconContentSize),
                tint = contentColor,
            )

            MaterialIcon(
                imageVector = SatsIcons.Cherry,
                contentDescription = null,
                modifier = Modifier.size(iconContentSize),
                tint = SatsTheme.colors2.buttons.action.default.fg,
            )
        } else {
            MaterialIcon(
                imageVector = SatsIcons.Notifications,
                contentDescription = null,
                modifier = Modifier.size(iconContentSize),
                tint = contentColor,
            )
        }
    }
}

@Composable
private fun SatsIconButtonLayout(
    onClick: () -> Unit,
    onClickLabel: String?,
    containerColor: Color,
    borderColor: Color?,
    contentColor: Color,
    size: SatsButtonSize,
    isEnabled: Boolean,
    isLoading: Boolean,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    val isActuallyEnabled = isEnabled && !isLoading

    Surface(
        modifier = modifier.semantics {
            onClick(onClickLabel, action = { isActuallyEnabled })
        },
        onClick = onClick,
        enabled = isEnabled,
        color = containerColor,
        contentColor = contentColor,
        border = borderColor?.let { BorderStroke(1.dp, it) },
        shape = SatsTheme.shapes.roundedCorners.small,
    ) {
        val buttonSize = animateDpAsState(
            when (size) {
                SatsButtonSize.Small -> 32.dp
                SatsButtonSize.Basic -> 36.dp
                SatsButtonSize.Large -> 52.dp
            },
            label = "Button size",
        ).value

        Box(
            Modifier
                .size(buttonSize)
                .aspectRatio(1f),
            contentAlignment = Alignment.Center,
        ) {
            content()
        }
    }
}

@Composable
private fun SatsTopAppBarIconButton(
    onClick: () -> Unit,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    content: @Composable () -> Unit,
) {
    val colors: SatsButtonColor = SatsButtonColor.Secondary

    SatsIconButtonLayout(
        onClick = onClick,
        onClickLabel = onClickLabel,
        modifier = modifier,
        containerColor = colors.animatedContainerColor(isEnabled),
        contentColor = colors.animatedContentColor(isEnabled),
        borderColor = null,
        size = SatsButtonSize.Basic,
        isEnabled = isEnabled,
        isLoading = false,
    ) {
        content()
    }
}

@PreviewLightDark
@Composable
private fun SatsIconButtonPreview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsIconButton(
                onClick = {},
                icon = SatsIcons.Barbell,
                onClickLabel = null,
                modifier = Modifier.padding(SatsTheme.spacing.s),
                colors = color,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsTopAppBarIconButtonPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsTopAppBarIconButton(
                onClick = {},
                icon = SatsIcons.Back,
                onClickLabel = null,
                modifier = Modifier.padding(SatsTheme.spacing.s),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsBellIconButtonNoCherryPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsBellIconButton(
                onClick = {},
                onClickLabel = null,
                showCherry = false,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsBellIconButtonWithCherryPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsBellIconButton(
                onClick = {},
                onClickLabel = null,
                showCherry = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
