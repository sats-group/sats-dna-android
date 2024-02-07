package com.sats.dna.components.icons

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

/**
 * Displays an icon representing a workout type.
 *
 * @param type The type of workout.
 * @param contentDescription The content description for the icon.
 * @param modifier The modifier to apply to the icon.
 */
@Composable
fun WorkoutTypeIcon(type: WorkoutType, contentDescription: String?, modifier: Modifier = Modifier) {
    val icon = when (type) {
        WorkoutType.GroupExercise -> SatsTheme.icons.workoutGx
        WorkoutType.GymTraining -> SatsTheme.icons.workoutGymFloor
        WorkoutType.OnlineTraining -> SatsTheme.icons.workoutOther
        WorkoutType.OwnTraining -> SatsTheme.icons.workoutOther
        WorkoutType.PtAppointment -> SatsTheme.icons.workoutPt
        WorkoutType.Unknown -> SatsTheme.icons.workoutOther
    }

    val color = when (type) {
        WorkoutType.GroupExercise ->
            SatsTheme.colors2.graphicalElements.workouts.gx.bg
        WorkoutType.GymTraining ->
            SatsTheme.colors2.graphicalElements.workouts.gymfloor.bg
        WorkoutType.OnlineTraining ->
            SatsTheme.colors2.graphicalElements.workouts.ownTrainingOther.bg
        WorkoutType.OwnTraining ->
            SatsTheme.colors2.graphicalElements.workouts.ownTrainingOther.bg
        WorkoutType.PtAppointment ->
            SatsTheme.colors2.graphicalElements.workouts.pt.bg
        WorkoutType.Unknown ->
            SatsTheme.colors2.graphicalElements.workouts.ownTrainingOther.bg
    }

    Icon(icon, contentDescription, modifier, color)
}

/**
 * An enum representing the different types of workouts.
 */
enum class WorkoutType {
    GroupExercise,
    GymTraining,
    OnlineTraining,
    OwnTraining,
    PtAppointment,
    Unknown,
}

@LightDarkPreview
@Composable
private fun Preview(@PreviewParameter(WorkoutTypePreviewProvider::class) workoutType: WorkoutType) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            WorkoutTypeIcon(workoutType, contentDescription = null, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

private class WorkoutTypePreviewProvider : PreviewParameterProvider<WorkoutType> {
    override val values = WorkoutType.entries.asSequence()
}
