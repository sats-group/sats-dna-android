package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.upcomingworkouts.UpcomingWorkoutDaySection
import com.sats.dna.components.upcomingworkouts.UpcomingWorkoutListItem
import com.sats.dna.components.upcomingworkouts.WaitingListStatus

@Composable
internal fun UpcomingWorkoutListItemScreen(navigateUp: () -> Unit) {
    ComponentScreen(
        "Upcoming Workout List",
        navigateUp,
        bottomBar = { Spacer(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding),
        ) {
            UpcomingWorkoutDaySection(day = "Thu, Jul 27, 2023") {
                repeat(3) {
                    if (it > 0) Divider()
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
                    ) { }
                }
            }

            UpcomingWorkoutDaySection(day = "Fri, Jul 28, 2023") {
                repeat(3) {
                    if (it > 0) Divider()
                    UpcomingWorkoutListItem(
                        name = "Pure Strength",
                        time = "10:30 AM",
                        location = "SATS Storo",
                        duration = "45 min",
                        instructor = "Kristin Hagen",
                        waitingListStatus = WaitingListStatus.OnWaitingList("You are number 10 on the waiting list"),
                        button = {
                            SatsButton(
                                onClick = { },
                                label = "Unbook",
                                colors = SatsButtonColor.Transparent,
                            )
                        },
                    ) { }
                }
            }
        }
    }
}
