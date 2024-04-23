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
val SatsIcons.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }

        _check = materialIcon(name = "Check") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(4.24f, 11.72f)
                lineToRelative(5.98f, 5.98f)
                lineToRelative(9.54f, -9.54f)
            }
        }

        return _check!!
    }

@Suppress("ObjectPropertyName")
private var _check: ImageVector? = null

@Preview
@Composable
private fun SatsIconCheckPreview() {
    Icon(SatsIcons.Check, contentDescription = null)
}
