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
val SatsIcons.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }

        _arrowLeft = materialIcon(name = "ArrowLeft") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(14.5f, 17f)
                lineToRelative(-5f, -5f)
                lineToRelative(5f, -5f)
            }
        }

        return _arrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _arrowLeft: ImageVector? = null

@Preview
@Composable
private fun SatsIconArrowLeftPreview() {
    Icon(SatsIcons.ArrowLeft, contentDescription = null)
}
