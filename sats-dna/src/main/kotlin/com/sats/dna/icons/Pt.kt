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
val SatsIcons.Pt: ImageVector
    get() {
        if (_pt != null) {
            return _pt!!
        }

        _pt = materialIcon(name = "Pt") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(15.91f, 22.37f)
                verticalLineToRelative(-9.9f)
                lineToRelative(2.03f, 2f)
                lineToRelative(-1.74f, 2.7f)
                curveToRelative(-0.21f, 0.25f, -0.31f, 0.59f, -0.28f, 0.92f)
                curveToRelative(0.03f, 0.34f, 0.19f, 0.65f, 0.44f, 0.86f)
                curveToRelative(0.25f, 0.22f, 0.58f, 0.33f, 0.9f, 0.3f)
                curveToRelative(0.34f, -0.04f, 0.64f, -0.2f, 0.85f, -0.46f)
                lineToRelative(2.49f, -3.61f)
                curveToRelative(0.2f, -0.25f, 0.3f, -0.57f, 0.29f, -0.89f)
                curveToRelative(-0.02f, -0.32f, -0.16f, -0.62f, -0.39f, -0.85f)
                lineToRelative(-3.9f, -3.82f)
                curveToRelative(-0.24f, -0.22f, -0.55f, -0.35f, -0.87f, -0.35f)
                horizontalLineTo(8.27f)
                curveToRelative(-0.32f, 0f, -0.63f, 0.13f, -0.86f, 0.35f)
                lineTo(3.5f, 13.44f)
                curveToRelative(-0.23f, 0.23f, -0.37f, 0.53f, -0.39f, 0.85f)
                curveToRelative(-0.01f, 0.32f, 0.09f, 0.64f, 0.29f, 0.89f)
                lineToRelative(2.49f, 3.61f)
                curveToRelative(0.21f, 0.26f, 0.51f, 0.42f, 0.84f, 0.45f)
                curveToRelative(0.33f, 0.04f, 0.66f, -0.07f, 0.91f, -0.29f)
                curveToRelative(0.25f, -0.21f, 0.41f, -0.52f, 0.44f, -0.86f)
                curveToRelative(0.03f, -0.33f, -0.07f, -0.67f, -0.28f, -0.93f)
                lineToRelative(-1.74f, -2.7f)
                lineToRelative(2.03f, -1.98f)
                verticalLineToRelative(9.89f)
                moveToRelative(4.27f, -9.82f)
                horizontalLineToRelative(1.77f)
                moveToRelative(0.71f, -8f)
                curveToRelative(0f, 1.6f, -1.27f, 2.9f, -2.84f, 2.9f)
                curveToRelative(-1.57f, 0f, -2.84f, -1.3f, -2.84f, -2.9f)
                curveToRelative(0f, -1.62f, 1.27f, -2.92f, 2.84f, -2.92f)
                curveToRelative(1.57f, 0f, 2.84f, 1.3f, 2.84f, 2.91f)
                close()
            }
        }

        return _pt!!
    }

@Suppress("ObjectPropertyName")
private var _pt: ImageVector? = null

@Preview
@Composable
private fun SatsIconPtPreview() {
    Icon(SatsIcons.Pt, contentDescription = null)
}
