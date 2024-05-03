package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.upcomingworkouts.SatsSchedule
import com.sats.dna.components.upcomingworkouts.SatsSchedulePlaceholder
import com.sats.dna.components.upcomingworkouts.SatsUpcomingWorkout
import com.sats.dna.components.upcomingworkouts.SatsWaitingListStatus
import com.sats.dna.components.upcomingworkouts.SatsWorkoutType
import com.sats.dna.sample.internal.ComponentScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun ScheduleSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Schedule", navigateUp, modifier) { innerPadding ->
        val schedule = listOf(
            SatsUpcomingWorkout(
                id = "foo",
                day = "Today",
                time = "09:00",
                duration = "45 min",
                name = "Yoga Flow",
                location = "SATS Nydalen",
                instructor = "w/ Andrew Nielsen",
                waitingListStatus = SatsWaitingListStatus.SpotSecured("Spot secured! 32 on the waiting list."),
                workoutTypeLabel = null,
                workoutType = SatsWorkoutType.Gx,
            ),
            SatsUpcomingWorkout(
                id = "bar",
                day = "Today",
                time = "17:30",
                duration = "30 min",
                name = "Body Pump",
                location = "SATS Colosseum",
                instructor = "w/ Magnus Owe",
                waitingListStatus = SatsWaitingListStatus.OnWaitingList("Number 5 on the waiting list."),
                workoutTypeLabel = null,
                workoutType = SatsWorkoutType.Pt,
            ),
            SatsUpcomingWorkout(
                id = "baz",
                day = "Tomorrow",
                time = "09:00",
                duration = "120 min",
                name = "Cycling Marathon",
                location = "SATS Storo",
                instructor = "w/ John Doe",
                waitingListStatus = null,
                workoutTypeLabel = null,
                workoutType = SatsWorkoutType.Gymfloor,
            ),
        )

        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            SatsSchedule(schedule, onWorkoutClicked = {})

            SatsHorizontalDivider()

            SatsSchedulePlaceholder()
        }
    }
}

@PreviewLightDark
@Composable
private fun ScheduleSampleScreenPreview() {
    SatsTheme {
        ScheduleSampleScreen(navigateUp = {})
    }
}
