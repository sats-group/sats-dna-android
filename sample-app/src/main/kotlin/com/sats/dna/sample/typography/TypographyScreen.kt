package com.sats.dna.sample.typography

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsFilterChip
import com.sats.dna.components.SatsSurface
import com.sats.dna.sample.components.ComponentScreen
import com.sats.dna.theme.SatsTheme

@Composable
internal fun TypographyScreen(navigateUp: () -> Unit) {
    var currentStyle by remember { mutableStateOf(SatsTextStyle.Default) }

    ComponentScreen(
        title = "Typography",
        navigateUp = navigateUp,
        bottomBar = {
            ConfigurationBar(
                contentPadding = WindowInsets.navigationBars.asPaddingValues(),
                currentStyle = currentStyle,
                onStyleChanged = { currentStyle = it },
            )
        },
    ) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = spacedBy(SatsTheme.spacing.m),
        ) {
            currentStyle.toTextSamples().forEach {
                Text(it.name, style = it.textStyle)
            }
        }
    }
}

@Composable
private fun SatsTextStyle.toTextSamples(): List<TextSample> {
    val textStyle = when (this) {
        SatsTextStyle.Default -> SatsTheme.typography.default
        SatsTextStyle.Medium -> SatsTheme.typography.medium
        SatsTextStyle.Emphasis -> SatsTheme.typography.emphasis
        SatsTextStyle.SatsFeeling -> SatsTheme.typography.satsFeeling
    }

    return listOf(
        TextSample(name = "Heading 1", textStyle = textStyle.heading1),
        TextSample(name = "Heading 2", textStyle = textStyle.heading2),
        TextSample(name = "Heading 3", textStyle = textStyle.heading3),
        TextSample(name = "Large", textStyle = textStyle.large),
        TextSample(name = "Basic", textStyle = textStyle.basic),
        TextSample(name = "Small", textStyle = textStyle.small),
        TextSample(name = "Button", textStyle = textStyle.button),
        TextSample(name = "Section", textStyle = textStyle.section),
    )
}

private data class TextSample(
    val name: String,
    val textStyle: TextStyle,
)

@Composable
private fun ConfigurationBar(
    contentPadding: PaddingValues,
    currentStyle: SatsTextStyle,
    onStyleChanged: (SatsTextStyle) -> Unit,
) {
    SatsSurface(elevation = 2.dp) {
        Row(
            Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(contentPadding)
                .padding(SatsTheme.spacing.m),
            horizontalArrangement = spacedBy(SatsTheme.spacing.s),
        ) {
            SatsTextStyle.entries.forEach { textStyle ->
                SatsFilterChip(
                    text = textStyle.styleName,
                    isSelected = currentStyle == textStyle,
                    onClick = { onStyleChanged(textStyle) },
                )
            }
        }
    }
}

private enum class SatsTextStyle(val styleName: String) {
    Default("Default"),
    Medium("Medium"),
    Emphasis("Emphasis"),
    SatsFeeling("SATS Feeling"),
}
