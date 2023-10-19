package com.sats.dna.internal

import androidx.compose.material3.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.material.Text as Material2Text
import androidx.compose.material3.Text as Material3Text

@Composable
internal fun MaterialText(
    useMaterial3: Boolean,
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    style: TextStyle = LocalTextStyle.current,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
) {
    if (useMaterial3) {
        Material3Text(
            text = text,
            modifier = modifier,
            color = color,
            style = style,
            maxLines = maxLines,
            overflow = overflow,
        )
    } else {
        Material2Text(
            text = text,
            modifier = modifier,
            color = color,
            style = style,
            maxLines = maxLines,
            overflow = overflow,
        )
    }
}