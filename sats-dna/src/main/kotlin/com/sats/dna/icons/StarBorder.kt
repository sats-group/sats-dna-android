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
val SatsIcons.StarBorder: ImageVector
    get() {
        if (_starBorder != null) {
            return _starBorder!!
        }

        _starBorder = materialIcon(name = "StarBorder") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(12f, 3.44f)
                lineToRelative(2.78f, 5.64f)
                lineTo(21f, 9.98f)
                lineToRelative(-4.5f, 4.39f)
                lineToRelative(1.06f, 6.19f)
                lineTo(12f, 17.64f)
                lineToRelative(-5.56f, 2.92f)
                lineToRelative(1.06f, -6.2f)
                lineTo(3f, 9.99f)
                lineToRelative(6.22f, -0.9f)
                lineTo(12f, 3.44f)
                close()
            }
        }

        return _starBorder!!
    }

@Suppress("ObjectPropertyName")
private var _starBorder: ImageVector? = null

@Preview
@Composable
private fun SatsIconStarBorderPreview() {
    Icon(SatsIcons.StarBorder, contentDescription = null)
}
