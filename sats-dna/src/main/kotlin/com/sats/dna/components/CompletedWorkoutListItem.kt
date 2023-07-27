package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
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
 * @param numberOfCommentsLabel How many comments the workout session has received, e.g. “10 comments”.
 * @param numberOfReactionsLabel How many people have reacted to the workout, e.g. “15 reactions”.
 * @param modifier The modifier to apply to the list item.
 */
@Composable
fun CompletedWorkoutListItem(
    icon: @Composable () -> Unit,
    timestamp: String,
    title: String,
    location: String?,
    numberOfCommentsLabel: String,
    numberOfReactionsLabel: String,
    modifier: Modifier = Modifier,
) {
    Row(modifier.padding(SatsTheme.spacing.m), spacedBy(SatsTheme.spacing.m)) {
        icon()

        Column(Modifier.weight(1f), spacedBy(SatsTheme.spacing.m)) {
            WorkoutInfo(timestamp, title, location)

            SocialInfo(numberOfReactionsLabel, numberOfCommentsLabel)
        }

        Icon(SatsTheme.icons.chevronRight, contentDescription = null)
    }
}

@Composable
@OptIn(ExperimentalLayoutApi::class)
private fun SocialInfo(numberOfReactionsLabel: String, numberOfCommentsLabel: String) {
    FlowRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalArrangement = spacedBy(SatsTheme.spacing.xs),
    ) {
        SocialCount(SatsTheme.icons.fistBump, numberOfReactionsLabel, Modifier.padding(end = SatsTheme.spacing.m))

        SocialCount(SatsTheme.icons.comment, numberOfCommentsLabel)
    }
}

@Composable
private fun SocialCount(icon: Painter, label: String, modifier: Modifier = Modifier) {
    Row(modifier, spacedBy(SatsTheme.spacing.xs), Alignment.CenterVertically) {
        Icon(icon, contentDescription = null)

        Text(label, color = SatsTheme.colors.onBackground.secondary)
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
                    numberOfCommentsLabel = "10 comments",
                    numberOfReactionsLabel = "15 people",
                )
            }
        }
    }
}
