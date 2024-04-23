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
val SatsIcons.Info: ImageVector
    get() {
        if (_info != null) {
            return _info!!
        }

        _info = materialIcon(name = "Info") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(1.42f, 12f)
                curveToRelative(0f, -5.84f, 4.74f, -10.58f, 10.58f, -10.58f)
                horizontalLineToRelative(0.01f)
                curveToRelative(5.84f, 0f, 10.58f, 4.74f, 10.58f, 10.58f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 5.84f, -4.74f, 10.58f, -10.58f, 10.58f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-5.84f, 0f, -10.58f, -4.74f, -10.58f, -10.58f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12.85f, 16.92f)
                verticalLineToRelative(-5.84f)
                curveToRelative(0f, -0.53f, -0.43f, -0.96f, -0.96f, -0.96f)
                curveToRelative(-0.52f, 0f, -0.95f, 0.43f, -0.95f, 0.96f)
                verticalLineToRelative(5.84f)
                curveToRelative(0f, 0.52f, 0.43f, 0.95f, 0.95f, 0.95f)
                curveToRelative(0.53f, 0f, 0.96f, -0.43f, 0.96f, -0.95f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.9f, 8.53f)
                curveToRelative(0.66f, 0f, 1.2f, -0.54f, 1.2f, -1.2f)
                curveToRelative(0f, -0.66f, -0.54f, -1.2f, -1.2f, -1.2f)
                curveToRelative(-0.67f, 0f, -1.2f, 0.54f, -1.2f, 1.2f)
                curveToRelative(0f, 0.66f, 0.53f, 1.2f, 1.2f, 1.2f)
                close()
            }
        }

        return _info!!
    }

@Suppress("ObjectPropertyName")
private var _info: ImageVector? = null

@Preview
@Composable
private fun SatsIconInfoPreview() {
    Icon(SatsIcons.Info, contentDescription = null)
}
