package com.sats.dna.internal

import androidx.compose.material3.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.material.Text as Material2Text
import androidx.compose.material3.Text as Material3Text

@Composable
internal fun MaterialText(
    useMaterial3: Boolean,
    numberOfReactionsLabel: String,
    color: Color = Color.Unspecified,
    style: TextStyle = LocalTextStyle.current,
) {
    if (useMaterial3) {
        Material3Text(numberOfReactionsLabel, color = color, style = style)
    } else {
        Material2Text(numberOfReactionsLabel, color = color, style = style)
    }
}
