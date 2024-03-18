package com.sats.dna.components.statistics

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsPlaceholderText
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.card.SatsCard
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsWorkoutStatisticsCard(
    leftItem: SatsWorkoutStatisticsCardItem,
    rightItem: SatsWorkoutStatisticsCardItem,
    modifier: Modifier = Modifier,
) {
    SatsCard(modifier) {
        Row(Modifier.padding(SatsTheme.spacing.m)) {
            WorkoutStatisticsSection(
                modifier = Modifier.weight(1f),
                label = leftItem.label,
                value = leftItem.count,
            )

            WorkoutStatisticsSection(
                modifier = Modifier.weight(1f),
                label = rightItem.label,
                value = rightItem.count,
            )
        }
    }
}

@Composable
private fun WorkoutStatisticsSection(
    label: String,
    value: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = value,
            style = SatsTheme.typography.normal.headline3,
        )

        Text(
            text = label,
            style = SatsTheme.typography.normal.small,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = SatsTheme.spacing.xxs),
        )
    }
}

@Composable
fun SatsWorkoutStatisticsCardPlaceholder(modifier: Modifier = Modifier) {
    SatsCard(modifier) {
        Row(Modifier.padding(SatsTheme.spacing.m)) {
            WorkoutStatisticsSectionPlaceholder(
                modifier = Modifier.weight(1f),
                label = "Last 12 months",
                value = "40",
            )

            WorkoutStatisticsSectionPlaceholder(
                modifier = Modifier.weight(1f),
                label = "Last 30 days",
                value = "50",
            )
        }
    }
}

@Composable
private fun WorkoutStatisticsSectionPlaceholder(
    label: String,
    value: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SatsPlaceholderText(
            text = value,
            style = SatsTheme.typography.normal.headline3,
        )

        SatsPlaceholderText(
            text = label,
            style = SatsTheme.typography.normal.small,
            modifier = Modifier.padding(top = SatsTheme.spacing.xxs),
        )
    }
}

class SatsWorkoutStatisticsCardItem private constructor(
    val label: String,
    val count: String,
) {
    constructor(label: String, count: Int) : this(label, "$count")
    constructor(label: String, count: Double) : this(label, "$count")
}

@PreviewLightDark
@Preview("2x font size", fontScale = 2f)
@Composable
private fun WorkoutStatisticsCardPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsWorkoutStatisticsCard(
                leftItem = SatsWorkoutStatisticsCardItem(
                    label = "Last 12 months",
                    count = 40,
                ),
                rightItem = SatsWorkoutStatisticsCardItem(
                    label = "Last 30 days",
                    count = 50,
                ),
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Preview("2x font size", fontScale = 2f)
@Composable
private fun StatisticsPlaceholderPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsWorkoutStatisticsCardPlaceholder(Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
