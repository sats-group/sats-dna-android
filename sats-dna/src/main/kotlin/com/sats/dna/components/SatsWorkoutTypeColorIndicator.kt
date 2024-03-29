package com.sats.dna.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.upcomingworkouts.SatsWorkoutType
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsWorkoutTypeColorIndicator(
    workoutType: SatsWorkoutType,
    modifier: Modifier = Modifier,
) {
    val color = when (workoutType) {
        SatsWorkoutType.Pt -> SatsTheme.colors.graphicalElements.workouts.pt.bg
        SatsWorkoutType.Gx -> SatsTheme.colors.graphicalElements.workouts.gx.bg
        SatsWorkoutType.Treatment -> SatsTheme.colors.graphicalElements.workouts.treatments.bg
        SatsWorkoutType.Gymfloor -> SatsTheme.colors.graphicalElements.workouts.gymfloor.bg
        SatsWorkoutType.OwnTraining -> SatsTheme.colors.graphicalElements.workouts.other.bg
    }

    Box(
        modifier
            .heightIn(min = 4.dp)
            .width(4.dp)
            .clip(SatsTheme.shapes.roundedCorners.medium)
            .background(color),
    )
}

@PreviewLightDark
@Composable
private fun SatsWorkoutTypeColorIndicatorPtPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsWorkoutTypeColorIndicator(
                SatsWorkoutType.Pt,
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .height(32.dp),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsWorkoutTypeColorIndicatorGxPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsWorkoutTypeColorIndicator(
                SatsWorkoutType.Gx,
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .height(32.dp),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsWorkoutTypeColorIndicatorTreatmentPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsWorkoutTypeColorIndicator(
                SatsWorkoutType.Treatment,
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .height(32.dp),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsWorkoutTypeColorIndicatorGymfloorPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsWorkoutTypeColorIndicator(
                SatsWorkoutType.Gymfloor,
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .height(32.dp),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsWorkoutTypeColorIndicatorOwnTrainingPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsWorkoutTypeColorIndicator(
                SatsWorkoutType.OwnTraining,
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .height(32.dp),
            )
        }
    }
}
