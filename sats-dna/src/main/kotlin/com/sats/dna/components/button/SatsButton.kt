package com.sats.dna.components.button

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

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
        isLoading -> IconContent.Loading
        icon != null -> IconContent.Icon(icon)
        else -> IconContent.Empty
    }

    val border = if (isActuallyEnabled) {
        colors.borderColor?.let {
            BorderStroke(1.dp, it)
        }
    } else {
        colors.disabledBorderColor?.let {
            BorderStroke(1.dp, it)
        }
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
        Row(Modifier.height(24.dp), verticalAlignment = CenterVertically) {
            AnimatedContent(iconContent, label = "Animated icon content") { iconContent ->
                when (iconContent) {
                    is IconContent.Empty -> Unit

                    is IconContent.Icon -> {
                        Icon(
                            painter = iconContent.painter,
                            contentDescription = null,
                            modifier = Modifier
                                .padding(end = SatsTheme.spacing.s)
                                .size(16.dp),
                        )
                    }

                    is IconContent.Loading -> {
                        val color by colors.contentColor(isActuallyEnabled)

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

            Text(
                text = label,
                modifier = Modifier
                    .fillMaxHeight()
                    .wrapContentHeight(),
                maxLines = 1,
            )
        }
    }
}

private sealed interface IconContent {
    data class Icon(val painter: Painter) : IconContent
    data object Loading : IconContent
    data object Empty : IconContent
}

@Composable
private fun buttonPadding(isLarge: Boolean): PaddingValues {
    val vertical = animateDpAsState(
        if (isLarge) SatsTheme.spacing.m else SatsTheme.spacing.xs,
        label = "Vertical padding",
    )

    return PaddingValues(horizontal = SatsTheme.spacing.m, vertical.value)
}

@LightDarkPreview
@Composable
private fun Preview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsButton(onClick = {}, color.name, Modifier.padding(SatsTheme.spacing.s), color)
                SatsButton(
                    onClick = {},
                    "${color.name} disabled",
                    Modifier.padding(SatsTheme.spacing.s),
                    color,
                    isEnabled = false,
                )
            }
        }
    }
}

internal class SatsButtonColorProvider : PreviewParameterProvider<SatsButtonColor> {
    override val values = SatsButtonColor.entries.asSequence()
}

@Composable
private fun SatsButtonColor.contentColor(enabled: Boolean): State<Color> {
    return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
}
