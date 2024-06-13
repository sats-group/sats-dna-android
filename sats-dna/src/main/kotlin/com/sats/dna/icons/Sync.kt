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
val SatsIcons.Sync: ImageVector
    get() {
        if (_sync != null) {
            return _sync!!
        }

        _sync = materialIcon(name = "Sync") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(3.15f, 10.37f)
                curveToRelative(0.37f, -2f, 1.4f, -3.8f, 2.92f, -5.14f)
                curveTo(7.6f, 3.89f, 9.53f, 3.1f, 11.56f, 3f)
                curveToRelative(2.02f, -0.1f, 4.02f, 0.49f, 5.67f, 1.67f)
                curveToRelative(1.65f, 1.18f, 2.86f, 2.88f, 3.42f, 4.83f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(21f, 3f)
                verticalLineToRelative(6.55f)
                lineToRelative(-6.5f, -0.8f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(20.85f, 13.64f)
                curveToRelative(-0.37f, 2f, -1.4f, 3.81f, -2.92f, 5.15f)
                curveToRelative(-1.53f, 1.33f, -3.46f, 2.11f, -5.49f, 2.21f)
                curveToRelative(-2.02f, 0.1f, -4.02f, -0.49f, -5.67f, -1.66f)
                curveToRelative(-1.65f, -1.18f, -2.86f, -2.89f, -3.42f, -4.83f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(3f, 21f)
                verticalLineToRelative(-6.54f)
                lineToRelative(6.5f, 0.8f)
            }
        }

        return _sync!!
    }

@Suppress("ObjectPropertyName")
private var _sync: ImageVector? = null

@Preview
@Composable
private fun SatsIconSyncPreview() {
    Icon(SatsIcons.Sync, contentDescription = null)
}
