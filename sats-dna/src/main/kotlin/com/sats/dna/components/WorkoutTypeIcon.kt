package com.sats.dna.components

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
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
        WorkoutType.GroupExercise -> SatsTheme.colors.workout.gx
        WorkoutType.GymTraining -> SatsTheme.colors.workout.gymFloor
        WorkoutType.OnlineTraining -> SatsTheme.colors.workout.other
        WorkoutType.OwnTraining -> SatsTheme.colors.workout.other
        WorkoutType.PtAppointment -> SatsTheme.colors.workout.pt
        WorkoutType.Unknown -> SatsTheme.colors.workout.other
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
        SatsSurface(color = SatsTheme.colors.background.primary) {
            WorkoutTypeIcon(workoutType, contentDescription = null)
        }
    }
}

private class WorkoutTypePreviewProvider : PreviewParameterProvider<WorkoutType> {
    override val values = WorkoutType.values().asSequence()
}
