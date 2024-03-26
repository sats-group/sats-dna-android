package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.WorkoutGymFloor: ImageVector
    get() {
        if (_workoutGymFloor != null) {
            return _workoutGymFloor!!
        }

        _workoutGymFloor = materialIcon(name = "WorkoutGymFloor") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(1.011f, 17.615f)
                arcToRelative(16.247f, 16.247f, 0f, true, true, 32.493f, 0f)
                arcToRelative(16.247f, 16.247f, 0f, true, true, -32.493f, 0f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(14.078f, 22.228f)
                lineToRelative(0.5f, 4f)
                lineToRelative(-2.775f, 0.793f)
                curveToRelative(-0.209f, 0.059f, -0.392f, 0.185f, -0.523f, 0.359f)
                curveToRelative(-0.131f, 0.173f, -0.202f, 0.384f, -0.202f, 0.602f)
                verticalLineToRelative(3.246f)
                moveToRelative(9f, -9f)
                lineToRelative(-0.5f, 4f)
                lineToRelative(2.775f, 0.793f)
                curveToRelative(0.209f, 0.059f, 0.393f, 0.185f, 0.523f, 0.359f)
                curveToRelative(0.131f, 0.173f, 0.202f, 0.384f, 0.202f, 0.602f)
                verticalLineToRelative(3.246f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(23.078f, 15.227f)
                lineToRelative(-3f, 7.001f)
                horizontalLineToRelative(-6f)
                lineToRelative(-3f, -7.001f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(17.078f, 19.228f)
                curveToRelative(1.105f, 0f, 2f, -0.896f, 2f, -2f)
                curveToRelative(0f, -1.105f, -0.895f, -2.001f, -2f, -2.001f)
                curveToRelative(-1.104f, 0f, -2f, 0.896f, -2f, 2.001f)
                curveToRelative(0f, 1.104f, 0.896f, 2f, 2f, 2f)
                close()
                moveToRelative(-11f, -7.001f)
                horizontalLineToRelative(22f)
                moveToRelative(-21f, -2.999f)
                verticalLineToRelative(5.999f)
                moveToRelative(20f, -5.999f)
                verticalLineToRelative(5.999f)
            }
        }

        return _workoutGymFloor!!
    }

@Suppress("ObjectPropertyName")
private var _workoutGymFloor: ImageVector? = null

@Preview
@Composable
private fun SatsIconWorkoutGymFloorPreview() {
    Icon(SatsIcons.WorkoutGymFloor, contentDescription = null)
}
