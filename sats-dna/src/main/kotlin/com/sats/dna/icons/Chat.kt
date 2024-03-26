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
val SatsIcons.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }

        _chat = materialIcon(name = "Chat") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 9.23f)
                curveTo(3f, 5.68f, 6.4f, 3f, 10.34f, 3f)
                curveToRelative(3.93f, 0f, 7.34f, 2.68f, 7.34f, 6.23f)
                curveToRelative(0f, 3.55f, -3.41f, 6.23f, -7.34f, 6.23f)
                curveToRelative(-0.9f, 0f, -1.77f, -0.14f, -2.57f, -0.4f)
                lineToRelative(-2.55f, 1.92f)
                curveToRelative(-0.21f, 0.16f, -0.5f, 0.19f, -0.73f, 0.07f)
                curveToRelative(-0.23f, -0.12f, -0.38f, -0.36f, -0.38f, -0.62f)
                verticalLineToRelative(-3.9f)
                curveTo(3.4f, 11.57f, 3f, 10.44f, 3f, 9.22f)
                close()
                moveToRelative(7.34f, -4.85f)
                curveToRelative(-3.41f, 0f, -5.96f, 2.29f, -5.96f, 4.85f)
                curveToRelative(0f, 0.96f, 0.35f, 1.86f, 0.96f, 2.63f)
                curveToRelative(0.1f, 0.12f, 0.15f, 0.27f, 0.15f, 0.43f)
                verticalLineToRelative(2.76f)
                lineToRelative(1.74f, -1.31f)
                curveToRelative(0.2f, -0.14f, 0.44f, -0.18f, 0.66f, -0.1f)
                curveToRelative(0.75f, 0.28f, 1.57f, 0.44f, 2.45f, 0.44f)
                curveToRelative(3.41f, 0f, 5.95f, -2.29f, 5.95f, -4.85f)
                curveToRelative(0f, -2.56f, -2.54f, -4.85f, -5.95f, -4.85f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(19.03f, 9.78f)
                curveToRelative(0.31f, -0.22f, 0.74f, -0.14f, 0.96f, 0.17f)
                curveToRelative(0.64f, 0.92f, 1.01f, 2f, 1.01f, 3.16f)
                curveToRelative(0f, 1.22f, -0.41f, 2.34f, -1.1f, 3.3f)
                verticalLineToRelative(3.9f)
                curveToRelative(0f, 0.25f, -0.15f, 0.49f, -0.37f, 0.6f)
                curveToRelative(-0.23f, 0.13f, -0.5f, 0.12f, -0.71f, -0.03f)
                lineTo(16f, 19.01f)
                curveToRelative(-0.73f, 0.21f, -1.52f, 0.33f, -2.34f, 0.33f)
                curveToRelative(-2.01f, 0f, -3.85f, -0.69f, -5.19f, -1.82f)
                curveToRelative(-0.29f, -0.25f, -0.33f, -0.69f, -0.08f, -0.98f)
                curveToRelative(0.25f, -0.29f, 0.69f, -0.33f, 0.98f, -0.08f)
                curveToRelative(1.07f, 0.91f, 2.59f, 1.5f, 4.3f, 1.5f)
                curveToRelative(0.78f, 0f, 1.54f, -0.14f, 2.23f, -0.36f)
                curveToRelative(0.2f, -0.07f, 0.42f, -0.04f, 0.6f, 0.08f)
                lineToRelative(2f, 1.34f)
                verticalLineToRelative(-2.85f)
                curveToRelative(0f, -0.16f, 0.06f, -0.31f, 0.16f, -0.43f)
                curveToRelative(0.61f, -0.77f, 0.96f, -1.67f, 0.96f, -2.63f)
                curveToRelative(0f, -0.86f, -0.28f, -1.66f, -0.77f, -2.37f)
                curveToRelative(-0.21f, -0.32f, -0.14f, -0.75f, 0.18f, -0.96f)
                close()
            }
        }

        return _chat!!
    }

@Suppress("ObjectPropertyName")
private var _chat: ImageVector? = null

@Preview
@Composable
private fun SatsIconChatPreview() {
    Icon(SatsIcons.Chat, contentDescription = null)
}
