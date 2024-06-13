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
val SatsIcons.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }

        _fire = materialIcon(name = "Fire") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(11.07f, 2.07f)
                curveToRelative(0.2f, -0.1f, 0.43f, -0.1f, 0.62f, 0.03f)
                curveToRelative(2f, 1.25f, 2.73f, 3.3f, 2.97f, 4.96f)
                curveToRelative(0.12f, 0.83f, 0.13f, 1.59f, 0.1f, 2.13f)
                curveToRelative(-0.01f, 0.28f, -0.04f, 0.5f, -0.05f, 0.66f)
                lineToRelative(-0.03f, 0.18f)
                verticalLineToRelative(0.05f)
                verticalLineToRelative(0.02f)
                horizontalLineToRelative(-0.01f)
                lineTo(14.05f, 10f)
                lineToRelative(0.62f, 0.1f)
                curveToRelative(-0.06f, 0.35f, -0.38f, 0.57f, -0.72f, 0.52f)
                curveToRelative(-0.34f, -0.06f, -0.57f, -0.38f, -0.51f, -0.72f)
                verticalLineTo(9.89f)
                verticalLineTo(9.87f)
                verticalLineTo(9.85f)
                lineToRelative(0.02f, -0.15f)
                curveToRelative(0.02f, -0.13f, 0.04f, -0.33f, 0.05f, -0.57f)
                curveToRelative(0.03f, -0.49f, 0.02f, -1.16f, -0.08f, -1.89f)
                curveToRelative(-0.18f, -1.2f, -0.62f, -2.49f, -1.6f, -3.46f)
                curveToRelative(-0.14f, 0.58f, -0.34f, 1.14f, -0.62f, 1.66f)
                curveToRelative(-0.44f, 0.86f, -1.07f, 1.62f, -1.82f, 2.22f)
                curveToRelative(-0.74f, 0.65f, -1.8f, 1.7f, -2.65f, 2.95f)
                curveToRelative(-0.87f, 1.27f, -1.5f, 2.7f, -1.49f, 4.13f)
                curveToRelative(0f, 1.26f, 0.33f, 2.5f, 0.99f, 3.57f)
                curveToRelative(0.5f, 0.82f, 1.16f, 1.52f, 1.95f, 2.05f)
                curveToRelative(0.26f, -1.17f, 0.85f, -2.25f, 1.71f, -3.1f)
                curveToRelative(0.77f, -0.77f, 1.25f, -1.77f, 1.36f, -2.85f)
                curveToRelative(0.02f, -0.2f, 0.13f, -0.38f, 0.3f, -0.48f)
                curveToRelative(0.18f, -0.1f, 0.4f, -0.1f, 0.58f, -0.02f)
                curveToRelative(1.42f, 0.64f, 2.38f, 2.1f, 2.98f, 3.5f)
                curveToRelative(0.42f, 1f, 0.7f, 2.03f, 0.82f, 2.9f)
                curveToRelative(0.7f, -0.46f, 1.32f, -1.06f, 1.79f, -1.76f)
                curveToRelative(0.64f, -0.96f, 1f, -2.08f, 1.05f, -3.23f)
                curveToRelative(0.08f, -2.46f, -0.75f, -4.85f, -2.32f, -6.74f)
                curveToRelative(-0.22f, -0.27f, -0.18f, -0.66f, 0.09f, -0.88f)
                curveToRelative(0.26f, -0.22f, 0.66f, -0.18f, 0.88f, 0.08f)
                curveToRelative(1.76f, 2.12f, 2.69f, 4.82f, 2.6f, 7.58f)
                curveToRelative(-0.05f, 1.39f, -0.5f, 2.73f, -1.26f, 3.88f)
                curveToRelative(-0.77f, 1.15f, -1.85f, 2.07f, -3.1f, 2.65f)
                curveToRelative(-0.2f, 0.09f, -0.43f, 0.07f, -0.6f, -0.04f)
                curveToRelative(-0.19f, -0.12f, -0.3f, -0.32f, -0.3f, -0.53f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -0.77f, -0.25f, -2.12f, -0.8f, -3.41f)
                curveToRelative(-0.42f, -0.98f, -0.98f, -1.85f, -1.65f, -2.4f)
                curveToRelative(-0.27f, 1f, -0.8f, 1.9f, -1.54f, 2.65f)
                curveToRelative(-0.88f, 0.87f, -1.4f, 2.03f, -1.48f, 3.26f)
                curveToRelative(-0.02f, 0.21f, -0.14f, 0.4f, -0.32f, 0.5f)
                curveToRelative(-0.18f, 0.11f, -0.4f, 0.12f, -0.59f, 0.02f)
                curveToRelative(-1.33f, -0.67f, -2.44f, -1.7f, -3.22f, -2.97f)
                curveTo(4.39f, 17.7f, 3.99f, 16.23f, 4f, 14.74f)
                curveToRelative(-0.01f, -1.78f, 0.77f, -3.46f, 1.7f, -4.83f)
                curveToRelative(0.95f, -1.38f, 2.09f, -2.5f, 2.87f, -3.2f)
                lineTo(8.6f, 6.69f)
                curveToRelative(0.62f, -0.5f, 1.14f, -1.12f, 1.5f, -1.82f)
                curveToRelative(0.37f, -0.71f, 0.59f, -1.49f, 0.64f, -2.28f)
                curveToRelative(0.01f, -0.22f, 0.14f, -0.42f, 0.33f, -0.52f)
                close()
            }
        }

        return _fire!!
    }

@Suppress("ObjectPropertyName")
private var _fire: ImageVector? = null

@Preview
@Composable
private fun SatsIconFirePreview() {
    Icon(SatsIcons.Fire, contentDescription = null)
}
