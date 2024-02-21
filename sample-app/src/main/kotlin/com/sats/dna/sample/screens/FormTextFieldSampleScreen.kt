package com.sats.dna.sample.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text2.input.TextFieldLineLimits
import androidx.compose.foundation.text2.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsFormInputField
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

                var workoutType by rememberSaveable { mutableStateOf(WorkoutType.Strength) }

                SatsFormInputField(
                    label = "Workout type",
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { workoutType = workoutType.toggle() },
                ) {
                    Text(workoutType.label)
                }
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

private enum class WorkoutType(val label: String) {
    Strength("🏋 Strength"),
    Cardio("🏃 Cardio"),
    ;

    fun toggle(): WorkoutType = when (this) {
        Strength -> Cardio
        Cardio -> Strength
    }
}
