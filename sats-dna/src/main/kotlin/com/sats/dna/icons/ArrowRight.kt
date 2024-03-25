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
val SatsIcons.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }

        _arrowRight = materialIcon(name = "ArrowRight") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(9.5f, 7f)
                lineToRelative(5f, 5f)
                lineToRelative(-5f, 5f)
            }
        }

        return _arrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _arrowRight: ImageVector? = null

@Preview
@Composable
private fun SatsIconArrowRightPreview() {
    Icon(SatsIcons.ArrowRight, contentDescription = null)
}
