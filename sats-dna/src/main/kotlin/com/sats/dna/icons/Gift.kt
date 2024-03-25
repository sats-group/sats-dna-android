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
val SatsIcons.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }

        _gift = materialIcon(name = "Gift") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(20.18f, 9.27f)
                verticalLineTo(22f)
                horizontalLineTo(3.82f)
                verticalLineTo(9.27f)
                moveToRelative(10f, -3.63f)
                verticalLineTo(22f)
                horizontalLineToRelative(-3.64f)
                verticalLineTo(5.64f)
                moveToRelative(1.82f, 0f)
                reflectiveCurveTo(11.05f, 2f, 8.36f, 2f)
                curveToRelative(-1f, 0f, -1.81f, 0.81f, -1.81f, 1.82f)
                curveToRelative(0f, 1f, 0.81f, 1.82f, 1.81f, 1.82f)
                horizontalLineTo(12f)
                close()
                moveToRelative(0f, 0f)
                reflectiveCurveTo(12.95f, 2f, 15.64f, 2f)
                curveToRelative(1f, 0f, 1.81f, 0.81f, 1.81f, 1.82f)
                curveToRelative(0f, 1f, -0.8f, 1.82f, -1.81f, 1.82f)
                horizontalLineTo(12f)
                close()
                moveToRelative(-10f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3.63f)
                horizontalLineTo(2f)
                verticalLineTo(5.64f)
                close()
            }
        }

        return _gift!!
    }

@Suppress("ObjectPropertyName")
private var _gift: ImageVector? = null

@Preview
@Composable
private fun SatsIconGiftPreview() {
    Icon(SatsIcons.Gift, contentDescription = null)
}
