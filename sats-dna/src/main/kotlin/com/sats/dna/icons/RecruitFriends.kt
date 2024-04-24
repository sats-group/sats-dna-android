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
val SatsIcons.RecruitFriends: ImageVector
    get() {
        if (_recruitFriends != null) {
            return _recruitFriends!!
        }

        _recruitFriends = materialIcon(name = "RecruitFriends") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(11.73f, 16.08f)
                curveToRelative(0.16f, -0.21f, 0.38f, -0.36f, 0.63f, -0.43f)
                lineToRelative(2.96f, -0.85f)
                curveToRelative(0.11f, -0.03f, 0.21f, -0.1f, 0.29f, -0.18f)
                curveToRelative(0.08f, -0.09f, 0.12f, -0.2f, 0.14f, -0.3f)
                lineTo(16f, 12.55f)
                curveToRelative(-0.63f, -0.28f, -1.16f, -0.74f, -1.53f, -1.32f)
                curveToRelative(-0.38f, -0.59f, -0.58f, -1.26f, -0.58f, -1.95f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0f, -0.49f, 0.1f, -0.97f, 0.29f, -1.41f)
                curveToRelative(0.19f, -0.45f, 0.46f, -0.85f, 0.8f, -1.19f)
                curveToRelative(0.35f, -0.33f, 0.77f, -0.6f, 1.22f, -0.77f)
                curveToRelative(0.45f, -0.17f, 0.93f, -0.26f, 1.41f, -0.24f)
                curveToRelative(0.95f, 0.05f, 1.85f, 0.47f, 2.5f, 1.17f)
                curveToRelative(0.65f, 0.7f, 1.01f, 1.63f, 1f, 2.59f)
                verticalLineToRelative(1.65f)
                curveToRelative(0f, 0.69f, -0.2f, 1.36f, -0.58f, 1.95f)
                curveToRelative(-0.37f, 0.58f, -0.9f, 1.04f, -1.53f, 1.32f)
                lineToRelative(0.25f, 1.76f)
                curveToRelative(0.01f, 0.11f, 0.06f, 0.22f, 0.14f, 0.3f)
                curveToRelative(0.08f, 0.1f, 0.18f, 0.16f, 0.29f, 0.19f)
                lineToRelative(2.96f, 0.84f)
                curveToRelative(0.25f, 0.07f, 0.47f, 0.22f, 0.63f, 0.43f)
                curveToRelative(0.15f, 0.21f, 0.24f, 0.46f, 0.24f, 0.73f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.27f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(17.5f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(11.39f, 10.55f)
                lineToRelative(-2.3f, -0.66f)
                curveTo(9f, 9.87f, 8.92f, 9.82f, 8.87f, 9.75f)
                curveTo(8.8f, 9.68f, 8.77f, 9.6f, 8.76f, 9.51f)
                lineToRelative(-0.2f, -1.36f)
                curveToRelative(0.49f, -0.22f, 0.9f, -0.58f, 1.2f, -1.03f)
                curveToRelative(0.28f, -0.45f, 0.44f, -0.97f, 0.44f, -1.5f)
                verticalLineToRelative(-1.3f)
                curveToRelative(0f, -0.73f, -0.27f, -1.45f, -0.77f, -2f)
                curveToRelative(-0.5f, -0.54f, -1.2f, -0.86f, -1.95f, -0.9f)
                curveTo(7.11f, 1.4f, 6.74f, 1.46f, 6.38f, 1.6f)
                curveTo(6.05f, 1.74f, 5.73f, 1.94f, 5.46f, 2.2f)
                curveTo(5.18f, 2.46f, 4.97f, 2.78f, 4.82f, 3.12f)
                curveTo(4.68f, 3.47f, 4.6f, 3.84f, 4.6f, 4.22f)
                verticalLineToRelative(1.4f)
                curveToRelative(0f, 0.53f, 0.16f, 1.05f, 0.45f, 1.5f)
                curveToRelative(0.29f, 0.45f, 0.7f, 0.81f, 1.19f, 1.03f)
                lineToRelative(-0.2f, 1.36f)
                curveTo(5.98f, 9.6f, 5.6f, 9.8f, 4.54f, 9.9f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.3f,
            ) {
                moveTo(1.45f, 17.34f)
                lineToRelative(2.61f, -4.53f)
                lineToRelative(4.53f, 2.62f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.3f,
            ) {
                moveTo(4.47f, 14.05f)
                lineToRelative(1.09f, 3.92f)
                curveToRelative(0.25f, 0.95f, 0.87f, 1.76f, 1.72f, 2.25f)
                reflectiveCurveToRelative(1.9f, 0.42f, 2.86f, 0.42f)
            }
        }

        return _recruitFriends!!
    }

@Suppress("ObjectPropertyName")
private var _recruitFriends: ImageVector? = null

@Preview
@Composable
private fun SatsIconRecruitFriendsPreview() {
    Icon(SatsIcons.RecruitFriends, contentDescription = null)
}
