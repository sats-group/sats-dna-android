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
val SatsIcons.MartialArts: ImageVector
    get() {
        if (_martialArts != null) {
            return _martialArts!!
        }

        _martialArts = materialIcon(name = "MartialArts") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(7.8f, 5.4f)
                curveToRelative(1.26f, 0f, 2.28f, -0.98f, 2.28f, -2.2f)
                curveTo(10.08f, 1.98f, 9.06f, 1f, 7.8f, 1f)
                curveTo(6.54f, 1f, 5.52f, 1.98f, 5.52f, 3.2f)
                curveToRelative(0f, 1.22f, 1.02f, 2.2f, 2.28f, 2.2f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(22.98f, 9.6f)
                curveToRelative(-0.05f, -0.28f, -0.22f, -0.54f, -0.47f, -0.7f)
                curveToRelative(-0.25f, -0.17f, -0.56f, -0.23f, -0.85f, -0.18f)
                lineToRelative(-4.18f, 0.73f)
                curveToRelative(-0.16f, 0.03f, -0.3f, 0.09f, -0.43f, 0.17f)
                lineToRelative(-2.9f, 1.86f)
                lineToRelative(-2.4f, -3.25f)
                lineToRelative(2.27f, -0.27f)
                curveToRelative(0.16f, -0.02f, 0.32f, -0.07f, 0.46f, -0.16f)
                curveToRelative(0.14f, -0.08f, 0.26f, -0.2f, 0.35f, -0.32f)
                lineToRelative(1.6f, -2.32f)
                curveToRelative(0.14f, -0.2f, 0.2f, -0.45f, 0.15f, -0.7f)
                curveToRelative(-0.04f, -0.23f, -0.18f, -0.45f, -0.38f, -0.6f)
                curveToRelative(-0.2f, -0.15f, -0.46f, -0.21f, -0.71f, -0.19f)
                curveTo(15.24f, 3.7f, 15.01f, 3.82f, 14.84f, 4f)
                lineToRelative(-1.62f, 1.84f)
                lineToRelative(-2.52f, 0.3f)
                curveToRelative(-0.15f, 0.02f, -0.29f, 0.06f, -0.41f, 0.13f)
                lineTo(6.87f, 8.11f)
                curveTo(6.73f, 8.18f, 6.6f, 8.28f, 6.5f, 8.4f)
                lineToRelative(-2.28f, 2.93f)
                curveToRelative(-0.14f, 0.17f, -0.21f, 0.38f, -0.23f, 0.6f)
                curveToRelative(-0.01f, 0.2f, 0.04f, 0.42f, 0.15f, 0.6f)
                lineToRelative(1.59f, 2.69f)
                curveToRelative(0.13f, 0.21f, 0.34f, 0.37f, 0.58f, 0.44f)
                curveToRelative(0.24f, 0.07f, 0.5f, 0.04f, 0.73f, -0.07f)
                curveToRelative(0.23f, -0.1f, 0.4f, -0.3f, 0.5f, -0.52f)
                curveToRelative(0.08f, -0.23f, 0.07f, -0.49f, -0.02f, -0.71f)
                lineTo(6.5f, 12.08f)
                lineToRelative(1.28f, -1.65f)
                lineToRelative(2.68f, 4.14f)
                verticalLineToRelative(7.33f)
                curveToRelative(0f, 0.3f, 0.12f, 0.57f, 0.33f, 0.78f)
                curveToRelative(0.22f, 0.2f, 0.5f, 0.32f, 0.8f, 0.32f)
                curveToRelative(0.31f, 0f, 0.6f, -0.12f, 0.81f, -0.32f)
                curveToRelative(0.22f, -0.2f, 0.34f, -0.49f, 0.34f, -0.78f)
                verticalLineTo(15f)
                lineToRelative(5.38f, -3.43f)
                lineToRelative(3.94f, -0.69f)
                curveToRelative(0.15f, -0.02f, 0.3f, -0.08f, 0.42f, -0.16f)
                curveToRelative(0.12f, -0.07f, 0.23f, -0.18f, 0.32f, -0.3f)
                curveToRelative(0.08f, -0.11f, 0.14f, -0.25f, 0.17f, -0.39f)
                curveToRelative(0.04f, -0.14f, 0.04f, -0.28f, 0.01f, -0.43f)
                close()
            }
        }

        return _martialArts!!
    }

@Suppress("ObjectPropertyName")
private var _martialArts: ImageVector? = null

@Preview
@Composable
private fun SatsIconMartialArtsPreview() {
    Icon(SatsIcons.MartialArts, contentDescription = null)
}
