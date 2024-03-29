package com.sats.dna.components.statistics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsPlaceholderBox
import com.sats.dna.components.SatsPlaceholderText
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.card.SatsCard
import com.sats.dna.icons.BarChart
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsWorkoutGraphCard(
    workoutWeeks: List<SatsWorkoutGraphCardWeek>,
    highestTrainingStreak: Int,
    modifier: Modifier = Modifier,
) {
    val lazyListState = rememberLazyListState(initialFirstVisibleItemIndex = workoutWeeks.count() - 1)
    val firstVisibleWeek = remember { derivedStateOf { lazyListState.firstVisibleItemIndex } }

    SatsCard(modifier) {
        Box(Modifier.height(IntrinsicSize.Min)) {
            Column {
                Text(
                    text = workoutWeeks[firstVisibleWeek.value].year,
                    style = SatsTheme.typography.normal.small,
                    modifier = Modifier.padding(start = SatsTheme.spacing.m, top = SatsTheme.spacing.m),
                )
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(14.dp),
                    verticalAlignment = Alignment.Bottom,
                    state = lazyListState,
                    contentPadding = PaddingValues(SatsTheme.spacing.m),
                    modifier = Modifier.height((10 * highestTrainingStreak + 190).dp),
                ) {
                    items(workoutWeeks) { workouts ->
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            TrainingGraphCylinder(
                                workouts = workouts,
                                cylinderHeight = 10 * highestTrainingStreak + 110,
                            )

                            Box(
                                modifier = Modifier
                                    .padding(top = SatsTheme.spacing.xs)
                                    .size(28.dp)
                                    .clip(SatsTheme.shapes.circle),
                            ) {
                                Text(
                                    text = workouts.weekNumber.toString(),
                                    style = SatsTheme.typography.normal.basic,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.align(Alignment.Center),
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SatsWorkoutGraphCardPlaceholder(modifier: Modifier = Modifier) {
    SatsCard(modifier) {
        Column(
            Modifier.padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
        ) {
            SatsPlaceholderText("2024", style = SatsTheme.typography.normal.small)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom,
            ) {
                repeat(9) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        SatsPlaceholderBox(Modifier.size(10.dp, 160.dp), SatsTheme.shapes.circle)

                        SatsPlaceholderText("00", style = SatsTheme.typography.normal.basic)
                    }
                }
            }
        }
    }
}

@Composable
fun SatsEmptyWorkoutGraphCard(
    description: String,
    modifier: Modifier = Modifier,
) {
    SatsCard(modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .padding(start = SatsTheme.spacing.m, top = SatsTheme.spacing.xl, bottom = SatsTheme.spacing.xl)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            val contentColor = SatsTheme.colors.surfaces.primary.default.fgAlternate

            Icon(
                tint = contentColor,
                imageVector = SatsIcons.BarChart,
                contentDescription = null,
            )

            Text(
                modifier = Modifier
                    .padding(start = SatsTheme.spacing.s, end = SatsTheme.spacing.m),
                color = contentColor,
                text = description,
                style = SatsTheme.typography.normal.small,
            )
        }
    }
}

@Composable
private fun TrainingGraphCylinder(
    workouts: SatsWorkoutGraphCardWeek,
    cylinderHeight: Int,
) {
    val colors = SatsTheme.colors.graphicalElements.graphs.bar.primary

    val segmentHeight = 19.dp
    val segmentWidth = 6.dp
    val numberOfTrainingEvents = workouts.numberOfTrainingEvents

    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
        Column(
            modifier = Modifier
                .size(width = segmentWidth, height = cylinderHeight.dp)
                .clip(SatsTheme.shapes.roundedCorners.small)
                .background(colors.bg),
            verticalArrangement = Arrangement.Bottom,
        ) {
            repeat(numberOfTrainingEvents) {
                Box(
                    modifier = Modifier
                        .size(width = segmentWidth, height = segmentHeight)
                        .padding(top = 2.dp)
                        .clip(SatsTheme.shapes.roundedCorners.small)
                        .background(colors.default),
                )
            }
        }
    }
}

data class SatsWorkoutGraphCardWeek(
    val year: String,
    val numberOfTrainingEvents: Int,
    val weekNumber: Int,
)

@PreviewLightDark
@Composable
private fun SatsWorkoutGraphCardPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsWorkoutGraphCard(
                workoutWeeks = listOf(
                    SatsWorkoutGraphCardWeek(
                        year = "2023",
                        numberOfTrainingEvents = 2,
                        weekNumber = 21,
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
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsWorkoutGraphCardPlaceholderPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsWorkoutGraphCardPlaceholder(Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsEmptyWorkoutGraphCardPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsEmptyWorkoutGraphCard(
                description = "When you start working out, you will see your statistics here.",
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
