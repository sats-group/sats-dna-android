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
val SatsIcons.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }

        _arrowUp = materialIcon(name = "ArrowUp") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(7f, 14.5f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 5f)
            }
        }

        return _arrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _arrowUp: ImageVector? = null

@Preview
@Composable
private fun SatsIconArrowUpPreview() {
    Icon(SatsIcons.ArrowUp, contentDescription = null)
}
