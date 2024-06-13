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
val SatsIcons.Up: ImageVector
    get() {
        if (_up != null) {
            return _up!!
        }

        _up = materialIcon(name = "Up") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18.83f, 9.83f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0f)
                lineToRelative(-5.02f, -5.02f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveTo(11.25f, 21.4f, 11.25f, 21f)
                verticalLineTo(4.8f)
                lineTo(6.23f, 9.83f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.77f, 0f, -1.06f)
                lineToRelative(6.3f, -6.3f)
                curveTo(11.61f, 2.33f, 11.8f, 2.25f, 12f, 2.25f)
                reflectiveCurveToRelative(0.39f, 0.08f, 0.53f, 0.22f)
                lineToRelative(6.3f, 6.3f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0f, 1.06f)
                close()
            }
        }

        return _up!!
    }

@Suppress("ObjectPropertyName")
private var _up: ImageVector? = null

@Preview
@Composable
private fun SatsIconUpPreview() {
    Icon(SatsIcons.Up, contentDescription = null)
}
