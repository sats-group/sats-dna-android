package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Cast: ImageVector
    get() {
        if (_cast != null) {
            return _cast!!
        }

        _cast = materialIcon(name = "Cast") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(19.36f, 4f)
                horizontalLineTo(4.64f)
                curveTo(3.74f, 4f, 3f, 4.74f, 3f, 5.64f)
                verticalLineToRelative(1.63f)
                curveTo(3f, 7.72f, 3.37f, 8.1f, 3.82f, 8.1f)
                curveToRelative(0.45f, 0f, 0.82f, -0.37f, 0.82f, -0.82f)
                verticalLineTo(5.64f)
                horizontalLineToRelative(14.72f)
                verticalLineToRelative(11.45f)
                horizontalLineToRelative(-4.9f)
                curveToRelative(-0.46f, 0f, -0.82f, 0.37f, -0.82f, 0.82f)
                curveToRelative(0f, 0.45f, 0.36f, 0.82f, 0.81f, 0.82f)
                horizontalLineToRelative(4.91f)
                curveToRelative(0.9f, 0f, 1.64f, -0.74f, 1.64f, -1.64f)
                verticalLineTo(5.64f)
                curveTo(21f, 4.74f, 20.26f, 4f, 19.36f, 4f)
                close()
                moveTo(3.97f, 16.47f)
                curveTo(3.47f, 16.25f, 3f, 16.72f, 3f, 17.27f)
                verticalLineToRelative(0.46f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.45f)
                curveToRelative(0.56f, 0f, 1.02f, -0.47f, 0.8f, -0.98f)
                curveToRelative(-0.24f, -0.57f, -0.7f, -1.03f, -1.28f, -1.28f)
                close()
                moveToRelative(-0.15f, -3.41f)
                curveTo(3.37f, 12.99f, 3f, 13.36f, 3f, 13.82f)
                curveToRelative(0f, 0.45f, 0.37f, 0.8f, 0.81f, 0.9f)
                curveToRelative(1.6f, 0.32f, 2.88f, 1.59f, 3.2f, 3.2f)
                curveToRelative(0.09f, 0.44f, 0.45f, 0.8f, 0.9f, 0.8f)
                reflectiveCurveToRelative(0.82f, -0.36f, 0.76f, -0.8f)
                curveToRelative(-0.36f, -2.52f, -2.34f, -4.5f, -4.85f, -4.86f)
                close()
                moveToRelative(0f, -3.3f)
                curveTo(3.37f, 9.72f, 3f, 10.1f, 3f, 10.55f)
                curveToRelative(0f, 0.45f, 0.37f, 0.8f, 0.82f, 0.86f)
                curveToRelative(3.41f, 0.38f, 6.12f, 3.09f, 6.5f, 6.5f)
                curveToRelative(0.05f, 0.45f, 0.41f, 0.82f, 0.86f, 0.82f)
                reflectiveCurveToRelative(0.82f, -0.37f, 0.78f, -0.82f)
                curveToRelative(-0.39f, -4.32f, -3.83f, -7.76f, -8.14f, -8.15f)
                close()
            }
        }

        return _cast!!
    }

@Suppress("ObjectPropertyName")
private var _cast: ImageVector? = null

@Preview
@Composable
private fun SatsIconCastPreview() {
    Icon(SatsIcons.Cast, contentDescription = null)
}
