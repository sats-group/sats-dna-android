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
val SatsIcons.ClubsOutline: ImageVector
    get() {
        if (_clubsOutline != null) {
            return _clubsOutline!!
        }

        _clubsOutline = materialIcon(name = "ClubsOutline") {
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
                moveTo(6.07f, 11.46f)
                curveToRelative(-0.2f, 0.09f, -0.33f, 0.22f, -0.38f, 0.4f)
                curveToRelative(-0.04f, 0.17f, 0f, 0.33f, 0.1f, 0.48f)
                curveToRelative(0.12f, 0.16f, 0.31f, 0.23f, 0.59f, 0.22f)
                horizontalLineToRelative(4.71f)
                curveToRelative(0.23f, 0f, 0.35f, 0.11f, 0.35f, 0.35f)
                verticalLineToRelative(4.71f)
                curveToRelative(0f, 0.28f, 0.06f, 0.47f, 0.21f, 0.58f)
                curveToRelative(0.16f, 0.11f, 0.32f, 0.15f, 0.49f, 0.1f)
                curveToRelative(0.18f, -0.04f, 0.31f, -0.16f, 0.4f, -0.37f)
                lineToRelative(4.32f, -9.84f)
                curveToRelative(0.1f, -0.21f, 0.1f, -0.4f, 0.01f, -0.58f)
                curveToRelative(-0.08f, -0.17f, -0.21f, -0.3f, -0.39f, -0.37f)
                curveToRelative(-0.17f, -0.08f, -0.37f, -0.08f, -0.58f, 0.01f)
                lineToRelative(-9.83f, 4.31f)
                close()
            }
        }

        return _clubsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _clubsOutline: ImageVector? = null

@Preview
@Composable
private fun SatsIconClubsOutlinePreview() {
    Icon(SatsIcons.ClubsOutline, contentDescription = null)
}
