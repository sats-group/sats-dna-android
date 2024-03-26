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
val SatsIcons.Instructor: ImageVector
    get() {
        if (_instructor != null) {
            return _instructor!!
        }

        _instructor = materialIcon(name = "Instructor") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 24f)
                curveToRelative(6.63f, 0f, 12f, -5.37f, 12f, -12f)
                reflectiveCurveTo(18.63f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                close()
                moveToRelative(-4.03f, -7.5f)
                horizontalLineTo(6.08f)
                lineTo(8.2f, 9.15f)
                horizontalLineToRelative(1.9f)
                lineTo(7.96f, 16.5f)
                close()
                moveToRelative(6.12f, -3.1f)
                lineToRelative(1.2f, -4.25f)
                horizontalLineToRelative(1.85f)
                lineToRelative(-2.07f, 7.35f)
                horizontalLineToRelative(-1.89f)
                lineToRelative(-0.88f, -4.47f)
                lineToRelative(-1.26f, 4.47f)
                horizontalLineTo(9.19f)
                lineToRelative(2.07f, -7.35f)
                horizontalLineToRelative(2f)
                lineToRelative(0.83f, 4.25f)
                close()
            }
        }

        return _instructor!!
    }

@Suppress("ObjectPropertyName")
private var _instructor: ImageVector? = null

@Preview
@Composable
private fun SatsIconInstructorPreview() {
    Icon(SatsIcons.Instructor, contentDescription = null)
}
