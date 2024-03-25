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
val SatsIcons.Closed: ImageVector
    get() {
        if (_closed != null) {
            return _closed!!
        }

        _closed = materialIcon(name = "Closed") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(20.78f, 8.26f)
                curveToRelative(-1.21f, -1.2f, -3.83f, -1.2f, -5.04f, 0f)
                curveToRelative(1.2f, -1.2f, 1.2f, -3.83f, 0f, -5.04f)
                curveToRelative(1.2f, 1.21f, 3.83f, 1.21f, 5.04f, 0f)
                curveToRelative(-1.21f, 1.21f, -1.21f, 3.83f, 0f, 5.04f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(18.26f, 15.19f)
                curveToRelative(-5.22f, 0f, -9.45f, -4.23f, -9.45f, -9.45f)
                curveToRelative(0f, -0.95f, 0.15f, -1.87f, 0.4f, -2.74f)
                curveToRelative(-3.87f, 1.17f, -6.7f, 4.77f, -6.7f, 9.04f)
                curveToRelative(0f, 5.21f, 4.23f, 9.44f, 9.45f, 9.44f)
                curveToRelative(4.26f, 0f, 7.86f, -2.82f, 9.04f, -6.7f)
                curveToRelative(-0.87f, 0.26f, -1.79f, 0.4f, -2.74f, 0.4f)
                close()
            }
        }

        return _closed!!
    }

@Suppress("ObjectPropertyName")
private var _closed: ImageVector? = null

@Preview
@Composable
private fun SatsIconClosedPreview() {
    Icon(SatsIcons.Closed, contentDescription = null)
}
