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
val SatsIcons.Strikes: ImageVector
    get() {
        if (_strikes != null) {
            return _strikes!!
        }

        _strikes = materialIcon(name = "Strikes") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(10.94f, 7.08f)
                verticalLineToRelative(5.84f)
                curveToRelative(0f, 0.53f, 0.43f, 0.96f, 0.95f, 0.96f)
                curveToRelative(0.53f, 0f, 0.96f, -0.43f, 0.96f, -0.96f)
                verticalLineTo(7.08f)
                curveToRelative(0f, -0.53f, -0.43f, -0.95f, -0.96f, -0.95f)
                curveToRelative(-0.52f, 0f, -0.95f, 0.42f, -0.95f, 0.95f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.9f, 15.47f)
                curveToRelative(-0.67f, 0f, -1.2f, 0.54f, -1.2f, 1.2f)
                curveToRelative(0f, 0.66f, 0.53f, 1.2f, 1.2f, 1.2f)
                curveToRelative(0.66f, 0f, 1.2f, -0.54f, 1.2f, -1.2f)
                curveToRelative(0f, -0.66f, -0.54f, -1.2f, -1.2f, -1.2f)
                close()
            }

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
        }

        return _strikes!!
    }

@Suppress("ObjectPropertyName")
private var _strikes: ImageVector? = null

@Preview
@Composable
private fun SatsIconStrikesPreview() {
    Icon(SatsIcons.Strikes, contentDescription = null)
}
