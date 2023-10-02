package com.sats.dna.sample.components.schedule

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.upcomingworkouts.Schedule
import com.sats.dna.components.upcomingworkouts.ScheduledWorkout
import com.sats.dna.components.upcomingworkouts.WaitingListStatus
import com.sats.dna.sample.components.ComponentScreen
import com.sats.dna.theme.SatsTheme

@Composable
internal fun ScheduleScreen(navigateUp: () -> Unit) {
    ComponentScreen("Schedule", navigateUp) { innerPadding ->
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
