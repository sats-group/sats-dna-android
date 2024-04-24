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
val SatsIcons.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }

        _lock = materialIcon(name = "Lock") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12.37f, 2.25f)
                horizontalLineToRelative(0.08f)
                curveToRelative(1.28f, 0.01f, 2.5f, 0.53f, 3.38f, 1.44f)
                curveToRelative(0.9f, 0.9f, 1.39f, 2.13f, 1.37f, 3.4f)
                verticalLineToRelative(3.34f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(5f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-9.82f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.52f)
                verticalLineTo(7f)
                curveToRelative(0.02f, -1.27f, 0.53f, -2.49f, 1.44f, -3.38f)
                curveToRelative(0.91f, -0.89f, 2.14f, -1.38f, 3.4f, -1.37f)
                close()
                moveToRelative(-3.35f, 8.18f)
                horizontalLineToRelative(6.68f)
                verticalLineTo(7.08f)
                curveToRelative(0.01f, -0.87f, -0.33f, -1.71f, -0.94f, -2.34f)
                curveToRelative(-0.61f, -0.62f, -1.44f, -0.98f, -2.32f, -0.99f)
                horizontalLineToRelative(-0.08f)
                curveToRelative(-0.88f, 0f, -1.72f, 0.33f, -2.35f, 0.94f)
                curveTo(9.4f, 5.31f, 9.03f, 6.14f, 9.02f, 7.01f)
                verticalLineToRelative(3.42f)
                close()
                moveToRelative(-3.27f, 1.5f)
                verticalLineToRelative(8.32f)
                horizontalLineToRelative(13.23f)
                verticalLineToRelative(-8.32f)
                horizontalLineTo(5.75f)
                close()
                moveToRelative(6.61f, 3.27f)
                curveToRelative(-0.49f, 0f, -0.88f, 0.4f, -0.88f, 0.9f)
                curveToRelative(0f, 0.48f, 0.4f, 0.88f, 0.88f, 0.88f)
                curveToRelative(0.5f, 0f, 0.89f, -0.4f, 0.89f, -0.89f)
                reflectiveCurveToRelative(-0.4f, -0.89f, -0.89f, -0.89f)
                close()
                moveToRelative(-2.38f, 0.9f)
                curveToRelative(0f, -1.33f, 1.07f, -2.4f, 2.38f, -2.4f)
                curveToRelative(1.32f, 0f, 2.39f, 1.07f, 2.39f, 2.4f)
                curveToRelative(0f, 1.3f, -1.07f, 2.38f, -2.39f, 2.38f)
                curveToRelative(-1.31f, 0f, -2.38f, -1.07f, -2.38f, -2.39f)
                close()
            }
        }

        return _lock!!
    }

@Suppress("ObjectPropertyName")
private var _lock: ImageVector? = null

@Preview
@Composable
private fun SatsIconLockPreview() {
    Icon(SatsIcons.Lock, contentDescription = null)
}
