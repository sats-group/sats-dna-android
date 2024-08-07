package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.SatsIcons
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.card.SatsCard
import com.sats.dna.icons.Barbell
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsEmptyStateCard(
    icon: ImageVector,
    title: String,
    body: String?,
    action: SatsEmptyStateAction?,
    modifier: Modifier = Modifier,
) {
    SatsCard(modifier) {
        SatsEmptyState(
            icon = icon,
            title = title,
            body = body,
            action = action,
            modifier = Modifier
                .fillMaxWidth()
                .padding(SatsTheme.spacing.m),
        )
    }
}

/**
 * A card that signals to the member that something is missing. Note that this is not the same as an error. Instead,
 * this component should be used as a placeholder for when we would like to display some data, but there is no data to
 * display. Examples of this could be that we would show an overview of the member's latest workouts, but they have
 * not completed any workouts, or show their friends' latest activity, but they don't have any friends.
 *
 * The card will fill its available size, center-aligning all the content inside of it.
 *
 * @param icon A icon shown in the component for purely aesthetic reasons. It's not important for accessibility.
 * @param title A required title text, preferably short enough to fit in a single line or two.
 * @param body An optional body text, describing in more detail what's missing and why it might be nice to have it.
 * @param action An optional [SatsEmptyStateAction], shown as a primary-colored [SatsButton] if provided.
 * @param modifier The modifier to be applied to the component.
 */
@Composable
fun SatsEmptyState(
    icon: ImageVector,
    title: String,
    body: String?,
    action: SatsEmptyStateAction?,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(36.dp),
            tint = SatsTheme.colors.surfaces.primary.default.fgAlternate,
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(title, textAlign = TextAlign.Center)

            if (body != null) {
                Text(
                    text = body,
                    color = SatsTheme.colors.surfaces.primary.default.fgAlternate,
                    textAlign = TextAlign.Center,
                    style = SatsTheme.typography.normal.small,
                )
            }
        }

        if (action != null) {
            SatsButton(action.action, action.label)
        }
    }
}

/**
 * A simple type representing an action for the [SatsEmptyState], ultimately represented as a button.
 *
 * @param action The action to be performed when the button is clicked.
 * @param label The label of the button.
 */
data class SatsEmptyStateAction(val action: () -> Unit, val label: String)

@PreviewLightDark
@Composable
private fun SatsEmptyStateM3Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsEmptyState(
                icon = SatsIcons.Barbell,
                title = "You don't have friends",
                body = "If you make friends, you can follow in their working out and stuff. " +
                    "And they can follow whatever you're doing, as well!",
                action = SatsEmptyStateAction(action = {}, "Make friends"),
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsEmptyStateM2Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsEmptyState(
                icon = SatsIcons.Barbell,
                title = "You don't have friends",
                body = "If you make friends, you can follow in their working out and stuff. " +
                    "And they can follow whatever you're doing, as well!",
                action = SatsEmptyStateAction(action = {}, "Make friends"),
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsEmptyStateCardPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsEmptyStateCard(
                icon = SatsIcons.Barbell,
                title = "You don't have friends",
                body = "If you make friends, you can follow in their working out and stuff. " +
                    "And they can follow whatever you're doing, as well!",
                action = SatsEmptyStateAction(action = {}, "Make friends"),
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
