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
val SatsIcons.Mediataion: ImageVector
    get() {
        if (_mediataion != null) {
            return _mediataion!!
        }

        _mediataion = materialIcon(name = "Mediataion") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(23.25f, 22.5f)
                horizontalLineTo(0.75f)
                moveToRelative(15.75f, -3.03f)
                lineToRelative(1.2f, -0.38f)
                curveToRelative(0.3f, -0.1f, 0.57f, -0.3f, 0.76f, -0.55f)
                curveToRelative(0.19f, -0.26f, 0.29f, -0.58f, 0.29f, -0.9f)
                curveToRelative(0f, -0.4f, -0.16f, -0.79f, -0.44f, -1.07f)
                curveToRelative(-0.29f, -0.29f, -0.67f, -0.44f, -1.08f, -0.45f)
                horizontalLineTo(15f)
                verticalLineToRelative(-5.25f)
                lineToRelative(2.25f, 1.97f)
                curveToRelative(0.19f, 0.17f, 0.42f, 0.27f, 0.67f, 0.28f)
                curveToRelative(0.25f, 0.02f, 0.5f, -0.05f, 0.7f, -0.18f)
                lineToRelative(2.36f, -1.58f)
                curveToRelative(0.11f, -0.07f, 0.2f, -0.16f, 0.28f, -0.27f)
                curveToRelative(0.07f, -0.1f, 0.12f, -0.23f, 0.15f, -0.36f)
                curveToRelative(0.02f, -0.13f, 0.02f, -0.26f, 0f, -0.39f)
                curveToRelative(-0.03f, -0.13f, -0.08f, -0.25f, -0.15f, -0.36f)
                curveToRelative(-0.14f, -0.2f, -0.34f, -0.34f, -0.57f, -0.4f)
                curveToRelative(-0.24f, -0.07f, -0.49f, -0.04f, -0.7f, 0.06f)
                lineToRelative(-1.9f, 0.94f)
                lineToRelative(-2.72f, -2.42f)
                curveToRelative(-0.2f, -0.18f, -0.47f, -0.29f, -0.74f, -0.29f)
                horizontalLineTo(9.37f)
                curveToRelative(-0.27f, 0f, -0.54f, 0.1f, -0.74f, 0.29f)
                lineTo(5.9f, 10.58f)
                lineTo(4.01f, 9.64f)
                curveToRelative(-0.21f, -0.1f, -0.46f, -0.13f, -0.7f, -0.07f)
                curveToRelative(-0.23f, 0.07f, -0.43f, 0.21f, -0.57f, 0.41f)
                curveToRelative(-0.07f, 0.11f, -0.12f, 0.23f, -0.15f, 0.36f)
                curveToRelative(-0.02f, 0.13f, -0.02f, 0.26f, 0f, 0.4f)
                curveToRelative(0.03f, 0.12f, 0.08f, 0.24f, 0.15f, 0.35f)
                curveToRelative(0.08f, 0.1f, 0.17f, 0.2f, 0.28f, 0.28f)
                lineToRelative(2.36f, 1.57f)
                curveToRelative(0.2f, 0.14f, 0.45f, 0.2f, 0.7f, 0.18f)
                curveToRelative(0.25f, -0.01f, 0.48f, -0.11f, 0.67f, -0.28f)
                lineTo(9f, 10.88f)
                verticalLineToRelative(5.24f)
                horizontalLineTo(6.73f)
                curveToRelative(-0.4f, 0f, -0.77f, 0.16f, -1.05f, 0.44f)
                curveToRelative(-0.27f, 0.28f, -0.43f, 0.65f, -0.43f, 1.05f)
                curveToRelative(0f, 0.32f, 0.1f, 0.64f, 0.3f, 0.9f)
                curveToRelative(0.2f, 0.26f, 0.49f, 0.45f, 0.8f, 0.53f)
                lineToRelative(6.4f, 1.67f)
                curveToRelative(0.3f, 0.08f, 0.63f, 0.04f, 0.9f, -0.12f)
                curveToRelative(0.28f, -0.15f, 0.5f, -0.4f, 0.6f, -0.7f)
                curveToRelative(0.1f, -0.3f, 0.08f, -0.64f, -0.06f, -0.93f)
                curveToRelative(-0.14f, -0.3f, -0.39f, -0.52f, -0.7f, -0.63f)
                lineToRelative(-1.87f, -0.7f)
                moveTo(9.75f, 3.74f)
                curveTo(9.75f, 4.99f, 10.75f, 6f, 12f, 6f)
                curveToRelative(1.24f, 0f, 2.25f, -1f, 2.25f, -2.25f)
                curveToRelative(0f, -1.24f, -1f, -2.25f, -2.25f, -2.25f)
                curveToRelative(-1.24f, 0f, -2.25f, 1f, -2.25f, 2.25f)
                close()
            }
        }

        return _mediataion!!
    }

@Suppress("ObjectPropertyName")
private var _mediataion: ImageVector? = null

@Preview
@Composable
private fun SatsIconMediataionPreview() {
    Icon(SatsIcons.Mediataion, contentDescription = null)
}
