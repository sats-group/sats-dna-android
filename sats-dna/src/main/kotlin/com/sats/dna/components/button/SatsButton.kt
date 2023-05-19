package com.sats.dna.components.button

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
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
    val buttonColors = colors.toButtonColors()

    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = isActuallyEnabled,
        shape = SatsTheme.shapes.roundedCorners.small,
        colors = buttonColors,
        contentPadding = buttonPadding(isLarge),
    ) {
        Row(Modifier.height(24.dp), horizontalArrangement = spacedBy(0.dp), verticalAlignment = CenterVertically) {
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

enum class SatsButtonColor { Primary, Cta, Secondary, Clean, WaitingList }

@Composable
private fun SatsButtonColor.toButtonColors() = when (this) {
    SatsButtonColor.Primary -> ButtonDefaults.buttonColors(
        backgroundColor = SatsTheme.colors.primary.default,
        contentColor = SatsTheme.colors.onPrimary.default,
        disabledBackgroundColor = SatsTheme.colors.primary.disabled,
        disabledContentColor = SatsTheme.colors.onPrimary.disabled,
    )

    SatsButtonColor.Cta -> ButtonDefaults.buttonColors(
        backgroundColor = SatsTheme.colors.cta.default,
        contentColor = SatsTheme.colors.onCta.default,
        disabledBackgroundColor = SatsTheme.colors.cta.disabled,
        disabledContentColor = SatsTheme.colors.onCta.disabled,
    )

    SatsButtonColor.Secondary -> ButtonDefaults.buttonColors(
        backgroundColor = SatsTheme.colors.secondary.default,
        contentColor = SatsTheme.colors.onSecondary.default,
        disabledBackgroundColor = SatsTheme.colors.secondary.disabled,
        disabledContentColor = SatsTheme.colors.onSecondary.disabled,
    )

    SatsButtonColor.Clean -> ButtonDefaults.buttonColors(
        backgroundColor = SatsTheme.colors.clean.default,
        contentColor = SatsTheme.colors.onClean.default,
        disabledBackgroundColor = SatsTheme.colors.clean.disabled,
        disabledContentColor = SatsTheme.colors.onClean.disabled,
    )

    SatsButtonColor.WaitingList -> ButtonDefaults.buttonColors(
        backgroundColor = SatsTheme.colors.waitingList.primary,
        contentColor = SatsTheme.colors.onWaitingList.primary,
        disabledBackgroundColor = SatsTheme.colors.waitingList.disabled,
        disabledContentColor = SatsTheme.colors.onWaitingList.disabled,
    )
}

@Composable
private fun buttonPadding(isLarge: Boolean) = PaddingValues(
    horizontal = SatsTheme.spacing.m,
    vertical = if (isLarge) SatsTheme.spacing.m else SatsTheme.spacing.xs,
)
