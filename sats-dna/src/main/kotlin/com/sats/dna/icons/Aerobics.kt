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
val SatsIcons.Aerobics: ImageVector
    get() {
        if (_aerobics != null) {
            return _aerobics!!
        }

        _aerobics = materialIcon(name = "Aerobics") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(18.13f, 9.9f)
                curveToRelative(1.35f, 0f, 2.45f, -1.09f, 2.45f, -2.43f)
                curveToRelative(0f, -1.35f, -1.1f, -2.44f, -2.45f, -2.44f)
                curveToRelative(-1.36f, 0f, -2.45f, 1.1f, -2.45f, 2.44f)
                curveToRelative(0f, 1.34f, 1.1f, 2.43f, 2.45f, 2.43f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.9f, 6.08f)
                curveToRelative(-0.05f, -0.06f, -0.08f, -0.13f, -0.08f, -0.2f)
                lineToRelative(-0.16f, -3.34f)
                curveToRelative(0f, -0.16f, -0.14f, -0.29f, -0.3f, -0.29f)
                horizontalLineTo(10.2f)
                curveToRelative(-0.16f, 0f, -0.3f, 0.13f, -0.3f, 0.29f)
                lineTo(9.72f, 6.43f)
                curveToRelative(0f, 0.13f, 0.03f, 0.27f, 0.08f, 0.4f)
                curveToRelative(0.06f, 0.12f, 0.13f, 0.24f, 0.23f, 0.33f)
                lineToRelative(2.24f, 2.23f)
                curveToRelative(0.12f, 0.11f, 0.12f, 0.3f, 0f, 0.42f)
                lineTo(1.7f, 20.31f)
                curveToRelative(-0.11f, 0.11f, -0.11f, 0.3f, 0f, 0.42f)
                lineToRelative(0.83f, 0.82f)
                curveToRelative(0.11f, 0.11f, 0.29f, 0.12f, 0.4f, 0.02f)
                lineToRelative(6.3f, -5.4f)
                curveToRelative(0.12f, -0.1f, 0.3f, -0.1f, 0.41f, 0f)
                lineToRelative(1.07f, 1.07f)
                curveToRelative(0.11f, 0.11f, 0.12f, 0.3f, 0f, 0.41f)
                lineToRelative(-2.37f, 2.66f)
                curveToRelative(-0.1f, 0.12f, -0.1f, 0.3f, 0.02f, 0.41f)
                lineToRelative(0.82f, 0.82f)
                curveToRelative(0.12f, 0.12f, 0.3f, 0.12f, 0.42f, 0f)
                lineToRelative(3.27f, -3.25f)
                curveToRelative(0.2f, -0.19f, 0.3f, -0.45f, 0.3f, -0.71f)
                curveToRelative(0f, -0.17f, -0.04f, -0.33f, -0.12f, -0.48f)
                curveToRelative(-0.08f, -0.15f, -0.08f, -0.34f, 0.03f, -0.45f)
                lineToRelative(3.04f, -3.02f)
                curveToRelative(0.12f, -0.12f, 0.3f, -0.12f, 0.41f, -0.02f)
                lineToRelative(4.53f, 4.02f)
                curveToRelative(0.11f, 0.11f, 0.3f, 0.1f, 0.4f, 0f)
                lineToRelative(0.82f, -0.81f)
                curveToRelative(0.11f, -0.12f, 0.11f, -0.31f, 0f, -0.43f)
                lineTo(11.9f, 6.08f)
                close()
            }
        }

        return _aerobics!!
    }

@Suppress("ObjectPropertyName")
private var _aerobics: ImageVector? = null

@Preview
@Composable
private fun SatsIconAerobicsPreview() {
    Icon(SatsIcons.Aerobics, contentDescription = null)
}
