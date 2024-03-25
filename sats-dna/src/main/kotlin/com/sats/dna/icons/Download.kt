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
val SatsIcons.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }

        _download = materialIcon(name = "Download") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(12f, 1f)
                verticalLineToRelative(16f)
                moveToRelative(0f, 0f)
                lineToRelative(6f, -6f)
                moveToRelative(-6f, 6f)
                lineToRelative(-6f, -6f)
                moveToRelative(16f, 11f)
                horizontalLineTo(2f)
            }
        }

        return _download!!
    }

@Suppress("ObjectPropertyName")
private var _download: ImageVector? = null

@Preview
@Composable
private fun SatsIconDownloadPreview() {
    Icon(SatsIcons.Download, contentDescription = null)
}
