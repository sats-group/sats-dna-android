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
val SatsIcons.Order: ImageVector
    get() {
        if (_order != null) {
            return _order!!
        }

        _order = materialIcon(name = "Order") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(7f, 17f)
                verticalLineTo(2f)
                moveToRelative(0f, 0f)
                lineTo(3f, 6f)
                moveToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                moveToRelative(6f, 0f)
                verticalLineToRelative(16f)
                moveToRelative(0f, 0f)
                lineToRelative(-4f, -4f)
                moveToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
        }

        return _order!!
    }

@Suppress("ObjectPropertyName")
private var _order: ImageVector? = null

@Preview
@Composable
private fun SatsIconOrderPreview() {
    Icon(SatsIcons.Order, contentDescription = null)
}
