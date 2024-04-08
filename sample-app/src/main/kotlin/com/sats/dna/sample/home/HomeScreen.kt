package com.sats.dna.sample.home

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsDividerColor
import com.sats.dna.components.SatsEmptyState
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.SatsSearchBar
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.icons.Search
import com.sats.dna.sample.screens.ArticleCardSampleScreen
import com.sats.dna.sample.screens.BadgeSampleScreen
import com.sats.dna.sample.screens.BannerSampleScreen
import com.sats.dna.sample.screens.BrandLogoSampleScreen
import com.sats.dna.sample.screens.ButtonsSampleScreen
import com.sats.dna.sample.screens.CardSampleScreen
import com.sats.dna.sample.screens.ChallengeBackgroundSampleScreen
import com.sats.dna.sample.screens.ChallengeBadgeSampleScreen
import com.sats.dna.sample.screens.ChallengeCardSampleScreen
import com.sats.dna.sample.screens.CheckboxSampleScreen
import com.sats.dna.sample.screens.ChipsSampleScreen
import com.sats.dna.sample.screens.ColorsSampleScreen
import com.sats.dna.sample.screens.CompletedWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.DividersSampleScreen
import com.sats.dna.sample.screens.EmptyStateSampleScreen
import com.sats.dna.sample.screens.FancyTopAppBarSampleScreen
import com.sats.dna.sample.screens.FormInputFieldsSampleScreen
import com.sats.dna.sample.screens.FriendsBookingStatusSampleScreen
import com.sats.dna.sample.screens.GeneralListItemSampleScreen
import com.sats.dna.sample.screens.IconsSampleScreen
import com.sats.dna.sample.screens.JoinYourFriendsSampleScreen
import com.sats.dna.sample.screens.PlaceholdersSampleScreen
import com.sats.dna.sample.screens.ProgressBarsSampleScreen
import com.sats.dna.sample.screens.ProteinBarSampleScreen
import com.sats.dna.sample.screens.RadioButtonsSampleScreen
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.sample.screens.ScaleBarSampleScreen
import com.sats.dna.sample.screens.ScheduleSampleScreen
import com.sats.dna.sample.screens.SearchBarSampleScreen
import com.sats.dna.sample.screens.SessionDetailsInfoLabelSampleScreen
import com.sats.dna.sample.screens.SurfaceSampleScreen
import com.sats.dna.sample.screens.SwitchSampleScreen
import com.sats.dna.sample.screens.TabRowSampleScreen
import com.sats.dna.sample.screens.TagsSampleScreen
import com.sats.dna.sample.screens.TextFieldSampleScreen
import com.sats.dna.sample.screens.TitledSectionSampleScreen
import com.sats.dna.sample.screens.TopAppBarSampleScreen
import com.sats.dna.sample.screens.TrafficLightsSampleScreen
import com.sats.dna.sample.screens.TypographySampleScreen
import com.sats.dna.sample.screens.UpcomingWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.WorkoutStatisticsSampleScreen
import com.sats.dna.sample.screens.YourMostBookedSampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
internal fun HomeScreen(navController: NavController, modifier: Modifier = Modifier) {
    val topAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    val searchBarState = remember { HomeScreenSearchBarState() }

    SatsScreen(
        modifier = modifier.nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
        topBar = { SatsTopAppBar("SATS DNA Sample App", scrollBehavior = topAppBarScrollBehavior) },
        bottomBar = {
            HomeScreenSearchBar(
                Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.End)
                    .navigationBarsPadding()
                    .imePadding()
                    .padding(SatsTheme.spacing.m),
                searchBarState,
            )
        },
    ) { innerPadding ->
        val matchingSectionTitles = groups.filter { (_, sampleScreens) ->
            sampleScreens.any { it.name.contains(searchBarState.query, ignoreCase = true) }
        }.map { (sectionTitle, _) -> sectionTitle }

        AnimatedContent(
            targetState = matchingSectionTitles.any(),
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(top = SatsTheme.spacing.m),
            transitionSpec = { fadeIn() togetherWith fadeOut() },
            label = "Matches or empty state",
        ) { hasAnyMatches ->
            if (hasAnyMatches) {
                Column {
                    groups.keys.forEachIndexed { index, sectionTitle ->
                        val sampleScreens = groups.getValue(sectionTitle)

                        val matches = remember(searchBarState.query) {
                            sampleScreens.filter { it.name.contains(searchBarState.query, ignoreCase = true) }
                        }

                        val enterTransition = fadeIn() + expandVertically()
                        val exitTransition = fadeOut() + shrinkVertically()

                        AnimatedContent(
                            targetState = matches.any(),
                            transitionSpec = { enterTransition.togetherWith(exitTransition) },
                            label = "Section $sectionTitle",
                        ) { hasMatches ->
                            if (hasMatches) {
                                Column {
                                    if (matchingSectionTitles.any() && sectionTitle != matchingSectionTitles.first()) {
                                        Spacer(Modifier.height(SatsTheme.spacing.l))
                                    }

                                    HomeScreenSection(sectionTitle) {
                                        sampleScreens.forEach { sampleScreen ->
                                            AnimatedVisibility(
                                                visible = sampleScreen in matches,
                                                enter = enterTransition,
                                                exit = exitTransition,
                                                label = "Screen ${sampleScreen.name}",
                                            ) {
                                                HomeScreenListItem(
                                                    label = sampleScreen.name,
                                                    onClick = { navController.navigate(sampleScreen.route) },
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                SatsEmptyState(
                    icon = SatsIcons.Search,
                    title = "Nothing to see here",
                    body = "The search query “${searchBarState.query}” didn't match any results. " +
                        "Try something else.",
                    action = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize()
                        .padding(SatsTheme.spacing.l),
                )
            }
        }
    }
}

@Composable
private fun HomeScreenSection(
    label: String,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier, verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
        Row(
            modifier = Modifier.padding(horizontal = SatsTheme.spacing.m),
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            SatsHorizontalDivider(Modifier.width(SatsTheme.spacing.l), color = SatsDividerColor.Alternate)

            Text(label, style = SatsTheme.typography.satsHeadlineEmphasis.headline3)

            SatsHorizontalDivider(Modifier.weight(1f), color = SatsDividerColor.Alternate)
        }

        Column {
            content()
        }
    }
}

@Composable
private fun HomeScreenListItem(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Text(
        text = label,
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(SatsTheme.spacing.m),
        style = SatsTheme.typography.normal.large,
    )
}

@Composable
private fun HomeScreenSearchBar(
    modifier: Modifier = Modifier,
    state: HomeScreenSearchBarState = remember { HomeScreenSearchBarState() },
) {
    BackHandler(enabled = state.isExpanded) {
        state.clear()
        state.isExpanded = false
    }

    AnimatedContent(
        targetState = state.isExpanded,
        modifier = modifier,
        label = "Expanded/collapsed content",
    ) { isExpanded ->
        if (isExpanded) {
            SatsSearchBar(state.query, onQueryChange = { state.query = it }, onClearClicked = { state.clear() })
        } else {
            SatsIconButton(
                onClick = { state.isExpanded = true },
                icon = SatsIcons.Search,
                onClickLabel = null,
                size = SatsButtonSize.Large,
            )
        }
    }
}

@Stable
internal class HomeScreenSearchBarState {
    var isExpanded: Boolean by mutableStateOf(false)
    var query: String by mutableStateOf("")

    fun clear() {
        query = ""
    }
}

private val groups: Map<String, List<SampleScreen>> = mapOf(
    "Styles" to listOf(
        ColorsSampleScreen,
        TypographySampleScreen,
    ),
    "Icons" to listOf(
        IconsSampleScreen,
    ),
    "Components" to listOf(
        ArticleCardSampleScreen,
        BadgeSampleScreen,
        BannerSampleScreen,
        BrandLogoSampleScreen,
        ButtonsSampleScreen,
        CardSampleScreen,
        ChallengeBackgroundSampleScreen,
        ChallengeBadgeSampleScreen,
        ChallengeCardSampleScreen,
        CheckboxSampleScreen,
        ChipsSampleScreen,
        CompletedWorkoutListItemSampleScreen,
        DividersSampleScreen,
        EmptyStateSampleScreen,
        FancyTopAppBarSampleScreen,
        FormInputFieldsSampleScreen,
        FriendsBookingStatusSampleScreen,
        GeneralListItemSampleScreen,
        JoinYourFriendsSampleScreen,
        PlaceholdersSampleScreen,
        ProgressBarsSampleScreen,
        ProteinBarSampleScreen,
        RadioButtonsSampleScreen,
        ScaleBarSampleScreen,
        ScheduleSampleScreen,
        SearchBarSampleScreen,
        SessionDetailsInfoLabelSampleScreen,
        SurfaceSampleScreen,
        SwitchSampleScreen,
        TabRowSampleScreen,
        TagsSampleScreen,
        TextFieldSampleScreen,
        TitledSectionSampleScreen,
        TopAppBarSampleScreen,
        TrafficLightsSampleScreen,
        UpcomingWorkoutListItemSampleScreen,
        WorkoutStatisticsSampleScreen,
        YourMostBookedSampleScreen,
    ),
)
