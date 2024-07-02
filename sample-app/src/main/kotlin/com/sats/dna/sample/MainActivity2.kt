package com.sats.dna.sample

import android.os.Bundle
import android.os.Parcelable
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
import com.sats.dna.sample.routes.styles.ColorPrimitivesSampleScreenRoute
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
import com.sats.dna.sample.screens.components.ChoiceBoxSampleScreen
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
import com.sats.dna.sample.screens.styles.ColorPrimitivesSampleScreen
import com.sats.dna.sample.screens.styles.ColorsSampleScreen
import com.sats.dna.sample.screens.styles.TypographySampleScreen
import kotlinx.parcelize.Parcelize

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            MainScreen(Modifier.fillMaxSize())
        }
    }
}

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val navigator = rememberListDetailPaneScaffoldNavigator<SampleScreenRoute2>()

    ListDetailPaneScaffold(
        directive = navigator.scaffoldDirective,
        value = navigator.scaffoldValue,
        listPane = {
            ListPane(
                openSampleScreen = {
                    navigator.navigateTo(
                        pane = ListDetailPaneScaffoldRole.Detail,
                        content = SampleScreenRoute2(it.name),
                    )
                },
            )
        },
        detailPane = {
            navigator.currentDestination?.content?.let { route ->
                DetailPane(SampleScreenRoute2(route.name), navigateUp = navigator::navigateBack)
            }
        },
        modifier = modifier,
    )
}

@Composable
fun ListPane(openSampleScreen: (SampleScreenRoute) -> Unit, modifier: Modifier = Modifier) {
    HomeScreen(openSampleScreen, modifier)
}

@Composable
fun DetailPane(route: SampleScreenRoute2, navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    when (route.name) {
        ColorPrimitivesSampleScreenRoute.name -> ColorPrimitivesSampleScreen(navigateUp, modifier)
        ColorsSampleScreenRoute.name -> ColorsSampleScreen(navigateUp, modifier)
        IconsSampleScreenRoute.name -> IconsSampleScreen(navigateUp, modifier)
        TypographySampleScreenRoute.name -> TypographySampleScreen(navigateUp, modifier)
        BadgeSampleScreenRoute.name -> BadgeSampleScreen(navigateUp, modifier)
        BannerSampleScreenRoute.name -> BannerSampleScreen(navigateUp, modifier)
        BrandLogoSampleScreenRoute.name -> BrandLogoSampleScreen(navigateUp, modifier)
        ButtonsSampleScreenRoute.name -> ButtonsSampleScreen(navigateUp, modifier)
        ArticleCardSampleScreenRoute.name -> ArticleCardSampleScreen(navigateUp, modifier)
        CardSampleScreenRoute.name -> CardSampleScreen(navigateUp, modifier)
        ChallengeBackgroundSampleScreenRoute.name -> ChallengeBackgroundSampleScreen(navigateUp, modifier)
        ChallengeBadgeSampleScreenRoute.name -> ChallengeBadgeSampleScreen(navigateUp, modifier)
        ChallengeCardSampleScreenRoute.name -> ChallengeCardSampleScreen(navigateUp, modifier)
        CheckboxSampleScreenRoute.name -> CheckboxSampleScreen(navigateUp, modifier)
        ChipsSampleScreenRoute.name -> ChipsSampleScreen(navigateUp, modifier)
        ChoiceBoxSampleScreenRoute.name -> ChoiceBoxSampleScreen(navigateUp, modifier)
        CompletedWorkoutListItemSampleScreenRoute.name -> CompletedWorkoutListItemSampleScreen(navigateUp, modifier)
        DividersSampleScreenRoute.name -> DividersSampleScreen(navigateUp, modifier)
        EmptyStateSampleScreenRoute.name -> EmptyStateSampleScreen(navigateUp, modifier)
        FancyTopAppBarSampleScreenRoute.name -> FancyTopAppBarSampleScreen(navigateUp, modifier)
        FormInputFieldsSampleScreenRoute.name -> FormInputFieldsSampleScreen(navigateUp, modifier)
        FriendsBookingStatusSampleScreenRoute.name -> FriendsBookingStatusSampleScreen(navigateUp, modifier)
        GeneralListItemSampleScreenRoute.name -> GeneralListItemSampleScreen(navigateUp, modifier)
        JoinYourFriendsSampleScreenRoute.name -> JoinYourFriendsSampleScreen(navigateUp, modifier)
        PlaceholdersSampleScreenRoute.name -> PlaceholdersSampleScreen(navigateUp, modifier)
        ProgressBarsSampleScreenRoute.name -> ProgressBarsSampleScreen(navigateUp, modifier)
        ProteinBarSampleScreenRoute.name -> ProteinBarSampleScreen(navigateUp, modifier)
        RadioButtonsSampleScreenRoute.name -> RadioButtonsSampleScreen(navigateUp, modifier)
        ScaleBarSampleScreenRoute.name -> ScaleBarSampleScreen(navigateUp, modifier)
        ScheduleSampleScreenRoute.name -> ScheduleSampleScreen(navigateUp, modifier)
        SearchBarSampleScreenRoute.name -> SearchBarSampleScreen(navigateUp, modifier)
        SessionDetailsInfoLabelSampleScreenRoute.name -> SessionDetailsInfoLabelSampleScreen(navigateUp, modifier)
        SurfaceSampleScreenRoute.name -> SurfaceSampleScreen(navigateUp, modifier)
        SwitchSampleScreenRoute.name -> SwitchSampleScreen(navigateUp, modifier)
        TabRowSampleScreenRoute.name -> TabRowSampleScreen(navigateUp, modifier)
        TagsSampleScreenRoute.name -> TagsSampleScreen(navigateUp, modifier)
        TextFieldSampleScreenRoute.name -> TextFieldSampleScreen(navigateUp, modifier)
        TitledSectionSampleScreenRoute.name -> TitledSectionSampleScreen(navigateUp, modifier)
        TopAppBarSampleScreenRoute.name -> TopAppBarSampleScreen(navigateUp, modifier)
        TrafficLightsSampleScreenRoute.name -> TrafficLightsSampleScreen(navigateUp, modifier)
        UpcomingWorkoutListItemSampleScreenRoute.name -> UpcomingWorkoutListItemSampleScreen(navigateUp, modifier)
        WorkoutStatisticsSampleScreenRoute.name -> WorkoutStatisticsSampleScreen(navigateUp, modifier)
        YourMostBookedSampleScreenRoute.name -> YourMostBookedSampleScreen(navigateUp, modifier)
    }
}

@Parcelize
class SampleScreenRoute2(val name: String) : Parcelable
