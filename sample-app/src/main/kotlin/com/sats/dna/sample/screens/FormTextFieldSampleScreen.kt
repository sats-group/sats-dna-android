package com.sats.dna.sample.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text2.input.TextFieldLineLimits
import androidx.compose.foundation.text2.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsFormTextField
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.theme.SatsTheme

data object FormTextFieldSampleScreen : SampleScreen(
    name = "Form Text Field",
    route = "/components/form-text-field",
    screen = { FormTextFieldScreen(it::navigateUp) },
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun FormTextFieldScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Form Text Field", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            Column {
                SatsFormTextField(
                    label = "Title",
                    textFieldState = rememberTextFieldState(),
                    modifier = Modifier.fillMaxWidth(),
                )

                SatsHorizontalDivider()

                SatsFormTextField(
                    label = "Workout type",
                    textFieldState = rememberTextFieldState(),
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            Column {
                SatsFormTextField(
                    label = "Date & Time",
                    textFieldState = rememberTextFieldState(),
                    modifier = Modifier.fillMaxWidth(),
                )

                SatsHorizontalDivider()

                SatsFormTextField(
                    label = "Duration",
                    textFieldState = rememberTextFieldState(),
                    modifier = Modifier.fillMaxWidth(),
                )

                SatsHorizontalDivider()

                SatsFormTextField(
                    label = "Club",
                    textFieldState = rememberTextFieldState(),
                    hint = "(optional)",
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            SatsFormTextField(
                label = "Workout description",
                textFieldState = rememberTextFieldState(),
                hint = "(optional)",
                lineLimits = TextFieldLineLimits.MultiLine(minHeightInLines = 5, maxHeightInLines = 6),
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun FormTextFieldScreenPreview() {
    SatsTheme {
        FormTextFieldScreen(navigateUp = {})
    }
}
