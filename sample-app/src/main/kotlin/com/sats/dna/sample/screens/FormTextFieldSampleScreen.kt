package com.sats.dna.sample.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text2.input.TextFieldLineLimits
import androidx.compose.foundation.text2.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsFormDateTimeInputField
import com.sats.dna.components.SatsFormInputField
import com.sats.dna.components.SatsFormTextField
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.theme.SatsTheme
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.atTime
import kotlinx.datetime.toJavaLocalDate
import kotlinx.datetime.toJavaLocalTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

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
                    keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words),
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
                val localDateTimeState by remember { mutableStateOf(LocalDateTimeState()) }

                SatsFormDateTimeInputField(
                    label = "Date & time",
                    value = localDateTimeState.dateTime,
                    onDateClicked = { localDateTimeState.changeDate() },
                    onTimeClicked = { localDateTimeState.changeTime() },
                    formatDate = { DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(it.toJavaLocalDate()) },
                    formatTime = { DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(it.toJavaLocalTime()) },
                    modifier = Modifier.fillMaxWidth(),
                )

                SatsHorizontalDivider()

                SatsFormTextField(
                    label = "Duration",
                    textFieldState = rememberTextFieldState(),
                    trailingText = "min",
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    inputTransformation = { _, valueWithChanges ->
                        if (valueWithChanges.asCharSequence().any { !it.isDigit() }) {
                            valueWithChanges.revertAllChanges()
                        }
                    },
                )

                SatsHorizontalDivider()

                SatsFormTextField(
                    label = "Club",
                    textFieldState = rememberTextFieldState(),
                    hint = "(optional)",
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words),
                )
            }

            SatsFormTextField(
                label = "Workout description",
                textFieldState = rememberTextFieldState(),
                hint = "(optional)",
                lineLimits = TextFieldLineLimits.MultiLine(minHeightInLines = 5, maxHeightInLines = 6),
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Sentences),
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

@Stable
private class LocalDateTimeState {
    val dateTime: LocalDateTime by derivedStateOf {
        currentDate.value.atTime(currentTime.value)
    }

    private var currentDate: Date by mutableStateOf(Date.Initial)
    private var currentTime: Time by mutableStateOf(Time.Initial)

    fun changeDate() {
        currentDate = currentDate.toggle()
    }

    fun changeTime() {
        currentTime = currentTime.toggle()
    }

    private enum class Date(val value: LocalDate) {
        Initial(LocalDate(2020, 1, 1)),
        Alternate(LocalDate(2024, 6, 15)),
        ;

        fun toggle(): Date = when (this) {
            Initial -> Alternate
            Alternate -> Initial
        }
    }

    private enum class Time(val value: LocalTime) {
        Initial(LocalTime(9, 0)),
        Alternate(LocalTime(17, 30)),
        ;

        fun toggle(): Time = when (this) {
            Initial -> Alternate
            Alternate -> Initial
        }
    }
}
