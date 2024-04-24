package com.sats.dna.components.button

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.internal.SatsBaseButtonLayout
import com.sats.dna.components.button.internal.iconButtonContentSize
import com.sats.dna.components.button.internal.iconButtonPadding
import com.sats.dna.components.button.internal.minSatsButtonSize
import com.sats.dna.icons.Back
import com.sats.dna.icons.BellCherry
import com.sats.dna.icons.Cherry
import com.sats.dna.icons.Notifications
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsTopAppBarIconButton(
    onClick: () -> Unit,
    icon: ImageVector,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    tint: Color = SatsButtonColor.Secondary.animatedContentColor(isEnabled),
) {
    SatsTopAppBarIconButtonLayout(
        onClick = onClick,
        onClickLabel = onClickLabel,
        modifier = modifier,
        isEnabled = isEnabled,
    ) {
        Icon(
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
    SatsTopAppBarIconButtonLayout(
        onClick = onClick,
        onClickLabel = onClickLabel,
        modifier = modifier,
        isEnabled = isEnabled,
    ) {
        val contentColor = SatsButtonColor.Secondary.animatedContentColor(isEnabled)
        val iconContentSize = iconButtonContentSize(SatsButtonSize.Basic)

        if (showCherry) {
            Icon(
                imageVector = SatsIcons.BellCherry,
                contentDescription = null,
                modifier = Modifier.size(iconContentSize),
                tint = contentColor,
            )

            Icon(
                imageVector = SatsIcons.Cherry,
                contentDescription = null,
                modifier = Modifier.size(iconContentSize),
                tint = SatsTheme.colors.buttons.action.default.fg,
            )
        } else {
            Icon(
                imageVector = SatsIcons.Notifications,
                contentDescription = null,
                modifier = Modifier.size(iconContentSize),
                tint = contentColor,
            )
        }
    }
}

@Composable
private fun SatsTopAppBarIconButtonLayout(
    onClick: () -> Unit,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    content: @Composable () -> Unit,
) {
    val colors: SatsButtonColor = SatsButtonColor.Secondary
    val buttonSize = SatsButtonSize.Basic

    SatsBaseButtonLayout(
        onClick = onClick,
        onClickLabel = onClickLabel,
        modifier = modifier,
        containerColor = colors.animatedContainerColor(isEnabled),
        contentColor = colors.animatedContentColor(isEnabled),
        borderColor = null,
        isEnabled = isEnabled,
        isLoading = false,
    ) {
        Box(
            Modifier
                .iconButtonPadding(buttonSize)
                .minSatsButtonSize(buttonSize)
                .wrapContentWidth(),
            contentAlignment = Alignment.Center,
        ) {
            content()
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsTopAppBarIconButtonPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsBellIconButton(
                onClick = {},
                onClickLabel = null,
                showCherry = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
