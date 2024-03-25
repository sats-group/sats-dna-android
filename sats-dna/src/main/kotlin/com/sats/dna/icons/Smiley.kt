package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Smiley: ImageVector
    get() {
        if (_smiley != null) {
            return _smiley!!
        }

        _smiley = materialIcon(name = "Smiley") {
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
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7f, 12f)
                curveToRelative(0.35f, 0f, 0.63f, 0.28f, 0.63f, 0.63f)
                curveToRelative(0f, 1.16f, 0.46f, 2.27f, 1.28f, 3.09f)
                curveTo(9.73f, 16.54f, 10.84f, 17f, 12f, 17f)
                reflectiveCurveToRelative(2.27f, -0.46f, 3.1f, -1.28f)
                curveToRelative(0.81f, -0.82f, 1.28f, -1.93f, 1.28f, -3.1f)
                curveToRelative(0f, -0.34f, 0.27f, -0.62f, 0.62f, -0.62f)
                reflectiveCurveToRelative(0.63f, 0.28f, 0.63f, 0.63f)
                curveToRelative(0f, 1.49f, -0.6f, 2.92f, -1.65f, 3.97f)
                curveToRelative(-1.06f, 1.06f, -2.49f, 1.65f, -3.98f, 1.65f)
                curveToRelative(-1.5f, 0f, -2.92f, -0.6f, -3.98f, -1.65f)
                curveToRelative(-1.05f, -1.05f, -1.64f, -2.48f, -1.64f, -3.98f)
                curveTo(6.38f, 12.29f, 6.64f, 12f, 7f, 12f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.56f, 8.88f)
                curveToRelative(-0.25f, 0f, -0.48f, 0.1f, -0.66f, 0.27f)
                curveToRelative(-0.18f, 0.18f, -0.28f, 0.41f, -0.28f, 0.66f)
                curveToRelative(0f, 0.35f, -0.27f, 0.63f, -0.62f, 0.63f)
                reflectiveCurveTo(6.37f, 10.16f, 6.37f, 9.8f)
                curveToRelative(0f, -0.58f, 0.24f, -1.13f, 0.65f, -1.54f)
                curveToRelative(0.4f, -0.41f, 0.96f, -0.64f, 1.54f, -0.64f)
                curveToRelative(0.58f, 0f, 1.14f, 0.23f, 1.55f, 0.64f)
                curveToRelative(0.41f, 0.4f, 0.64f, 0.96f, 0.64f, 1.54f)
                curveToRelative(0f, 0.35f, -0.28f, 0.63f, -0.63f, 0.63f)
                curveToRelative(-0.34f, 0f, -0.62f, -0.28f, -0.62f, -0.63f)
                curveToRelative(0f, -0.25f, -0.1f, -0.48f, -0.27f, -0.66f)
                curveTo(9.05f, 8.97f, 8.8f, 8.87f, 8.56f, 8.87f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(13.9f, 8.27f)
                curveToRelative(0.4f, -0.41f, 0.96f, -0.64f, 1.54f, -0.64f)
                curveToRelative(0.58f, 0f, 1.13f, 0.23f, 1.54f, 0.64f)
                curveToRelative(0.41f, 0.4f, 0.64f, 0.96f, 0.64f, 1.54f)
                curveToRelative(0f, 0.35f, -0.27f, 0.63f, -0.62f, 0.63f)
                reflectiveCurveToRelative(-0.63f, -0.28f, -0.63f, -0.63f)
                curveToRelative(0f, -0.25f, -0.1f, -0.48f, -0.27f, -0.66f)
                curveToRelative(-0.18f, -0.18f, -0.41f, -0.28f, -0.66f, -0.28f)
                curveToRelative(-0.25f, 0f, -0.49f, 0.1f, -0.67f, 0.28f)
                curveToRelative(-0.17f, 0.18f, -0.27f, 0.41f, -0.27f, 0.66f)
                curveToRelative(0f, 0.35f, -0.28f, 0.63f, -0.63f, 0.63f)
                curveToRelative(-0.34f, 0f, -0.62f, -0.28f, -0.62f, -0.63f)
                curveToRelative(0f, -0.58f, 0.23f, -1.13f, 0.64f, -1.54f)
                close()
            }
        }

        return _smiley!!
    }

@Suppress("ObjectPropertyName")
private var _smiley: ImageVector? = null

@Preview
@Composable
private fun SatsIconSmileyPreview() {
    Icon(SatsIcons.Smiley, contentDescription = null)
}
