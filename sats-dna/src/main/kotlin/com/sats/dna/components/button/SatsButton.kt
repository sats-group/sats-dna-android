package com.sats.dna.components.button

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsButton(
    onClick: () -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    colors: SatsButtonColor = SatsButtonColor.Primary,
    size: SatsButtonSize = SatsButtonSize.Basic,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    icon: Painter? = null,
) {
    val isActuallyEnabled = isEnabled && !isLoading

    Surface(
        onClick = onClick,
        modifier = modifier
            .semantics { role = Role.Button },
        enabled = isActuallyEnabled,
        shape = SatsTheme.shapes.roundedCorners.small,
        color = colors.animatedContainerColor(isActuallyEnabled),
        contentColor = colors.animatedContentColor(isActuallyEnabled),
        border = colors.animatedBorderColor(isActuallyEnabled)?.let { BorderStroke(1.dp, it) },
        interactionSource = remember { MutableInteractionSource() },
    ) {
        Row(
            Modifier
                .padding(buttonPadding(size))
                .heightIn(min = minContentHeight(size))
                .wrapContentWidth(),
            verticalAlignment = CenterVertically,
        ) {
            val iconContent = remember(isLoading, icon) {
                when {
                    isLoading -> SatsButtonIconContent.Loading
                    icon != null -> SatsButtonIconContent.Icon(icon)
                    else -> SatsButtonIconContent.Empty
                }
            }

            // Note the use of an end padding instead of a horizontal arrangement. The arrangement would
            // still put space between the AnimatedContent and the text, even if its content is empty.
            AnimatedContent(iconContent, label = "Animated icon content") { actualContent ->
                val iconContentSize = animateDpAsState(
                    when (size) {
                        SatsButtonSize.Small -> 16.dp
                        SatsButtonSize.Basic -> 18.dp
                        SatsButtonSize.Large -> 24.dp
                    },
                    label = "Icon content size",
                ).value

                val color = colors.animatedContentColor(isEnabled)

                when (actualContent) {
                    is SatsButtonIconContent.Empty -> Unit

                    is SatsButtonIconContent.Icon -> {
                        Icon(
                            painter = actualContent.painter,
                            contentDescription = null,
                            tint = color,
                            modifier = Modifier
                                .padding(end = SatsTheme.spacing.s)
                                .size(iconContentSize),
                        )
                    }

                    is SatsButtonIconContent.Loading -> {
                        CircularProgressIndicator(
                            Modifier
                                .padding(end = SatsTheme.spacing.s)
                                .size(iconContentSize),
                            color = color,
                            strokeWidth = 1.5.dp,
                        )
                    }
                }
            }

            Text(label, maxLines = 1, style = textStyle(size))
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsButtonPreview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
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
