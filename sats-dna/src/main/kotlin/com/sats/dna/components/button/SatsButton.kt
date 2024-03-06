package com.sats.dna.components.button

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

@Deprecated("Replace with SatsButton2")
@Composable
fun SatsButton(
    onClick: () -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    colors: SatsButtonColor = SatsButtonColor.Primary,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    isLarge: Boolean = false,
    icon: Painter? = null,
) {
    val isActuallyEnabled = isEnabled && !isLoading
    val buttonColors = colors.asMaterialButtonColors(isActuallyEnabled)

    val iconContent = when {
        isLoading -> SatsButtonIconContent.Loading
        icon != null -> SatsButtonIconContent.Icon(icon)
        else -> SatsButtonIconContent.Empty
    }

    val border = colors.animatedBorderColor(isActuallyEnabled)?.let {
        BorderStroke(1.dp, it)
    }

    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = isActuallyEnabled,
        shape = SatsTheme.shapes.roundedCorners.small,
        border = border,
        elevation = null,
        colors = buttonColors,
        contentPadding = buttonPadding(isLarge),
    ) {
        // Note that a horizontal arrangement is not used for spacing items, as a space-aligned arrangement would
        // still put space between the AnimatedContent and the text, even if the AnimatedContent is empty.
        Row(verticalAlignment = CenterVertically) {
            AnimatedContent(iconContent, label = "Animated icon content") { iconContent ->
                when (iconContent) {
                    is SatsButtonIconContent.Empty -> Unit

                    is SatsButtonIconContent.Icon -> {
                        Icon(
                            painter = iconContent.painter,
                            contentDescription = null,
                            modifier = Modifier
                                .padding(end = SatsTheme.spacing.s)
                                .size(16.dp),
                        )
                    }

                    is SatsButtonIconContent.Loading -> {
                        val color = colors.animatedContentColor(isActuallyEnabled)

                        CircularProgressIndicator(
                            Modifier
                                .padding(end = SatsTheme.spacing.s)
                                .size(16.dp),
                            color = color,
                            strokeWidth = 1.5.dp,
                        )
                    }
                }
            }

            Text(label, maxLines = 1)
        }
    }
}

@Composable
private fun buttonPadding(isLarge: Boolean): PaddingValues {
    val vertical = animateDpAsState(
        if (isLarge) SatsTheme.spacing.m else SatsTheme.spacing.xs,
        label = "Vertical padding",
    )

    return PaddingValues(horizontal = SatsTheme.spacing.m, vertical.value)
}

@PreviewLightDark
@Composable
private fun SatsButtonPreview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        val backgroundColor = when (color) {
            SatsButtonColor.Clean -> SatsTheme.colors2.backgrounds.fixed.primary.bg.default
            SatsButtonColor.CleanSecondary -> SatsTheme.colors2.backgrounds.fixed.primary.bg.default
            else -> SatsTheme.colors2.backgrounds.primary.bg.default
        }

        SatsSurface(color = backgroundColor, useMaterial3 = true) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                SatsButton(onClick = {}, color.name, Modifier.padding(SatsTheme.spacing.s), color)
                SatsButton(
                    onClick = {},
                    label = "${color.name} disabled",
                    modifier = Modifier.padding(SatsTheme.spacing.s),
                    colors = color,
                    isEnabled = false,
                )
            }
        }
    }
}

@PreviewFontScale
@Composable
private fun SatsButtonFontScalePreview() {
    SatsTheme {
        SatsSurface(
            modifier = Modifier.fillMaxWidth(),
            color = SatsTheme.colors2.backgrounds.primary.bg.default,
            useMaterial3 = true,
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                SatsButton(
                    onClick = {},
                    label = "${LocalConfiguration.current.fontScale}x",
                    modifier = Modifier.padding(SatsTheme.spacing.s),
                    colors = SatsButtonColor.Primary,
                )
            }
        }
    }
}
