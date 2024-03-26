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
val SatsIcons.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }

        _forward = materialIcon(name = "Forward") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(3f, 12f)
                horizontalLineToRelative(18f)
                moveToRelative(0f, 0f)
                lineToRelative(-6.3f, 6.3f)
                moveTo(21f, 12f)
                lineToRelative(-6.3f, -6.3f)
            }
        }

        return _forward!!
    }

@Suppress("ObjectPropertyName")
private var _forward: ImageVector? = null

@Preview
@Composable
private fun SatsIconForwardPreview() {
    Icon(SatsIcons.Forward, contentDescription = null)
}
