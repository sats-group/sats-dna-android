package com.sats.dna.components.upcomingworkouts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.sats.dna.components.PlaceholderText
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.card.SatsCard
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.FontSizePreview
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
fun SchedulePlaceholder(modifier: Modifier = Modifier) {
    SatsCard(modifier.fillMaxWidth()) {
        Column(
            Modifier.padding(top = cardInnerPadding, bottom = cardInnerPadding - clickableVerticalPadding),
            spacedBy(SatsTheme.spacing.s - clickableVerticalPadding),
        ) {
            Column(verticalArrangement = spacedBy(SatsTheme.spacing.s - clickableVerticalPadding)) {
                PlaceholderText(
                    text = "Tomorrow",
                    modifier = Modifier.padding(horizontal = cardInnerPadding),
                    style = SatsTheme.typography.normal.small,
                )

                Column(verticalArrangement = spacedBy(SatsTheme.spacing.xs - clickableVerticalPadding)) {
                    repeat(2) {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .padding(horizontal = cardInnerPadding - clickableHorizontalPadding)
                                .clip(SatsTheme.shapes.roundedCorners.small)
                                .padding(
                                    vertical = clickableVerticalPadding,
                                    horizontal = clickableHorizontalPadding,
                                ),
                            horizontalArrangement = spacedBy(SatsTheme.spacing.s),
                        ) {
                            Column(Modifier.weight(1f), verticalArrangement = spacedBy(SatsTheme.spacing.xxs)) {
                                PlaceholderText("9:00 PM", style = SatsTheme.typography.medium.basic)

                                PlaceholderText("45 min", style = SatsTheme.typography.normal.small)
                            }

                            Column(Modifier.weight(4f), verticalArrangement = spacedBy(SatsTheme.spacing.xxs)) {
                                PlaceholderText("Yoga Flow", style = SatsTheme.typography.medium.basic)

                                PlaceholderText("SATS Nydalen", style = SatsTheme.typography.normal.small)

                                PlaceholderText("w/Andrew Nielsen", style = SatsTheme.typography.normal.small)
                            }
                        }
                    }
                }
            }
        }
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
                    .height(IntrinsicSize.Min)
                    .padding(horizontal = cardInnerPadding - clickableHorizontalPadding)
                    .clip(SatsTheme.shapes.roundedCorners.small)
                    .clickable { onWorkoutClicked(workout) }
                    .padding(
                        vertical = clickableVerticalPadding,
                        horizontal = clickableHorizontalPadding,
                    ),
                horizontalArrangement = spacedBy(SatsTheme.spacing.s),
            ) {
                workout.workoutTypeColor?.let {
                    WorkoutTypeColorIndicator(it)
                }
                TimeAndDuration(
                    time = workout.time,
                    duration = workout.duration,
                    modifier = Modifier.weight(1f),
                )

                WorkoutInfo(
                    name = workout.name,
                    location = workout.location,
                    instructor = workout.instructor,
                    workoutType = workout.workoutType,
                    waitingListStatus = workout.waitingListStatus,
                    modifier = Modifier.weight(4f),
                )
            }
        }
    }
}

@LightDarkPreview
@FontSizePreview
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
            instructor = "w/Andrew Nielsen",
            workoutTypeColor = SatsTheme.colors2.graphicalElements.workouts.gx,
            workoutType = null,
            waitingListStatus = WaitingListStatus.SpotSecured("Spot secured!", "32 on waiting list"),
        ),
        ScheduledWorkout(
            id = "bar",
            day = "Today",
            time = "5:30 PM",
            duration = "30 min",
            name = "Body Pump",
            location = "SATS Colosseum",
            instructor = "w/Magnus Owe",
            workoutTypeColor = SatsTheme.colors2.graphicalElements.workouts.gymfloor,
            workoutType = null,
            waitingListStatus = WaitingListStatus.OnWaitingList("Number 5 on the waiting list."),
        ),
        ScheduledWorkout(
            id = "baz",
            day = "Tomorrow",
            time = "9:00 AM",
            duration = "120 min",
            name = "Cycling Marathon",
            location = "SATS Storo",
            instructor = "w/John Doe",
            workoutType = "Cycling",
            waitingListStatus = null,
        ),
    )

    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            Schedule(schedule, onWorkoutClicked = {}, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@LightDarkPreview
@Composable
private fun SchedulePlaceholderPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SchedulePlaceholder(Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

private val cardInnerPadding @Composable get() = SatsTheme.spacing.m
private val clickableVerticalPadding @Composable get() = SatsTheme.spacing.xxs
private val clickableHorizontalPadding @Composable get() = SatsTheme.spacing.xs
