package com.sats.dna.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.AnimatedPane
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.PaneAdaptedValue
import androidx.compose.material3.adaptive.layout.ThreePaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.CompositionLocalProvider
import com.sats.dna.sample.internal.LocalSharedTransitionScope
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
import com.sats.dna.sample.screens.HomeScreen
import com.sats.dna.sample.screens.components.ArticleCardSampleScreen
import com.sats.dna.sample.screens.components.BadgeSampleScreen
import com.sats.dna.sample.screens.components.BannerSampleScreen
import com.sats.dna.sample.screens.components.BrandLogoSampleScreen
import com.sats.dna.sample.screens.components.ButtonsSampleScreen
import com.sats.dna.sample.screens.components.CardSampleScreen
import com.sats.dna.sample.screens.components.ChallengeBackgroundSampleScreen
import com.sats.dna.sample.screens.components.ChallengeBadgeSampleScreen
import com.sats.dna.sample.screens.components.ChallengeCardSampleScreen
import com.sats.dna.sample.screens.components.CheckboxSampleScreen
import com.sats.dna.sample.screens.components.ChipsSampleScreen
import com.sats.dna.sample.screens.components.CompletedWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.components.DividersSampleScreen
import com.sats.dna.sample.screens.components.EmptyStateSampleScreen
import com.sats.dna.sample.screens.components.FancyTopAppBarSampleScreen
import com.sats.dna.sample.screens.components.FormInputFieldsSampleScreen
import com.sats.dna.sample.screens.components.FriendsBookingStatusSampleScreen
import com.sats.dna.sample.screens.components.GeneralListItemSampleScreen
import com.sats.dna.sample.screens.components.JoinYourFriendsSampleScreen
import com.sats.dna.sample.screens.components.PlaceholdersSampleScreen
import com.sats.dna.sample.screens.components.ProgressBarsSampleScreen
import com.sats.dna.sample.screens.components.ProteinBarSampleScreen
import com.sats.dna.sample.screens.components.RadioButtonsSampleScreen
import com.sats.dna.sample.screens.components.ScaleBarSampleScreen
import com.sats.dna.sample.screens.components.ScheduleSampleScreen
import com.sats.dna.sample.screens.components.SearchBarSampleScreen
import com.sats.dna.sample.screens.components.SessionDetailsInfoLabelSampleScreen
import com.sats.dna.sample.screens.components.SurfaceSampleScreen
import com.sats.dna.sample.screens.components.SwitchSampleScreen
import com.sats.dna.sample.screens.components.TabRowSampleScreen
import com.sats.dna.sample.screens.components.TagsSampleScreen
import com.sats.dna.sample.screens.components.TextFieldSampleScreen
import com.sats.dna.sample.screens.components.TitledSectionSampleScreen
import com.sats.dna.sample.screens.components.TopAppBarSampleScreen
import com.sats.dna.sample.screens.components.TrafficLightsSampleScreen
import com.sats.dna.sample.screens.components.UpcomingWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.components.WorkoutStatisticsSampleScreen
import com.sats.dna.sample.screens.components.YourMostBookedSampleScreen
import com.sats.dna.sample.screens.icons.IconsSampleScreen
import com.sats.dna.sample.screens.styles.ColorsSampleScreen
import com.sats.dna.sample.screens.styles.TypographySampleScreen
import com.sats.dna.theme.SatsTheme

class MainActivity2 : ComponentActivity() {
    @OptIn(ExperimentalMaterial3AdaptiveApi::class, ExperimentalSharedTransitionApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            SatsTheme {
                val navigator = rememberListDetailPaneScaffoldNavigator<SampleScreenRoute>(

                )
                val openSampleScreen = { route: SampleScreenRoute ->
                    navigator.navigateTo(ThreePaneScaffoldRole.Primary, route)
                }

                BackHandler(navigator.canNavigateBack()) {
                    navigator.navigateBack()
                }

                SharedTransitionScope { sharedTransitionScopeModifier ->
                    CompositionLocalProvider(LocalSharedTransitionScope provides this) {
                        ListDetailPaneScaffold(
                            modifier = sharedTransitionScopeModifier,
                            directive = navigator.scaffoldDirective,
                            value = navigator.scaffoldValue,
                            listPane = {
                                AnimatedPane {
                                    HomeScreen(openSampleScreen = openSampleScreen)
                                }
                            },
                            detailPane = {
                                AnimatedPane {
                                    navigator.currentDestination?.content?.let { sampleScreenRoute ->
                                        val navigateUp: (() -> Unit)? = {
                                            navigator.navigateBack()
                                            Unit
                                        }.takeIf { navigator.scaffoldValue.secondary == PaneAdaptedValue.Hidden }

                                        when (sampleScreenRoute) {
                                            is ColorsSampleScreenRoute -> {
                                                ColorsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is IconsSampleScreenRoute -> {
                                                IconsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is TypographySampleScreenRoute -> {
                                                TypographySampleScreen(navigateUp = navigateUp)
                                            }

                                            is BadgeSampleScreenRoute -> {
                                                BadgeSampleScreen(navigateUp = navigateUp)
                                            }

                                            is BannerSampleScreenRoute -> {
                                                BannerSampleScreen(navigateUp = navigateUp)
                                            }

                                            is BrandLogoSampleScreenRoute -> {
                                                BrandLogoSampleScreen(navigateUp = navigateUp)
                                            }

                                            is ButtonsSampleScreenRoute -> {
                                                ButtonsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is ArticleCardSampleScreenRoute -> {
                                                ArticleCardSampleScreen(navigateUp = navigateUp)
                                            }

                                            is CardSampleScreenRoute -> {
                                                CardSampleScreen(navigateUp = navigateUp)
                                            }

                                            is ChallengeBackgroundSampleScreenRoute -> {
                                                ChallengeBackgroundSampleScreen(navigateUp = navigateUp)
                                            }

                                            is ChallengeBadgeSampleScreenRoute -> {
                                                ChallengeBadgeSampleScreen(navigateUp = navigateUp)
                                            }

                                            is ChallengeCardSampleScreenRoute -> {
                                                ChallengeCardSampleScreen(navigateUp = navigateUp)
                                            }

                                            is CheckboxSampleScreenRoute -> {
                                                CheckboxSampleScreen(navigateUp = navigateUp)
                                            }

                                            is ChipsSampleScreenRoute -> {
                                                ChipsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is CompletedWorkoutListItemSampleScreenRoute -> {
                                                CompletedWorkoutListItemSampleScreen(navigateUp = navigateUp)
                                            }

                                            is DividersSampleScreenRoute -> {
                                                DividersSampleScreen(navigateUp = navigateUp)
                                            }

                                            is EmptyStateSampleScreenRoute -> {
                                                EmptyStateSampleScreen(navigateUp = navigateUp)
                                            }

                                            is FancyTopAppBarSampleScreenRoute -> {
                                                FancyTopAppBarSampleScreen(navigateUp = navigateUp)
                                            }

                                            is FormInputFieldsSampleScreenRoute -> {
                                                FormInputFieldsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is FriendsBookingStatusSampleScreenRoute -> {
                                                FriendsBookingStatusSampleScreen(navigateUp = navigateUp)
                                            }

                                            is GeneralListItemSampleScreenRoute -> {
                                                GeneralListItemSampleScreen(navigateUp = navigateUp)
                                            }

                                            is JoinYourFriendsSampleScreenRoute -> {
                                                JoinYourFriendsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is PlaceholdersSampleScreenRoute -> {
                                                PlaceholdersSampleScreen(navigateUp = navigateUp)
                                            }

                                            is ProgressBarsSampleScreenRoute -> {
                                                ProgressBarsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is ProteinBarSampleScreenRoute -> {
                                                ProteinBarSampleScreen(navigateUp = navigateUp)
                                            }

                                            is RadioButtonsSampleScreenRoute -> {
                                                RadioButtonsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is ScaleBarSampleScreenRoute -> {
                                                ScaleBarSampleScreen(navigateUp = navigateUp)
                                            }

                                            is ScheduleSampleScreenRoute -> {
                                                ScheduleSampleScreen(navigateUp = navigateUp)
                                            }

                                            is SearchBarSampleScreenRoute -> {
                                                SearchBarSampleScreen(navigateUp = navigateUp)
                                            }

                                            is SessionDetailsInfoLabelSampleScreenRoute -> {
                                                SessionDetailsInfoLabelSampleScreen(navigateUp = navigateUp)
                                            }

                                            is SurfaceSampleScreenRoute -> {
                                                SurfaceSampleScreen(navigateUp = navigateUp)
                                            }

                                            is SwitchSampleScreenRoute -> {
                                                SwitchSampleScreen(navigateUp = navigateUp)
                                            }

                                            is TabRowSampleScreenRoute -> {
                                                TabRowSampleScreen(navigateUp = navigateUp)
                                            }

                                            is TagsSampleScreenRoute -> {
                                                TagsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is TextFieldSampleScreenRoute -> {
                                                TextFieldSampleScreen(navigateUp = navigateUp)
                                            }

                                            is TitledSectionSampleScreenRoute -> {
                                                TitledSectionSampleScreen(navigateUp = navigateUp)
                                            }

                                            is TopAppBarSampleScreenRoute -> {
                                                TopAppBarSampleScreen(navigateUp = navigateUp)
                                            }

                                            is TrafficLightsSampleScreenRoute -> {
                                                TrafficLightsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is UpcomingWorkoutListItemSampleScreenRoute -> {
                                                UpcomingWorkoutListItemSampleScreen(navigateUp = navigateUp)
                                            }

                                            is WorkoutStatisticsSampleScreenRoute -> {
                                                WorkoutStatisticsSampleScreen(navigateUp = navigateUp)
                                            }

                                            is YourMostBookedSampleScreenRoute -> {
                                                YourMostBookedSampleScreen(navigateUp = navigateUp)
                                            }
                                        }
                                    }
                                }
                            },
                        )
                    }
                }
            }
        }
    }
}
