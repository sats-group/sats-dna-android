package com.sats.dna.sample.components.schedule

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.insets.ui.Scaffold
import com.google.accompanist.insets.ui.TopAppBar
import com.sats.dna.components.schedule.Schedule
import com.sats.dna.components.schedule.ScheduledWorkout
import com.sats.dna.components.schedule.WaitingListStatus
import com.sats.dna.theme.SatsTheme

@Composable
internal fun ScheduleScreen(navigateUp: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = SatsTheme.colors.surface.primary,
                contentPadding = WindowInsets.statusBars.asPaddingValues(),
                navigationIcon = {
                    IconButton(navigateUp) {
                        Icon(SatsTheme.icons.back, contentDescription = null)
                    }
                },
                title = { Text("Schedule") },
            )
        },
    ) { innerPadding ->
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