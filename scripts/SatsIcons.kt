package com.sats.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val SatsIcons: ImageVector
    get() {
        val current = _satsIcons
        if (current != null) return current

        return ImageVector.Builder(
            name = "SatsTheme.SatsIcons",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8.07 13.22 l2 -4.3 3.6 10.15 c0.1 0.28 0.42 0.44 0.8 0.43 0.38 0 0.72 -0.18 0.82 -0.48 l1.87 -5.15 h3.53 c0.21 -0.3 0.3 -0.51 0.31 -0.72 q0.02 -0.3 -0.31 -0.78 H16.7 q-0.44 0 -0.65 0.16 a1 1 0 0 0 -0.35 0.48 l-1.24 2.94 -3.6 -9.51 C10.75 6.14 10.44 5.99 10.1 6 9.75 6 9.4 6.18 9.25 6.5 l-2.77 5.87 H3.33 Q2.97 12.82 3 13.11 q0 0.3 0.33 0.76 h3.71 a1 1 0 0 0 0.64 -0.16 1 1 0 0 0 0.39 -0.49
            path(
                fill = SolidColor(Color(0xFF14233C)),
            ) {
                // M 8.07 13.22
                moveTo(x = 8.07f, y = 13.22f)
                // l 2.0 -4.3
                lineToRelative(dx = 2.0f, dy = -4.3f)
                // l 3.6 10.15
                lineToRelative(dx = 3.6f, dy = 10.15f)
                // c 0.1 0.28 0.42 0.44 0.8 0.43
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = 0.28f,
                    dx2 = 0.42f,
                    dy2 = 0.44f,
                    dx3 = 0.8f,
                    dy3 = 0.43f,
                )
                // c 0.38 0.0 0.72 -0.18 0.82 -0.48
                curveToRelative(
                    dx1 = 0.38f,
                    dy1 = 0.0f,
                    dx2 = 0.72f,
                    dy2 = -0.18f,
                    dx3 = 0.82f,
                    dy3 = -0.48f,
                )
                // l 1.87 -5.15
                lineToRelative(dx = 1.87f, dy = -5.15f)
                // h 3.53
                horizontalLineToRelative(dx = 3.53f)
                // c 0.21 -0.3 0.3 -0.51 0.31 -0.72
                curveToRelative(
                    dx1 = 0.21f,
                    dy1 = -0.3f,
                    dx2 = 0.3f,
                    dy2 = -0.51f,
                    dx3 = 0.31f,
                    dy3 = -0.72f,
                )
                // q 0.02 -0.3 -0.31 -0.78
                quadToRelative(
                    dx1 = 0.02f,
                    dy1 = -0.3f,
                    dx2 = -0.31f,
                    dy2 = -0.78f,
                )
                // H 16.7
                horizontalLineTo(x = 16.7f)
                // q -0.44 0.0 -0.65 0.16
                quadToRelative(
                    dx1 = -0.44f,
                    dy1 = 0.0f,
                    dx2 = -0.65f,
                    dy2 = 0.16f,
                )
                // a 1.0 1.0 0.0 0 0 -0.35 0.48
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.35f,
                    dy1 = 0.48f,
                )
                // l -1.24 2.94
                lineToRelative(dx = -1.24f, dy = 2.94f)
                // l -3.6 -9.51
                lineToRelative(dx = -3.6f, dy = -9.51f)
                // C 10.75 6.14 10.44 5.99 10.1 6.0
                curveTo(
                    x1 = 10.75f,
                    y1 = 6.14f,
                    x2 = 10.44f,
                    y2 = 5.99f,
                    x3 = 10.1f,
                    y3 = 6.0f,
                )
                // C 9.75 6.0 9.4 6.18 9.25 6.5
                curveTo(
                    x1 = 9.75f,
                    y1 = 6.0f,
                    x2 = 9.4f,
                    y2 = 6.18f,
                    x3 = 9.25f,
                    y3 = 6.5f,
                )
                // l -2.77 5.87
                lineToRelative(dx = -2.77f, dy = 5.87f)
                // H 3.33
                horizontalLineTo(x = 3.33f)
                // Q 2.97 12.82 3.0 13.11
                quadTo(
                    x1 = 2.97f,
                    y1 = 12.82f,
                    x2 = 3.0f,
                    y2 = 13.11f,
                )
                // q 0.0 0.3 0.33 0.76
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.3f,
                    dx2 = 0.33f,
                    dy2 = 0.76f,
                )
                // h 3.71
                horizontalLineToRelative(dx = 3.71f)
                // a 1.0 1.0 0.0 0 0 0.64 -0.16
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.64f,
                    dy1 = -0.16f,
                )
                // a 1.0 1.0 0.0 0 0 0.39 -0.49
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.39f,
                    dy1 = -0.49f,
                )
            }
        }.build().also { _satsIcons = it }
    }

@Preview
@Composable
private fun IconPreview() {
    SatsTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                imageVector = SatsIcons,
                contentDescription = null,
                modifier = Modifier.size(100.dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _satsIcons: ImageVector? = null
