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
val SatsIcons.Kroner: ImageVector
    get() {
        if (_kroner != null) {
            return _kroner!!
        }

        _kroner = materialIcon(name = "Kroner") {
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
                moveTo(5.22f, 16f)
                verticalLineTo(8f)
                horizontalLineToRelative(1.45f)
                verticalLineToRelative(3.68f)
                horizontalLineToRelative(0.1f)
                lineTo(9.89f, 8f)
                horizontalLineToRelative(1.77f)
                lineToRelative(-3.1f, 3.59f)
                lineTo(11.7f, 16f)
                horizontalLineTo(9.94f)
                lineToRelative(-2.38f, -3.43f)
                lineToRelative(-0.89f, 1.05f)
                verticalLineTo(16f)
                horizontalLineTo(5.22f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12.66f, 16f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                curveToRelative(0.62f, 0f, 1.14f, 0.1f, 1.55f, 0.32f)
                curveToRelative(0.42f, 0.21f, 0.74f, 0.51f, 0.95f, 0.9f)
                curveToRelative(0.22f, 0.38f, 0.33f, 0.83f, 0.33f, 1.34f)
                curveToRelative(0f, 0.51f, -0.11f, 0.96f, -0.33f, 1.33f)
                curveToRelative(-0.22f, 0.38f, -0.54f, 0.67f, -0.96f, 0.88f)
                curveToRelative(-0.42f, 0.2f, -0.94f, 0.3f, -1.55f, 0.3f)
                horizontalLineTo(13.5f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(1.94f)
                curveToRelative(0.36f, 0f, 0.65f, -0.05f, 0.88f, -0.15f)
                curveToRelative(0.23f, -0.1f, 0.4f, -0.25f, 0.51f, -0.44f)
                curveToRelative(0.11f, -0.2f, 0.17f, -0.44f, 0.17f, -0.72f)
                curveToRelative(0f, -0.29f, -0.06f, -0.53f, -0.17f, -0.73f)
                curveToRelative(-0.11f, -0.2f, -0.28f, -0.35f, -0.51f, -0.46f)
                curveToRelative(-0.23f, -0.1f, -0.53f, -0.16f, -0.89f, -0.16f)
                horizontalLineToRelative(-1.33f)
                verticalLineTo(16f)
                horizontalLineToRelative(-1.45f)
                close()
                moveToRelative(4.14f, -3.63f)
                lineTo(18.78f, 16f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-1.94f, -3.63f)
                horizontalLineToRelative(1.58f)
                close()
            }
        }

        return _kroner!!
    }

@Suppress("ObjectPropertyName")
private var _kroner: ImageVector? = null

@Preview
@Composable
private fun SatsIconKronerPreview() {
    Icon(SatsIcons.Kroner, contentDescription = null)
}
