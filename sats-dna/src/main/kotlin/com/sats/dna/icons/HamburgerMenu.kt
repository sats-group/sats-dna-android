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
val SatsIcons.HamburgerMenu: ImageVector
    get() {
        if (_hamburgerMenu != null) {
            return _hamburgerMenu!!
        }

        _hamburgerMenu = materialIcon(name = "HamburgerMenu") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(1.5f, 12f)
                horizontalLineToRelative(21f)
                moveToRelative(-21f, -6.75f)
                horizontalLineToRelative(21f)
                moveToRelative(-21f, 13.5f)
                horizontalLineToRelative(21f)
            }
        }

        return _hamburgerMenu!!
    }

@Suppress("ObjectPropertyName")
private var _hamburgerMenu: ImageVector? = null

@Preview
@Composable
private fun SatsIconHamburgerMenuPreview() {
    Icon(SatsIcons.HamburgerMenu, contentDescription = null)
}
