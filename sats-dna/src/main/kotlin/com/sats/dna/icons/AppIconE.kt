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
val SatsIcons.AppIconE: ImageVector
    get() {
        if (_appIconE != null) {
            return _appIconE!!
        }

        _appIconE = materialIcon(name = "AppIconE") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.86f, 9.1f)
                lineToRelative(-0.53f, 1.74f)
                horizontalLineToRelative(3.31f)
                lineToRelative(-0.62f, 2.13f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(-0.59f, 1.94f)
                horizontalLineToRelative(4.44f)
                lineToRelative(-0.64f, 2.13f)
                horizontalLineTo(6.87f)
                lineToRelative(3f, -10.08f)
                horizontalLineToRelative(7.08f)
                lineTo(16.31f, 9.1f)
                horizontalLineToRelative(-4.45f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(19.9f, 4.17f)
                curveToRelative(0.82f, 0.82f, 1f, 2f, 1f, 3.8f)
                verticalLineToRelative(8.05f)
                curveToRelative(0f, 1.8f, -0.18f, 2.99f, -1f, 3.81f)
                curveToRelative(-0.84f, 0.83f, -2.05f, 1.02f, -3.84f, 1.02f)
                horizontalLineTo(7.93f)
                curveToRelative(-1.78f, 0f, -3f, -0.19f, -3.82f, -1.02f)
                curveToRelative(-0.83f, -0.82f, -1f, -2.01f, -1f, -3.8f)
                verticalLineTo(7.94f)
                curveToRelative(0f, -1.76f, 0.17f, -2.95f, 1f, -3.78f)
                curveToRelative(0.83f, -0.83f, 2.04f, -1.02f, 3.8f, -1.02f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.8f, 0f, 3f, 0.19f, 3.83f, 1.02f)
                close()
            }
        }

        return _appIconE!!
    }

@Suppress("ObjectPropertyName")
private var _appIconE: ImageVector? = null

@Preview
@Composable
private fun SatsIconAppIconEPreview() {
    Icon(SatsIcons.AppIconE, contentDescription = null)
}
