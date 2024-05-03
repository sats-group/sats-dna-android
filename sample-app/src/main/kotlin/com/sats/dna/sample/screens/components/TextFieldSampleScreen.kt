package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsOutlinedTextField
import com.sats.dna.components.SatsTextField
import com.sats.dna.sample.internal.ComponentScreen
import com.sats.dna.theme.SatsTheme

@Composable
internal fun TextFieldSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    val (inputValue, setValue) = remember { mutableStateOf("") }
    val (outlinedInputValue, outlinedSetValue) = remember { mutableStateOf("") }

    ComponentScreen("Text Field", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxWidth(),
            Arrangement.spacedBy(SatsTheme.spacing.l),
            Alignment.CenterHorizontally,
        ) {
            LabeledTextField(
                label = "Enabled text field",
                value = inputValue,
                onValueChange = setValue,
            )

            LabeledTextField(
                label = "Disabled text field",
                value = inputValue,
                onValueChange = setValue,
                enabled = false,
            )

            LabeledOutlinedTextField(
                label = "Enabled outlined text field",
                value = outlinedInputValue,
                onValueChange = outlinedSetValue,
            )

            LabeledOutlinedTextField(
                label = "Disabled outlined text field",
                value = outlinedInputValue,
                onValueChange = outlinedSetValue,
                enabled = false,
            )
        }
    }
}

@Composable
private fun LabeledTextField(
    label: String,
    value: String,
    onValueChange: (newValue: String) -> Unit,
    enabled: Boolean = true,
) {
    SatsTextField(
        value = value,
        onValueChange = onValueChange,
        enabled = enabled,
        label = { Text(label) },
    )
}

@Composable
private fun LabeledOutlinedTextField(
    label: String,
    value: String,
    onValueChange: (newValue: String) -> Unit,
    enabled: Boolean = true,
) {
    Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs)) {
        SatsOutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            enabled = enabled,
            label = { Text(label) },
        )
    }
}

@PreviewLightDark
@Composable
private fun TextFieldSampleScreenPreview() {
    SatsTheme {
        TextFieldSampleScreen(navigateUp = {})
    }
}
