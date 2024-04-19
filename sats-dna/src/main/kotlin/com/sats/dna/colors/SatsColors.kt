package com.sats.dna.colors

import androidx.compose.ui.graphics.Color

class SatsColors(
    val buttons: Buttons,
    val graphicalElements: GraphicalElements,
    val backgrounds: Backgrounds,
    val surfaces: Surfaces,
    val signalSurfaces: SignalSurfaces,
    val isLightMode: Boolean,
) {
    class Buttons(
        val primary: Primary,
        val secondary: Secondary,
        val clean: Clean,
        val cleanSecondary: CleanSecondary,
        val action: Action,
        val fixedAction: FixedAction,
        val cta: Cta,
        val waitingListFilled: WaitingListFilled,
        val waitingListOutlined: WaitingListOutlined,
        val destructive: Destructive,
    ) {
        class Primary(
            val default: ColorSet,
            val disabled: ColorSet,
        )

        class Secondary(
            val default: OutlinedColorSet,
            val disabled: OutlinedColorSet,
        )

        class Clean(
            val default: ColorSet,
            val disabled: ColorSet,
        )

        class CleanSecondary(
            val default: OutlinedColorSet,
            val disabled: OutlinedColorSet,
        )

        class Action(
            val default: ColorSet,
            val disabled: ColorSet,
        )

        class FixedAction(
            val default: ColorSet,
            val disabled: ColorSet,
        )

        class Cta(
            val default: ColorSet,
            val disabled: ColorSet,
        )

        class WaitingListFilled(
            val default: ColorSet,
            val disabled: ColorSet,
        )

        class WaitingListOutlined(
            val default: OutlinedColorSet,
            val disabled: OutlinedColorSet,
        )

        class Destructive(
            val default: Default,
            val outlined: Outlined,
        ) {
            class Default(
                val default: ColorSet,
                val disabled: ColorSet,
            )

            class Outlined(
                val default: OutlinedColorSet,
                val disabled: OutlinedColorSet,
            )
        }
    }

    class GraphicalElements(
        val divider: Divider,
        val border: Border,
        val signalBorder: SignalBorder,
        val skeleton: Color,
        val navBar: NavBar,
        val progressBar: ProgressBar,
        val fixedProgressBar: FixedProgressBar,
        val graphs: Graphs,
        val selector: Selector,
        val selectorFixed: SelectorFixed,
        val chips: Chips,
        val toggle: Toggle,
        val icons: Icons,
        val indicators: Indicators,
        val signal: Signal,
        val tags: Tags,
        val indicatorTag: IndicatorTag,
        val badge: Badge,
        val fixedBadge: FixedBadge,
        val rewards: Rewards,
        val workouts: Workouts,
    ) {
        class Divider(
            val default: Color,
            val alternate: Color,
        )

        class Border(
            val default: Color,
            val focused: Color,
        )

        class SignalBorder(
            val success: Color,
            val warning: Color,
            val error: Color,
            val waitingList: Color,
            val neutral: Color,
            val information: Color,
            val featured: Color,
        )

        class NavBar(
            val selected: Color,
            val notSelected: Color,
        )

        class ProgressBar(
            val default: ColorSet,
            val alternate: ColorSet,
        )

        class FixedProgressBar(
            val default: ColorSet,
            val alternate: ColorSet,
        )

        class Graphs(
            val bar: Bar,
            val trend: Trend,
        ) {
            class Bar(
                val primary: Primary,
                val secondary: Secondary,
            ) {
                class Primary(
                    val default: Color,
                    val bg: Color,
                )

                class Secondary(
                    val default: Color,
                    val bg: Color,
                )
            }

            class Trend(
                val upwards: Color,
                val neutral: Color,
                val downwards: Color,
            )
        }

        class Selector(
            val primary: Primary,
            val secondary: Secondary,
        ) {
            class Primary(
                val unselected: Unselected,
                val selected: Selected,
                val unselectedSurface: UnselectedSurface,
                val selectedSurface: SelectedSurface,
            ) {
                class Unselected(
                    val default: OutlinedColorSet,
                    val disabled: OutlinedColorSet,
                )

                class Selected(
                    val default: ColorSet,
                    val disabled: ColorSet,
                )

                class UnselectedSurface(
                    val default: Color,
                    val disabled: Color,
                )

                class SelectedSurface(
                    val default: Color,
                    val disabled: Color,
                )
            }

            class Secondary(
                val unselected: Unselected,
                val selected: Selected,
                val unselectedSurface: UnselectedSurface,
                val selectedSurface: SelectedSurface,
            ) {
                class Unselected(
                    val default: OutlinedColorSet,
                    val disabled: OutlinedColorSet,
                )

                class Selected(
                    val default: ColorSet,
                    val disabled: ColorSet,
                )

                class UnselectedSurface(
                    val default: Color,
                    val disabled: Color,
                )

                class SelectedSurface(
                    val default: Color,
                    val disabled: Color,
                )
            }
        }

        class SelectorFixed(
            val unselected: Unselected,
            val selected: Selected,
            val selectedBackground: SelectedBackground,
        ) {
            class Unselected(
                val default: OutlinedColorSet,
                val disabled: OutlinedColorSet,
            )

            class Selected(
                val default: ColorSet,
                val disabled: ColorSet,
            )

            class SelectedBackground(
                val default: Color,
                val disabled: Color,
            )
        }

        class Chips(
            val unselected: Unselected,
            val selected: Selected,
        ) {
            class Unselected(
                val default: OutlinedColorSet,
                val disabled: OutlinedColorSet,
            )

            class Selected(
                val default: ColorSet,
                val disabled: ColorSet,
            )
        }

        class Toggle(
            val unselected: Unselected,
            val handle: Color,
            val selected: Selected,
        ) {
            class Unselected(
                val default: Color,
                val disabled: Color,
            )

            class Selected(
                val default: Color,
                val disabled: Color,
            )
        }

        class Icons(
            val primary: Color,
            val secondary: Color,
            val fixed: Color,
            val positive: Color,
            val attention: Color,
            val negative: Color,
            val waitingList: Color,
            val delete: Color,
        )

        class Indicators(
            val positive: Positive,
            val attention: Attention,
            val negative: Negative,
            val neutral: Neutral,
        ) {
            class Positive(
                val default: Color,
                val alternate: Color,
            )

            class Attention(
                val default: Color,
                val alternate: Color,
            )

            class Negative(
                val default: Color,
                val alternate: Color,
            )

            class Neutral(
                val default: Color,
                val alternate: Color,
            )
        }

        class Signal(
            val success: Color,
            val warning: Color,
            val error: Color,
            val neutral: Color,
            val waitingList: Color,
        )

        class Tags(
            val primary: ColorSet,
            val secondary: ColorSet,
            val featured: ColorSet,
        )

        class IndicatorTag(
            val positive: Positive,
            val attention: Attention,
            val negative: Negative,
            val featured: Featured,
            val neutral: Neutral,
            val information: Information,
        ) {
            class Positive(
                val default: ColorSet,
                val alternate: ColorSet,
            )

            class Attention(
                val default: ColorSet,
                val alternate: ColorSet,
            )

            class Negative(
                val default: ColorSet,
                val alternate: ColorSet,
            )

            class Featured(
                val default: ColorSet,
                val alternate: ColorSet,
            )

            class Neutral(
                val default: ColorSet,
                val alternate: ColorSet,
            )

            class Information(
                val default: ColorSet,
                val alternate: ColorSet,
            )
        }

        class Badge(
            val primary: ColorSet,
            val secondary: ColorSet,
            val tertiary: ColorSet,
        )

        class FixedBadge(
            val primary: ColorSet,
            val secondary: ColorSet,
            val tertiary: ColorSet,
        )

        class Rewards(
            val blue: ColorSet,
            val silver: ColorSet,
            val gold: ColorSet,
            val platinum: ColorSet,
        )

        class Workouts(
            val pt: ColorSet,
            val gx: ColorSet,
            val treatments: ColorSet,
            val gymfloor: ColorSet,
            val other: ColorSet,
            val bootcamp: ColorSet,
        )
    }

    class Backgrounds(
        val primary: Primary,
        val secondary: Secondary,
        val fixed: Fixed,
    ) {
        class Primary(
            val default: BackgroundColorSet,
            val selected: BackgroundColorSet,
        )

        class Secondary(
            val default: BackgroundColorSet,
            val selected: BackgroundColorSet,
        )

        class Fixed(
            val primary: Primary,
            val secondary: Secondary,
        ) {
            class Primary(
                val default: BackgroundColorSet,
                val selected: BackgroundColorSet,
            )

            class Secondary(
                val default: BackgroundColorSet,
                val selected: BackgroundColorSet,
            )
        }
    }

    class Surfaces(
        val primary: Primary,
        val secondary: Secondary,
        val fixed: Fixed,
    ) {
        class Primary(
            val default: SurfaceColorSet,
            val selected: SurfaceColorSet,
            val disabled: SurfaceColorSet,
        )

        class Secondary(
            val default: SurfaceColorSet,
            val selected: SurfaceColorSet,
        )

        class Fixed(
            val primary: Primary,
            val secondary: Secondary,
        ) {
            class Primary(
                val default: SurfaceColorSet,
                val selected: SurfaceColorSet,
            )

            class Secondary(
                val default: SurfaceColorSet,
                val selected: SurfaceColorSet,
            )
        }
    }

    class SignalSurfaces(
        val success: Success,
        val warning: Warning,
        val error: Error,
        val waitingList: WaitingList,
        val neutral: Neutral,
        val information: Information,
        val featured: Featured,
    ) {
        class Success(
            val default: ColorSet,
            val alternate: ColorSet,
        )

        class Warning(
            val default: ColorSet,
            val alternate: ColorSet,
        )

        class Error(
            val default: ColorSet,
            val alternate: ColorSet,
        )

        class WaitingList(
            val default: ColorSet,
            val alternate: ColorSet,
        )

        class Neutral(
            val default: ColorSet,
            val alternate: ColorSet,
        )

        class Information(
            val default: ColorSet,
            val alternate: ColorSet,
        )

        class Featured(
            val default: ColorSet,
            val alternate: ColorSet,
        )
    }
}

class ColorSet(
    val bg: Color,
    val fg: Color,
)

internal infix fun Color.on(bg: Color): ColorSet {
    return ColorSet(bg = bg, fg = this)
}

class OutlinedColorSet(
    val bg: Color,
    val fg: Color,
    val outline: Color,
)

class BackgroundColorSet(
    val bg: Color,
    val fg: Color,
    val fgAlternate: Color,
    val fgDisabled: Color,
)

class SurfaceColorSet(
    val bg: Color,
    val fg: Color,
    val fgAlternate: Color,
    val fgDisabled: Color,
    val fgSuccess: Color,
    val fgWarning: Color,
    val fgError: Color,
    val fgWaitingList: Color,
    val fgNeutral: Color,
    val fgInformation: Color,
    val fgFeatured: Color,
)
