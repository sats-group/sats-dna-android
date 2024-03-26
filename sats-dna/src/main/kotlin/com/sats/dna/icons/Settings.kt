package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }

        _settings = materialIcon(name = "Settings") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.65f, 12f)
                curveToRelative(0f, -2.95f, 2.4f, -5.35f, 5.35f, -5.35f)
                curveToRelative(2.95f, 0f, 5.35f, 2.4f, 5.35f, 5.35f)
                curveToRelative(0f, 2.95f, -2.4f, 5.35f, -5.35f, 5.35f)
                curveToRelative(-2.95f, 0f, -5.35f, -2.4f, -5.35f, -5.35f)
                close()
                moveTo(12f, 8.15f)
                curveToRelative(-2.12f, 0f, -3.85f, 1.72f, -3.85f, 3.85f)
                curveToRelative(0f, 2.12f, 1.73f, 3.85f, 3.85f, 3.85f)
                curveToRelative(2.13f, 0f, 3.85f, -1.73f, 3.85f, -3.85f)
                curveToRelative(0f, -2.13f, -1.72f, -3.85f, -3.85f, -3.85f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(10.69f, 19.72f)
                verticalLineToRelative(1.58f)
                curveToRelative(0f, 0.32f, 0.27f, 0.6f, 0.6f, 0.6f)
                horizontalLineToRelative(1.43f)
                curveToRelative(0.32f, 0f, 0.6f, -0.28f, 0.6f, -0.6f)
                verticalLineToRelative(-1.58f)
                lineToRelative(1.04f, -0.34f)
                curveToRelative(0.4f, -0.13f, 0.8f, -0.3f, 1.2f, -0.5f)
                lineToRelative(0.97f, -0.5f)
                lineToRelative(1.11f, 1.12f)
                curveToRelative(0.24f, 0.24f, 0.62f, 0.23f, 0.85f, 0f)
                lineToRelative(1.01f, -1f)
                curveToRelative(0.23f, -0.24f, 0.23f, -0.62f, 0f, -0.85f)
                lineToRelative(-1.12f, -1.12f)
                lineToRelative(0.5f, -0.98f)
                curveToRelative(0.2f, -0.38f, 0.37f, -0.78f, 0.5f, -1.2f)
                lineToRelative(0.34f, -1.04f)
                horizontalLineToRelative(1.58f)
                curveToRelative(0.32f, 0f, 0.6f, -0.27f, 0.6f, -0.6f)
                verticalLineTo(11.3f)
                curveToRelative(0f, -0.33f, -0.28f, -0.6f, -0.6f, -0.6f)
                horizontalLineToRelative(-1.58f)
                lineToRelative(-0.34f, -1.05f)
                curveToRelative(-0.13f, -0.4f, -0.3f, -0.8f, -0.5f, -1.2f)
                lineToRelative(-0.5f, -0.97f)
                lineToRelative(1.12f, -1.11f)
                curveToRelative(0.23f, -0.24f, 0.23f, -0.62f, 0f, -0.85f)
                lineTo(18.5f, 4.5f)
                curveToRelative(-0.23f, -0.23f, -0.61f, -0.23f, -0.84f, 0f)
                lineToRelative(-1.12f, 1.12f)
                lineToRelative(-0.98f, -0.5f)
                curveToRelative(-0.38f, -0.2f, -0.78f, -0.37f, -1.2f, -0.5f)
                lineToRelative(-1.04f, -0.34f)
                verticalLineTo(2.71f)
                curveToRelative(0f, -0.33f, -0.27f, -0.6f, -0.6f, -0.6f)
                horizontalLineToRelative(-1.43f)
                curveToRelative(-0.32f, 0f, -0.6f, 0.27f, -0.6f, 0.6f)
                verticalLineToRelative(1.57f)
                lineTo(9.65f, 4.62f)
                curveToRelative(-0.4f, 0.13f, -0.8f, 0.3f, -1.2f, 0.5f)
                lineToRelative(-0.97f, 0.5f)
                lineTo(6.36f, 4.5f)
                curveToRelative(-0.24f, -0.23f, -0.62f, -0.23f, -0.85f, 0f)
                lineTo(4.5f, 5.5f)
                curveToRelative(-0.23f, 0.23f, -0.23f, 0.61f, 0f, 0.85f)
                lineToRelative(1.12f, 1.11f)
                lineToRelative(-0.5f, 0.98f)
                curveToRelative(-0.2f, 0.38f, -0.37f, 0.78f, -0.5f, 1.2f)
                lineToRelative(-0.34f, 1.04f)
                horizontalLineTo(2.7f)
                curveToRelative(-0.32f, 0f, -0.6f, 0.27f, -0.6f, 0.6f)
                verticalLineToRelative(1.43f)
                curveToRelative(0f, 0.32f, 0.28f, 0.6f, 0.6f, 0.6f)
                horizontalLineToRelative(1.58f)
                lineToRelative(0.34f, 1.04f)
                curveToRelative(0.13f, 0.4f, 0.3f, 0.8f, 0.5f, 1.2f)
                lineToRelative(0.5f, 0.97f)
                lineToRelative(-1.12f, 1.11f)
                curveToRelative(-0.23f, 0.24f, -0.23f, 0.62f, 0f, 0.85f)
                lineTo(5.5f, 19.5f)
                curveToRelative(0.23f, 0.23f, 0.61f, 0.24f, 0.84f, 0f)
                lineToRelative(1.12f, -1.12f)
                lineToRelative(0.98f, 0.5f)
                curveToRelative(0.38f, 0.2f, 0.78f, 0.37f, 1.2f, 0.5f)
                lineToRelative(1.04f, 0.34f)
                close()
                moveToRelative(-1.5f, 1.1f)
                curveToRelative(-0.5f, -0.16f, -0.97f, -0.36f, -1.43f, -0.6f)
                lineToRelative(-0.34f, 0.34f)
                curveToRelative(-0.83f, 0.83f, -2.16f, 0.8f, -2.97f, 0f)
                lineToRelative(-1.01f, -1f)
                curveToRelative(-0.8f, -0.82f, -0.83f, -2.15f, 0f, -2.98f)
                lineToRelative(0.34f, -0.34f)
                curveToRelative(-0.24f, -0.46f, -0.43f, -0.93f, -0.6f, -1.43f)
                horizontalLineTo(2.7f)
                curveToRelative(-1.15f, 0f, -2.1f, -0.94f, -2.1f, -2.1f)
                verticalLineTo(11.3f)
                curveToRelative(0f, -1.16f, 0.95f, -2.1f, 2.1f, -2.1f)
                horizontalLineTo(3.2f)
                curveToRelative(0.16f, -0.5f, 0.35f, -0.97f, 0.6f, -1.43f)
                lineTo(3.43f, 7.42f)
                curveToRelative(-0.83f, -0.83f, -0.8f, -2.16f, 0f, -2.97f)
                lineToRelative(1f, -1.01f)
                curveToRelative(0.82f, -0.81f, 2.15f, -0.83f, 2.98f, 0f)
                lineToRelative(0.34f, 0.34f)
                curveToRelative(0.46f, -0.24f, 0.94f, -0.43f, 1.43f, -0.6f)
                verticalLineTo(2.72f)
                curveToRelative(0f, -1.16f, 0.94f, -2.1f, 2.1f, -2.1f)
                horizontalLineToRelative(1.43f)
                curveToRelative(1.15f, 0f, 2.1f, 0.94f, 2.1f, 2.1f)
                verticalLineToRelative(0.48f)
                curveToRelative(0.48f, 0.16f, 0.96f, 0.35f, 1.42f, 0.6f)
                lineToRelative(0.34f, -0.35f)
                curveToRelative(0.83f, -0.83f, 2.16f, -0.8f, 2.97f, 0f)
                lineToRelative(1.01f, 1.01f)
                curveToRelative(0.8f, 0.8f, 0.83f, 2.14f, 0f, 2.97f)
                lineToRelative(-0.34f, 0.34f)
                curveToRelative(0.24f, 0.46f, 0.43f, 0.94f, 0.6f, 1.43f)
                horizontalLineToRelative(0.48f)
                curveToRelative(1.15f, 0f, 2.1f, 0.94f, 2.1f, 2.1f)
                verticalLineToRelative(1.43f)
                curveToRelative(0f, 1.15f, -0.95f, 2.1f, -2.1f, 2.1f)
                horizontalLineTo(20.8f)
                curveToRelative(-0.16f, 0.49f, -0.35f, 0.96f, -0.6f, 1.42f)
                lineToRelative(0.35f, 0.34f)
                curveToRelative(0.83f, 0.83f, 0.8f, 2.16f, 0f, 2.97f)
                lineToRelative(-1f, 1.01f)
                curveToRelative(-0.82f, 0.81f, -2.15f, 0.83f, -2.98f, 0f)
                lineToRelative(-0.34f, -0.34f)
                curveToRelative(-0.46f, 0.24f, -0.94f, 0.44f, -1.43f, 0.6f)
                verticalLineToRelative(0.48f)
                curveToRelative(0f, 1.15f, -0.94f, 2.1f, -2.1f, 2.1f)
                horizontalLineToRelative(-1.43f)
                curveToRelative(-1.15f, 0f, -2.1f, -0.95f, -2.1f, -2.1f)
                verticalLineTo(20.8f)
                close()
            }
        }

        return _settings!!
    }

@Suppress("ObjectPropertyName")
private var _settings: ImageVector? = null

@Preview
@Composable
private fun SatsIconSettingsPreview() {
    Icon(SatsIcons.Settings, contentDescription = null)
}
