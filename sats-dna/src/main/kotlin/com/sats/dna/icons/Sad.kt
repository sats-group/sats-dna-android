package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Sad: ImageVector
    get() {
        if (_sad != null) {
            return _sad!!
        }

        _sad = materialIcon(name = "Sad") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 3.25f)
                curveToRelative(-4.83f, 0f, -8.75f, 3.92f, -8.75f, 8.75f)
                reflectiveCurveToRelative(3.92f, 8.75f, 8.75f, 8.75f)
                reflectiveCurveToRelative(8.75f, -3.92f, 8.75f, -8.75f)
                reflectiveCurveTo(16.83f, 3.25f, 12f, 3.25f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.48f, 6.48f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.48f, 10f, 10f)
                reflectiveCurveToRelative(-4.48f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.52f, 2f, 12f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(8.25f, 10.75f)
                curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveTo(8.94f, 8.25f, 8.25f, 8.25f)
                reflectiveCurveTo(7f, 8.81f, 7f, 9.5f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(15.75f, 10.75f)
                curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveTo(14.5f, 8.81f, 14.5f, 9.5f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 14.5f)
                curveToRelative(-0.65f, 0f, -1.28f, 0.17f, -1.85f, 0.49f)
                curveToRelative(-0.56f, 0.32f, -1.03f, 0.78f, -1.36f, 1.33f)
                curveToRelative(-0.18f, 0.3f, -0.57f, 0.4f, -0.86f, 0.22f)
                curveToRelative(-0.3f, -0.18f, -0.4f, -0.57f, -0.22f, -0.86f)
                curveToRelative(0.45f, -0.74f, 1.08f, -1.35f, 1.83f, -1.78f)
                curveToRelative(0.75f, -0.42f, 1.6f, -0.65f, 2.46f, -0.65f)
                curveToRelative(0.86f, 0f, 1.71f, 0.23f, 2.46f, 0.65f)
                curveToRelative(0.75f, 0.43f, 1.38f, 1.04f, 1.83f, 1.78f)
                curveToRelative(0.17f, 0.3f, 0.08f, 0.68f, -0.22f, 0.86f)
                curveToRelative(-0.3f, 0.17f, -0.68f, 0.08f, -0.86f, -0.22f)
                curveToRelative(-0.33f, -0.55f, -0.8f, -1.01f, -1.36f, -1.33f)
                curveToRelative(-0.57f, -0.32f, -1.2f, -0.49f, -1.85f, -0.49f)
                close()
            }
        }

        return _sad!!
    }

@Suppress("ObjectPropertyName")
private var _sad: ImageVector? = null

@Preview
@Composable
private fun SatsIconSadPreview() {
    Icon(SatsIcons.Sad, contentDescription = null)
}
