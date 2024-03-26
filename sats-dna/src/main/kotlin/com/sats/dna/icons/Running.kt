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
val SatsIcons.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }

        _running = materialIcon(name = "Running") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(13.33f, 14.04f)
                lineToRelative(2.7f, -3.55f)
                lineToRelative(1.75f, 3.28f)
                curveToRelative(0.12f, 0.22f, 0.3f, 0.4f, 0.53f, 0.5f)
                curveToRelative(0.23f, 0.1f, 0.49f, 0.13f, 0.73f, 0.07f)
                lineToRelative(2.83f, -0.73f)
                curveToRelative(0.13f, -0.03f, 0.25f, -0.09f, 0.36f, -0.17f)
                curveToRelative(0.1f, -0.08f, 0.19f, -0.18f, 0.26f, -0.3f)
                curveToRelative(0.07f, -0.1f, 0.11f, -0.24f, 0.13f, -0.37f)
                curveToRelative(0.02f, -0.13f, 0.01f, -0.26f, -0.02f, -0.4f)
                curveToRelative(-0.06f, -0.24f, -0.2f, -0.45f, -0.4f, -0.59f)
                curveToRelative(-0.2f, -0.14f, -0.45f, -0.2f, -0.7f, -0.17f)
                lineToRelative(-2.16f, 0.28f)
                lineToRelative(-1.84f, -3.43f)
                curveToRelative(-0.08f, -0.15f, -0.18f, -0.27f, -0.31f, -0.37f)
                lineToRelative(-3f, -2.3f)
                curveToRelative(-0.11f, -0.08f, -0.23f, -0.15f, -0.37f, -0.18f)
                lineTo(8.57f, 4.07f)
                curveTo(8.35f, 4.01f, 8.11f, 4.02f, 7.9f, 4.1f)
                curveTo(7.67f, 4.17f, 7.5f, 4.32f, 7.35f, 4.51f)
                lineToRelative(-1.96f, 2.8f)
                curveTo(5.24f, 7.52f, 5.2f, 7.8f, 5.22f, 8.06f)
                curveToRelative(0.05f, 0.26f, 0.2f, 0.5f, 0.4f, 0.65f)
                curveToRelative(0.2f, 0.15f, 0.45f, 0.21f, 0.69f, 0.18f)
                curveToRelative(0.24f, -0.02f, 0.46f, -0.14f, 0.63f, -0.33f)
                lineToRelative(1.78f, -2.05f)
                lineToRelative(3.4f, 0.99f)
                lineToRelative(-3.33f, 3.8f)
                curveToRelative(-0.24f, 0.26f, -0.4f, 0.58f, -0.5f, 0.93f)
                curveToRelative(-0.09f, 0.35f, -0.1f, 0.71f, -0.03f, 1.06f)
                curveToRelative(0.07f, 0.35f, 0.22f, 0.68f, 0.44f, 0.96f)
                curveToRelative(0.22f, 0.29f, 0.5f, 0.51f, 0.81f, 0.66f)
                lineToRelative(3.02f, 1.44f)
                lineToRelative(-2.51f, 3.42f)
                curveToRelative(-0.17f, 0.22f, -0.26f, 0.5f, -0.25f, 0.77f)
                curveToRelative(0.01f, 0.28f, 0.12f, 0.55f, 0.3f, 0.75f)
                curveToRelative(0.12f, 0.12f, 0.26f, 0.22f, 0.4f, 0.28f)
                curveToRelative(0.16f, 0.06f, 0.32f, 0.08f, 0.49f, 0.07f)
                curveToRelative(0.16f, 0f, 0.32f, -0.05f, 0.46f, -0.13f)
                curveToRelative(0.15f, -0.08f, 0.27f, -0.19f, 0.37f, -0.32f)
                lineToRelative(3.37f, -4.6f)
                curveToRelative(0.1f, -0.14f, 0.17f, -0.3f, 0.2f, -0.46f)
                curveToRelative(0.04f, -0.17f, 0.04f, -0.34f, 0f, -0.5f)
                curveToRelative(-0.05f, -0.17f, -0.13f, -0.32f, -0.24f, -0.45f)
                curveToRelative(-0.1f, -0.13f, -0.24f, -0.24f, -0.38f, -0.32f)
                lineToRelative(-3.08f, -1.8f)
                moveToRelative(-3.4f, 3.32f)
                lineTo(3.5f, 22.02f)
                curveToRelative(-0.1f, 0.11f, -0.22f, 0.2f, -0.35f, 0.27f)
                curveTo(3f, 22.36f, 2.86f, 22.4f, 2.7f, 22.41f)
                curveToRelative(-0.14f, 0f, -0.3f, -0.01f, -0.43f, -0.06f)
                curveTo(2.14f, 22.3f, 2f, 22.23f, 1.9f, 22.13f)
                curveToRelative(-0.11f, -0.1f, -0.2f, -0.22f, -0.27f, -0.36f)
                curveToRelative(-0.07f, -0.13f, -0.1f, -0.28f, -0.11f, -0.43f)
                curveToRelative(-0.01f, -0.15f, 0f, -0.3f, 0.05f, -0.45f)
                curveToRelative(0.05f, -0.14f, 0.12f, -0.27f, 0.22f, -0.38f)
                lineToRelative(4.92f, -5.75f)
                moveTo(20.64f, 4.03f)
                curveToRelative(0f, 1.27f, -1f, 2.3f, -2.25f, 2.3f)
                curveToRelative(-1.24f, 0f, -2.25f, -1.03f, -2.25f, -2.3f)
                curveToRelative(0f, -1.27f, 1f, -2.3f, 2.25f, -2.3f)
                curveToRelative(1.24f, 0f, 2.25f, 1.03f, 2.25f, 2.3f)
                close()
            }
        }

        return _running!!
    }

@Suppress("ObjectPropertyName")
private var _running: ImageVector? = null

@Preview
@Composable
private fun SatsIconRunningPreview() {
    Icon(SatsIcons.Running, contentDescription = null)
}
