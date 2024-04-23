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
val SatsIcons.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }

        _smartphone = materialIcon(name = "Smartphone") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(8.98f, 19.98f)
                horizontalLineToRelative(5.12f)
                moveTo(10.88f, 4.16f)
                horizontalLineToRelative(1.32f)
                moveTo(8.27f, 23f)
                horizontalLineToRelative(6.54f)
                curveToRelative(1.8f, 0f, 3.27f, -1.47f, 3.27f, -3.27f)
                verticalLineTo(4.27f)
                curveToRelative(0f, -1.8f, -1.46f, -3.27f, -3.27f, -3.27f)
                horizontalLineTo(8.27f)
                curveTo(6.47f, 1f, 5f, 2.47f, 5f, 4.27f)
                verticalLineToRelative(15.46f)
                curveTo(5f, 21.53f, 6.47f, 23f, 8.27f, 23f)
                close()
            }
        }

        return _smartphone!!
    }

@Suppress("ObjectPropertyName")
private var _smartphone: ImageVector? = null

@Preview
@Composable
private fun SatsIconSmartphonePreview() {
    Icon(SatsIcons.Smartphone, contentDescription = null)
}
