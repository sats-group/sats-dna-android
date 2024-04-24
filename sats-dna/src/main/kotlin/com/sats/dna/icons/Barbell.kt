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
val SatsIcons.Barbell: ImageVector
    get() {
        if (_barbell != null) {
            return _barbell!!
        }

        _barbell = materialIcon(name = "Barbell") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(17.36f, 6.64f)
                lineToRelative(2.89f, -2.89f)
                moveTo(8.7f, 15.3f)
                lineToRelative(6.6f, -6.6f)
                moveTo(3.75f, 20.25f)
                lineToRelative(2.89f, -2.89f)
                moveToRelative(7.83f, -13.61f)
                lineToRelative(5.78f, 5.78f)
                moveToRelative(-16.5f, 4.95f)
                lineToRelative(5.78f, 5.77f)
            }
        }

        return _barbell!!
    }

@Suppress("ObjectPropertyName")
private var _barbell: ImageVector? = null

@Preview
@Composable
private fun SatsIconBarbellPreview() {
    Icon(SatsIcons.Barbell, contentDescription = null)
}
