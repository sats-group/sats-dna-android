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
val SatsIcons.BarChart: ImageVector
    get() {
        if (_barChart != null) {
            return _barChart!!
        }

        _barChart = materialIcon(name = "BarChart") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.25f, 19.5f)
                horizontalLineToRelative(-15f)
                curveToRelative(-0.2f, 0f, -0.39f, -0.08f, -0.53f, -0.22f)
                reflectiveCurveTo(4.5f, 18.95f, 4.5f, 18.75f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -0.2f, -0.08f, -0.39f, -0.22f, -0.53f)
                reflectiveCurveTo(3.95f, 3f, 3.75f, 3f)
                reflectiveCurveTo(3.36f, 3.08f, 3.22f, 3.22f)
                reflectiveCurveTo(3f, 3.55f, 3f, 3.75f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.6f, 0.24f, 1.17f, 0.66f, 1.6f)
                curveToRelative(0.42f, 0.41f, 1f, 0.65f, 1.59f, 0.65f)
                horizontalLineToRelative(15f)
                curveToRelative(0.2f, 0f, 0.39f, -0.08f, 0.53f, -0.22f)
                reflectiveCurveTo(21f, 20.45f, 21f, 20.25f)
                reflectiveCurveToRelative(-0.08f, -0.39f, -0.22f, -0.53f)
                reflectiveCurveToRelative(-0.33f, -0.22f, -0.53f, -0.22f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(14.25f, 18f)
                curveToRelative(0.2f, 0f, 0.39f, -0.08f, 0.53f, -0.22f)
                reflectiveCurveTo(15f, 17.45f, 15f, 17.25f)
                verticalLineTo(12f)
                curveToRelative(0f, -0.2f, -0.08f, -0.39f, -0.22f, -0.53f)
                reflectiveCurveToRelative(-0.33f, -0.22f, -0.53f, -0.22f)
                reflectiveCurveToRelative(-0.39f, 0.08f, -0.53f, 0.22f)
                reflectiveCurveTo(13.5f, 11.8f, 13.5f, 12f)
                verticalLineToRelative(5.25f)
                curveToRelative(0f, 0.2f, 0.08f, 0.39f, 0.22f, 0.53f)
                reflectiveCurveTo(14.05f, 18f, 14.25f, 18f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(8.25f, 18f)
                curveToRelative(0.2f, 0f, 0.39f, -0.08f, 0.53f, -0.22f)
                reflectiveCurveTo(9f, 17.45f, 9f, 17.25f)
                verticalLineTo(12f)
                curveToRelative(0f, -0.2f, -0.08f, -0.39f, -0.22f, -0.53f)
                reflectiveCurveToRelative(-0.33f, -0.22f, -0.53f, -0.22f)
                reflectiveCurveToRelative(-0.39f, 0.08f, -0.53f, 0.22f)
                reflectiveCurveTo(7.5f, 11.8f, 7.5f, 12f)
                verticalLineToRelative(5.25f)
                curveToRelative(0f, 0.2f, 0.08f, 0.39f, 0.22f, 0.53f)
                reflectiveCurveTo(8.05f, 18f, 8.25f, 18f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(17.25f, 18f)
                curveToRelative(0.2f, 0f, 0.39f, -0.08f, 0.53f, -0.22f)
                reflectiveCurveTo(18f, 17.45f, 18f, 17.25f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.2f, -0.08f, -0.39f, -0.22f, -0.53f)
                reflectiveCurveTo(17.45f, 7.5f, 17.25f, 7.5f)
                reflectiveCurveToRelative(-0.39f, 0.08f, -0.53f, 0.22f)
                reflectiveCurveToRelative(-0.22f, 0.33f, -0.22f, 0.53f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.2f, 0.08f, 0.39f, 0.22f, 0.53f)
                reflectiveCurveTo(17.05f, 18f, 17.25f, 18f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.25f, 18f)
                curveToRelative(0.2f, 0f, 0.39f, -0.08f, 0.53f, -0.22f)
                reflectiveCurveTo(12f, 17.45f, 12f, 17.25f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.2f, -0.08f, -0.39f, -0.22f, -0.53f)
                reflectiveCurveTo(11.45f, 7.5f, 11.25f, 7.5f)
                reflectiveCurveToRelative(-0.39f, 0.08f, -0.53f, 0.22f)
                reflectiveCurveToRelative(-0.22f, 0.33f, -0.22f, 0.53f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.2f, 0.08f, 0.39f, 0.22f, 0.53f)
                reflectiveCurveTo(11.05f, 18f, 11.25f, 18f)
                close()
            }
        }

        return _barChart!!
    }

@Suppress("ObjectPropertyName")
private var _barChart: ImageVector? = null

@Preview
@Composable
private fun SatsIconBarChartPreview() {
    Icon(SatsIcons.BarChart, contentDescription = null)
}
