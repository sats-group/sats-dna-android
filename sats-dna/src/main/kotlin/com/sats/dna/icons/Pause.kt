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
val SatsIcons.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }

        _pause = materialIcon(name = "Pause") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(8.4f, 0.75f)
                horizontalLineTo(6.22f)
                curveToRelative(-0.75f, 0f, -1.35f, 0.6f, -1.35f, 1.35f)
                verticalLineToRelative(19.29f)
                curveToRelative(0f, 0.74f, 0.6f, 1.34f, 1.35f, 1.34f)
                horizontalLineTo(8.4f)
                curveToRelative(0.75f, 0f, 1.35f, -0.6f, 1.35f, -1.34f)
                verticalLineTo(2.09f)
                curveToRelative(0f, -0.74f, -0.6f, -1.34f, -1.35f, -1.34f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(17.78f, 0.75f)
                horizontalLineTo(15.6f)
                curveToRelative(-0.75f, 0f, -1.35f, 0.6f, -1.35f, 1.35f)
                verticalLineToRelative(19.29f)
                curveToRelative(0f, 0.74f, 0.6f, 1.34f, 1.35f, 1.34f)
                horizontalLineToRelative(2.18f)
                curveToRelative(0.75f, 0f, 1.35f, -0.6f, 1.35f, -1.34f)
                verticalLineTo(2.09f)
                curveToRelative(0f, -0.74f, -0.6f, -1.34f, -1.35f, -1.34f)
                close()
            }
        }

        return _pause!!
    }

@Suppress("ObjectPropertyName")
private var _pause: ImageVector? = null

@Preview
@Composable
private fun SatsIconPausePreview() {
    Icon(SatsIcons.Pause, contentDescription = null)
}
