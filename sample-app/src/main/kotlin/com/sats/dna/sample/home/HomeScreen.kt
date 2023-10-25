package com.sats.dna.sample.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sats.dna.components.appbar.M3SatsTopAppBar
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.sample.screens.BottomNavigationSampleScreen
import com.sats.dna.sample.screens.BrandLogoSampleScreen
import com.sats.dna.sample.screens.ButtonsSampleScreen
import com.sats.dna.sample.screens.CampaignModuleSampleScreen
import com.sats.dna.sample.screens.CardSampleScreen
import com.sats.dna.sample.screens.ChallengeBadgeSampleScreen
import com.sats.dna.sample.screens.CheckboxSampleScreen
import com.sats.dna.sample.screens.ChipsSampleScreen
import com.sats.dna.sample.screens.CircularProgressIndicatorSampleScreen
import com.sats.dna.sample.screens.ColorsSampleScreen
import com.sats.dna.sample.screens.CompletedWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.EmptyStateSampleScreen
import com.sats.dna.sample.screens.GeneralListItemSampleScreen
import com.sats.dna.sample.screens.IconsSampleScreen
import com.sats.dna.sample.screens.PlaceholdersSampleScreen
import com.sats.dna.sample.screens.ProgressBarsSampleScreen
import com.sats.dna.sample.screens.RadioButtonsSampleScreen
import com.sats.dna.sample.screens.ScheduleSampleScreen
import com.sats.dna.sample.screens.SnackbarSampleScreen
import com.sats.dna.sample.screens.SurfaceSampleScreen
import com.sats.dna.sample.screens.SwitchSampleScreen
import com.sats.dna.sample.screens.TagsSampleScreen
import com.sats.dna.sample.screens.TextFieldSampleScreen
import com.sats.dna.sample.screens.TopBarSampleScreen
import com.sats.dna.sample.screens.TrafficLightsSampleScreen
import com.sats.dna.sample.screens.TypographySampleScreen
import com.sats.dna.sample.screens.UpcomingWorkoutListItemSampleScreen
import com.sats.dna.theme.SatsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun HomeScreen(navController: NavController) {
    SatsScreen(
        topBar = { M3SatsTopAppBar("SATS DNA Sample App") },
        bottomBar = { Box(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding),
        ) {
            ColorsSampleScreen.HomeListItem(navController)
            IconsSampleScreen.HomeListItem(navController)
            TypographySampleScreen.HomeListItem(navController)

            Divider(Modifier.padding(vertical = SatsTheme.spacing.s))

            BottomNavigationSampleScreen.HomeListItem(navController)
            BrandLogoSampleScreen.HomeListItem(navController)
            ButtonsSampleScreen.HomeListItem(navController)
            CampaignModuleSampleScreen.HomeListItem(navController)
            CardSampleScreen.HomeListItem(navController)
            ChallengeBadgeSampleScreen.HomeListItem(navController)
            CheckboxSampleScreen.HomeListItem(navController)
            ChipsSampleScreen.HomeListItem(navController)
            CircularProgressIndicatorSampleScreen.HomeListItem(navController)
            CompletedWorkoutListItemSampleScreen.HomeListItem(navController)
            EmptyStateSampleScreen.HomeListItem(navController)
            GeneralListItemSampleScreen.HomeListItem(navController)
            PlaceholdersSampleScreen.HomeListItem(navController)
            ProgressBarsSampleScreen.HomeListItem(navController)
            RadioButtonsSampleScreen.HomeListItem(navController)
            ScheduleSampleScreen.HomeListItem(navController)
            SnackbarSampleScreen.HomeListItem(navController)
            SurfaceSampleScreen.HomeListItem(navController)
            SwitchSampleScreen.HomeListItem(navController)
            TagsSampleScreen.HomeListItem(navController)
            TextFieldSampleScreen.HomeListItem(navController)
            TopBarSampleScreen.HomeListItem(navController)
            TrafficLightsSampleScreen.HomeListItem(navController)
            UpcomingWorkoutListItemSampleScreen.HomeListItem(navController)
        }
    }
}
