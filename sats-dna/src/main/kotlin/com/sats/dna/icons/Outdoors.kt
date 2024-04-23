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
val SatsIcons.Outdoors: ImageVector
    get() {
        if (_outdoors != null) {
            return _outdoors!!
        }

        _outdoors = materialIcon(name = "Outdoors") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.8f, 4.5f)
                curveToRelative(0f, -2.32f, 1.88f, -4.2f, 4.2f, -4.2f)
                curveToRelative(2.32f, 0f, 4.2f, 1.88f, 4.2f, 4.2f)
                lineToRelative(-0.01f, 0.3f)
                horizontalLineToRelative(0.31f)
                curveToRelative(1.9f, 0f, 3.45f, 1.54f, 3.45f, 3.45f)
                curveToRelative(0f, 0.48f, -0.1f, 0.93f, -0.28f, 1.34f)
                curveToRelative(1.91f, 0.69f, 3.28f, 2.51f, 3.28f, 4.66f)
                curveToRelative(0f, 2.73f, -2.22f, 4.95f, -4.95f, 4.95f)
                horizontalLineTo(6f)
                curveToRelative(-2.73f, 0f, -4.95f, -2.22f, -4.95f, -4.95f)
                curveToRelative(0f, -2.15f, 1.37f, -3.97f, 3.28f, -4.66f)
                curveToRelative(-0.18f, -0.4f, -0.28f, -0.86f, -0.28f, -1.34f)
                curveToRelative(0f, -1.9f, 1.54f, -3.45f, 3.45f, -3.45f)
                horizontalLineToRelative(0.31f)
                lineTo(7.8f, 4.5f)
                close()
                moveTo(12f, 1.2f)
                curveToRelative(-1.82f, 0f, -3.3f, 1.48f, -3.3f, 3.3f)
                curveToRelative(0f, 0.23f, 0.02f, 0.45f, 0.07f, 0.66f)
                lineToRelative(0.1f, 0.54f)
                horizontalLineTo(7.5f)
                curveToRelative(-1.4f, 0f, -2.55f, 1.14f, -2.55f, 2.55f)
                curveToRelative(0f, 0.5f, 0.15f, 0.98f, 0.41f, 1.38f)
                lineToRelative(0.35f, 0.53f)
                lineToRelative(-0.63f, 0.15f)
                curveToRelative(-1.8f, 0.41f, -3.13f, 2.02f, -3.13f, 3.94f)
                curveToRelative(0f, 2.24f, 1.81f, 4.05f, 4.05f, 4.05f)
                horizontalLineToRelative(12f)
                curveToRelative(2.24f, 0f, 4.05f, -1.81f, 4.05f, -4.05f)
                curveToRelative(0f, -1.92f, -1.34f, -3.53f, -3.13f, -3.94f)
                lineToRelative(-0.63f, -0.15f)
                lineToRelative(0.35f, -0.53f)
                curveToRelative(0.26f, -0.4f, 0.41f, -0.87f, 0.41f, -1.38f)
                curveToRelative(0f, -1.4f, -1.14f, -2.55f, -2.55f, -2.55f)
                horizontalLineToRelative(-1.38f)
                lineToRelative(0.11f, -0.54f)
                curveToRelative(0.05f, -0.21f, 0.07f, -0.43f, 0.07f, -0.66f)
                curveToRelative(0f, -1.82f, -1.48f, -3.3f, -3.3f, -3.3f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 7.8f)
                curveToRelative(0.25f, 0f, 0.45f, 0.2f, 0.45f, 0.45f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.25f, -0.2f, 0.45f, -0.45f, 0.45f)
                reflectiveCurveToRelative(-0.45f, -0.2f, -0.45f, -0.45f)
                verticalLineToRelative(-15f)
                curveTo(11.55f, 8f, 11.75f, 7.8f, 12f, 7.8f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.05f, 23.25f)
                curveToRelative(0f, -0.25f, 0.2f, -0.45f, 0.45f, -0.45f)
                horizontalLineToRelative(9f)
                curveToRelative(0.25f, 0f, 0.45f, 0.2f, 0.45f, 0.45f)
                reflectiveCurveToRelative(-0.2f, 0.45f, -0.45f, 0.45f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.25f, 0f, -0.45f, -0.2f, -0.45f, -0.45f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.93f, 11.68f)
                curveToRelative(0.18f, -0.17f, 0.46f, -0.17f, 0.64f, 0f)
                lineTo(12f, 15.11f)
                lineToRelative(3.43f, -3.43f)
                curveToRelative(0.18f, -0.17f, 0.46f, -0.17f, 0.64f, 0f)
                curveToRelative(0.17f, 0.18f, 0.17f, 0.46f, 0f, 0.64f)
                lineTo(12f, 16.39f)
                lineToRelative(-4.07f, -4.07f)
                curveToRelative(-0.17f, -0.18f, -0.17f, -0.46f, 0f, -0.64f)
                close()
            }
        }

        return _outdoors!!
    }

@Suppress("ObjectPropertyName")
private var _outdoors: ImageVector? = null

@Preview
@Composable
private fun SatsIconOutdoorsPreview() {
    Icon(SatsIcons.Outdoors, contentDescription = null)
}
