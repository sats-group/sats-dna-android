package com.sats.dna.components.button

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsDismissButton(
    dismissLabel: String,
    onDismissClicked: () -> Unit,
    modifier: Modifier = Modifier,
    size: SatsButtonSize = SatsButtonSize.Small,
    color: SatsButtonColor = SatsButtonColor.Clean,
) {
    var isCloseClicked by remember {
        mutableStateOf(false)
    }

    Surface(
        onClick = {
            if (isCloseClicked) {
                onDismissClicked()
            } else {
                isCloseClicked = true
            }
        },
        modifier = modifier
            .semantics { role = Role.Button }
            .heightIn(min = minContentHeight(size))
            .wrapContentWidth()
            .padding(
                horizontal = if (isCloseClicked) {
                    SatsTheme.spacing.s
                } else {
                    0.dp
                },
            ),
        shape = SatsTheme.shapes.roundedCorners.small,
        interactionSource = remember { MutableInteractionSource() },
        color = color.animatedContainerColor(enabled = true),
        contentColor = color.animatedContentColor(true),
        border = color.animatedBorderColor(true)?.let { BorderStroke(1.dp, it) },
    ) {
        AnimatedContent(
            isCloseClicked,
            label = "Animated content",
        ) { isCloseClicked ->
            val content = when {
                isCloseClicked -> SatsDismissButtonContent.Dismiss
                else -> SatsDismissButtonContent.Close
            }

            val iconContentSize = animateDpAsState(
                when (size) {
                    SatsButtonSize.Small -> 16.dp
                    SatsButtonSize.Basic -> 18.dp
                    SatsButtonSize.Large -> 24.dp
                },
                label = "Icon content size",
            ).value

            when (content) {
                is SatsDismissButtonContent.Close -> {
                    Icon(
                        painter = SatsTheme.icons.close,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(SatsTheme.spacing.xs)
                            .size(iconContentSize),
                    )
                }

                is SatsDismissButtonContent.Dismiss -> {
                    Text(
                        text = dismissLabel,
                        style = textStyle(size),
                        maxLines = 1,
                        modifier = Modifier.padding(SatsTheme.spacing.xs),
                    )
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsDismissButtonPreview() {
    SatsTheme {
        SatsSurface {
            SatsDismissButton("Dismiss", {}, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
