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
val SatsIcons.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }

        _person = materialIcon(name = "Person") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(12f, 12f)
                curveToRelative(-2.26f, 0f, -4.1f, -1.83f, -4.1f, -4.1f)
                verticalLineTo(7.1f)
                curveTo(7.9f, 4.82f, 9.75f, 3f, 12f, 3f)
                reflectiveCurveToRelative(4.1f, 1.83f, 4.1f, 4.1f)
                verticalLineToRelative(0.8f)
                curveToRelative(0f, 2.27f, -1.84f, 4.1f, -4.1f, 4.1f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(20.18f, 19.29f)
                curveToRelative(0f, -1.47f, -0.98f, -2.77f, -2.4f, -3.16f)
                curveToRelative(-1.55f, -0.42f, -3.66f, -0.86f, -5.78f, -0.86f)
                reflectiveCurveToRelative(-4.23f, 0.44f, -5.78f, 0.86f)
                curveToRelative(-1.42f, 0.39f, -2.4f, 1.69f, -2.4f, 3.16f)
                verticalLineTo(21f)
                horizontalLineToRelative(16.36f)
                verticalLineToRelative(-1.71f)
                close()
            }
        }

        return _person!!
    }

@Suppress("ObjectPropertyName")
private var _person: ImageVector? = null

@Preview
@Composable
private fun SatsIconPersonPreview() {
    Icon(SatsIcons.Person, contentDescription = null)
}
