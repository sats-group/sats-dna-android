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
val SatsIcons.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }

        _arrowDown = materialIcon(name = "ArrowDown") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(17f, 9.5f)
                lineToRelative(-5f, 5f)
                lineToRelative(-5f, -5f)
            }
        }

        return _arrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _arrowDown: ImageVector? = null

@Preview
@Composable
private fun SatsIconArrowDownPreview() {
    Icon(SatsIcons.ArrowDown, contentDescription = null)
}
