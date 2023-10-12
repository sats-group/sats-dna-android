package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sats.dna.components.SatsOutlinedTextField
import com.sats.dna.components.SatsTextField
import com.sats.dna.theme.SatsTheme

@Composable
internal fun SatsTextFieldScreen(navigateUp: () -> Unit) {
    val (inputValue, setValue) = remember { mutableStateOf("") }
    val (outlinedInputValue, outlinedSetValue) = remember { mutableStateOf("") }

    ComponentScreen(title = "Text Field", navigateUp = navigateUp) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            Arrangement.spacedBy(SatsTheme.spacing.m),
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
    Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs)) {
        SatsTextField(
            label = { Text(label) },
            value = value,
            onValueChange = onValueChange,
            enabled = enabled,
        )
    }
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
            label = { Text(label) },
            value = value,
            onValueChange = onValueChange,
            enabled = enabled,
        )
    }
}
