package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.UpcomingWorkoutDaySection
import com.sats.dna.components.UpcomingWorkoutInstructorLabel
import com.sats.dna.components.UpcomingWorkoutListItem
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.icons.DefaultInstructorIcon
import com.sats.dna.components.icons.InstructorType
import com.sats.dna.components.icons.WorkoutType
import com.sats.dna.components.icons.WorkoutTypeIcon

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
            repeat(10) {
                if (it > 0) Divider()

                UpcomingWorkoutDaySection(day = "Thu, Jul 27, 2023") {
                    UpcomingWorkoutListItem(
                        title = "Pure Strength",
                        timeStamp = "11:00 AM",
                        location = "SATS Storo",
                        duration = "45 min",
                        icon = {
                            WorkoutTypeIcon(
                                type = WorkoutType.GroupExercise,
                                contentDescription = null,
                                modifier = Modifier.size(34.dp),
                            )
                        },
                        instructorInfo = {
                            UpcomingWorkoutInstructorLabel(
                                instructorImage = {
                                    DefaultInstructorIcon(instructorType = InstructorType.Gx)
                                },
                                instructorName = "Kristin Hagen",
                            )
                        },
                        unbookButton = {
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
