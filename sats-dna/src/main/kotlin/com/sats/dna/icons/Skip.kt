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
val SatsIcons.Skip: ImageVector
    get() {
        if (_skip != null) {
            return _skip!!
        }

        _skip = materialIcon(name = "Skip") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.65f, 2.34f)
                curveTo(2.9f, 2.2f, 3.19f, 2.22f, 3.42f, 2.38f)
                lineToRelative(12.65f, 8.63f)
                curveToRelative(0.2f, 0.13f, 0.33f, 0.37f, 0.33f, 0.62f)
                curveToRelative(0f, 0.24f, -0.12f, 0.47f, -0.33f, 0.61f)
                lineTo(3.42f, 20.87f)
                curveToRelative(-0.23f, 0.16f, -0.52f, 0.17f, -0.77f, 0.04f)
                reflectiveCurveToRelative(-0.4f, -0.38f, -0.4f, -0.66f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.28f, 0.15f, -0.53f, 0.4f, -0.66f)
                close()
                moveToRelative(17.6f, -0.09f)
                curveTo(20.66f, 2.25f, 21f, 2.59f, 21f, 3f)
                verticalLineToRelative(17.25f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(3.75f, 4.42f)
                verticalLineToRelative(14.41f)
                lineToRelative(10.57f, -7.2f)
                lineTo(3.75f, 4.42f)
                close()
            }
        }

        return _skip!!
    }

@Suppress("ObjectPropertyName")
private var _skip: ImageVector? = null

@Preview
@Composable
private fun SatsIconSkipPreview() {
    Icon(SatsIcons.Skip, contentDescription = null)
}
