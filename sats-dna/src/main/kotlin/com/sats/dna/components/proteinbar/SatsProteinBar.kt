package com.sats.dna.components.proteinbar

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
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsButton2
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsIconButton2
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme

/**
 * Protein Bar to display short and non intrusive messages to a user.
 *
 * @param message The message to be displayed in the protein bar.
 * @param action Optional action to be shown as a button in the protein bar.
 * @param modifier The modifier to be applied to this composable.
 * @param theme Theme for the protein bar, by default [SatsProteinBarTheme.Info].
 */
@Composable
fun SatsProteinBar(
    message: String,
    action: SatsProteinBarAction?,
    modifier: Modifier = Modifier,
    theme: SatsProteinBarTheme = SatsProteinBarTheme.Neutral,
) {
    SatsProteinBar(
        visuals = SatsProteinBarDefaults.visuals(
            message = message,
            action = action,
            theme = theme,
        ),
        modifier = modifier,
    )
}

/**
 * Protein Bar to display short and non intrusive messages to a user.
 *
 * @param visuals The [SatsProteinBarVisuals] to be used for the protein bar.
 * @param modifier The modifier to be applied to this composable.
 *
 * @see [SatsProteinBarDefaults]
 */
@Composable
fun SatsProteinBar(
    visuals: SatsProteinBarVisuals,
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
                    SatsIconButton2(
                        onClick = visuals.dismissAction.action,
                        icon = SatsTheme.icons.close,
                        onClickLabel = visuals.dismissAction.label,
                        modifier = Modifier.align(Alignment.Top),
                        colors = SatsButtonColor.Action,
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
private fun LeadingIcon(leadingIcon: SatsProteinBarLeadingIcon, modifier: Modifier = Modifier) {
    Box(modifier) {
        when (leadingIcon) {
            is SatsProteinBarLeadingIcon.None -> Unit

            is SatsProteinBarLeadingIcon.Emoji -> {
                MaterialText(leadingIcon.text, Modifier.clearAndSetSemantics { })
            }

            is SatsProteinBarLeadingIcon.Icon -> {
                MaterialIcon(leadingIcon.painter, contentDescription = null, Modifier.size(18.dp))
            }
        }
    }
}

@Composable
private fun TitleAndMessage(visuals: SatsProteinBarVisuals, modifier: Modifier = Modifier) {
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
private fun ActionButton(action: SatsProteinBarAction, modifier: Modifier = Modifier) {
    SatsButton2(
        onClick = action.action,
        label = action.label,
        modifier = modifier,
        colors = SatsButtonColor.Action,
    )
}

@PreviewLightDark
@Composable
private fun SatsProteinBarPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val message = "Something went wrong. You should probably try that one more time."
            val action = SatsProteinBarAction(action = {}, "Try again")

            SatsProteinBar(message, action, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsProteinBarInfoPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val visuals = SatsProteinBarDefaults.visuals(
                title = "This is the title of the Protein Bar",
                message = "This text exists so that you can read it. Did you read it through all the way?",
                action = null,
                theme = SatsProteinBarTheme.Info,
                dismissAction = SatsProteinBarAction({}, "close"),
            )

            SatsProteinBar(visuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsProteinBarSuccessPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val visuals = SatsProteinBarDefaults.visuals(
                title = "Yay! Invitations have been sent!",
                message = "You can always add or remove friends later, or change other details.",
                action = null,
                theme = SatsProteinBarTheme.Success,
                dismissAction = SatsProteinBarAction({}, "close"),
            )

            SatsProteinBar(visuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsProteinBarWarningPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val visuals = SatsProteinBarDefaults.visuals(
                title = "This is the title of the Protein Bar",
                message = "This text exists so that you can read it. Did you read it through all the way?",
                action = null,
                theme = SatsProteinBarTheme.Warning,
                dismissAction = SatsProteinBarAction({}, "close"),
            )

            SatsProteinBar(visuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsProteinBarErrorPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val visuals = SatsProteinBarDefaults.visuals(
                title = "Oh no, that's not great!",
                message = "It looks like whatever you were trying to do didn't happen according to plan. You may " +
                    "want to try that again.",
                action = SatsProteinBarAction(action = {}, label = "Try again"),
                theme = SatsProteinBarTheme.Error,
                dismissAction = SatsProteinBarAction({}, "close"),
            )

            SatsProteinBar(visuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@Preview
@Composable
private fun SatsProteinBarWithActionPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val visuals = SatsProteinBarDefaults.visuals(
                title = "Yay! Invitations have been sent!",
                message = "You can always add or remove friends later, or change other details.",
                action = SatsProteinBarAction(action = {}, label = "Try again"),
                theme = SatsProteinBarTheme.Info,
                dismissAction = null,
            )

            SatsProteinBar(visuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@Preview
@Composable
private fun SatsProteinBarWithDismissAndActionPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val visuals = SatsProteinBarDefaults.visuals(
                title = "Yay! Invitations have been sent!",
                message = "You can always add or remove friends later, or change other details.",
                action = SatsProteinBarAction(action = {}, label = "Try again"),
                theme = SatsProteinBarTheme.Info,
                dismissAction = SatsProteinBarAction({}, "close"),
            )

            SatsProteinBar(visuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@PreviewFontScale
@Composable
private fun SatsProteinBarFontSizesPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val visuals = SatsProteinBarDefaults.visuals(
                title = "Yay! Invitations have been sent!",
                message = "You can always add or remove friends later, or change other details.",
                action = SatsProteinBarAction(action = {}, label = "Try again"),
                theme = SatsProteinBarTheme.Info,
                dismissAction = SatsProteinBarAction({}, "close"),
            )

            SatsProteinBar(visuals, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
