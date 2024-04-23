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
val SatsIcons.Level: ImageVector
    get() {
        if (_level != null) {
            return _level!!
        }

        _level = materialIcon(name = "Level") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(5.96f, 13.5f)
                horizontalLineTo(2.79f)
                curveToRelative(-0.1f, 0f, -0.2f, 0.01f, -0.3f, 0.05f)
                curveToRelative(-0.1f, 0.04f, -0.2f, 0.1f, -0.27f, 0.17f)
                curveToRelative(-0.08f, 0.07f, -0.13f, 0.16f, -0.17f, 0.26f)
                curveTo(2f, 14.08f, 2f, 14.18f, 2f, 14.3f)
                verticalLineToRelative(4.75f)
                curveToRelative(0f, 0.1f, 0.01f, 0.21f, 0.05f, 0.31f)
                reflectiveCurveToRelative(0.1f, 0.19f, 0.17f, 0.27f)
                curveToRelative(0.07f, 0.07f, 0.16f, 0.13f, 0.26f, 0.17f)
                curveToRelative(0.1f, 0.03f, 0.2f, 0.05f, 0.31f, 0.04f)
                horizontalLineToRelative(3.17f)
                curveToRelative(0.1f, 0f, 0.21f, 0f, 0.3f, -0.04f)
                curveToRelative(0.1f, -0.04f, 0.2f, -0.1f, 0.27f, -0.17f)
                curveToRelative(0.08f, -0.08f, 0.14f, -0.17f, 0.17f, -0.27f)
                curveToRelative(0.04f, -0.1f, 0.06f, -0.2f, 0.05f, -0.3f)
                verticalLineToRelative(-4.76f)
                curveToRelative(0f, -0.1f, 0f, -0.2f, -0.05f, -0.3f)
                curveToRelative(-0.03f, -0.1f, -0.1f, -0.2f, -0.17f, -0.27f)
                curveToRelative(-0.07f, -0.08f, -0.16f, -0.13f, -0.26f, -0.17f)
                curveToRelative(-0.1f, -0.04f, -0.2f, -0.06f, -0.31f, -0.05f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(13.08f, 8.75f)
                horizontalLineTo(9.92f)
                curveToRelative(-0.1f, 0f, -0.21f, 0.01f, -0.31f, 0.05f)
                reflectiveCurveTo(9.4f, 8.9f, 9.34f, 8.97f)
                reflectiveCurveTo(9.21f, 9.13f, 9.17f, 9.23f)
                curveToRelative(-0.03f, 0.1f, -0.05f, 0.2f, -0.04f, 0.31f)
                verticalLineToRelative(9.5f)
                curveToRelative(-0.01f, 0.1f, 0f, 0.21f, 0.04f, 0.31f)
                reflectiveCurveToRelative(0.1f, 0.19f, 0.17f, 0.26f)
                curveToRelative(0.08f, 0.08f, 0.17f, 0.14f, 0.27f, 0.17f)
                curveToRelative(0.1f, 0.04f, 0.2f, 0.06f, 0.3f, 0.05f)
                horizontalLineToRelative(3.17f)
                curveToRelative(0.1f, 0f, 0.21f, 0f, 0.31f, -0.05f)
                curveToRelative(0.1f, -0.03f, 0.2f, -0.1f, 0.27f, -0.17f)
                reflectiveCurveToRelative(0.13f, -0.16f, 0.17f, -0.26f)
                curveToRelative(0.03f, -0.1f, 0.05f, -0.2f, 0.04f, -0.3f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.01f, -0.11f, 0f, -0.22f, -0.04f, -0.32f)
                reflectiveCurveToRelative(-0.1f, -0.19f, -0.17f, -0.26f)
                curveToRelative(-0.08f, -0.08f, -0.17f, -0.13f, -0.27f, -0.17f)
                curveToRelative(-0.1f, -0.04f, -0.2f, -0.06f, -0.3f, -0.05f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.2f, 4f)
                horizontalLineToRelative(-3.16f)
                curveToRelative(-0.1f, 0f, -0.21f, 0.01f, -0.3f, 0.05f)
                curveToRelative(-0.1f, 0.04f, -0.2f, 0.1f, -0.27f, 0.17f)
                curveToRelative(-0.08f, 0.07f, -0.14f, 0.16f, -0.17f, 0.26f)
                curveToRelative(-0.04f, 0.1f, -0.06f, 0.2f, -0.05f, 0.31f)
                verticalLineToRelative(14.25f)
                curveToRelative(0f, 0.1f, 0f, 0.21f, 0.05f, 0.31f)
                curveToRelative(0.03f, 0.1f, 0.1f, 0.19f, 0.17f, 0.26f)
                curveToRelative(0.07f, 0.08f, 0.16f, 0.14f, 0.26f, 0.18f)
                curveToRelative(0.1f, 0.03f, 0.2f, 0.05f, 0.31f, 0.04f)
                horizontalLineToRelative(3.17f)
                curveToRelative(0.1f, 0f, 0.2f, 0f, 0.3f, -0.04f)
                curveToRelative(0.1f, -0.04f, 0.2f, -0.1f, 0.27f, -0.18f)
                curveToRelative(0.08f, -0.07f, 0.13f, -0.16f, 0.17f, -0.26f)
                curveToRelative(0.04f, -0.1f, 0.05f, -0.2f, 0.05f, -0.3f)
                verticalLineTo(4.78f)
                curveToRelative(0f, -0.1f, -0.01f, -0.2f, -0.05f, -0.3f)
                curveToRelative(-0.04f, -0.1f, -0.1f, -0.2f, -0.17f, -0.27f)
                curveToRelative(-0.07f, -0.08f, -0.16f, -0.13f, -0.26f, -0.17f)
                curveTo(20.42f, 4f, 20.32f, 4f, 20.2f, 4f)
                close()
            }
        }

        return _level!!
    }

@Suppress("ObjectPropertyName")
private var _level: ImageVector? = null

@Preview
@Composable
private fun SatsIconLevelPreview() {
    Icon(SatsIcons.Level, contentDescription = null)
}
