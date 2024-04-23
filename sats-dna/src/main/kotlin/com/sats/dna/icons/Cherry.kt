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
val SatsIcons.Cherry: ImageVector
    get() {
        if (_cherry != null) {
            return _cherry!!
        }

        _cherry = materialIcon(name = "Cherry") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(21.3f, 4.54f)
                curveToRelative(0f, 2.14f, -1.75f, 3.88f, -3.9f, 3.88f)
                curveToRelative(-2.14f, 0f, -3.88f, -1.74f, -3.88f, -3.88f)
                curveToRelative(0f, -2.15f, 1.74f, -3.9f, 3.89f, -3.9f)
                curveToRelative(2.14f, 0f, 3.88f, 1.75f, 3.88f, 3.9f)
                close()
            }
        }

        return _cherry!!
    }

@Suppress("ObjectPropertyName")
private var _cherry: ImageVector? = null

@Preview
@Composable
private fun SatsIconCherryPreview() {
    Icon(SatsIcons.Cherry, contentDescription = null)
}
