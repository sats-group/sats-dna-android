package com.sats.dna.components.upcomingworkouts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.card.SatsCard
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun Schedule(
    workouts: List<ScheduledWorkout>,
    onWorkoutClicked: (workout: ScheduledWorkout) -> Unit,
    modifier: Modifier = Modifier,
) {
    SatsCard(modifier.fillMaxWidth()) {
        val days = workouts.groupBy { it.day }

        ScheduledDays(days, onWorkoutClicked)
    }
}

@Composable
private fun ScheduledDays(
    days: Map<String, List<ScheduledWorkout>>,
    onWorkoutClicked: (workout: ScheduledWorkout) -> Unit,
) {
    Column(
        Modifier.padding(top = cardInnerPadding, bottom = cardInnerPadding - clickableVerticalPadding),
        spacedBy(SatsTheme.spacing.s - clickableVerticalPadding),
    ) {
        days.keys.forEach { dayName ->
            Column(verticalArrangement = spacedBy(SatsTheme.spacing.s - clickableVerticalPadding)) {
                MaterialText(
                    text = dayName,
                    modifier = Modifier.padding(horizontal = cardInnerPadding),
                    color = SatsTheme.colors2.surfaces.primary.fg.alternate,
                    style = SatsTheme.typography.normal.small,
                )

                val workouts = days.getValue(dayName)

                ScheduledWorkouts(workouts, onWorkoutClicked)
            }
        }
    }
}

@Composable
private fun ScheduledWorkouts(
    workouts: List<ScheduledWorkout>,
    onWorkoutClicked: (workout: ScheduledWorkout) -> Unit,
) {
    Column(verticalArrangement = spacedBy(SatsTheme.spacing.xs - clickableVerticalPadding)) {
        workouts.forEach { workout ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = cardInnerPadding - clickableHorizontalPadding)
                    .clip(SatsTheme.shapes.roundedCorners.small)
                    .clickable { onWorkoutClicked(workout) }
                    .padding(
                        vertical = clickableVerticalPadding,
                        horizontal = clickableHorizontalPadding,
                    ),
                horizontalArrangement = spacedBy(SatsTheme.spacing.s),
            ) {
                TimeAndDuration(
                    time = workout.time,
                    duration = workout.duration,
                    modifier = Modifier.weight(1f),
                )

                WorkoutInfo(
                    name = workout.name,
                    location = workout.location,
                    instructor = workout.instructor,
                    waitingListStatus = workout.waitingListStatus,
                    modifier = Modifier.weight(4f),
                )
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun SchedulePreview() {
    val schedule = listOf(
        ScheduledWorkout(
            id = "foo",
            day = "Today",
            time = "9:00 PM",
            duration = "45 min",
            name = "Yoga Flow",
            location = "SATS Nydalen",
            instructor = "w/ Andrew Nielsen",
            waitingListStatus = WaitingListStatus.SpotSecured("Spot secured!", "32 on waiting list"),
        ),
        ScheduledWorkout(
            id = "bar",
            day = "Today",
            time = "5:30 PM",
            duration = "30 min",
            name = "Body Pump",
            location = "SATS Colosseum",
            instructor = "w/ Magnus Owe",
            waitingListStatus = WaitingListStatus.OnWaitingList("Number 5 on the waiting list."),
        ),
        ScheduledWorkout(
            id = "baz",
            day = "Tomorrow",
            time = "9:00 AM",
            duration = "120 min",
            name = "Cycling Marathon",
            location = "SATS Storo",
            instructor = "w/ John Doe",
            waitingListStatus = null,
        ),
        ScheduledWorkout(
            id = "baz",
            day = "Tomorrow",
            time = "9:00 PM",
            duration = "120 min",
            name = "Super long long long long long workout name",
            location = "SATS Storo",
            instructor = "w/ John Doe",
            waitingListStatus = null,
        ),
    )

    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            Schedule(schedule, onWorkoutClicked = {}, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

private val cardInnerPadding @Composable get() = SatsTheme.spacing.m
private val clickableVerticalPadding @Composable get() = SatsTheme.spacing.xxs
private val clickableHorizontalPadding @Composable get() = SatsTheme.spacing.xs
