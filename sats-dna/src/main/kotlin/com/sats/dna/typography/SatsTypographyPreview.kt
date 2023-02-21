package com.sats.dna.typography

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Preview(widthDp = 800, heightDp = 350)
@Composable
private fun Preview() {
    SatsTheme {
        Surface(Modifier.fillMaxWidth()) {
            Row(
                Modifier.padding(32.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                SamplesColumn("Default", SatsTypographyImpl.default)
                SamplesColumn("Medium", SatsTypographyImpl.medium)
                SamplesColumn("Emphasis", SatsTypographyImpl.emphasis)
                SamplesColumn("Sats Feeling", SatsTypographyImpl.satsFeeling)
            }
        }
    }
}

@Composable
private fun SamplesColumn(title: String, textStyles: SatsTextStyles) {
    Column {
        Text(title)

        textStyles.toListItems().forEach { (name, style) ->
            Text(name, style = style)
        }
    }
}

private fun SatsTextStyles.toListItems() = listOf(
    SampleListItem("Heading 1", heading1),
    SampleListItem("Heading 2", heading2),
    SampleListItem("Heading 3", heading3),
    SampleListItem("Large", large),
    SampleListItem("Basic", basic),
    SampleListItem("Small", small),
    SampleListItem("Button", button),
    SampleListItem("Section", section),
)

private data class SampleListItem(
    val name: String,
    val style: TextStyle,
)
