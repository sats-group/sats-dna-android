package com.sats.dna.sample.screens

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
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsDividerColor
import com.sats.dna.components.SatsEmptyState
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.SatsSearchBar
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.icons.Search
import com.sats.dna.sample.internal.SatsScreen
import com.sats.dna.sample.internal.trySharedBounds
import com.sats.dna.sample.routes.SampleScreenRoute
import com.sats.dna.sample.routes.components.ArticleCardSampleScreenRoute
import com.sats.dna.sample.routes.components.BadgeSampleScreenRoute
import com.sats.dna.sample.routes.components.BannerSampleScreenRoute
import com.sats.dna.sample.routes.components.BrandLogoSampleScreenRoute
import com.sats.dna.sample.routes.components.ButtonsSampleScreenRoute
import com.sats.dna.sample.routes.components.CardSampleScreenRoute
import com.sats.dna.sample.routes.components.ChallengeBackgroundSampleScreenRoute
import com.sats.dna.sample.routes.components.ChallengeBadgeSampleScreenRoute
import com.sats.dna.sample.routes.components.ChallengeCardSampleScreenRoute
import com.sats.dna.sample.routes.components.CheckboxSampleScreenRoute
import com.sats.dna.sample.routes.components.ChipsSampleScreenRoute
import com.sats.dna.sample.routes.components.ChoiceBoxSampleScreenRoute
import com.sats.dna.sample.routes.components.CompletedWorkoutListItemSampleScreenRoute
import com.sats.dna.sample.routes.components.DividersSampleScreenRoute
import com.sats.dna.sample.routes.components.EmptyStateSampleScreenRoute
import com.sats.dna.sample.routes.components.FancyTopAppBarSampleScreenRoute
import com.sats.dna.sample.routes.components.FormInputFieldsSampleScreenRoute
import com.sats.dna.sample.routes.components.FriendsBookingStatusSampleScreenRoute
import com.sats.dna.sample.routes.components.GeneralListItemSampleScreenRoute
import com.sats.dna.sample.routes.components.JoinYourFriendsSampleScreenRoute
import com.sats.dna.sample.routes.components.PlaceholdersSampleScreenRoute
import com.sats.dna.sample.routes.components.ProgressBarsSampleScreenRoute
import com.sats.dna.sample.routes.components.ProteinBarSampleScreenRoute
import com.sats.dna.sample.routes.components.RadioButtonsSampleScreenRoute
import com.sats.dna.sample.routes.components.ScaleBarSampleScreenRoute
import com.sats.dna.sample.routes.components.ScheduleSampleScreenRoute
import com.sats.dna.sample.routes.components.SearchBarSampleScreenRoute
import com.sats.dna.sample.routes.components.SessionDetailsInfoLabelSampleScreenRoute
import com.sats.dna.sample.routes.components.SurfaceSampleScreenRoute
import com.sats.dna.sample.routes.components.SwitchSampleScreenRoute
import com.sats.dna.sample.routes.components.TabRowSampleScreenRoute
import com.sats.dna.sample.routes.components.TagsSampleScreenRoute
import com.sats.dna.sample.routes.components.TextFieldSampleScreenRoute
import com.sats.dna.sample.routes.components.TitledSectionSampleScreenRoute
import com.sats.dna.sample.routes.components.TopAppBarSampleScreenRoute
import com.sats.dna.sample.routes.components.TrafficLightsSampleScreenRoute
import com.sats.dna.sample.routes.components.UpcomingWorkoutListItemSampleScreenRoute
import com.sats.dna.sample.routes.components.WorkoutStatisticsSampleScreenRoute
import com.sats.dna.sample.routes.components.YourMostBookedSampleScreenRoute
import com.sats.dna.sample.routes.icons.IconsSampleScreenRoute
import com.sats.dna.sample.routes.styles.ColorsSampleScreenRoute
import com.sats.dna.sample.routes.styles.TypographySampleScreenRoute
import com.sats.dna.theme.SatsTheme

@Composable
internal fun HomeScreen(openSampleScreen: (SampleScreenRoute) -> Unit, modifier: Modifier = Modifier) {
    val topAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    val searchBarState = remember { HomeScreenSearchBarState() }

    SatsScreen(
        modifier = modifier.nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
        topBar = {
            SatsTopAppBar(
                title = "SATS DNA Sample App",
                scrollBehavior = topAppBarScrollBehavior,
                modifier = Modifier.trySharedBounds("top-bar"),
            )
        },
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
                    groups.keys.forEach { sectionTitle ->
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
                                                    onClick = { openSampleScreen(sampleScreen) },
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

private val groups: Map<String, List<SampleScreenRoute>> = mapOf(
    "Styles" to listOf(
        ColorsSampleScreenRoute,
        TypographySampleScreenRoute,
    ),
    "Icons" to listOf(
        IconsSampleScreenRoute,
    ),
    "Components" to listOf(
        ArticleCardSampleScreenRoute,
        BadgeSampleScreenRoute,
        BannerSampleScreenRoute,
        BrandLogoSampleScreenRoute,
        ButtonsSampleScreenRoute,
        CardSampleScreenRoute,
        ChallengeBackgroundSampleScreenRoute,
        ChallengeBadgeSampleScreenRoute,
        ChallengeCardSampleScreenRoute,
        CheckboxSampleScreenRoute,
        ChipsSampleScreenRoute,
        ChoiceBoxSampleScreenRoute,
        CompletedWorkoutListItemSampleScreenRoute,
        DividersSampleScreenRoute,
        EmptyStateSampleScreenRoute,
        FancyTopAppBarSampleScreenRoute,
        FormInputFieldsSampleScreenRoute,
        FriendsBookingStatusSampleScreenRoute,
        GeneralListItemSampleScreenRoute,
        JoinYourFriendsSampleScreenRoute,
        PlaceholdersSampleScreenRoute,
        ProgressBarsSampleScreenRoute,
        ProteinBarSampleScreenRoute,
        RadioButtonsSampleScreenRoute,
        ScaleBarSampleScreenRoute,
        ScheduleSampleScreenRoute,
        SearchBarSampleScreenRoute,
        SessionDetailsInfoLabelSampleScreenRoute,
        SurfaceSampleScreenRoute,
        SwitchSampleScreenRoute,
        TabRowSampleScreenRoute,
        TagsSampleScreenRoute,
        TextFieldSampleScreenRoute,
        TitledSectionSampleScreenRoute,
        TopAppBarSampleScreenRoute,
        TrafficLightsSampleScreenRoute,
        UpcomingWorkoutListItemSampleScreenRoute,
        WorkoutStatisticsSampleScreenRoute,
        YourMostBookedSampleScreenRoute,
    ),
)

@PreviewLightDark
@Composable
private fun HomeScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            HomeScreen(openSampleScreen = {})
        }
    }
}
