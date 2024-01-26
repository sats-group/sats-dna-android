package com.sats.dna.components.snackbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.Top
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow.Companion.Ellipsis
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

/**
 * Sats snackbar to display short and non intrusive messages to a user.
 *
 * @param message The message to be displayed in the snackbar.
 * @param action Optional action to be shown as a button in the snackbar.
 * @param modifier The modifier to be applied to this composable.
 * @param theme Theme for the snackbar, by default [SatsSnackbarTheme.Info].
 *
 * **/
@Composable
fun SatsSnackbar(
    message: String,
    action: SatsSnackbarAction?,
    modifier: Modifier = Modifier,
    theme: SatsSnackbarTheme = SatsSnackbarTheme.Info,
) {
    SatsSnackbar(
        visuals = SatsSnackbarDefaults.snackbarVisuals(
            message = message,
            action = action,
            theme = theme,
        ),
        modifier = modifier,
    )
}

/**
 * Sats snackbar to display short and non intrusive messages to a user.
 *
 * @param visuals The [SatsSnackbarVisuals] to be used for the snackbar.
 * @param modifier The modifier to be applied to this composable.
 *
 * @see [SatsSnackbarDefaults]
 * **/

@Composable
fun SatsSnackbar(
    visuals: SatsSnackbarVisuals,
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min),
        shape = SatsTheme.shapes.roundedCorners.small,
        shadowElevation = 6.dp,
        color = visuals.colors.backgroundColor,
        contentColor = visuals.colors.containerColor,
    ) {
        Row(
            Modifier
                .padding(SatsTheme.spacing.m)
                .fillMaxHeight(),
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
            verticalAlignment = if (visuals.title == null) CenterVertically else Top,
        ) {
            visuals.leadingIcon()
            Row(
                horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
                verticalAlignment = CenterVertically,
            ) {
                Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                    visuals.title?.let { title ->
                        MaterialText(
                            text = title,
                            style = SatsTheme.typography.emphasis.basic,
                            color = visuals.colors.titleColor,
                        )
                    }

                    MaterialText(
                        text = visuals.message,
                        maxLines = 3,
                        overflow = Ellipsis,
                    )
                }

                if (visuals.action != null) {
                    SatsButton(visuals.action.action, visuals.action.label, colors = SatsButtonColor.Transparent)
                }
                if (visuals.dismissAction != null) {
                    IconButton(
                        onClick = visuals.dismissAction.action,
                    ) {
                        Icon(
                            modifier = Modifier.size(20.dp),
                            painter = SatsTheme.icons.close,
                            contentDescription = visuals.dismissAction.label,
                        )
                    }
                }
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun SnackbarPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val message = "Something went wrong. You should probably try that one more time."
            val action = SatsSnackbarAction(action = {}, "Try again")

            SatsSnackbar(message, action, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@LightDarkPreview
@Composable
private fun SnackBarVisualsPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val snackbarVisuals = SatsSnackbarDefaults.snackbarVisuals(
                title = "Yay! Invitations have been sent!",
                message = "You can always add or remove friends later, or change other details.",
                action = null,
                theme = SatsSnackbarTheme.Success,
                dismissAction = SatsSnackbarAction({}, "close"),
            )
            SatsSnackbar(snackbarVisuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
