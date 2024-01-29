package com.sats.dna.components.snackbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.FontSizePreview
import com.sats.dna.tooling.LightDarkPreview

/**
 * Sats snackbar to display short and non intrusive messages to a user.
 *
 * @param message The message to be displayed in the snackbar.
 * @param action Optional action to be shown as a button in the snackbar.
 * @param modifier The modifier to be applied to this composable.
 * @param theme Theme for the snackbar, by default [SatsSnackbarTheme.Info].
 */
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
 */
@Composable
fun SatsSnackbar(
    visuals: SatsSnackbarVisuals,
    modifier: Modifier = Modifier,
) {
    SatsSurface(
        modifier = modifier.fillMaxWidth(),
        shape = SatsTheme.shapes.roundedCorners.small,
        elevation = 6.dp,
        color = visuals.colors.containerColor,
        contentColor = visuals.colors.contentColor,
    ) {
        Column {
            Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
                Row(
                    modifier = Modifier
                        .padding(
                            start = SatsTheme.spacing.s,
                            top = SatsTheme.spacing.s,
                            end = if (visuals.dismissAction == null) SatsTheme.spacing.s else 0.dp,
                            bottom = if (visuals.action == null) SatsTheme.spacing.s else 0.dp,
                        )
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
                ) {
                    LeadingIcon(visuals.leadingIcon)

                    TitleAndMessage(visuals, Modifier.weight(1f))
                }

                if (visuals.dismissAction != null) {
                    SatsIconButton(
                        onClick = visuals.dismissAction.action,
                        icon = SatsTheme.icons.close,
                        onClickLabel = visuals.dismissAction.label,
                        modifier = Modifier.align(Alignment.Top),
                        colors = SatsButtonColor.Secondary,
                    )
                }
            }

            if (visuals.action != null) {
                ActionButton(
                    action = visuals.action,
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = SatsTheme.spacing.xxs),
                )
            }
        }
    }
}

@Composable
private fun LeadingIcon(leadingIcon: SatsSnackbarLeadingIcon, modifier: Modifier = Modifier) {
    Box(modifier) {
        when (leadingIcon) {
            is SatsSnackbarLeadingIcon.Emoji -> {
                MaterialText(leadingIcon.text, Modifier.clearAndSetSemantics { })
            }

            is SatsSnackbarLeadingIcon.Icon -> {
                MaterialIcon(leadingIcon.painter, contentDescription = null, Modifier.size(18.dp))
            }
        }
    }
}

@Composable
private fun TitleAndMessage(visuals: SatsSnackbarVisuals, modifier: Modifier = Modifier) {
    Column(modifier, verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
        if (visuals.title != null) {
            MaterialText(
                text = visuals.title,
                style = SatsTheme.typography.emphasis.basic,
                color = visuals.colors.titleColor,
            )
        }

        MaterialText(
            text = visuals.message,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun ActionButton(action: SatsSnackbarAction, modifier: Modifier = Modifier) {
    SatsButton(
        onClick = action.action,
        label = action.label,
        modifier = modifier,
        colors = SatsButtonColor.Transparent,
    )
}

@LightDarkPreview
@Composable
private fun RegularSnackbarPreview() {
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
private fun SuccessSnackbarPreview() {
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

@Preview
@Composable
private fun SnackbarWithActionPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val snackbarVisuals = SatsSnackbarDefaults.snackbarVisuals(
                title = "Yay! Invitations have been sent!",
                message = "You can always add or remove friends later, or change other details.",
                action = SatsSnackbarAction(action = {}, label = "Try again"),
                theme = SatsSnackbarTheme.Info,
                dismissAction = null,
            )

            SatsSnackbar(snackbarVisuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@Preview
@Composable
private fun SnackbarWithDismissAndActionPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val snackbarVisuals = SatsSnackbarDefaults.snackbarVisuals(
                title = "Yay! Invitations have been sent!",
                message = "You can always add or remove friends later, or change other details.",
                action = SatsSnackbarAction(action = {}, label = "Try again"),
                theme = SatsSnackbarTheme.Info,
                dismissAction = SatsSnackbarAction({}, "close"),
            )

            SatsSnackbar(snackbarVisuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@FontSizePreview
@Composable
private fun SnackbarFontSizesPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val snackbarVisuals = SatsSnackbarDefaults.snackbarVisuals(
                title = "Yay! Invitations have been sent!",
                message = "You can always add or remove friends later, or change other details.",
                action = SatsSnackbarAction(action = {}, label = "Try again"),
                theme = SatsSnackbarTheme.Info,
                dismissAction = SatsSnackbarAction({}, "close"),
            )

            SatsSnackbar(snackbarVisuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
