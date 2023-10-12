package com.sats.dna.sample.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.CompletedWorkoutListItem
import com.sats.dna.components.icons.WorkoutType
import com.sats.dna.components.icons.WorkoutTypeIcon

@Composable
internal fun CompletedWorkoutListItemScreen(navigateUp: () -> Unit) {
    ComponentScreen(
        "Completed Workout List",
        navigateUp,
        bottomBar = { Spacer(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding),
        ) {
            repeat(10) {
                if (it > 0) Divider()

                CompletedWorkoutListItem(
                    icon = { WorkoutTypeIcon(WorkoutType.OwnTraining, null, Modifier.size(34.dp)) },
                    timestamp = "Jul 18, 2023, 06:18",
                    title = "Gym training",
                    location = "at Colosseum",
                    numberOfComments = 10,
                    numberOfReactionsLabel = "15 people",
                    modifier = Modifier.clickable { },
                    onSaidAwesomeClicked = {},
                    onCompletedWorkoutClicked = {},
                    isLiked = false,
                )
            }
        }
    }
}
