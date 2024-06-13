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
val SatsIcons.TimeFilled: ImageVector
    get() {
        if (_timeFilled != null) {
            return _timeFilled!!
        }

        _timeFilled = materialIcon(name = "TimeFilled") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(0.67f, 12f)
                curveTo(0.67f, 5.74f, 5.74f, 0.67f, 12f, 0.67f)
                reflectiveCurveTo(23.34f, 5.74f, 23.34f, 12f)
                reflectiveCurveTo(18.26f, 23.33f, 12f, 23.33f)
                reflectiveCurveTo(0.67f, 18.26f, 0.67f, 12f)
                close()
                moveTo(12.6f, 7.03f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.74f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(13f)
                verticalLineToRelative(0.09f)
                verticalLineToRelative(0.09f)
                curveToRelative(0f, 0.41f, -0.34f, 0.74f, -0.75f, 0.74f)
                horizontalLineTo(8.86f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.33f, -0.75f, -0.74f)
                reflectiveCurveToRelative(0.34f, -0.74f, 0.75f, -0.74f)
                horizontalLineToRelative(3.74f)
                verticalLineTo(7.03f)
                close()
            }
        }

        return _timeFilled!!
    }

@Suppress("ObjectPropertyName")
private var _timeFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconTimeFilledPreview() {
    Icon(SatsIcons.TimeFilled, contentDescription = null)
}
