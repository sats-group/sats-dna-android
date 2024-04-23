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
val SatsIcons.Loading: ImageVector
    get() {
        if (_loading != null) {
            return _loading!!
        }

        _loading = materialIcon(name = "Loading") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 3.67f)
                curveTo(7.4f, 3.67f, 3.67f, 7.4f, 3.67f, 12f)
                reflectiveCurveTo(7.4f, 20.33f, 12f, 20.33f)
                reflectiveCurveToRelative(8.33f, -3.73f, 8.33f, -8.33f)
                reflectiveCurveTo(16.6f, 3.67f, 12f, 3.67f)
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
                moveTo(11.17f, 2.83f)
                curveTo(11.17f, 2.37f, 11.54f, 2f, 12f, 2f)
                curveToRelative(2.65f, 0f, 5.2f, 1.05f, 7.07f, 2.93f)
                curveTo(20.95f, 6.8f, 22f, 9.35f, 22f, 12f)
                curveToRelative(0f, 0.46f, -0.37f, 0.83f, -0.83f, 0.83f)
                curveToRelative(-0.46f, 0f, -0.84f, -0.37f, -0.84f, -0.83f)
                curveToRelative(0f, -2.21f, -0.87f, -4.33f, -2.44f, -5.9f)
                curveToRelative(-1.56f, -1.56f, -3.68f, -2.43f, -5.89f, -2.43f)
                curveToRelative(-0.46f, 0f, -0.83f, -0.38f, -0.83f, -0.84f)
                close()
            }
        }

        return _loading!!
    }

@Suppress("ObjectPropertyName")
private var _loading: ImageVector? = null

@Preview
@Composable
private fun SatsIconLoadingPreview() {
    Icon(SatsIcons.Loading, contentDescription = null)
}
