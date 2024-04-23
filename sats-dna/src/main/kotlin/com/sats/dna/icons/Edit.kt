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
val SatsIcons.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }

        _edit = materialIcon(name = "Edit") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(14.33f, 4.67f)
                lineToRelative(5f, 5f)
                moveTo(8f, 21f)
                lineToRelative(-6f, 1f)
                lineToRelative(1f, -6f)
                lineTo(16.41f, 2.59f)
                curveTo(16.8f, 2.2f, 17.3f, 2f, 17.83f, 2f)
                curveToRelative(0.53f, 0f, 1.04f, 0.21f, 1.41f, 0.59f)
                lineToRelative(2.17f, 2.17f)
                curveTo(21.8f, 5.13f, 22f, 5.64f, 22f, 6.17f)
                curveToRelative(0f, 0.53f, -0.21f, 1.04f, -0.59f, 1.42f)
                lineTo(8f, 21f)
                close()
            }
        }

        return _edit!!
    }

@Suppress("ObjectPropertyName")
private var _edit: ImageVector? = null

@Preview
@Composable
private fun SatsIconEditPreview() {
    Icon(SatsIcons.Edit, contentDescription = null)
}
