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
val SatsIcons.Notifications: ImageVector
    get() {
        if (_notifications != null) {
            return _notifications!!
        }

        _notifications = materialIcon(name = "Notifications") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 3.24f)
                curveToRelative(-3.07f, 0f, -5.54f, 2.45f, -5.54f, 5.45f)
                verticalLineToRelative(2.76f)
                curveToRelative(0f, 2.4f, -1.07f, 4.67f, -2.92f, 6.21f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.06f, 0.05f, -0.09f, 0.11f, -0.09f, 0.18f)
                curveToRelative(0f, 0.12f, 0.1f, 0.24f, 0.26f, 0.24f)
                horizontalLineToRelative(16.6f)
                curveToRelative(0.15f, 0f, 0.26f, -0.12f, 0.26f, -0.24f)
                curveToRelative(0f, -0.07f, -0.03f, -0.13f, -0.09f, -0.18f)
                curveToRelative(-1.86f, -1.55f, -2.93f, -3.83f, -2.93f, -6.22f)
                verticalLineTo(8.69f)
                curveToRelative(0f, -3f, -2.47f, -5.45f, -5.54f, -5.45f)
                close()
                moveTo(4.96f, 8.7f)
                curveToRelative(0f, -3.85f, 3.16f, -6.95f, 7.04f, -6.95f)
                reflectiveCurveToRelative(7.04f, 3.1f, 7.04f, 6.95f)
                verticalLineToRelative(2.76f)
                curveToRelative(0f, 1.95f, 0.87f, 3.8f, 2.39f, 5.07f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.37f, 0.32f, 0.62f, 0.79f, 0.62f, 1.33f)
                curveToRelative(0f, 0.97f, -0.8f, 1.74f, -1.76f, 1.74f)
                horizontalLineTo(3.7f)
                curveToRelative(-0.96f, 0f, -1.76f, -0.77f, -1.76f, -1.74f)
                curveToRelative(0f, -0.54f, 0.25f, -1.01f, 0.62f, -1.32f)
                verticalLineToRelative(-0.01f)
                curveToRelative(1.53f, -1.27f, 2.4f, -3.12f, 2.4f, -5.07f)
                verticalLineTo(8.69f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(9.17f, 18.56f)
                curveToRelative(0.41f, 0f, 0.75f, 0.33f, 0.75f, 0.75f)
                curveToRelative(0f, 1f, 0.89f, 1.9f, 2.08f, 1.9f)
                curveToRelative(1.2f, 0f, 2.08f, -0.9f, 2.08f, -1.9f)
                curveToRelative(0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                curveToRelative(0.42f, 0f, 0.75f, 0.33f, 0.75f, 0.75f)
                curveToRelative(0f, 1.92f, -1.65f, 3.4f, -3.58f, 3.4f)
                curveToRelative(-1.93f, 0f, -3.58f, -1.48f, -3.58f, -3.4f)
                curveToRelative(0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }

        return _notifications!!
    }

@Suppress("ObjectPropertyName")
private var _notifications: ImageVector? = null

@Preview
@Composable
private fun SatsIconNotificationsPreview() {
    Icon(SatsIcons.Notifications, contentDescription = null)
}
