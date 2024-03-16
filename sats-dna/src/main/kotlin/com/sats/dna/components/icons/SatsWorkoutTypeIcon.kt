package com.sats.dna.components.icons

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

/**
 * Displays an icon representing a workout type.
 *
 * @param type The type of workout.
 * @param contentDescription The content description for the icon.
 * @param modifier The modifier to apply to the icon.
 */
@Composable
fun SatsWorkoutTypeIcon(type: SatsWorkoutTypeIconType, contentDescription: String?, modifier: Modifier = Modifier) {
    val icon = when (type) {
        SatsWorkoutTypeIconType.GroupExercise -> SatsTheme.icons.workoutGx
        SatsWorkoutTypeIconType.GymTraining -> SatsTheme.icons.workoutGymFloor
        SatsWorkoutTypeIconType.OnlineTraining -> SatsTheme.icons.workoutOther
        SatsWorkoutTypeIconType.OwnTraining -> SatsTheme.icons.workoutOther
        SatsWorkoutTypeIconType.PtAppointment -> SatsTheme.icons.workoutPt
        SatsWorkoutTypeIconType.Unknown -> SatsTheme.icons.workoutOther
    }

    val color = when (type) {
        SatsWorkoutTypeIconType.GroupExercise ->
            SatsTheme.colors2.graphicalElements.workouts.gx.bg

        SatsWorkoutTypeIconType.GymTraining ->
            SatsTheme.colors2.graphicalElements.workouts.gymfloor.bg

        SatsWorkoutTypeIconType.OnlineTraining ->
            SatsTheme.colors2.graphicalElements.workouts.other.bg

        SatsWorkoutTypeIconType.OwnTraining ->
            SatsTheme.colors2.graphicalElements.workouts.other.bg

        SatsWorkoutTypeIconType.PtAppointment ->
            SatsTheme.colors2.graphicalElements.workouts.pt.bg

        SatsWorkoutTypeIconType.Unknown ->
            SatsTheme.colors2.graphicalElements.workouts.other.bg
    }

    Icon(icon, contentDescription, modifier, color)
}

/**
 * An enum representing the different types of workouts.
 */
enum class SatsWorkoutTypeIconType {
    GroupExercise,
    GymTraining,
    OnlineTraining,
    OwnTraining,
    PtAppointment,
    Unknown,
}

@PreviewLightDark
@Composable
private fun SatsWorkoutTypeIconPreview(
    @PreviewParameter(WorkoutTypePreviewProvider::class) workoutType: SatsWorkoutTypeIconType,
) {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds2.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsWorkoutTypeIcon(
                workoutType,
                contentDescription = null,
                Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

private class WorkoutTypePreviewProvider : PreviewParameterProvider<SatsWorkoutTypeIconType> {
    override val values = SatsWorkoutTypeIconType.entries.asSequence()
}
