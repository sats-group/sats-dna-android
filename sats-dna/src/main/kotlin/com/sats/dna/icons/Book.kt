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
val SatsIcons.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }

        _book = materialIcon(name = "Book") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12f, 6.09f)
                curveToRelative(0.4f, 0f, 0.71f, 0.32f, 0.71f, 0.7f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.39f, 0f, 0.7f, 0.32f, 0.7f, 0.71f)
                curveToRelative(0f, 0.4f, -0.31f, 0.71f, -0.7f, 0.71f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.39f, -0.32f, 0.7f, -0.71f, 0.7f)
                curveToRelative(-0.4f, 0f, -0.71f, -0.31f, -0.71f, -0.7f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.39f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                curveToRelative(0f, -0.4f, 0.31f, -0.72f, 0.7f, -0.72f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(6.8f)
                curveToRelative(0f, -0.38f, 0.32f, -0.7f, 0.71f, -0.7f)
                close()
            }

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
        }

        return _book!!
    }

@Suppress("ObjectPropertyName")
private var _book: ImageVector? = null

@Preview
@Composable
private fun SatsIconBookPreview() {
    Icon(SatsIcons.Book, contentDescription = null)
}
