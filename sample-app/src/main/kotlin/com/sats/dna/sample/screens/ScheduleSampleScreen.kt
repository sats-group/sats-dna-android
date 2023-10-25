package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.upcomingworkouts.Schedule
import com.sats.dna.components.upcomingworkouts.ScheduledWorkout
import com.sats.dna.components.upcomingworkouts.WaitingListStatus
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object ScheduleSampleScreen : SampleScreen(
    name = "Schedule",
    route = "/components/schedule",
    screen = { ScheduleScreen(it::navigateUp) },
)

@Composable
private fun ScheduleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Schedule", navigateUp, modifier) { innerPadding ->
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

        Schedule(
            schedule,
            onWorkoutClicked = {},
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
        )
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        ScheduleScreen(navigateUp = {})
    }
}
