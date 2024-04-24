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
val SatsIcons.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }

        _home = materialIcon(name = "Home") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(12f, 3f)
                lineTo(3.43f, 9.86f)
                verticalLineTo(21f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5.14f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(9.86f)
                lineTo(12f, 3f)
                close()
            }
        }

        return _home!!
    }

@Suppress("ObjectPropertyName")
private var _home: ImageVector? = null

@Preview
@Composable
private fun SatsIconHomePreview() {
    Icon(SatsIcons.Home, contentDescription = null)
}
