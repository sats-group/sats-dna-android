package com.sats.dna.sample.screens

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
import com.sats.dna.components.M3SatsOutlinedTextField
import com.sats.dna.components.M3SatsTextField
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object TextFieldSampleScreen : SampleScreen(
    name = "Text Field",
    route = "/components/text-field",
    screen = { TextFieldScreen(it::navigateUp) },
)

@Composable
internal fun TextFieldScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
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
    M3SatsTextField(
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
        M3SatsOutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            enabled = enabled,
            label = { Text(label) },
        )
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        TextFieldScreen(navigateUp = {})
    }
}
