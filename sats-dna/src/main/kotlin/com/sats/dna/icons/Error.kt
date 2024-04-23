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
val SatsIcons.Error: ImageVector
    get() {
        if (_error != null) {
            return _error!!
        }

        _error = materialIcon(name = "Error") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.33f, 1.47f)
                curveToRelative(0.14f, -0.14f, 0.33f, -0.22f, 0.53f, -0.22f)
                horizontalLineToRelative(8.28f)
                curveToRelative(0.2f, 0f, 0.4f, 0.08f, 0.53f, 0.22f)
                lineToRelative(5.86f, 5.86f)
                curveToRelative(0.14f, 0.14f, 0.22f, 0.33f, 0.22f, 0.53f)
                verticalLineToRelative(8.28f)
                curveToRelative(0f, 0.2f, -0.08f, 0.4f, -0.22f, 0.53f)
                lineToRelative(-5.86f, 5.86f)
                curveToRelative(-0.14f, 0.14f, -0.33f, 0.22f, -0.53f, 0.22f)
                horizontalLineTo(7.86f)
                curveToRelative(-0.2f, 0f, -0.4f, -0.08f, -0.53f, -0.22f)
                lineToRelative(-5.86f, -5.86f)
                curveToRelative(-0.14f, -0.14f, -0.22f, -0.33f, -0.22f, -0.53f)
                verticalLineTo(7.86f)
                curveToRelative(0f, -0.2f, 0.08f, -0.4f, 0.22f, -0.53f)
                lineToRelative(5.86f, -5.86f)
                close()
                moveToRelative(0.84f, 1.28f)
                lineTo(2.75f, 8.17f)
                verticalLineToRelative(7.66f)
                lineToRelative(5.42f, 5.42f)
                horizontalLineToRelative(7.66f)
                lineToRelative(5.42f, -5.42f)
                verticalLineTo(8.17f)
                lineToRelative(-5.42f, -5.42f)
                horizontalLineTo(8.17f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12.33f, 6.75f)
                curveToRelative(0.59f, 0f, 1.05f, 0.52f, 0.98f, 1.1f)
                lineToRelative(-0.52f, 5.06f)
                curveToRelative(-0.04f, 0.4f, -0.38f, 0.71f, -0.79f, 0.71f)
                curveToRelative(-0.4f, 0f, -0.75f, -0.3f, -0.79f, -0.7f)
                lineTo(10.7f, 7.84f)
                curveToRelative(-0.06f, -0.6f, 0.4f, -1.1f, 1f, -1.1f)
                horizontalLineToRelative(0.64f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12f, 17.45f)
                curveToRelative(0.5f, 0f, 0.9f, -0.4f, 0.9f, -0.9f)
                reflectiveCurveToRelative(-0.4f, -0.91f, -0.9f, -0.91f)
                reflectiveCurveToRelative(-0.9f, 0.4f, -0.9f, 0.9f)
                reflectiveCurveToRelative(0.4f, 0.91f, 0.9f, 0.91f)
                close()
            }
        }

        return _error!!
    }

@Suppress("ObjectPropertyName")
private var _error: ImageVector? = null

@Preview
@Composable
private fun SatsIconErrorPreview() {
    Icon(SatsIcons.Error, contentDescription = null)
}
