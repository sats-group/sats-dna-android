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
val SatsIcons.Geoposition: ImageVector
    get() {
        if (_geoposition != null) {
            return _geoposition!!
        }

        _geoposition = materialIcon(name = "Geoposition") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 4.28f)
                curveToRelative(-4.27f, 0f, -7.72f, 3.45f, -7.72f, 7.72f)
                reflectiveCurveToRelative(3.45f, 7.72f, 7.72f, 7.72f)
                reflectiveCurveToRelative(7.72f, -3.45f, 7.72f, -7.72f)
                reflectiveCurveTo(16.27f, 4.28f, 12f, 4.28f)
                close()
                moveTo(2.87f, 12f)
                curveToRelative(0f, -5.04f, 4.09f, -9.13f, 9.13f, -9.13f)
                curveToRelative(5.04f, 0f, 9.13f, 4.09f, 9.13f, 9.13f)
                curveToRelative(0f, 5.04f, -4.09f, 9.13f, -9.13f, 9.13f)
                curveToRelative(-5.04f, 0f, -9.13f, -4.09f, -9.13f, -9.13f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 1f)
                curveToRelative(0.39f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 0.38f, -0.31f, 0.7f, -0.7f, 0.7f)
                curveToRelative(-0.39f, 0f, -0.7f, -0.32f, -0.7f, -0.7f)
                verticalLineTo(1.7f)
                curveTo(11.3f, 1.31f, 11.6f, 1f, 12f, 1f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.85f, 12f)
                curveToRelative(0f, -0.39f, 0.32f, -0.7f, 0.7f, -0.7f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.39f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                horizontalLineToRelative(-3.75f)
                curveToRelative(-0.38f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 17.85f)
                curveToRelative(0.39f, 0f, 0.7f, 0.32f, 0.7f, 0.7f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                curveToRelative(-0.39f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-3.75f)
                curveToRelative(0f, -0.38f, 0.31f, -0.7f, 0.7f, -0.7f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(1f, 12f)
                curveToRelative(0f, -0.39f, 0.31f, -0.7f, 0.7f, -0.7f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.38f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                curveToRelative(0f, 0.39f, -0.32f, 0.7f, -0.7f, 0.7f)
                horizontalLineTo(1.7f)
                curveTo(1.31f, 12.7f, 1f, 12.4f, 1f, 12f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 11.77f)
                curveToRelative(-0.13f, 0f, -0.23f, 0.1f, -0.23f, 0.23f)
                reflectiveCurveToRelative(0.1f, 0.23f, 0.23f, 0.23f)
                reflectiveCurveToRelative(0.23f, -0.1f, 0.23f, -0.23f)
                reflectiveCurveToRelative(-0.1f, -0.23f, -0.23f, -0.23f)
                close()
                moveTo(10.36f, 12f)
                curveToRelative(0f, -0.9f, 0.74f, -1.64f, 1.64f, -1.64f)
                curveToRelative(0.9f, 0f, 1.64f, 0.74f, 1.64f, 1.64f)
                curveToRelative(0f, 0.9f, -0.74f, 1.64f, -1.64f, 1.64f)
                curveToRelative(-0.9f, 0f, -1.64f, -0.74f, -1.64f, -1.64f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12f, 12.94f)
                curveToRelative(0.52f, 0f, 0.94f, -0.42f, 0.94f, -0.94f)
                reflectiveCurveToRelative(-0.42f, -0.94f, -0.94f, -0.94f)
                reflectiveCurveToRelative(-0.94f, 0.42f, -0.94f, 0.94f)
                reflectiveCurveToRelative(0.42f, 0.94f, 0.94f, 0.94f)
                close()
            }
        }

        return _geoposition!!
    }

@Suppress("ObjectPropertyName")
private var _geoposition: ImageVector? = null

@Preview
@Composable
private fun SatsIconGeopositionPreview() {
    Icon(SatsIcons.Geoposition, contentDescription = null)
}
