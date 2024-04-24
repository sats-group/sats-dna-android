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
val SatsIcons.Zendesk: ImageVector
    get() {
        if (_zendesk != null) {
            return _zendesk!!
        }

        _zendesk = materialIcon(name = "Zendesk") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.31f, 8.46f)
                verticalLineTo(19.5f)
                horizontalLineTo(3f)
                lineToRelative(8.31f, -11.04f)
                close()
                moveToRelative(0f, -3.96f)
                curveToRelative(0f, 1.21f, -0.43f, 2.38f, -1.21f, 3.23f)
                curveTo(9.32f, 8.6f, 8.26f, 9.07f, 7.16f, 9.07f)
                curveTo(6.06f, 9.07f, 5f, 8.6f, 4.22f, 7.73f)
                curveTo(3.44f, 6.88f, 3f, 5.71f, 3f, 4.5f)
                horizontalLineToRelative(8.31f)
                close()
                moveToRelative(1.37f, 15f)
                curveToRelative(0f, -1.21f, 0.44f, -2.38f, 1.22f, -3.23f)
                curveToRelative(0.78f, -0.86f, 1.84f, -1.34f, 2.94f, -1.34f)
                curveToRelative(1.1f, 0f, 2.16f, 0.48f, 2.94f, 1.34f)
                curveToRelative(0.78f, 0.85f, 1.22f, 2.02f, 1.22f, 3.23f)
                horizontalLineToRelative(-8.32f)
                close()
                moveToRelative(0f, -3.96f)
                verticalLineTo(4.5f)
                horizontalLineTo(21f)
                lineToRelative(-8.32f, 11.04f)
                close()
            }
        }

        return _zendesk!!
    }

@Suppress("ObjectPropertyName")
private var _zendesk: ImageVector? = null

@Preview
@Composable
private fun SatsIconZendeskPreview() {
    Icon(SatsIcons.Zendesk, contentDescription = null)
}
