package com.sats.dna.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.icons.DefaultInstructorIcon
import com.sats.dna.components.icons.InstructorType
import com.sats.dna.components.icons.WorkoutType
import com.sats.dna.components.icons.WorkoutTypeIcon
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.FontSizePreview
import com.sats.dna.tooling.LightDarkPreview

/**
 * A section for a day of upcoming workouts

 * @param day A formatted day that will be displayed as the title of the section.
 * @param content The list of the containing workouts for this day. Consider using [UpcomingWorkoutListItem].
 * @param modifier The modifier to apply to the section.
 **/
@Composable
fun UpcomingWorkoutDaySection(
    day: String,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier,
    ) {
        SatsSurface(Modifier.fillMaxWidth(), elevation = 1.dp) {
            Text(
                day,
                Modifier.padding(
                    vertical = SatsTheme.spacing.s,
                    horizontal = SatsTheme.spacing.m,
                ),
            )
        }
        content()
    }
}

/**
 *  A list item for an upcoming workout.
 *
 * @param title The title of the workout.
 * @param timeStamp A formatted date/time for when the workout started.
 * @param location Where the workout took place, e.g. at which gym.
 * @param duration The duration of the workout.
 * @param onClick Callback to be invoked when this item is clicked.
 * @param icon An icon to be displayed on the left gutter of the item. Consider using [WorkoutTypeIcon]
 * @param instructorInfo Information about the instructor for the workout. Consider using [UpcomingWorkoutInstructorLabel]
 * @param modifier The modifier to apply to the list item.
 * @param unbookButton Optional slot for displaying an unbook button.
 * @param friendsAttending Optional slot for displaying friends that are also attending the workout. Typically a [UpcomingWorkoutAttendingFriendsLabel]
 * **/
@Composable
fun UpcomingWorkoutListItem(
    title: String,
    timeStamp: String,
    location: String,
    duration: String,
    icon: @Composable RowScope.() -> Unit,
    instructorInfo: @Composable ColumnScope.() -> Unit,
    modifier: Modifier = Modifier,
    unbookButton: @Composable (RowScope.() -> Unit)? = null,
    friendsAttending: @Composable (ColumnScope.() -> Unit)? = null,
    onClick: () -> Unit,
) {
    Row(
        modifier
            .clickable(role = Role.Button) { onClick() }
            .padding(SatsTheme.spacing.m),
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                verticalAlignment = Alignment.Top,
            ) {
                icon()
                Column(
                    Modifier.weight(1f),
                    verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                ) {
                    WorkoutInfo(
                        title = title,
                        timeStamp = timeStamp,
                        clubName = location,
                        duration = duration,
                    )
                    instructorInfo()
                    friendsAttending?.let { it() }
                }
                unbookButton?.let { it() }
            }
        }
    }
}

/**
 * A label that displays info about the instructor for the upcoming workout
 *
 * @param instructorImage An icon to represent the instructor type.
 * @param instructorName The name of the instructor for the workout.
 * @param modifier The modifier to apply to the label.
 * **/
@Composable
fun UpcomingWorkoutInstructorLabel(
    instructorImage: @Composable RowScope.() -> Unit,
    instructorName: String,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .semantics(mergeDescendants = true) {},
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        instructorImage()
        Text(instructorName)
    }
}

/**
 * A label that displays info about the instructor for the upcoming workout
 *
 * @param memberImages The friends profile images.
 * When more than one image passed at the root level of this composable, they will slightly overlap each other.
 * @param friendsAttendingLabel The name of the instructor for the workout.
 * @param modifier The modifier to apply to the label.
 * **/

@Composable
fun UpcomingWorkoutAttendingFriendsLabel(
    memberImages: @Composable RowScope.() -> Unit,
    friendsAttendingLabel: String,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy((-8).dp)) {
            memberImages()
        }

        Text(friendsAttendingLabel)
    }
}

@Composable
private fun WorkoutInfo(
    title: String,
    timeStamp: String,
    clubName: String,
    duration: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier) {
        Text(title, style = SatsTheme.typography.emphasis.large)
        Text("$timeStamp  •  $clubName  •  $duration")
    }
}

@LightDarkPreview
@FontSizePreview
@Composable
private fun UpcomingWorkoutsListPreview() {
    SatsTheme {
        SatsSurface {
            Column {
                UpcomingWorkoutDaySection(day = "Thu, Jul 27 2023") {
                    UpcomingWorkoutListItem(
                        title = "Pure Strength",
                        timeStamp = "11:00 AM",
                        location = "SATS Storo",
                        duration = "45 min",
                        icon = {
                            WorkoutTypeIcon(
                                type = WorkoutType.GroupExercise,
                                contentDescription = null,
                                modifier = Modifier.size(34.dp),
                            )
                        },
                        instructorInfo = {
                            UpcomingWorkoutInstructorLabel(
                                instructorImage = {
                                    DefaultInstructorIcon(InstructorType.Gx)
                                },
                                instructorName = "Kristin Hagen",
                            )
                        },
                        unbookButton = {
                            SatsButton(
                                onClick = { },
                                label = "Unbook",
                                colors = SatsButtonColor.Transparent,
                            )
                        },
                        friendsAttending = {
                            UpcomingWorkoutAttendingFriendsLabel(
                                memberImages = {
                                    PlaceholderBox(
                                        Modifier
                                            .size(24.dp)
                                            .border(BorderStroke(1.dp, Color.White), CircleShape),
                                        shape = SatsTheme.shapes.circle,
                                    )
                                    PlaceholderBox(
                                        Modifier
                                            .size(24.dp)
                                            .border(BorderStroke(1.dp, Color.White), CircleShape),
                                        shape = SatsTheme.shapes.circle,
                                    )
                                },
                                friendsAttendingLabel = "2 friends are joining this workout!",
                            )
                        },
                    ) { }
                }
            }
        }
    }
}
