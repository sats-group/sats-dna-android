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
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold
import com.google.accompanist.insets.ui.TopAppBar
import com.sats.dna.theme.SatsTheme

@Composable
internal fun TypographyScreen(navigateUp: () -> Unit) {
    var currentStyle by remember { mutableStateOf(SatsTextStyle.Default) }

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = SatsTheme.colors.surface.primary,
                contentPadding = WindowInsets.statusBars.asPaddingValues(),
                navigationIcon = {
                    IconButton(onClick = navigateUp) {
                        Icon(SatsTheme.icons.back, contentDescription = null)
                    }
                },
                title = { Text("Typography") },
            )
        },
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

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun ConfigurationBar(
    contentPadding: PaddingValues,
    currentStyle: SatsTextStyle,
    onStyleChanged: (SatsTextStyle) -> Unit,
) {
    Surface(elevation = 2.dp) {
        Row(
            Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(contentPadding)
                .padding(SatsTheme.spacing.m),
            horizontalArrangement = spacedBy(SatsTheme.spacing.s),
        ) {
            SatsTextStyle.entries.forEach { textStyle ->
                FilterChip(selected = currentStyle == textStyle, onClick = { onStyleChanged(textStyle) }) {
                    Text(textStyle.styleName)
                }
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
