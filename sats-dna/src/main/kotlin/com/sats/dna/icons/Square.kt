package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Square: ImageVector
    get() {
        if (_square != null) {
            return _square!!
        }

        _square = materialIcon(name = "Square") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(22f, 7f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.7f, -0.3f)
                curveTo(22.9f, 6.53f, 23f, 6.28f, 23f, 6f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.27f, -0.1f, -0.52f, -0.3f, -0.7f)
                curveTo(22.53f, 1.1f, 22.28f, 1f, 22f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.1f, -0.7f, 0.3f)
                curveTo(17.1f, 1.47f, 17f, 1.72f, 17f, 2f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.27f, -0.1f, -0.52f, -0.3f, -0.7f)
                curveTo(6.53f, 1.1f, 6.28f, 1f, 6f, 1f)
                horizontalLineTo(2f)
                curveTo(1.73f, 1f, 1.48f, 1.1f, 1.3f, 1.3f)
                curveTo(1.1f, 1.47f, 1f, 1.72f, 1f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.27f, 0.1f, 0.52f, 0.3f, 0.7f)
                curveTo(1.47f, 6.9f, 1.72f, 7f, 2f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                horizontalLineTo(2f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.1f, -0.7f, 0.3f)
                curveTo(1.1f, 17.47f, 1f, 17.72f, 1f, 18f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.27f, 0.1f, 0.52f, 0.3f, 0.7f)
                curveTo(1.47f, 22.9f, 1.72f, 23f, 2f, 23f)
                horizontalLineToRelative(4f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.7f, -0.3f)
                curveTo(6.9f, 22.53f, 7f, 22.28f, 7f, 22f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.27f, 0.1f, 0.52f, 0.3f, 0.7f)
                curveToRelative(0.18f, 0.2f, 0.43f, 0.3f, 0.7f, 0.3f)
                horizontalLineToRelative(4f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.7f, -0.3f)
                curveToRelative(0.2f, -0.18f, 0.3f, -0.43f, 0.3f, -0.7f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.27f, -0.1f, -0.52f, -0.3f, -0.7f)
                curveToRelative(-0.18f, -0.2f, -0.43f, -0.3f, -0.7f, -0.3f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(-3f, 10f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.1f, -0.7f, 0.3f)
                curveToRelative(-0.2f, 0.18f, -0.3f, 0.43f, -0.3f, 0.7f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.27f, -0.1f, -0.52f, -0.3f, -0.7f)
                curveTo(6.53f, 17.1f, 6.28f, 17f, 6f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.7f, -0.3f)
                curveTo(6.9f, 6.53f, 7f, 6.28f, 7f, 6f)
                verticalLineTo(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.27f, 0.1f, 0.52f, 0.3f, 0.7f)
                curveTo(17.47f, 6.9f, 17.72f, 7f, 18f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                close()
            }
        }

        return _square!!
    }

@Suppress("ObjectPropertyName")
private var _square: ImageVector? = null

@Preview
@Composable
private fun SatsIconSquarePreview() {
    Icon(SatsIcons.Square, contentDescription = null)
}
