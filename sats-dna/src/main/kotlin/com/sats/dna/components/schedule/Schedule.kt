package com.sats.dna.components.schedule

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun Schedule(
    workouts: List<ScheduledWorkout>,
    onWorkoutClicked: (workout: ScheduledWorkout) -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(modifier.fillMaxWidth()) {
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
        spacedBy(SatsTheme.spacing.xs),
    ) {
        days.keys.forEach { dayName ->
            Column(verticalArrangement = spacedBy(SatsTheme.spacing.s - clickableVerticalPadding)) {
                Text(
                    dayName,
                    Modifier.padding(horizontal = cardInnerPadding),
                    color = SatsTheme.colors.onSurface.secondary,
                    style = SatsTheme.typography.default.small,
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
    Column(verticalArrangement = spacedBy(SatsTheme.spacing.xxs)) {
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
            ) {
                TimeAndDuration(workout, Modifier.width(60.dp))

                WorkoutInfo(workout)
            }
        }
    }
}

@Composable
private fun TimeAndDuration(workout: ScheduledWorkout, modifier: Modifier = Modifier) {
    Column(modifier, spacedBy(SatsTheme.spacing.xxs)) {
        Text(workout.time)

        Text(
            workout.duration,
            color = SatsTheme.colors.onSurface.secondary,
            style = SatsTheme.typography.default.small,
        )
    }
}

@Composable
private fun WorkoutInfo(workout: ScheduledWorkout) {
    Column(verticalArrangement = spacedBy(SatsTheme.spacing.xxs)) {
        Text(workout.name)

        Text(
            workout.location,
            color = SatsTheme.colors.onSurface.secondary,
            style = SatsTheme.typography.default.small,
        )

        Text(
            workout.instructor,
            color = SatsTheme.colors.onSurface.secondary,
            style = SatsTheme.typography.default.small,
        )

        workout.waitingListStatus?.let { status ->
            WaitingListText(status)
        }
    }
}

@Composable
private fun WaitingListText(status: WaitingListStatus) {
    val color = when (status) {
        is WaitingListStatus.OnWaitingList -> SatsTheme.colors.waitingList.text
        is WaitingListStatus.SpotSecured -> SatsTheme.colors.signalText.success
    }

    Text(status.text, color = color, style = SatsTheme.typography.default.small)
}

@LightDarkPreview
@Composable
private fun Preview() {
    val schedule = listOf(
        ScheduledWorkout(
            id = "foo",
            day = "Today",
            time = "09:00",
            duration = "45 min",
            name = "Yoga Flow",
            location = "SATS Nydalen",
            instructor = "w/ Andrew Nielsen",
            waitingListStatus = WaitingListStatus.SpotSecured("Spot secured! 32 on the waiting list."),
        ),
        ScheduledWorkout(
            id = "bar",
            day = "Today",
            time = "17:30",
            duration = "30 min",
            name = "Body Pump",
            location = "SATS Colosseum",
            instructor = "w/ Magnus Owe",
            waitingListStatus = WaitingListStatus.OnWaitingList("Number 5 on the waiting list."),
        ),
        ScheduledWorkout(
            id = "baz",
            day = "Tomorrow",
            time = "09:00",
            duration = "120 min",
            name = "Cycling Marathon",
            location = "SATS Storo",
            instructor = "w/ John Doe",
            waitingListStatus = null,
        ),
    )

    SatsTheme {
        Schedule(schedule, onWorkoutClicked = {})
    }
}

private val cardInnerPadding @Composable get() = SatsTheme.spacing.m
private val clickableVerticalPadding @Composable get() = SatsTheme.spacing.xxs
private val clickableHorizontalPadding @Composable get() = SatsTheme.spacing.xs
