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
import com.sats.dna.sample.navigateToBottomNavigationScreen
import com.sats.dna.sample.navigateToButtons
import com.sats.dna.sample.navigateToCardScreen
import com.sats.dna.sample.navigateToChips
import com.sats.dna.sample.navigateToColors
import com.sats.dna.sample.navigateToIcons
import com.sats.dna.sample.navigateToProgressBars
import com.sats.dna.sample.navigateToTopAppBarScreen
import com.sats.dna.sample.navigateToTypography
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
        }
    }
}
