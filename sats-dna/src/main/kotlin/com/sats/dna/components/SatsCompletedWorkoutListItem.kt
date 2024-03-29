package com.sats.dna.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.SatsIcons
import com.sats.dna.components.button.SatsLikeButton
import com.sats.dna.components.upcomingworkouts.SatsWorkoutType
import com.sats.dna.icons.ArrowRight
import com.sats.dna.icons.Comment
import com.sats.dna.icons.Fistbump
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme

/**
 * Displays a list item for a completed workout.
 *
 * @param timestamp A formatted date/time for when the workout started.
 * @param title The title of the workout.
 * @param location Where the workout took place, e.g. at which gym.2
 * @param numberOfComments How many comments the workout session has received, e.g. 10.
 * @param numberOfReactionsLabel How many people have reacted to the workout, e.g. “15 reactions”.
 * @param workoutType The [SatsWorkoutType] that this workout belongs to.
 * @param modifier The modifier to apply to the list item.
 */
@Composable
fun SatsCompletedWorkoutListItem(
    timestamp: String,
    title: String,
    location: String?,
    numberOfComments: Int,
    numberOfReactionsLabel: String?,
    onCompletedWorkoutClicked: () -> Unit,
    onSaidAwesomeClicked: (isLiked: Boolean) -> Unit,
    isLiked: Boolean,
    workoutType: SatsWorkoutType,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier
            .height(IntrinsicSize.Min)
            .clickable(onClick = onCompletedWorkoutClicked)
            .padding(horizontal = SatsTheme.spacing.m)
            .padding(top = SatsTheme.spacing.m),
        spacedBy(SatsTheme.spacing.m),
    ) {
        SatsWorkoutTypeColorIndicator(
            workoutType = workoutType,
            modifier = Modifier
                .fillMaxHeight()
                .padding(bottom = SatsTheme.spacing.s),
        )

        Column(Modifier.weight(1f), spacedBy(SatsTheme.spacing.m)) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                WorkoutInfo(timestamp, title, location)
                MaterialIcon(SatsIcons.ArrowRight, contentDescription = null)
            }

            SocialRow(
                numberOfComments = numberOfComments,
                numberOfReactionsLabel = numberOfReactionsLabel,
                onSaidAwesomeClicked = onSaidAwesomeClicked,
                isLiked = isLiked,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}

@Composable
private fun SocialRow(
    numberOfComments: Int,
    numberOfReactionsLabel: String?,
    onSaidAwesomeClicked: (isLiked: Boolean) -> Unit,
    isLiked: Boolean,
    modifier: Modifier = Modifier,
) {
    Row(modifier, verticalAlignment = Alignment.CenterVertically) {
        if (numberOfReactionsLabel != null) {
            Row(
                modifier = Modifier.padding(end = SatsTheme.spacing.m),
                horizontalArrangement = spacedBy(SatsTheme.spacing.xs),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                MaterialIcon(
                    SatsIcons.Fistbump,
                    contentDescription = null,
                    tint = SatsTheme.colors.backgrounds.secondary.default.fg,
                )

                MaterialText(numberOfReactionsLabel, color = SatsTheme.colors.backgrounds.secondary.default.fg)
            }
        }

        Spacer(Modifier.weight(1f))

        val normalizedNumberOfComments = if (numberOfComments < 100) {
            "$numberOfComments"
        } else {
            "99+"
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Row(Modifier, spacedBy(SatsTheme.spacing.xs), Alignment.CenterVertically) {
                MaterialIcon(
                    SatsIcons.Comment,
                    contentDescription = null,
                    tint = SatsTheme.colors.buttons.action.default.fg,
                )
                MaterialText(normalizedNumberOfComments, color = SatsTheme.colors.backgrounds.secondary.default.fg)
            }

            SatsLikeButton(isLiked = isLiked, onSaidAwesomeClicked)
        }
    }
}

@Composable
private fun WorkoutInfo(
    timestamp: String,
    title: String,
    subtitle: String?,
    modifier: Modifier = Modifier,
) {
    Column(modifier) {
        MaterialText(
            timestamp,
            color = SatsTheme.colors.backgrounds.secondary.default.fg,
            style = SatsTheme.typography.normal.small,
        )

        MaterialText(title)

        if (subtitle != null) {
            MaterialText(
                subtitle,
                color = SatsTheme.colors.backgrounds.secondary.default.fg,
                style = SatsTheme.typography.normal.small,
            )
        }
    }
}

@PreviewLightDark
@PreviewFontScale
@Composable
private fun SatsCompletedWorkoutListItemPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsCompletedWorkoutListItem(
                timestamp = "Jul 18, 2023, 06:18",
                title = "Gym training (M3)",
                location = "at Colosseum",
                numberOfComments = 10,
                numberOfReactionsLabel = "15 people",
                onCompletedWorkoutClicked = {},
                onSaidAwesomeClicked = {},
                isLiked = false,
                workoutType = SatsWorkoutType.OwnTraining,
            )
        }
    }
}
