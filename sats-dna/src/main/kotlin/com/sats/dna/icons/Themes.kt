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
val SatsIcons.Themes: ImageVector
    get() {
        if (_themes != null) {
            return _themes!!
        }

        _themes = materialIcon(name = "Themes") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(3.76f, 3.2f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(8.81f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(17.24f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-8.81f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(6.91f, 19.53f)
                horizontalLineToRelative(5.01f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(8.77f, 4.26f)
                horizontalLineToRelative(1.3f)
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.99f, 17.33f)
                curveToRelative(0f, -0.73f, -0.6f, -1.32f, -1.32f, -1.32f)
                curveToRelative(-0.73f, 0f, -1.32f, 0.6f, -1.32f, 1.32f)
                curveToRelative(0f, 0.73f, 1.32f, 2.2f, 1.32f, 2.2f)
                reflectiveCurveToRelative(1.32f, -1.47f, 1.32f, -2.2f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(19.67f, 15.13f)
                curveToRelative(-0.32f, 0f, -0.61f, 0.07f, -0.88f, 0.19f)
                verticalLineToRelative(-8.2f)
                curveToRelative(0f, -0.48f, 0.4f, -0.88f, 0.88f, -0.88f)
                reflectiveCurveToRelative(0.88f, 0.4f, 0.88f, 0.88f)
                verticalLineToRelative(8.2f)
                curveToRelative(-0.27f, -0.12f, -0.57f, -0.19f, -0.88f, -0.19f)
                close()
            }
        }

        return _themes!!
    }

@Suppress("ObjectPropertyName")
private var _themes: ImageVector? = null

@Preview
@Composable
private fun SatsIconThemesPreview() {
    Icon(SatsIcons.Themes, contentDescription = null)
}
