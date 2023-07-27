@file:OptIn(ExperimentalMaterialApi::class)

package com.sats.dna.sample.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.google.accompanist.insets.ui.Scaffold
import com.google.accompanist.insets.ui.TopAppBar
import com.sats.dna.sample.navigateSurface
import com.sats.dna.sample.navigateToBottomNavigationScreen
import com.sats.dna.sample.navigateToButtons
import com.sats.dna.sample.navigateToCardScreen
import com.sats.dna.sample.navigateToCheckbox
import com.sats.dna.sample.navigateToChips
import com.sats.dna.sample.navigateToCircularProgressIndicator
import com.sats.dna.sample.navigateToColors
import com.sats.dna.sample.navigateToCompletedWorkoutListItem
import com.sats.dna.sample.navigateToIcons
import com.sats.dna.sample.navigateToPlaceholders
import com.sats.dna.sample.navigateToProgressBars
import com.sats.dna.sample.navigateToRadioButtons
import com.sats.dna.sample.navigateToSchedule
import com.sats.dna.sample.navigateToSnackbar
import com.sats.dna.sample.navigateToSwitch
import com.sats.dna.sample.navigateToTextField
import com.sats.dna.sample.navigateToTopAppBarScreen
import com.sats.dna.sample.navigateToTypography
import com.sats.dna.sample.navigateToUpcomingWorkoutListItem
import com.sats.dna.theme.SatsTheme

@Composable
internal fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = SatsTheme.colors.surface.primary,
                contentPadding = WindowInsets.statusBars.asPaddingValues(),
                title = { Text("Sats DNA Sample App") },
            )
        },
        bottomBar = { Box(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding),
        ) {
            ListItem(
                modifier = Modifier.clickable { navController.navigateToColors() },
                text = { Text("Colors") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToTypography() },
                text = { Text("Typography") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToIcons() },
                text = { Text("Icons") },
            )

            Divider(Modifier.padding(vertical = SatsTheme.spacing.s))

            ListItem(
                modifier = Modifier.clickable { navController.navigateToButtons() },
                text = { Text("Buttons") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToChips() },
                text = { Text("Chips") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToProgressBars() },
                text = { Text("Progress Bars") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToTopAppBarScreen() },
                text = { Text("Top App Bar") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToCardScreen() },
                text = { Text("Card") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToBottomNavigationScreen() },
                text = { Text("Bottom Navigation") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToSchedule() },
                text = { Text("Schedule") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToRadioButtons() },
                text = { Text("Radio Buttons") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToSwitch() },
                text = { Text("Switch") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToCheckbox() },
                text = { Text("Checkbox") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToCircularProgressIndicator() },
                text = { Text("Circular Progress Indicator") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateSurface() },
                text = { Text("Surface") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToTextField() },
                text = { Text("Text Field") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToSnackbar() },
                text = { Text("Snackbar") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToPlaceholders() },
                text = { Text("Placeholders") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToCompletedWorkoutListItem() },
                text = { Text("Completed Workout List Item") },
            )

            ListItem(
                modifier = Modifier.clickable { navController.navigateToUpcomingWorkoutListItem() },
                text = { Text("Upcoming Workout List Item") },
            )
        }
    }
}
