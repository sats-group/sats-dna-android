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
val SatsIcons.ClubsFilled: ImageVector
    get() {
        if (_clubsFilled != null) {
            return _clubsFilled!!
        }

        _clubsFilled = materialIcon(name = "ClubsFilled") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 0.67f)
                curveTo(5.74f, 0.67f, 0.67f, 5.74f, 0.67f, 12f)
                reflectiveCurveTo(5.74f, 23.33f, 12f, 23.33f)
                reflectiveCurveTo(23.33f, 18.26f, 23.33f, 12f)
                reflectiveCurveTo(18.26f, 0.67f, 12f, 0.67f)
                close()
                moveTo(5.7f, 11.86f)
                curveToRelative(0.04f, -0.18f, 0.16f, -0.31f, 0.37f, -0.4f)
                lineToRelative(9.83f, -4.31f)
                curveToRelative(0.21f, -0.09f, 0.4f, -0.1f, 0.58f, -0.02f)
                curveToRelative(0.18f, 0.08f, 0.3f, 0.2f, 0.39f, 0.38f)
                curveToRelative(0.09f, 0.17f, 0.08f, 0.37f, -0.01f, 0.58f)
                lineToRelative(-4.32f, 9.84f)
                curveToRelative(-0.09f, 0.2f, -0.22f, 0.33f, -0.4f, 0.38f)
                curveToRelative(-0.17f, 0.04f, -0.33f, 0f, -0.49f, -0.11f)
                curveToRelative(-0.15f, -0.11f, -0.22f, -0.3f, -0.2f, -0.58f)
                verticalLineToRelative(-4.71f)
                curveToRelative(0f, -0.24f, -0.13f, -0.35f, -0.36f, -0.35f)
                horizontalLineTo(6.38f)
                curveToRelative(-0.28f, 0f, -0.47f, -0.06f, -0.58f, -0.22f)
                curveToRelative(-0.11f, -0.15f, -0.15f, -0.31f, -0.1f, -0.48f)
                close()
            }
        }

        return _clubsFilled!!
    }

@Suppress("ObjectPropertyName")
private var _clubsFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconClubsFilledPreview() {
    Icon(SatsIcons.ClubsFilled, contentDescription = null)
}
