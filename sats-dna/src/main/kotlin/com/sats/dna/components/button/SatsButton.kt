package com.sats.dna.components.button

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsButton(
    onClick: () -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    colors: SatsButtonColor = SatsButtonColor.Primary,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    isLarge: Boolean = false,
) {
    val isActuallyEnabled = isEnabled && !isLoading
    val buttonColors = colors.asMaterialButtonColors(isActuallyEnabled)

    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = isActuallyEnabled,
        shape = SatsTheme.shapes.roundedCorners.small,
        colors = buttonColors,
        contentPadding = buttonPadding(isLarge),
    ) {
        Row(Modifier.height(24.dp), verticalAlignment = CenterVertically) {
            AnimatedVisibility(isLoading) {
                val color by buttonColors.contentColor(isActuallyEnabled)

                CircularProgressIndicator(
                    Modifier
                        .padding(end = SatsTheme.spacing.s)
                        .size(16.dp),
                    color = color,
                    strokeWidth = 1.5.dp,
                )
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

@Composable
private fun buttonPadding(isLarge: Boolean) = PaddingValues(
    horizontal = SatsTheme.spacing.m,
    vertical = if (isLarge) SatsTheme.spacing.m else SatsTheme.spacing.xs,
)
