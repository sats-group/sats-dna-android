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
val SatsIcons.Quinyx: ImageVector
    get() {
        if (_quinyx != null) {
            return _quinyx!!
        }

        _quinyx = materialIcon(name = "Quinyx") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(11.76f, 21.1f)
                curveToRelative(-1.2f, 0f, -2.4f, -0.23f, -3.52f, -0.7f)
                curveToRelative(-1.12f, -0.46f, -2.13f, -1.13f, -2.98f, -1.99f)
                curveToRelative(-0.86f, -0.85f, -1.54f, -1.87f, -2f, -2.98f)
                curveToRelative(-0.38f, -0.92f, -0.6f, -1.88f, -0.67f, -2.86f)
                horizontalLineToRelative(9.34f)
                curveToRelative(1.21f, 0f, 2.41f, 0.24f, 3.53f, 0.7f)
                curveToRelative(1.11f, 0.46f, 2.13f, 1.14f, 2.98f, 2f)
                curveToRelative(0.86f, 0.85f, 1.53f, 1.86f, 2f, 2.98f)
                curveToRelative(0.38f, 0.91f, 0.6f, 1.88f, 0.67f, 2.86f)
                horizontalLineToRelative(-9.35f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(21.14f, 11.7f)
                curveToRelative(0f, 0.32f, -0.02f, 0.63f, -0.05f, 0.94f)
                curveToRelative(-2.38f, -2.33f, -5.5f, -3.76f, -8.95f, -3.8f)
                horizontalLineToRelative(-9.2f)
                curveToRelative(0.6f, -1.88f, 1.79f, -3.52f, 3.4f, -4.69f)
                curveTo(8.2f, 2.8f, 10.5f, 2.2f, 12.79f, 2.43f)
                curveToRelative(2.3f, 0.25f, 4.41f, 1.33f, 5.95f, 3.04f)
                curveToRelative(1.54f, 1.7f, 2.4f, 3.93f, 2.4f, 6.23f)
                close()
            }
        }

        return _quinyx!!
    }

@Suppress("ObjectPropertyName")
private var _quinyx: ImageVector? = null

@Preview
@Composable
private fun SatsIconQuinyxPreview() {
    Icon(SatsIcons.Quinyx, contentDescription = null)
}
