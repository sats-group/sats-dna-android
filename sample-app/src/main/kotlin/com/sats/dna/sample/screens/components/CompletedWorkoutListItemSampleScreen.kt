package com.sats.dna.sample.screens.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsCompletedWorkoutListItem
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.upcomingworkouts.SatsWorkoutType
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun CompletedWorkoutListItemSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen(
        title = "Completed Workout List",
        navigateUp = navigateUp,
        modifier = modifier,
        bottomBar = { Spacer(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding),
        ) {
            repeat(10) {
                if (it > 0) SatsHorizontalDivider()

                SatsCompletedWorkoutListItem(
                    timestamp = "Jul 18, 2023, 06:18",
                    title = "Gym training",
                    location = "at Colosseum",
                    numberOfComments = 10,
                    numberOfReactionsLabel = "15 people",
                    modifier = Modifier.clickable { },
                    onSaidAwesomeClicked = {},
                    onCompletedWorkoutClicked = {},
                    isLiked = false,
                    workoutType = SatsWorkoutType.OwnTraining,
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun CompletedWorkoutListItemSampleScreenPreview() {
    SatsTheme {
        CompletedWorkoutListItemSampleScreen(navigateUp = {})
    }
}
