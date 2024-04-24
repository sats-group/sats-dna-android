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
val SatsIcons.Sound: ImageVector
    get() {
        if (_sound != null) {
            return _sound!!
        }

        _sound = materialIcon(name = "Sound") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(13.84f, 4.08f)
                curveToRelative(-0.26f, -0.13f, -0.56f, -0.1f, -0.79f, 0.07f)
                lineTo(7.25f, 8.5f)
                horizontalLineToRelative(-3.5f)
                curveTo(3.34f, 8.5f, 3f, 8.84f, 3f, 9.25f)
                verticalLineToRelative(6f)
                curveTo(3f, 15.67f, 3.34f, 16f, 3.75f, 16f)
                horizontalLineToRelative(3.5f)
                lineToRelative(5.8f, 4.35f)
                curveToRelative(0.13f, 0.1f, 0.3f, 0.15f, 0.45f, 0.15f)
                curveToRelative(0.12f, 0f, 0.23f, -0.02f, 0.34f, -0.08f)
                curveToRelative(0.25f, -0.12f, 0.41f, -0.38f, 0.41f, -0.67f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -0.28f, -0.16f, -0.54f, -0.41f, -0.67f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(16.68f, 9.07f)
                curveToRelative(-0.29f, -0.3f, -0.76f, -0.3f, -1.06f, 0f)
                curveToRelative(-0.29f, 0.3f, -0.29f, 0.77f, 0f, 1.06f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                curveToRelative(-0.29f, 0.3f, -0.29f, 0.77f, 0f, 1.06f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0f)
                curveToRelative(1.76f, -1.75f, 1.76f, -4.6f, 0f, -6.36f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(18.8f, 6.95f)
                curveToRelative(-0.29f, -0.3f, -0.76f, -0.3f, -1.05f, 0f)
                curveToRelative(-0.3f, 0.29f, -0.3f, 0.77f, 0f, 1.06f)
                curveToRelative(2.34f, 2.34f, 2.34f, 6.15f, 0f, 8.49f)
                curveToRelative(-0.3f, 0.29f, -0.3f, 0.76f, 0f, 1.06f)
                curveToRelative(0.29f, 0.29f, 0.76f, 0.29f, 1.06f, 0f)
                curveToRelative(2.92f, -2.93f, 2.92f, -7.69f, 0f, -10.61f)
                close()
            }
        }

        return _sound!!
    }

@Suppress("ObjectPropertyName")
private var _sound: ImageVector? = null

@Preview
@Composable
private fun SatsIconSoundPreview() {
    Icon(SatsIcons.Sound, contentDescription = null)
}
