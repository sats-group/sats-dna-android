package com.sats.dna.internal

import androidx.compose.material3.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.sats.dna.components.LocalUseMaterial3
import androidx.compose.material.Text as Material2Text
import androidx.compose.material3.Text as Material3Text

@Composable
internal fun MaterialText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    style: TextStyle = LocalTextStyle.current,
) {
    if (LocalUseMaterial3.current) {
        Material3Text(
            text = text,
            modifier = modifier,
            color = color,
            textAlign = textAlign,
            overflow = overflow,
            maxLines = maxLines,
            style = style,
        )
    } else {
        Material2Text(
            text = text,
            modifier = modifier,
            color = color,
            textAlign = textAlign,
            overflow = overflow,
            maxLines = maxLines,
            style = style,
        )
    }
}
