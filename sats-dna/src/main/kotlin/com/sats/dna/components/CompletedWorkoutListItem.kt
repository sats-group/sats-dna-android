package com.sats.dna.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.button.LikeButton
import com.sats.dna.components.icons.WorkoutType
import com.sats.dna.components.icons.WorkoutTypeIcon
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.FontSizePreview
import com.sats.dna.tooling.LightDarkPreview

/**
 * Displays a list item for a completed workout.
 *
 * @param icon An icon to be displayed on the left gutter of the item, typically a [WorkoutTypeIcon]
 * @param timestamp A formatted date/time for when the workout started.
 * @param title The title of the workout.
 * @param location Where the workout took place, e.g. at which gym.
 * @param numberOfComments How many comments the workout session has received, e.g. 10.
 * @param numberOfReactionsLabel How many people have reacted to the workout, e.g. “15 reactions”.
 * @param modifier The modifier to apply to the list item.
 */
@Composable
fun CompletedWorkoutListItem(
    icon: @Composable () -> Unit,
    timestamp: String,
    title: String,
    location: String?,
    numberOfComments: Int,
    numberOfReactionsLabel: String?,
    onCompletedWorkoutClicked: () -> Unit,
    onSaidAwesomeClicked: (isLiked: Boolean) -> Unit,
    isLiked: Boolean,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier
            .clickable(onClick = onCompletedWorkoutClicked)
            .padding(horizontal = SatsTheme.spacing.m)
            .padding(top = SatsTheme.spacing.m),
        spacedBy(SatsTheme.spacing.m),
    ) {
        icon()

        Column(Modifier.weight(1f), spacedBy(SatsTheme.spacing.m)) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                WorkoutInfo(timestamp, title, location)
                Icon(SatsTheme.icons.arrowRight, contentDescription = null)
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
                Icon(
                    SatsTheme.icons.fistBump,
                    contentDescription = null,
                    tint = SatsTheme.colors.onBackground.secondary,
                )

                Text(numberOfReactionsLabel, color = SatsTheme.colors.onBackground.secondary)
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
                Icon(SatsTheme.icons.comment, contentDescription = null, tint = SatsTheme.colors.action.default)
                Text(normalizedNumberOfComments, color = SatsTheme.colors.onBackground.secondary)
            }

            LikeButton(isLiked = isLiked, onSaidAwesomeClicked)
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
        Text(
            timestamp,
            color = SatsTheme.colors.onBackground.secondary,
            style = SatsTheme.typography.default.small,
        )

        Text(title)

        if (subtitle != null) {
            Text(
                subtitle,
                color = SatsTheme.colors.onBackground.secondary,
                style = SatsTheme.typography.default.small,
            )
        }
    }
}

@LightDarkPreview
@FontSizePreview
@Composable
private fun Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            Column {
                CompletedWorkoutListItem(
                    icon = { WorkoutTypeIcon(WorkoutType.OwnTraining, null, Modifier.size(34.dp)) },
                    timestamp = "Jul 18, 2023, 06:18",
                    title = "Gym training",
                    location = "at Colosseum",
                    numberOfComments = 123,
                    numberOfReactionsLabel = null,
                    onCompletedWorkoutClicked = {},
                    onSaidAwesomeClicked = {},
                    isLiked = false,
                )

                Divider()

                CompletedWorkoutListItem(
                    icon = { WorkoutTypeIcon(WorkoutType.OwnTraining, null, Modifier.size(34.dp)) },
                    timestamp = "Jul 18, 2023, 06:18",
                    title = "Gym training",
                    location = "at Colosseum",
                    numberOfComments = 10,
                    numberOfReactionsLabel = "15 people",
                    onCompletedWorkoutClicked = {},
                    onSaidAwesomeClicked = {},
                    isLiked = false,
                )
            }
        }
    }
}
