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
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsPlaceholderText
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsTwoOptionsInCardCardButton
import com.sats.dna.components.card.SatsCard
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsSchedule(
    workouts: List<SatsUpcomingWorkout>,
    onWorkoutClicked: (workout: SatsUpcomingWorkout) -> Unit,
    modifier: Modifier = Modifier,
    cardButton: @Composable (() -> Unit?)? = null,
) {
    SatsCard(modifier.fillMaxWidth()) {
        Column {
            val days = workouts.groupBy { it.day }

            ScheduledDays(days, onWorkoutClicked)

            cardButton?.let {
                cardButton()
            }
        }
    }
}

@Composable
fun SatsSchedulePlaceholder(modifier: Modifier = Modifier) {
    SatsCard(modifier.fillMaxWidth()) {
        Column(
            Modifier.padding(top = cardInnerPadding, bottom = cardInnerPadding - clickableVerticalPadding),
            spacedBy(SatsTheme.spacing.s - clickableVerticalPadding),
        ) {
            Column(verticalArrangement = spacedBy(SatsTheme.spacing.s - clickableVerticalPadding)) {
                SatsPlaceholderText(
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
                                SatsPlaceholderText("9:00 PM", style = SatsTheme.typography.medium.basic)

                                SatsPlaceholderText("45 min", style = SatsTheme.typography.normal.small)
                            }

                            Column(Modifier.weight(4f), verticalArrangement = spacedBy(SatsTheme.spacing.xxs)) {
                                SatsPlaceholderText("Yoga Flow", style = SatsTheme.typography.medium.basic)

                                SatsPlaceholderText("SATS Nydalen", style = SatsTheme.typography.normal.small)

                                SatsPlaceholderText("w/Andrew Nielsen", style = SatsTheme.typography.normal.small)
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
    days: Map<String, List<SatsUpcomingWorkout>>,
    onWorkoutClicked: (workout: SatsUpcomingWorkout) -> Unit,
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
    workouts: List<SatsUpcomingWorkout>,
    onWorkoutClicked: (workout: SatsUpcomingWorkout) -> Unit,
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
                workout.workoutType?.let {
                    SatsWorkoutTypeColorIndicator(it)
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
                    workoutType = workout.workoutTypeLabel,
                    waitingListStatus = workout.waitingListStatus,
                    modifier = Modifier.weight(4f),
                )
            }
        }
    }
}

@PreviewLightDark
@PreviewFontScale
@Composable
private fun SatsSchedulePreview() {
    val schedule = listOf(
        SatsUpcomingWorkout(
            id = "foo",
            day = "Today",
            time = "9:00 PM",
            duration = "45 min",
            name = "Yoga Flow",
            location = "SATS Nydalen",
            instructor = "w/Andrew Nielsen",
            workoutType = SatsWorkoutType.Gx,
            workoutTypeLabel = null,
            waitingListStatus = SatsWaitingListStatus.SpotSecured("Spot secured!", "32 on waiting list"),
        ),
        SatsUpcomingWorkout(
            id = "bar",
            day = "Today",
            time = "5:30 PM",
            duration = "30 min",
            name = "Body Pump",
            location = "SATS Colosseum",
            instructor = "w/Magnus Owe",
            workoutType = SatsWorkoutType.Pt,
            workoutTypeLabel = null,
            waitingListStatus = SatsWaitingListStatus.OnWaitingList("Number 5 on the waiting list."),
        ),
        SatsUpcomingWorkout(
            id = "baz",
            day = "Tomorrow",
            time = "9:00 AM",
            duration = "120 min",
            name = "Cycling Marathon",
            location = "SATS Storo",
            instructor = "w/John Doe",
            workoutTypeLabel = "Cycling",
            waitingListStatus = null,
        ),
    )

    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsSchedule(schedule, onWorkoutClicked = {}, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@PreviewLightDark
@PreviewFontScale
@Composable
private fun SatsScheduleWithCardButtonPreview() {
    val schedule = listOf(
        SatsUpcomingWorkout(
            id = "foo",
            day = "Today",
            time = "9:00 PM",
            duration = "45 min",
            name = "Yoga Flow",
            location = "SATS Nydalen",
            instructor = "w/Andrew Nielsen",
            workoutType = SatsWorkoutType.Gx,
            workoutTypeLabel = null,
            waitingListStatus = SatsWaitingListStatus.SpotSecured("Spot secured!", "32 on waiting list"),
        ),
        SatsUpcomingWorkout(
            id = "bar",
            day = "Today",
            time = "5:30 PM",
            duration = "30 min",
            name = "Body Pump",
            location = "SATS Colosseum",
            instructor = "w/Magnus Owe",
            workoutType = SatsWorkoutType.Pt,
            workoutTypeLabel = null,
            waitingListStatus = SatsWaitingListStatus.OnWaitingList("Number 5 on the waiting list."),
        ),
        SatsUpcomingWorkout(
            id = "baz",
            day = "Tomorrow",
            time = "9:00 AM",
            duration = "120 min",
            name = "Cycling Marathon",
            location = "SATS Storo",
            instructor = "w/John Doe",
            workoutTypeLabel = "Cycling",
            waitingListStatus = null,
        ),
    )

    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsSchedule(
                workouts = schedule,
                onWorkoutClicked = {},
                modifier = Modifier.padding(SatsTheme.spacing.m),
                cardButton = {
                    SatsTwoOptionsInCardCardButton(
                        firstOptionOnClick = {},
                        firstOptionText = "Book",
                        firstOptionIcon = SatsTheme.icons.time,
                        secondOptionOnClick = {},
                        secondOptionText = "Schedule",
                        secondOptionIcon = SatsTheme.icons.calendar,
                    )
                },
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsSchedulePlaceholderPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsSchedulePlaceholder(Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

private val cardInnerPadding @Composable get() = SatsTheme.spacing.m
private val clickableVerticalPadding @Composable get() = SatsTheme.spacing.xxs
private val clickableHorizontalPadding @Composable get() = SatsTheme.spacing.xs
