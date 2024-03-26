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
val SatsIcons.Indifference: ImageVector
    get() {
        if (_indifference != null) {
            return _indifference!!
        }

        _indifference = materialIcon(name = "Indifference") {
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
                curveToRelative(0f, -0.7f, -0.56f, -1.25f, -1.25f, -1.25f)
                curveTo(7.55f, 8.25f, 7f, 8.81f, 7f, 9.5f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(15.75f, 10.75f)
                curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                curveToRelative(0f, -0.7f, -0.56f, -1.25f, -1.25f, -1.25f)
                curveToRelative(-0.7f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.25f, 15.13f)
                curveToRelative(0f, -0.35f, 0.28f, -0.63f, 0.63f, -0.63f)
                horizontalLineToRelative(6.24f)
                curveToRelative(0.35f, 0f, 0.63f, 0.28f, 0.63f, 0.63f)
                curveToRelative(0f, 0.34f, -0.28f, 0.62f, -0.63f, 0.62f)
                horizontalLineTo(8.88f)
                curveToRelative(-0.35f, 0f, -0.63f, -0.28f, -0.63f, -0.63f)
                close()
            }
        }

        return _indifference!!
    }

@Suppress("ObjectPropertyName")
private var _indifference: ImageVector? = null

@Preview
@Composable
private fun SatsIconIndifferencePreview() {
    Icon(SatsIcons.Indifference, contentDescription = null)
}
