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
val SatsIcons.Join: ImageVector
    get() {
        if (_join != null) {
            return _join!!
        }

        _join = materialIcon(name = "Join") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(14.31f, 16.94f)
                lineToRelative(-3.2f, -0.91f)
                curveToRelative(-0.13f, -0.04f, -0.24f, -0.1f, -0.32f, -0.2f)
                curveToRelative(-0.08f, -0.1f, -0.13f, -0.21f, -0.15f, -0.34f)
                lineToRelative(-0.27f, -1.9f)
                curveToRelative(0.68f, -0.3f, 1.26f, -0.8f, 1.66f, -1.43f)
                curveToRelative(0.4f, -0.63f, 0.62f, -1.36f, 0.62f, -2.11f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0.02f, -1.03f, -0.37f, -2.03f, -1.07f, -2.79f)
                curveTo(10.87f, 4.7f, 9.9f, 4.25f, 8.86f, 4.2f)
                curveTo(8.34f, 4.17f, 7.82f, 4.26f, 7.33f, 4.45f)
                reflectiveCurveTo(6.4f, 4.93f, 6.03f, 5.3f)
                curveToRelative(-0.38f, 0.36f, -0.68f, 0.8f, -0.88f, 1.28f)
                curveToRelative(-0.2f, 0.48f, -0.31f, 1f, -0.31f, 1.53f)
                verticalLineToRelative(1.95f)
                curveToRelative(0f, 0.75f, 0.21f, 1.48f, 0.62f, 2.1f)
                curveToRelative(0.4f, 0.64f, 0.98f, 1.14f, 1.66f, 1.45f)
                lineToRelative(-0.27f, 1.89f)
                curveToRelative(-0.02f, 0.12f, -0.07f, 0.24f, -0.15f, 0.34f)
                curveToRelative(-0.09f, 0.09f, -0.2f, 0.16f, -0.31f, 0.2f)
                lineToRelative(-3.21f, 0.9f)
                curveTo(2.9f, 17.01f, 2.67f, 17.18f, 2.5f, 17.4f)
                curveToRelative(-0.17f, 0.23f, -0.27f, 0.5f, -0.27f, 0.79f)
                verticalLineToRelative(2.43f)
                curveToRelative(0f, 0.27f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(12.02f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                verticalLineToRelative(-2.43f)
                curveToRelative(0f, -0.28f, -0.09f, -0.56f, -0.26f, -0.78f)
                curveToRelative(-0.17f, -0.23f, -0.4f, -0.4f, -0.68f, -0.47f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(17.86f, 21.11f)
                horizontalLineToRelative(3.4f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.69f)
                curveToRelative(0f, -0.29f, -0.1f, -0.57f, -0.27f, -0.8f)
                curveToRelative(-0.18f, -0.23f, -0.43f, -0.39f, -0.71f, -0.46f)
                lineToRelative(-3.8f, -0.95f)
                curveToRelative(-0.12f, -0.03f, -0.24f, -0.1f, -0.32f, -0.2f)
                curveToRelative(-0.1f, -0.09f, -0.15f, -0.21f, -0.17f, -0.34f)
                lineToRelative(-0.26f, -1.87f)
                curveToRelative(0.68f, -0.32f, 1.25f, -0.82f, 1.66f, -1.44f)
                curveToRelative(0.4f, -0.63f, 0.62f, -1.37f, 0.62f, -2.11f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0.02f, -1.03f, -0.37f, -2.03f, -1.08f, -2.79f)
                curveToRelative(-0.7f, -0.76f, -1.67f, -1.21f, -2.7f, -1.27f)
                curveTo(14f, 2.86f, 13.27f, 3.04f, 12.64f, 3.4f)
            }
        }

        return _join!!
    }

@Suppress("ObjectPropertyName")
private var _join: ImageVector? = null

@Preview
@Composable
private fun SatsIconJoinPreview() {
    Icon(SatsIcons.Join, contentDescription = null)
}
