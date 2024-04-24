package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }

        _menu = materialIcon(name = "Menu") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(0.3f, 6.13f)
                curveToRelative(0f, -0.42f, 0.33f, -0.75f, 0.74f, -0.75f)
                horizontalLineToRelative(21.92f)
                curveToRelative(0.41f, 0f, 0.75f, 0.33f, 0.75f, 0.75f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(1.04f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(0.3f, 17.87f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.74f, -0.75f)
                horizontalLineToRelative(21.92f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                curveToRelative(0f, 0.42f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(1.04f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.33f, -0.75f, -0.75f)
                close()
            }
        }

        return _menu!!
    }

@Suppress("ObjectPropertyName")
private var _menu: ImageVector? = null

@Preview
@Composable
private fun SatsIconMenuPreview() {
    Icon(SatsIcons.Menu, contentDescription = null)
}
