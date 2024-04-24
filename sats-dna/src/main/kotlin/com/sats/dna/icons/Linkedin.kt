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
val SatsIcons.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }

        _linkedin = materialIcon(name = "Linkedin") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(17.58f, 6.2f)
                horizontalLineTo(7.07f)
                curveToRelative(-0.22f, 0f, -0.42f, 0.08f, -0.57f, 0.24f)
                curveTo(6.34f, 6.59f, 6.26f, 6.79f, 6.26f, 7f)
                verticalLineToRelative(10.51f)
                curveToRelative(0f, 0.21f, 0.08f, 0.42f, 0.24f, 0.57f)
                curveToRelative(0.15f, 0.15f, 0.35f, 0.24f, 0.57f, 0.24f)
                horizontalLineToRelative(10.51f)
                curveToRelative(0.21f, 0f, 0.42f, -0.09f, 0.57f, -0.24f)
                curveToRelative(0.15f, -0.15f, 0.24f, -0.36f, 0.24f, -0.57f)
                verticalLineTo(7.01f)
                curveToRelative(0f, -0.22f, -0.09f, -0.42f, -0.24f, -0.57f)
                curveTo(18f, 6.28f, 17.8f, 6.2f, 17.58f, 6.2f)
                close()
                moveTo(9.85f, 16.55f)
                horizontalLineTo(8.03f)
                verticalLineToRelative(-5.8f)
                horizontalLineToRelative(1.82f)
                verticalLineToRelative(5.8f)
                close()
                moveToRelative(-0.91f, -6.6f)
                curveToRelative(-0.21f, 0f, -0.41f, -0.06f, -0.59f, -0.18f)
                curveTo(8.18f, 9.65f, 8.05f, 9.5f, 7.96f, 9.3f)
                curveTo(7.88f, 9.1f, 7.86f, 8.9f, 7.9f, 8.7f)
                curveToRelative(0.04f, -0.21f, 0.15f, -0.4f, 0.3f, -0.55f)
                curveToRelative(0.14f, -0.15f, 0.33f, -0.25f, 0.54f, -0.3f)
                curveToRelative(0.2f, -0.03f, 0.42f, -0.01f, 0.61f, 0.07f)
                curveToRelative(0.2f, 0.08f, 0.36f, 0.22f, 0.48f, 0.4f)
                curveTo(9.94f, 8.47f, 10f, 8.67f, 10f, 8.88f)
                curveToRelative(0f, 0.14f, -0.02f, 0.28f, -0.08f, 0.4f)
                curveTo(9.87f, 9.44f, 9.8f, 9.55f, 9.7f, 9.65f)
                curveToRelative(-0.1f, 0.1f, -0.21f, 0.18f, -0.34f, 0.23f)
                curveToRelative(-0.13f, 0.06f, -0.27f, 0.08f, -0.41f, 0.08f)
                close()
                moveToRelative(7.68f, 6.6f)
                horizontalLineToRelative(-1.79f)
                verticalLineToRelative(-2.8f)
                curveToRelative(0f, -0.69f, 0f, -1.52f, -0.95f, -1.52f)
                reflectiveCurveToRelative(-1.06f, 0.72f, -1.06f, 1.47f)
                verticalLineToRelative(2.89f)
                horizontalLineToRelative(-1.79f)
                verticalLineToRelative(-5.84f)
                horizontalLineToRelative(1.67f)
                verticalLineToRelative(0.8f)
                horizontalLineToRelative(0.04f)
                curveToRelative(0.17f, -0.3f, 0.42f, -0.55f, 0.72f, -0.72f)
                curveToRelative(0.3f, -0.16f, 0.65f, -0.25f, 1f, -0.23f)
                curveToRelative(1.82f, 0f, 2.16f, 1.2f, 2.16f, 2.76f)
                verticalLineToRelative(3.19f)
                close()
            }
        }

        return _linkedin!!
    }

@Suppress("ObjectPropertyName")
private var _linkedin: ImageVector? = null

@Preview
@Composable
private fun SatsIconLinkedinPreview() {
    Icon(SatsIcons.Linkedin, contentDescription = null)
}
