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
val SatsIcons.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }

        _add = materialIcon(name = "Add") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(12f, 5f)
                verticalLineToRelative(14f)
                moveToRelative(7f, -7f)
                horizontalLineTo(5f)
            }
        }

        return _add!!
    }

@Suppress("ObjectPropertyName")
private var _add: ImageVector? = null

@Preview
@Composable
private fun SatsIconAddPreview() {
    Icon(SatsIcons.Add, contentDescription = null)
}
