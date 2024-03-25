package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }

        _inbox = materialIcon(name = "Inbox") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 13.66f)
                curveToRelative(0f, -0.38f, 0.31f, -0.7f, 0.7f, -0.7f)
                horizontalLineToRelative(5.53f)
                curveToRelative(0.38f, 0f, 0.7f, 0.32f, 0.7f, 0.7f)
                verticalLineToRelative(2.63f)
                horizontalLineToRelative(4.15f)
                verticalLineToRelative(-2.63f)
                curveToRelative(0f, -0.38f, 0.3f, -0.7f, 0.69f, -0.7f)
                horizontalLineToRelative(5.54f)
                curveToRelative(0.38f, 0f, 0.69f, 0.32f, 0.69f, 0.7f)
                curveToRelative(0f, 0.38f, -0.31f, 0.7f, -0.7f, 0.7f)
                horizontalLineToRelative(-4.84f)
                verticalLineToRelative(2.62f)
                curveToRelative(0f, 0.39f, -0.3f, 0.7f, -0.7f, 0.7f)
                horizontalLineTo(9.24f)
                curveToRelative(-0.38f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-2.63f)
                horizontalLineTo(3.7f)
                curveToRelative(-0.38f, 0f, -0.69f, -0.3f, -0.69f, -0.69f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.35f, 4.38f)
                curveToRelative(-0.25f, 0f, -0.5f, 0.1f, -0.68f, 0.29f)
                curveTo(4.49f, 4.85f, 4.38f, 5.1f, 4.38f, 5.35f)
                verticalLineToRelative(13.3f)
                curveToRelative(0f, 0.25f, 0.1f, 0.5f, 0.29f, 0.68f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.68f, 0.29f)
                horizontalLineToRelative(13.3f)
                curveToRelative(0.25f, 0f, 0.5f, -0.1f, 0.68f, -0.29f)
                curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.68f)
                verticalLineTo(5.35f)
                curveToRelative(0f, -0.25f, -0.1f, -0.5f, -0.29f, -0.68f)
                curveToRelative(-0.18f, -0.18f, -0.43f, -0.29f, -0.68f, -0.29f)
                horizontalLineTo(5.35f)
                close()
                moveTo(3.7f, 3.68f)
                curveTo(4.13f, 3.26f, 4.73f, 3f, 5.35f, 3f)
                horizontalLineToRelative(13.3f)
                curveToRelative(0.62f, 0f, 1.22f, 0.25f, 1.66f, 0.69f)
                curveTo(20.75f, 4.13f, 21f, 4.73f, 21f, 5.35f)
                verticalLineToRelative(13.3f)
                curveToRelative(0f, 0.62f, -0.25f, 1.22f, -0.69f, 1.66f)
                curveToRelative(-0.44f, 0.44f, -1.04f, 0.69f, -1.66f, 0.69f)
                horizontalLineTo(5.35f)
                curveToRelative(-0.62f, 0f, -1.22f, -0.25f, -1.66f, -0.69f)
                curveTo(3.25f, 19.87f, 3f, 19.27f, 3f, 18.65f)
                verticalLineTo(5.35f)
                curveTo(3f, 4.73f, 3.25f, 4.13f, 3.69f, 3.7f)
                close()
            }
        }

        return _inbox!!
    }

@Suppress("ObjectPropertyName")
private var _inbox: ImageVector? = null

@Preview
@Composable
private fun SatsIconInboxPreview() {
    Icon(SatsIcons.Inbox, contentDescription = null)
}
