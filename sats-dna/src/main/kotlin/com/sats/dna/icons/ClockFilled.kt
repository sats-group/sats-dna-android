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
val SatsIcons.ClockFilled: ImageVector
    get() {
        if (_clockFilled != null) {
            return _clockFilled!!
        }

        _clockFilled = materialIcon(name = "ClockFilled") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 20.28f)
                curveToRelative(4.57f, 0f, 8.28f, -3.7f, 8.28f, -8.28f)
                curveToRelative(0f, -4.57f, -3.7f, -8.28f, -8.28f, -8.28f)
                curveToRelative(-4.57f, 0f, -8.28f, 3.7f, -8.28f, 8.28f)
                curveToRelative(0f, 4.57f, 3.7f, 8.28f, 8.28f, 8.28f)
                close()
                moveToRelative(0.32f, -12.72f)
                curveToRelative(0f, -0.3f, 0.23f, -0.53f, 0.52f, -0.53f)
                curveToRelative(0.3f, 0f, 0.52f, 0.24f, 0.52f, 0.53f)
                verticalLineToRelative(5.22f)
                curveToRelative(0f, 0.3f, -0.23f, 0.53f, -0.52f, 0.53f)
                horizontalLineTo(8.66f)
                curveToRelative(-0.29f, 0f, -0.52f, -0.24f, -0.52f, -0.53f)
                curveToRelative(0f, -0.28f, 0.23f, -0.52f, 0.52f, -0.52f)
                horizontalLineToRelative(3.66f)
                verticalLineToRelative(-4.7f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(1.42f, 12f)
                curveToRelative(0f, -5.84f, 4.74f, -10.58f, 10.58f, -10.58f)
                horizontalLineToRelative(0.01f)
                curveToRelative(5.84f, 0f, 10.58f, 4.74f, 10.58f, 10.58f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 5.84f, -4.74f, 10.58f, -10.58f, 10.58f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-5.84f, 0f, -10.58f, -4.74f, -10.58f, -10.58f)
                close()
            }
        }

        return _clockFilled!!
    }

@Suppress("ObjectPropertyName")
private var _clockFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconClockFilledPreview() {
    Icon(SatsIcons.ClockFilled, contentDescription = null)
}
