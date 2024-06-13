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
val SatsIcons.More: ImageVector
    get() {
        if (_more != null) {
            return _more!!
        }

        _more = materialIcon(name = "More") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(0.44f, 12f)
                curveToRelative(0f, -0.47f, 0.38f, -0.85f, 0.85f, -0.85f)
                horizontalLineToRelative(21.85f)
                curveToRelative(0.47f, 0f, 0.85f, 0.38f, 0.85f, 0.85f)
                reflectiveCurveToRelative(-0.38f, 0.85f, -0.85f, 0.85f)
                horizontalLineTo(1.3f)
                curveToRelative(-0.47f, 0f, -0.85f, -0.38f, -0.85f, -0.85f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(0.44f, 5.63f)
                curveToRelative(0f, -0.47f, 0.38f, -0.85f, 0.85f, -0.85f)
                horizontalLineToRelative(21.85f)
                curveToRelative(0.47f, 0f, 0.85f, 0.38f, 0.85f, 0.85f)
                curveToRelative(0f, 0.46f, -0.38f, 0.85f, -0.85f, 0.85f)
                horizontalLineTo(1.3f)
                curveToRelative(-0.47f, 0f, -0.85f, -0.39f, -0.85f, -0.85f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.48f, 18.38f)
                curveToRelative(0f, -0.47f, 0.38f, -0.86f, 0.85f, -0.86f)
                horizontalLineToRelative(14.81f)
                curveToRelative(0.47f, 0f, 0.85f, 0.39f, 0.85f, 0.86f)
                curveToRelative(0f, 0.46f, -0.38f, 0.85f, -0.85f, 0.85f)
                horizontalLineTo(8.33f)
                curveToRelative(-0.47f, 0f, -0.85f, -0.39f, -0.85f, -0.86f)
                close()
            }
        }

        return _more!!
    }

@Suppress("ObjectPropertyName")
private var _more: ImageVector? = null

@Preview
@Composable
private fun SatsIconMorePreview() {
    Icon(SatsIcons.More, contentDescription = null)
}
