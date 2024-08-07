package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.card.SatsCard
import com.sats.dna.components.statistics.SatsEmptyWorkoutGraphCard
import com.sats.dna.components.statistics.SatsWorkoutGraphCard
import com.sats.dna.components.statistics.SatsWorkoutGraphCardPlaceholder
import com.sats.dna.components.statistics.SatsWorkoutGraphCardWeek
import com.sats.dna.components.statistics.SatsWorkoutStatisticsCard
import com.sats.dna.components.statistics.SatsWorkoutStatisticsCardItem
import com.sats.dna.components.statistics.SatsWorkoutStatisticsCardPlaceholder
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun WorkoutStatisticsSampleScreen(
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier,
) {
    SampleScreen(
        title = "Workout Statistics",
        navigateUp = navigateUp,
        modifier = modifier,
    ) {
        Column(
            Modifier
                .padding(it)
                .verticalScroll(rememberScrollState())
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            Column {
                Text(
                    modifier = Modifier.padding(horizontal = SatsTheme.spacing.m),
                    text = "Graph",
                    style = SatsTheme.typography.medium.small,
                )
                SatsHorizontalDivider()
            }
            SatsWorkoutGraphCard(
                workoutWeeks = listOf(
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 2,
                        weekNumber = 19,
                    ),
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 2,
                        weekNumber = 20,
                    ),
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 5,
                        weekNumber = 21,
                    ),
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 4,
                        weekNumber = 22,
                    ),
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 1,
                        weekNumber = 23,
                    ),
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 4,
                        weekNumber = 24,
                    ),
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 5,
                        weekNumber = 25,
                    ),
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 2,
                        weekNumber = 26,
                    ),
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 2,
                        weekNumber = 27,
                    ),
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 3,
                        weekNumber = 28,
                    ),
                ),
                highestTrainingStreak = 5,
            )
            SatsCard {
                SatsWorkoutGraphCardPlaceholder()
            }
            SatsCard {
                SatsEmptyWorkoutGraphCard(
                    description = "When you start working out, you will see your statistics here",
                )
            }

            Column {
                Text(
                    modifier = Modifier.padding(horizontal = SatsTheme.spacing.m),
                    text = "Statistics Card",
                    style = SatsTheme.typography.medium.small,
                )
                SatsHorizontalDivider()
            }
            SatsWorkoutStatisticsCard(
                leftItem = SatsWorkoutStatisticsCardItem(
                    label = "Last 12 months",
                    count = 40,
                ),
                rightItem = SatsWorkoutStatisticsCardItem(
                    label = "Last 30 days",
                    count = 50,
                ),
            )
            SatsWorkoutStatisticsCardPlaceholder()
        }
    }
}

@PreviewLightDark
@Composable
private fun WorkoutStatisticsSampleScreenPreview() {
    SatsTheme {
        WorkoutStatisticsSampleScreen(navigateUp = {})
    }
}
