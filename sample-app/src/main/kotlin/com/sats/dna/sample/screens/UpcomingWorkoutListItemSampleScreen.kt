package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.upcomingworkouts.SatsUpcomingWorkoutDaySection
import com.sats.dna.components.upcomingworkouts.SatsUpcomingWorkoutListItem
import com.sats.dna.components.upcomingworkouts.SatsWaitingListStatus
import com.sats.dna.components.upcomingworkouts.SatsWorkoutType
import com.sats.dna.theme.SatsTheme

data object UpcomingWorkoutListItemSampleScreen : SampleScreen(
    name = "Upcoming Workout List Item",
    route = "/components/upcoming-workout-list-item",
    screen = { UpcomingWorkoutListItemScreen(it::navigateUp) },
)

@Composable
private fun UpcomingWorkoutListItemScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen(
        title = "Upcoming Workout List",
        navigateUp = navigateUp,
        modifier = modifier,
        bottomBar = { Spacer(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding),
        ) {
            SatsUpcomingWorkoutDaySection(day = "Thu, Jul 27, 2023") {
                repeat(3) {
                    if (it > 0) SatsHorizontalDivider()
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
                        onClick = {},
                        waitingListStatus = SatsWaitingListStatus.OnWaitingList(
                            "You are number 10 on the waiting list",
                        ),
                        workoutType = SatsWorkoutType.OwnTraining,
                        workoutTypeLabel = null,
                    )
                }
            }

            SatsUpcomingWorkoutDaySection(day = "Fri, Jul 28, 2023") {
                repeat(3) {
                    if (it > 0) SatsHorizontalDivider()
                    SatsUpcomingWorkoutListItem(
                        name = "Pure Strength",
                        time = "10:30 AM",
                        location = "SATS Storo",
                        duration = "45 min",
                        instructor = "Kristin Hagen",
                        waitingListStatus = SatsWaitingListStatus.OnWaitingList(
                            "You are number 10 on the waiting list",
                        ),
                        button = {
                            SatsButton(
                                onClick = { },
                                label = "Unbook",
                                colors = SatsButtonColor.Action,
                            )
                        },
                        onClick = {},
                        workoutTypeLabel = "🏋️ Strength training",
                    )
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun UpcomingWorkoutListItemScreenPreview() {
    SatsTheme {
        UpcomingWorkoutListItemScreen(navigateUp = {})
    }
}
