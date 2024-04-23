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
val SatsIcons.Elixia: ImageVector
    get() {
        if (_elixia != null) {
            return _elixia!!
        }

        _elixia = materialIcon(name = "Elixia") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(18.49f, 8.05f)
                lineTo(19.5f, 4.5f)
                horizontalLineTo(9.03f)
                lineTo(4.5f, 20.22f)
                horizontalLineToRelative(10.77f)
                lineToRelative(1f, -3.55f)
                horizontalLineToRelative(-6.7f)
                lineToRelative(0.79f, -2.7f)
                horizontalLineToRelative(4.77f)
                lineToRelative(1.01f, -3.54f)
                horizontalLineToRelative(-4.77f)
                lineToRelative(0.7f, -2.38f)
                horizontalLineToRelative(6.42f)
                close()
            }
        }

        return _elixia!!
    }

@Suppress("ObjectPropertyName")
private var _elixia: ImageVector? = null

@Preview
@Composable
private fun SatsIconElixiaPreview() {
    Icon(SatsIcons.Elixia, contentDescription = null)
}
