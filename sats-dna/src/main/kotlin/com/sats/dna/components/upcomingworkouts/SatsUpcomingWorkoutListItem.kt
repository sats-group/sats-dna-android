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
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsPlaceholderBox
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme

/**
 * A section for a day of upcoming workouts
 *
 * @param day A formatted day that will be displayed as the title of the section.
 * @param content The list of the containing workouts for this day. Consider using [SatsUpcomingWorkoutListItem].
 * @param modifier The modifier to apply to the section.
 **/
@Composable
fun SatsUpcomingWorkoutDaySection(
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
 * @param workoutTypeLabel What kind of workout it was, like cardio or strength training.
 * @param modifier The modifier to apply to the list item.
 * @param workoutType If not null, gives the component a color bar to the left of the content.
 * To symbolize what type of workout it is.
 * @param button Optional slot for displaying a book/unbook button.
 * @param friendsAttending Optional slot for displaying friends that are also attending the workout. Typically a [SatsUpcomingWorkoutAttendingFriendsLabel]
 * @param waitingListStatus What status the member has on the waiting list.
 * **/
@Composable
fun SatsUpcomingWorkoutListItem(
    name: String,
    time: String,
    location: String?,
    instructor: String?,
    duration: String,
    workoutTypeLabel: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    workoutType: SatsWorkoutType? = null,
    button: @Composable (() -> Unit)? = null,
    friendsAttending: @Composable (ColumnScope.() -> Unit)? = null,
    waitingListStatus: SatsWaitingListStatus? = null,
) {
    Row(
        modifier
            .clickable(role = Role.Button) { onClick() }
            .height(IntrinsicSize.Min)
            .padding(SatsTheme.spacing.m),
        horizontalArrangement = spacedBy(SatsTheme.spacing.s),
    ) {
        workoutType?.let {
            SatsWorkoutTypeColorIndicator(it)
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
                    workoutType = workoutTypeLabel,
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
fun SatsUpcomingWorkoutAttendingFriendsLabel(
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

@PreviewLightDark
@PreviewFontScale
@Composable
private fun SatsUpcomingWorkoutsListPreview() {
    SatsTheme {
        SatsSurface(useMaterial3 = true) {
            Column {
                SatsUpcomingWorkoutDaySection(day = "Thu, Jul 27 2023") {
                    SatsUpcomingWorkoutListItem(
                        name = "Pure Strength",
                        time = "11:00 AM",
                        location = "SATS Storo",
                        duration = "45 min",
                        instructor = "Kristin Hagen",
                        button = {
                            SatsButton(
                                onClick = { },
                                label = "Unbook",
                                colors = SatsButtonColor.Action,
                            )
                        },
                        friendsAttending = {
                            SatsUpcomingWorkoutAttendingFriendsLabel(
                                memberImages = {
                                    SatsPlaceholderBox(
                                        Modifier
                                            .size(24.dp)
                                            .border(BorderStroke(1.dp, Color.White), CircleShape),
                                        shape = SatsTheme.shapes.circle,
                                    )
                                    SatsPlaceholderBox(
                                        Modifier
                                            .size(24.dp)
                                            .border(BorderStroke(1.dp, Color.White), CircleShape),
                                        shape = SatsTheme.shapes.circle,
                                    )
                                },
                                friendsAttendingLabel = "2 friends are joining this workout!",
                            )
                        },
                        workoutType = SatsWorkoutType.Gx,
                        workoutTypeLabel = null,
                        onClick = {},
                    )
                }
            }
        }
    }
}
