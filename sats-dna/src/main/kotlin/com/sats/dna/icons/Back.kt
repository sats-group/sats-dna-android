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
val SatsIcons.Back: ImageVector
    get() {
        if (_back != null) {
            return _back!!
        }

        _back = materialIcon(name = "Back") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(21f, 12f)
                horizontalLineTo(3f)
                moveToRelative(0f, 0f)
                lineToRelative(6.3f, 6.3f)
                moveTo(3f, 12f)
                lineToRelative(6.3f, -6.3f)
            }
        }

        return _back!!
    }

@Suppress("ObjectPropertyName")
private var _back: ImageVector? = null

@Preview
@Composable
private fun SatsIconBackPreview() {
    Icon(SatsIcons.Back, contentDescription = null)
}
