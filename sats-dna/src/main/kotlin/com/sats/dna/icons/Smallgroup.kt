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
val SatsIcons.Smallgroup: ImageVector
    get() {
        if (_smallgroup != null) {
            return _smallgroup!!
        }

        _smallgroup = materialIcon(name = "Smallgroup") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(12.03f, 12.5f)
                curveToRelative(1.75f, 0f, 3.18f, -1.43f, 3.18f, -3.18f)
                curveToRelative(0f, -1.76f, -1.43f, -3.18f, -3.18f, -3.18f)
                curveToRelative(-1.76f, 0f, -3.18f, 1.42f, -3.18f, 3.18f)
                curveToRelative(0f, 1.75f, 1.42f, 3.17f, 3.18f, 3.17f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(5.67f, 20.7f)
                reflectiveCurveToRelative(0.85f, -5.42f, 2.16f, -5.96f)
                curveToRelative(1.32f, -0.54f, 7.08f, -0.54f, 8.4f, 0f)
                curveToRelative(1.3f, 0.54f, 2.16f, 5.95f, 2.16f, 5.95f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(7.1f, 9.93f)
                curveToRelative(-1.75f, 0f, -3.17f, -1.42f, -3.17f, -3.18f)
                curveTo(3.93f, 5f, 5.35f, 3.57f, 7.1f, 3.57f)
                curveToRelative(1.2f, 0f, 2.24f, 0.67f, 2.78f, 1.64f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(0.75f, 18.13f)
                reflectiveCurveToRelative(0.85f, -5.42f, 2.16f, -5.96f)
                curveToRelative(0.65f, -0.27f, 2.4f, -0.4f, 4.17f, -0.4f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(16.9f, 9.93f)
                curveToRelative(1.75f, 0f, 3.17f, -1.42f, 3.17f, -3.18f)
                curveToRelative(0f, -1.75f, -1.42f, -3.18f, -3.18f, -3.18f)
                curveToRelative(-1.2f, 0f, -2.24f, 0.67f, -2.78f, 1.64f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(23.25f, 18.13f)
                reflectiveCurveToRelative(-0.85f, -5.42f, -2.16f, -5.96f)
                curveToRelative(-0.65f, -0.27f, -2.4f, -0.4f, -4.17f, -0.4f)
            }
        }

        return _smallgroup!!
    }

@Suppress("ObjectPropertyName")
private var _smallgroup: ImageVector? = null

@Preview
@Composable
private fun SatsIconSmallgroupPreview() {
    Icon(SatsIcons.Smallgroup, contentDescription = null)
}
