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
val SatsIcons.AppIconS: ImageVector
    get() {
        if (_appIconS != null) {
            return _appIconS!!
        }

        _appIconS = materialIcon(name = "AppIconS") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(19.9f, 4.17f)
                curveToRelative(0.82f, 0.82f, 1f, 2f, 1f, 3.8f)
                verticalLineToRelative(8.05f)
                curveToRelative(0f, 1.8f, -0.18f, 2.99f, -1f, 3.81f)
                curveToRelative(-0.84f, 0.83f, -2.05f, 1.02f, -3.84f, 1.02f)
                horizontalLineTo(7.93f)
                curveToRelative(-1.78f, 0f, -3f, -0.19f, -3.82f, -1.02f)
                curveToRelative(-0.83f, -0.82f, -1f, -2.01f, -1f, -3.8f)
                verticalLineTo(7.94f)
                curveToRelative(0f, -1.76f, 0.17f, -2.95f, 1f, -3.78f)
                curveToRelative(0.83f, -0.83f, 2.04f, -1.02f, 3.8f, -1.02f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.8f, 0f, 3f, 0.19f, 3.83f, 1.02f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(13.73f, 11.32f)
                lineTo(13f, 10.69f)
                curveToRelative(-0.43f, -0.38f, -0.67f, -0.68f, -0.67f, -1.1f)
                curveToRelative(0f, -0.53f, 0.38f, -1f, 1.17f, -1f)
                curveToRelative(0.54f, 0f, 1.04f, 0.2f, 1.5f, 0.65f)
                lineToRelative(1.97f, -1.53f)
                curveToRelative(-0.52f, -0.72f, -1.6f, -1.4f, -3.18f, -1.4f)
                curveToRelative(-2.33f, 0f, -4.03f, 1.57f, -4.03f, 3.65f)
                curveToRelative(0f, 1.05f, 0.55f, 1.78f, 1.28f, 2.42f)
                lineTo(11.76f, 13f)
                curveToRelative(0.5f, 0.44f, 0.7f, 0.72f, 0.7f, 1.11f)
                curveToRelative(0f, 0.59f, -0.4f, 1.14f, -1.41f, 1.14f)
                curveToRelative(-0.76f, 0f, -1.43f, -0.3f, -1.93f, -0.89f)
                lineTo(7.16f, 15.9f)
                curveToRelative(0.74f, 0.93f, 1.99f, 1.66f, 3.7f, 1.66f)
                curveToRelative(2.64f, 0f, 4.17f, -1.65f, 4.17f, -3.84f)
                curveToRelative(0.01f, -1.1f, -0.61f, -1.8f, -1.3f, -2.4f)
                close()
            }
        }

        return _appIconS!!
    }

@Suppress("ObjectPropertyName")
private var _appIconS: ImageVector? = null

@Preview
@Composable
private fun SatsIconAppIconSPreview() {
    Icon(SatsIcons.AppIconS, contentDescription = null)
}
