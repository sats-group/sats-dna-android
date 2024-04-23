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
val SatsIcons.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }

        _star = materialIcon(name = "Star") {
            path(
                fill = SolidColor(Color.Black),
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

        return _star!!
    }

@Suppress("ObjectPropertyName")
private var _star: ImageVector? = null

@Preview
@Composable
private fun SatsIconStarPreview() {
    Icon(SatsIcons.Star, contentDescription = null)
}
