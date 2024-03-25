package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }

        _copy = materialIcon(name = "Copy") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(16f, 8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(14f)
                horizontalLineTo(8f)
                verticalLineToRelative(-6f)
                moveTo(2f, 2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                close()
            }
        }

        return _copy!!
    }

@Suppress("ObjectPropertyName")
private var _copy: ImageVector? = null

@Preview
@Composable
private fun SatsIconCopyPreview() {
    Icon(SatsIcons.Copy, contentDescription = null)
}
