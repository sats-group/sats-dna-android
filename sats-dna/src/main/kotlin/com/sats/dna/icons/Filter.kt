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
val SatsIcons.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }

        _filter = materialIcon(name = "Filter") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(6.67f, 19.06f)
                curveToRelative(0.37f, 0f, 0.67f, -0.3f, 0.67f, -0.64f)
                verticalLineToRelative(-2.3f)
                curveToRelative(0.73f, -0.28f, 1.25f, -0.99f, 1.25f, -1.82f)
                curveToRelative(0f, -0.82f, -0.52f, -1.53f, -1.25f, -1.8f)
                verticalLineTo(5.75f)
                curveToRelative(0f, -0.37f, -0.3f, -0.66f, -0.67f, -0.66f)
                curveToRelative(-0.38f, 0f, -0.68f, 0.29f, -0.68f, 0.66f)
                verticalLineToRelative(6.73f)
                curveToRelative(-0.73f, 0.28f, -1.26f, 0.98f, -1.26f, 1.81f)
                curveToRelative(0f, 0.83f, 0.53f, 1.54f, 1.26f, 1.81f)
                verticalLineToRelative(2.31f)
                curveToRelative(0f, 0.34f, 0.3f, 0.64f, 0.68f, 0.64f)
                close()
                moveToRelative(5.33f, 0f)
                curveToRelative(0.38f, 0f, 0.67f, -0.3f, 0.67f, -0.67f)
                verticalLineToRelative(-6.84f)
                curveToRelative(0.74f, -0.28f, 1.26f, -1f, 1.26f, -1.81f)
                curveToRelative(0f, -0.83f, -0.52f, -1.54f, -1.26f, -1.81f)
                verticalLineToRelative(-2.2f)
                curveToRelative(0f, -0.34f, -0.3f, -0.63f, -0.67f, -0.63f)
                curveToRelative(-0.37f, 0f, -0.67f, 0.29f, -0.67f, 0.64f)
                verticalLineToRelative(2.18f)
                curveToRelative(-0.74f, 0.27f, -1.26f, 0.99f, -1.26f, 1.82f)
                curveToRelative(0f, 0.82f, 0.52f, 1.53f, 1.26f, 1.8f)
                verticalLineToRelative(6.85f)
                curveToRelative(0f, 0.37f, 0.3f, 0.67f, 0.67f, 0.67f)
                close()
                moveToRelative(3.4f, -4.76f)
                curveToRelative(0f, 0.83f, 0.54f, 1.54f, 1.27f, 1.81f)
                verticalLineToRelative(2.31f)
                curveToRelative(0f, 0.34f, 0.3f, 0.64f, 0.66f, 0.64f)
                curveToRelative(0.38f, 0f, 0.68f, -0.3f, 0.68f, -0.64f)
                verticalLineToRelative(-2.3f)
                curveToRelative(0.73f, -0.28f, 1.26f, -0.99f, 1.26f, -1.82f)
                curveToRelative(0f, -0.83f, -0.53f, -1.53f, -1.26f, -1.8f)
                verticalLineTo(5.75f)
                curveToRelative(0f, -0.37f, -0.3f, -0.66f, -0.68f, -0.66f)
                curveToRelative(-0.36f, 0f, -0.66f, 0.29f, -0.66f, 0.66f)
                verticalLineToRelative(6.73f)
                curveToRelative(-0.73f, 0.28f, -1.26f, 1f, -1.26f, 1.81f)
                close()
                moveToRelative(-4.33f, -4.56f)
                curveToRelative(0f, -0.53f, 0.41f, -0.94f, 0.93f, -0.94f)
                curveToRelative(0.53f, 0f, 0.93f, 0.41f, 0.93f, 0.94f)
                curveToRelative(0f, 0.52f, -0.4f, 0.93f, -0.93f, 0.93f)
                curveToRelative(-0.52f, 0f, -0.93f, -0.41f, -0.93f, -0.93f)
                close()
                moveTo(5.73f, 14.3f)
                curveToRelative(0f, -0.52f, 0.41f, -0.93f, 0.94f, -0.93f)
                reflectiveCurveTo(7.6f, 13.78f, 7.6f, 14.3f)
                curveToRelative(0f, 0.53f, -0.4f, 0.93f, -0.93f, 0.93f)
                reflectiveCurveToRelative(-0.94f, -0.4f, -0.94f, -0.93f)
                close()
                moveToRelative(10.68f, 0f)
                curveToRelative(0f, -0.52f, 0.4f, -0.93f, 0.93f, -0.93f)
                reflectiveCurveToRelative(0.94f, 0.41f, 0.94f, 0.93f)
                curveToRelative(0f, 0.53f, -0.4f, 0.93f, -0.94f, 0.93f)
                curveToRelative(-0.52f, 0f, -0.93f, -0.4f, -0.93f, -0.93f)
                close()
            }
        }

        return _filter!!
    }

@Suppress("ObjectPropertyName")
private var _filter: ImageVector? = null

@Preview
@Composable
private fun SatsIconFilterPreview() {
    Icon(SatsIcons.Filter, contentDescription = null)
}
