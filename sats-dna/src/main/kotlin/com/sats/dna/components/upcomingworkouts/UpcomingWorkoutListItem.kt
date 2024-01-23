package com.sats.dna.components.upcomingworkouts

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.sats.dna.components.PlaceholderBox
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.FontSizePreview
import com.sats.dna.tooling.LightDarkPreview

/**
 * A section for a day of upcoming workouts
 *
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
    Column(modifier) {
        SatsSurface(Modifier.fillMaxWidth(), elevation = 1.dp) {
            MaterialText(
                text = day,
                modifier = Modifier.padding(
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
 * @param name The name of the workout.
 * @param time A formatted date/time for when the workout started.
 * @param location Where the workout took place, e.g. at which gym.
 * @param duration The duration of the workout.
 * @param onClick Callback to be invoked when this item is clicked.
 * @param instructor Information about the instructor for the workout.
 * @param workoutType What kind of workout it was, like cardio or strength training.
 * @param modifier The modifier to apply to the list item.
 * @param workoutTypeColor Gives the component a color bar to the left of the content.
 * To symbolize what type of workout it is.
 * @param button Optional slot for displaying a book/unbook button.
 * @param friendsAttending Optional slot for displaying friends that are also attending the workout. Typically a [UpcomingWorkoutAttendingFriendsLabel]
 * @param waitingListStatus What status the member has on the waiting list.
 * **/
@Composable
fun UpcomingWorkoutListItem(
    name: String,
    time: String,
    location: String?,
    duration: String,
    workoutType: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    instructor: String?,
    workoutTypeColor: Color? = null,
    button: @Composable (() -> Unit)? = null,
    friendsAttending: @Composable (ColumnScope.() -> Unit)? = null,
    waitingListStatus: WaitingListStatus? = null,
) {
    Row(
        modifier
            .clickable(role = Role.Button) { onClick() }
            .height(IntrinsicSize.Min)
            .padding(SatsTheme.spacing.m),
        horizontalArrangement = spacedBy(SatsTheme.spacing.s),
    ) {
        workoutTypeColor?.let {
            WorkoutTypeColorIndicator(it)
        }
        TimeAndDuration(
            time = time,
            duration = duration,
        )

        Column(
            verticalArrangement = spacedBy(SatsTheme.spacing.s),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = spacedBy(SatsTheme.spacing.m),
                verticalAlignment = Alignment.Top,
            ) {
                WorkoutInfo(
                    name = name,
                    location = location,
                    instructor = instructor,
                    waitingListStatus = waitingListStatus,
                    workoutType = workoutType,
                    modifier = Modifier.weight(1f),
                )

                button?.let { it() }
            }

            friendsAttending?.let { it() }
        }
    }
}

/**
 * A label that displays info about the friends attending the same workout
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
        horizontalArrangement = spacedBy(SatsTheme.spacing.xs),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(horizontalArrangement = spacedBy((-8).dp)) {
            memberImages()
        }

        MaterialText(friendsAttendingLabel)
    }
}

@LightDarkPreview
@FontSizePreview
@Composable
private fun UpcomingWorkoutsListPreview() {
    SatsTheme {
        SatsSurface(useMaterial3 = true) {
            Column {
                UpcomingWorkoutDaySection(day = "Thu, Jul 27 2023") {
                    UpcomingWorkoutListItem(
                        name = "Pure Strength",
                        time = "11:00 AM",
                        location = "SATS Storo",
                        duration = "45 min",
                        instructor = "Kristin Hagen",
                        button = {
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
                        workoutTypeColor = SatsTheme.colors2.graphicalElements.workouts.gymfloor,
                        workoutType = null,
                        onClick = {},
                    )
                }
            }
        }
    }
}
