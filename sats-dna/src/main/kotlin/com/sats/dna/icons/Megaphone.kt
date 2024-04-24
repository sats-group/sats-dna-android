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
val SatsIcons.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }

        _megaphone = materialIcon(name = "Megaphone") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(11.36f, 15.43f)
                lineToRelative(1.03f, 1.99f)
                curveToRelative(0.42f, 0.83f, 0.1f, 1.84f, -0.74f, 2.27f)
                curveToRelative(-0.82f, 0.42f, -1.84f, 0.1f, -2.27f, -0.73f)
                lineToRelative(-3f, -5.84f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(12f, 6.38f)
                horizontalLineTo(6.37f)
                curveTo(4.51f, 6.38f, 3f, 7.88f, 3f, 9.75f)
                curveToRelative(0f, 1.86f, 1.51f, 3.38f, 3.38f, 3.38f)
                horizontalLineTo(12f)
                curveToRelative(3.38f, 0f, 6.75f, 3.37f, 6.75f, 3.37f)
                verticalLineTo(3f)
                reflectiveCurveTo(15.37f, 6.38f, 12f, 6.38f)
                close()
            }
        }

        return _megaphone!!
    }

@Suppress("ObjectPropertyName")
private var _megaphone: ImageVector? = null

@Preview
@Composable
private fun SatsIconMegaphonePreview() {
    Icon(SatsIcons.Megaphone, contentDescription = null)
}
