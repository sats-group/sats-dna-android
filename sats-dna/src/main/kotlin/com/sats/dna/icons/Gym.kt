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
val SatsIcons.Gym: ImageVector
    get() {
        if (_gym != null) {
            return _gym!!
        }

        _gym = materialIcon(name = "Gym") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2f, 21.57f)
                curveToRelative(0f, -0.35f, 0.29f, -0.63f, 0.64f, -0.63f)
                horizontalLineToRelative(18.72f)
                curveToRelative(0.35f, 0f, 0.64f, 0.28f, 0.64f, 0.63f)
                curveToRelative(0f, 0.36f, -0.29f, 0.64f, -0.64f, 0.64f)
                horizontalLineTo(2.64f)
                curveTo(2.29f, 22.21f, 2f, 21.93f, 2f, 21.57f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.04f, 7.74f)
                curveToRelative(-0.28f, 0f, -0.55f, 0.12f, -0.75f, 0.32f)
                curveToRelative(-0.2f, 0.2f, -0.31f, 0.47f, -0.31f, 0.75f)
                verticalLineToRelative(10.21f)
                curveToRelative(0f, 0.35f, -0.29f, 0.64f, -0.64f, 0.64f)
                curveToRelative(-0.35f, 0f, -0.64f, -0.29f, -0.64f, -0.64f)
                verticalLineTo(8.81f)
                curveToRelative(0f, -0.62f, 0.25f, -1.22f, 0.69f, -1.66f)
                curveToRelative(0.44f, -0.44f, 1.03f, -0.68f, 1.65f, -0.68f)
                horizontalLineToRelative(11.92f)
                curveToRelative(0.62f, 0f, 1.21f, 0.24f, 1.65f, 0.68f)
                curveToRelative(0.44f, 0.44f, 0.69f, 1.04f, 0.69f, 1.66f)
                verticalLineToRelative(10.21f)
                curveToRelative(0f, 0.35f, -0.29f, 0.64f, -0.64f, 0.64f)
                curveToRelative(-0.35f, 0f, -0.64f, -0.29f, -0.64f, -0.64f)
                verticalLineTo(8.81f)
                curveToRelative(0f, -0.28f, -0.11f, -0.55f, -0.31f, -0.75f)
                curveToRelative(-0.2f, -0.2f, -0.47f, -0.32f, -0.75f, -0.32f)
                horizontalLineTo(6.04f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.8f, 13.91f)
                curveToRelative(0f, -0.35f, 0.3f, -0.63f, 0.65f, -0.63f)
                horizontalLineToRelative(5.1f)
                curveToRelative(0.36f, 0f, 0.64f, 0.28f, 0.64f, 0.63f)
                verticalLineToRelative(5.11f)
                curveToRelative(0f, 0.35f, -0.28f, 0.64f, -0.64f, 0.64f)
                curveToRelative(-0.35f, 0f, -0.64f, -0.29f, -0.64f, -0.64f)
                verticalLineToRelative(-4.47f)
                horizontalLineTo(10.1f)
                verticalLineToRelative(4.47f)
                curveToRelative(0f, 0.35f, -0.3f, 0.64f, -0.64f, 0.64f)
                curveToRelative(-0.36f, 0f, -0.64f, -0.29f, -0.64f, -0.64f)
                verticalLineToRelative(-5.1f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12.85f, 9.66f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(1.7f)
                verticalLineToRelative(-1.7f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(9.45f, 9.66f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(1.7f)
                verticalLineToRelative(-1.7f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(16.25f, 9.66f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(1.7f)
                verticalLineToRelative(-1.7f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12f, 2f)
                lineToRelative(3.4f, 1.7f)
                lineTo(12f, 5.4f)
                verticalLineTo(2f)
                close()
            }
        }

        return _gym!!
    }

@Suppress("ObjectPropertyName")
private var _gym: ImageVector? = null

@Preview
@Composable
private fun SatsIconGymPreview() {
    Icon(SatsIcons.Gym, contentDescription = null)
}
