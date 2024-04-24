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
val SatsIcons.Confirm: ImageVector
    get() {
        if (_confirm != null) {
            return _confirm!!
        }

        _confirm = materialIcon(name = "Confirm") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18.01f, 8.25f)
                curveToRelative(0.33f, 0.33f, 0.33f, 0.87f, 0f, 1.2f)
                lineToRelative(-7.81f, 7.81f)
                lineToRelative(-4.21f, -4.2f)
                curveToRelative(-0.33f, -0.34f, -0.33f, -0.87f, 0f, -1.2f)
                curveToRelative(0.33f, -0.34f, 0.87f, -0.34f, 1.2f, 0f)
                lineToRelative(3f, 3f)
                lineToRelative(6.62f, -6.61f)
                curveToRelative(0.33f, -0.33f, 0.87f, -0.33f, 1.2f, 0f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.17f, 12f)
                curveToRelative(0f, 5.43f, 4.4f, 9.83f, 9.83f, 9.83f)
                reflectiveCurveToRelative(9.83f, -4.4f, 9.83f, -9.83f)
                reflectiveCurveToRelative(-4.4f, -9.83f, -9.83f, -9.83f)
                reflectiveCurveTo(2.17f, 6.57f, 2.17f, 12f)
                close()
                moveTo(12f, 0.67f)
                curveTo(5.74f, 0.67f, 0.67f, 5.74f, 0.67f, 12f)
                reflectiveCurveTo(5.74f, 23.33f, 12f, 23.33f)
                reflectiveCurveTo(23.33f, 18.26f, 23.33f, 12f)
                reflectiveCurveTo(18.26f, 0.67f, 12f, 0.67f)
                close()
            }
        }

        return _confirm!!
    }

@Suppress("ObjectPropertyName")
private var _confirm: ImageVector? = null

@Preview
@Composable
private fun SatsIconConfirmPreview() {
    Icon(SatsIcons.Confirm, contentDescription = null)
}
