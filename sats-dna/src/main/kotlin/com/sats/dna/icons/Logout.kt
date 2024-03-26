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
val SatsIcons.Logout: ImageVector
    get() {
        if (_logout != null) {
            return _logout!!
        }

        _logout = materialIcon(name = "Logout") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 12f)
                curveToRelative(0f, -0.38f, 0.31f, -0.7f, 0.7f, -0.7f)
                horizontalLineToRelative(12.68f)
                curveToRelative(0.39f, 0f, 0.7f, 0.32f, 0.7f, 0.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                horizontalLineTo(3.7f)
                curveTo(3.3f, 12.7f, 3f, 12.39f, 3f, 12f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.42f, 7.28f)
                curveToRelative(0.27f, 0.27f, 0.27f, 0.71f, 0f, 0.99f)
                lineTo(4.68f, 12f)
                lineToRelative(3.74f, 3.74f)
                curveToRelative(0.27f, 0.27f, 0.27f, 0.7f, 0f, 0.98f)
                curveTo(8.15f, 17f, 7.7f, 17f, 7.43f, 16.72f)
                lineTo(3.2f, 12.5f)
                curveToRelative(-0.27f, -0.27f, -0.27f, -0.71f, 0f, -0.98f)
                lineToRelative(4.23f, -4.23f)
                curveTo(7.71f, 7f, 8.15f, 7f, 8.42f, 7.28f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(9.77f, 2.7f)
                curveToRelative(0f, -0.39f, 0.3f, -0.7f, 0.7f, -0.7f)
                horizontalLineToRelative(8.45f)
                curveToRelative(0.63f, 0f, 1.24f, 0.25f, 1.69f, 0.7f)
                curveToRelative(0.45f, 0.45f, 0.7f, 1.06f, 0.7f, 1.69f)
                verticalLineTo(19.6f)
                curveToRelative(0f, 0.63f, -0.25f, 1.24f, -0.7f, 1.69f)
                curveToRelative(-0.45f, 0.45f, -1.06f, 0.7f, -1.69f, 0.7f)
                horizontalLineToRelative(-8.46f)
                curveToRelative(-0.38f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                curveToRelative(0f, -0.38f, 0.32f, -0.7f, 0.7f, -0.7f)
                horizontalLineToRelative(8.46f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.7f, -0.29f)
                curveToRelative(0.19f, -0.18f, 0.3f, -0.44f, 0.3f, -0.7f)
                verticalLineTo(4.4f)
                curveToRelative(0f, -0.26f, -0.11f, -0.52f, -0.3f, -0.7f)
                curveToRelative(-0.18f, -0.19f, -0.44f, -0.3f, -0.7f, -0.3f)
                horizontalLineToRelative(-8.46f)
                curveToRelative(-0.38f, 0f, -0.7f, -0.3f, -0.7f, -0.7f)
                close()
            }
        }

        return _logout!!
    }

@Suppress("ObjectPropertyName")
private var _logout: ImageVector? = null

@Preview
@Composable
private fun SatsIconLogoutPreview() {
    Icon(SatsIcons.Logout, contentDescription = null)
}
