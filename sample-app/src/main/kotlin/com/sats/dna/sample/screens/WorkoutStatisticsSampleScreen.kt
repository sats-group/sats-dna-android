package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.card.SatsCard
import com.sats.dna.statistics.SatsEmptyWorkoutGraph
import com.sats.dna.statistics.SatsWorkoutGraph
import com.sats.dna.statistics.GraphWeek
import com.sats.dna.theme.SatsTheme

data object WorkoutStatisticsSampleScreen : SampleScreen(
    name = "Workout Statistics",
    route = "/components/statistics",
    screen = { WorkoutStatisticsScreen(it::navigateUp) },
)

@Composable
private fun WorkoutStatisticsScreen(
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier,
) {
    ComponentScreen(
        title = "Workout Statistics",
        navigateUp = navigateUp,
        modifier = modifier,
    ) {
        Column(
            Modifier
                .padding(it)
                .padding(SatsTheme.spacing.m)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            SatsCard {
                SatsWorkoutGraph(
                    workoutWeeks = listOf(
                        GraphWeek(
                            year = "2023",
                            numberOfTrainingEvents = 2,
                            weekNumber = 19,
                        ),
                        GraphWeek(
                            year = "2023",
                            numberOfTrainingEvents = 2,
                            weekNumber = 20,
                        ),
                        GraphWeek(
                            year = "2023",
                            numberOfTrainingEvents = 5,
                            weekNumber = 21,
                        ),
                        GraphWeek(
                            year = "2023",
                            numberOfTrainingEvents = 4,
                            weekNumber = 22,
                        ),
                        GraphWeek(
                            year = "2023",
                            numberOfTrainingEvents = 1,
                            weekNumber = 23,
                        ),
                        GraphWeek(
                            year = "2023",
                            numberOfTrainingEvents = 4,
                            weekNumber = 24,
                        ),
                        GraphWeek(
                            year = "2023",
                            numberOfTrainingEvents = 5,
                            weekNumber = 25,
                        ),
                        GraphWeek(
                            year = "2023",
                            numberOfTrainingEvents = 2,
                            weekNumber = 26,
                        ),
                        GraphWeek(
                            year = "2023",
                            numberOfTrainingEvents = 2,
                            weekNumber = 27,
                        ),
                        GraphWeek(
                            year = "2023",
                            numberOfTrainingEvents = 3,
                            weekNumber = 28,
                        ),
                    ),
                    highestTrainingStreak = 5,
                )
            }
            SatsCard {
                SatsEmptyWorkoutGraph(
                    description = "When you start working out, you will see your statistics here"
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun WorkoutStatisticsScreenPreview() {
    SatsTheme {
        WorkoutStatisticsScreen(navigateUp = {})
    }
}
