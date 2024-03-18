package com.sats.dna.colors

import androidx.compose.ui.graphics.Color

class SatsColors2(
    val buttons: Buttons,
    val graphicalElements: GraphicalElements,
    val backgrounds: Backgrounds2,
    val surfaces: Surfaces2,
    val signalSurfaces: SignalSurfaces2,
    val isLightMode: Boolean,
) {
    class Buttons(
        val primary: Primary,
        val secondary: Secondary,
        val clean: Clean,
        val cleanSecondary: CleanSecondary,
        val action: Action,
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
        val progressBar: ProgressBar2,
        val fixedProgressBar: FixedProgressBar2,
        val graphs: Graphs,
        val selector: Selector,
        val selectorFixed: SelectorFixed,
        val chips: Chips,
        val toggle: Toggle,
        val icons: Icons,
        val indicators: Indicators,
        val signal: Signal,
        val tags: Tags,
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

        class ProgressBar(progressBar2: ProgressBar2) {
            @Deprecated("", ReplaceWith("SatsTheme.colors2.graphicalElements.progressBar2.default.fg"))
            val indicator: Color = progressBar2.default.fg

            @Deprecated("", ReplaceWith("SatsTheme.colors2.graphicalElements.progressBar2.alternate.fg"))
            val indicatorAlternate: Color = progressBar2.alternate.fg

            @Deprecated("", ReplaceWith("SatsTheme.colors2.graphicalElements.progressBar2.default.bg"))
            val bg: Color = progressBar2.default.bg
        }

        class ProgressBar2(
            val default: ColorSet,
            val alternate: ColorSet,
        )

        class FixedProgressBar(fixedProgressBar2: FixedProgressBar2) {
            @Deprecated("", ReplaceWith("SatsTheme.colors2.graphicalElements.fixedProgressBar2.default.fg"))
            val indicator: Color = fixedProgressBar2.default.fg

            @Deprecated("", ReplaceWith("SatsTheme.colors2.graphicalElements.fixedProgressBar2.alternate.fg"))
            val indicatorAlternate: Color = fixedProgressBar2.alternate.fg

            @Deprecated("", ReplaceWith("SatsTheme.colors2.graphicalElements.fixedProgressBar2.default.bg"))
            val bg: Color = fixedProgressBar2.default.bg
        }

        class FixedProgressBar2(
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
            val unselected: Unselected,
            val selected: Selected,
            val indicator: Color,
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

        class SelectorFixed(
            val unselected: Unselected,
            val selected: Selected,
            val indicator: Color,
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

        class Chips(
            val unselected: Unselected,
            val selected: Selected,
        ) {
            class Unselected(
                val default: ColorSet,
                val disabled: ColorSet,
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

    class Backgrounds(backgrounds2: Backgrounds2) {
        val primary = Primary(backgrounds2)
        val secondary = Secondary(backgrounds2)
        val fixed = Fixed(backgrounds2)

        class Primary(backgrounds2: Backgrounds2) {
            val bg = Bg(backgrounds2)
            val fg = Fg(backgrounds2)

            class Bg(backgrounds2: Backgrounds2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.primary.default.bg"))
                val default: Color = backgrounds2.primary.default.bg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.primary.selected.bg"))
                val selected: Color = backgrounds2.primary.selected.bg
            }

            class Fg(backgrounds2: Backgrounds2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.primary.default.fg"))
                val default: Color = backgrounds2.primary.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.primary.default.fgAlternate"))
                val alternate: Color = backgrounds2.primary.default.fgAlternate

                @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.primary.default.fgDisabled"))
                val disabled: Color = backgrounds2.primary.default.fgDisabled
            }
        }

        class Secondary(backgrounds2: Backgrounds2) {
            val bg = Bg(backgrounds2)
            val fg = Fg(backgrounds2)

            class Bg(backgrounds2: Backgrounds2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.secondary.default.bg"))
                val default: Color = backgrounds2.secondary.default.bg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.secondary.selected.bg"))
                val selected: Color = backgrounds2.secondary.selected.bg
            }

            class Fg(backgrounds2: Backgrounds2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.secondary.default.fg"))
                val default: Color = backgrounds2.secondary.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.secondary.default.fgAlternate"))
                val alternate: Color = backgrounds2.secondary.default.fgAlternate

                @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.secondary.default.fgDisabled"))
                val disabled: Color = backgrounds2.secondary.default.fgDisabled
            }
        }

        class Fixed(backgrounds2: Backgrounds2) {
            val primary = Primary(backgrounds2)
            val secondary = Secondary(backgrounds2)

            class Primary(backgrounds2: Backgrounds2) {
                val bg = Bg(backgrounds2)
                val fg = Fg(backgrounds2)

                class Bg(backgrounds2: Backgrounds2) {
                    @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.fixed.primary.default.bg"))
                    val default: Color = backgrounds2.fixed.primary.default.bg

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.fixed.primary.selected.bg"))
                    val selected: Color = backgrounds2.fixed.primary.selected.bg
                }

                class Fg(backgrounds2: Backgrounds2) {
                    @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.fixed.primary.default.fg"))
                    val default: Color = backgrounds2.fixed.primary.default.fg

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.fixed.primary.default.fgAlternate"))
                    val alternate: Color = backgrounds2.fixed.primary.default.fgAlternate

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.fixed.primary.default.fgDisabled"))
                    val disabled: Color = backgrounds2.fixed.primary.default.fgDisabled
                }
            }

            class Secondary(backgrounds2: Backgrounds2) {
                val bg = Bg(backgrounds2)
                val fg = Fg(backgrounds2)

                class Bg(backgrounds2: Backgrounds2) {
                    @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.fixed.secondary.default.bg"))
                    val default: Color = backgrounds2.fixed.secondary.default.bg

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.fixed.secondary.selected.bg"))
                    val selected: Color = backgrounds2.fixed.secondary.selected.bg
                }

                class Fg(backgrounds2: Backgrounds2) {
                    @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.fixed.secondary.default.fg"))
                    val default: Color = backgrounds2.fixed.secondary.default.fg

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.fixed.secondary.default.fgAlternate"))
                    val alternate: Color = backgrounds2.fixed.secondary.default.fgAlternate

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.backgrounds2.fixed.secondary.default.fgDisabled"))
                    val disabled: Color = backgrounds2.fixed.secondary.default.fgDisabled
                }
            }
        }
    }

    class Backgrounds2(
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

    class Surfaces(surfaces2: Surfaces2) {
        val primary = Primary(surfaces2)
        val secondary = Secondary(surfaces2)
        val fixed = Fixed(surfaces2)

        class Primary(surfaces2: Surfaces2) {
            val bg = Bg(surfaces2)
            val fg = Fg(surfaces2)

            class Bg(surfaces2: Surfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.bg"))
                val default: Color = surfaces2.primary.default.bg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.selected.bg"))
                val selected: Color = surfaces2.primary.selected.bg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.disabled.bg"))
                val disabled: Color = surfaces2.primary.disabled.bg
            }

            class Fg(surfaces2: Surfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.fg"))
                val default: Color = surfaces2.primary.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.fgAlternate"))
                val alternate: Color = surfaces2.primary.default.fgAlternate

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.fgDisabled"))
                val disabled: Color = surfaces2.primary.default.fgDisabled

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.fgSuccess"))
                val success: Color = surfaces2.primary.default.fgSuccess

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.fgWarning"))
                val warning: Color = surfaces2.primary.default.fgWarning

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.fgError"))
                val error: Color = surfaces2.primary.default.fgError

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.fgWaitingList"))
                val waitlist: Color = surfaces2.primary.default.fgWaitingList

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.fgNeutral"))
                val neutral: Color = surfaces2.primary.default.fgNeutral

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.fgInformation"))
                val information: Color = surfaces2.primary.default.fgInformation

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.primary.default.fgFeatured"))
                val featured: Color = surfaces2.primary.default.fgFeatured
            }
        }

        class Secondary(surfaces2: Surfaces2) {
            val bg = Bg(surfaces2)
            val fg = Fg(surfaces2)

            class Bg(surfaces2: Surfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.bg"))
                val default: Color = surfaces2.secondary.default.bg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.selected.bg"))
                val selected: Color = surfaces2.secondary.selected.bg
            }

            class Fg(surfaces2: Surfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.fg"))
                val default: Color = surfaces2.secondary.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.fgAlternate"))
                val alternate: Color = surfaces2.secondary.default.fgAlternate

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.fgDisabled"))
                val disabled: Color = surfaces2.secondary.default.fgDisabled

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.fgSuccess"))
                val success: Color = surfaces2.secondary.default.fgSuccess

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.fgWarning"))
                val warning: Color = surfaces2.secondary.default.fgWarning

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.fgError"))
                val error: Color = surfaces2.secondary.default.fgError

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.fgWaitingList"))
                val waitlist: Color = surfaces2.secondary.default.fgWaitingList

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.fgNeutral"))
                val neutral: Color = surfaces2.secondary.default.fgNeutral

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.fgInformation"))
                val information: Color = surfaces2.secondary.default.fgInformation

                @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.secondary.default.fgFeatured"))
                val featured: Color = surfaces2.secondary.default.fgFeatured
            }
        }

        class Fixed(surfaces2: Surfaces2) {
            val primary = Primary(surfaces2)
            val secondary = Secondary(surfaces2)

            class Primary(surfaces2: Surfaces2) {
                val bg = Bg(surfaces2)
                val fg = Fg(surfaces2)

                class Bg(surfaces2: Surfaces2) {
                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.bg"))
                    val default: Color = surfaces2.fixed.primary.default.bg

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.selected.bg"))
                    val selected: Color = surfaces2.fixed.primary.selected.bg
                }

                class Fg(surfaces2: Surfaces2) {
                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.fg"))
                    val default: Color = surfaces2.fixed.primary.default.fg

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.fgAlternate"))
                    val alternate: Color = surfaces2.fixed.primary.default.fgAlternate

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.fgDisabled"))
                    val disabled: Color = surfaces2.fixed.primary.default.fgDisabled

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.fgSuccess"))
                    val success: Color = surfaces2.fixed.primary.default.fgSuccess

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.fgWarning"))
                    val warning: Color = surfaces2.fixed.primary.default.fgWarning

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.fgError"))
                    val error: Color = surfaces2.fixed.primary.default.fgError

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.fgWaitingList"))
                    val waitlist: Color = surfaces2.fixed.primary.default.fgWaitingList

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.fgNeutral"))
                    val neutral: Color = surfaces2.fixed.primary.default.fgNeutral

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.fgInformation"))
                    val information: Color = surfaces2.fixed.primary.default.fgInformation

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.primary.default.fgFeatured"))
                    val featured: Color = surfaces2.fixed.primary.default.fgFeatured
                }
            }

            class Secondary(surfaces2: Surfaces2) {
                val bg = Bg(surfaces2)
                val fg = Fg(surfaces2)

                class Bg(surfaces2: Surfaces2) {
                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.bg"))
                    val default: Color = surfaces2.fixed.secondary.default.bg

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.selected.bg"))
                    val selected: Color = surfaces2.fixed.secondary.selected.bg
                }

                class Fg(surfaces2: Surfaces2) {
                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.fg"))
                    val default: Color = surfaces2.fixed.secondary.default.fg

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.fgAlternate"))
                    val alternate: Color = surfaces2.fixed.secondary.default.fgAlternate

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.fgDisabled"))
                    val disabled: Color = surfaces2.fixed.secondary.default.fgDisabled

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.fgSuccess"))
                    val success: Color = surfaces2.fixed.secondary.default.fgSuccess

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.fgWarning"))
                    val warning: Color = surfaces2.fixed.secondary.default.fgWarning

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.fgError"))
                    val error: Color = surfaces2.fixed.secondary.default.fgError

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.fgWaitingList"))
                    val waitlist: Color = surfaces2.fixed.secondary.default.fgWaitingList

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.fgNeutral"))
                    val neutral: Color = surfaces2.fixed.secondary.default.fgNeutral

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.fgInformation"))
                    val information: Color = surfaces2.fixed.secondary.default.fgInformation

                    @Deprecated("", ReplaceWith("SatsTheme.colors2.surfaces2.fixed.secondary.default.fgFeatured"))
                    val featured: Color = surfaces2.fixed.secondary.default.fgFeatured
                }
            }
        }
    }

    class Surfaces2(
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

    class SignalSurfaces(signalSurfaces2: SignalSurfaces2) {
        val success = Success(signalSurfaces2)
        val warning = Warning(signalSurfaces2)
        val error = Error(signalSurfaces2)
        val waitingList = WaitingList(signalSurfaces2)
        val neutral = Neutral(signalSurfaces2)
        val information = Information(signalSurfaces2)
        val featured = Featured(signalSurfaces2)

        class Success(signalSurfaces2: SignalSurfaces2) {
            @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.success.default.bg"))
            val bg: Color = signalSurfaces2.success.default.bg

            val fg = Fg(signalSurfaces2)

            class Fg(signalSurfaces2: SignalSurfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.success.default.fg"))
                val default: Color = signalSurfaces2.success.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.success.alternate.fg"))
                val alternate: Color = signalSurfaces2.success.alternate.fg
            }
        }

        class Warning(signalSurfaces2: SignalSurfaces2) {
            @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.warning.default.bg"))
            val bg: Color = signalSurfaces2.warning.default.bg

            val fg = Fg(signalSurfaces2)

            class Fg(signalSurfaces2: SignalSurfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.warning.default.fg"))
                val default: Color = signalSurfaces2.warning.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.warning.alternate.fg"))
                val alternate: Color = signalSurfaces2.warning.alternate.fg
            }
        }

        class Error(signalSurfaces2: SignalSurfaces2) {
            @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.error.default.bg"))
            val bg: Color = signalSurfaces2.error.default.bg

            val fg = Fg(signalSurfaces2)

            class Fg(signalSurfaces2: SignalSurfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.error.default.fg"))
                val default: Color = signalSurfaces2.error.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.error.alternate.fg"))
                val alternate: Color = signalSurfaces2.error.alternate.fg
            }
        }

        class WaitingList(signalSurfaces2: SignalSurfaces2) {
            @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.waitingList.default.bg"))
            val bg: Color = signalSurfaces2.waitingList.default.bg

            val fg = Fg(signalSurfaces2)

            class Fg(signalSurfaces2: SignalSurfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.waitingList.default.fg"))
                val default: Color = signalSurfaces2.waitingList.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.waitingList.alternate.fg"))
                val alternate: Color = signalSurfaces2.waitingList.alternate.fg
            }
        }

        class Neutral(signalSurfaces2: SignalSurfaces2) {
            @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.neutral.default.bg"))
            val bg: Color = signalSurfaces2.neutral.default.bg

            val fg = Fg(signalSurfaces2)

            class Fg(signalSurfaces2: SignalSurfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.neutral.default.fg"))
                val default: Color = signalSurfaces2.neutral.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.neutral.alternate.fg"))
                val alternate: Color = signalSurfaces2.neutral.alternate.fg
            }
        }

        class Information(signalSurfaces2: SignalSurfaces2) {
            @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.information.default.bg"))
            val bg: Color = signalSurfaces2.information.default.bg

            val fg = Fg(signalSurfaces2)

            class Fg(signalSurfaces2: SignalSurfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.information.default.fg"))
                val default: Color = signalSurfaces2.information.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.information.alternate.fg"))
                val alternate: Color = signalSurfaces2.information.alternate.fg
            }
        }

        class Featured(signalSurfaces2: SignalSurfaces2) {
            @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.featured.default.bg"))
            val bg: Color = signalSurfaces2.featured.default.bg

            val fg = Fg(signalSurfaces2)

            class Fg(signalSurfaces2: SignalSurfaces2) {
                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.featured.default.fg"))
                val default: Color = signalSurfaces2.featured.default.fg

                @Deprecated("", ReplaceWith("SatsTheme.colors2.signalSurfaces2.featured.alternate.fg"))
                val alternate: Color = signalSurfaces2.featured.alternate.fg
            }
        }
    }

    class SignalSurfaces2(
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

interface ColorSet {
    val bg: Color
    val fg: Color
}

internal fun ColorSet(
    bg: Color,
    fg: Color,
): ColorSet {
    return object : ColorSet {
        override val bg = bg
        override val fg = fg
    }
}

interface OutlinedColorSet : ColorSet {
    override val bg: Color
    override val fg: Color
    val outline: Color
}

internal fun OutlinedColorSet(
    bg: Color,
    fg: Color,
    outline: Color,
): OutlinedColorSet {
    return object : OutlinedColorSet {
        override val bg = bg
        override val fg = fg
        override val outline = outline
    }
}

interface BackgroundColorSet : ColorSet {
    override val bg: Color
    override val fg: Color
    val fgAlternate: Color
    val fgDisabled: Color
}

internal fun BackgroundColorSet(
    bg: Color,
    fgDefault: Color,
    fgAlternate: Color,
    fgDisabled: Color,
): BackgroundColorSet {
    return object : BackgroundColorSet {
        override val bg = bg
        override val fg = fgDefault
        override val fgAlternate = fgAlternate
        override val fgDisabled = fgDisabled
    }
}

interface SurfaceColorSet : ColorSet {
    override val bg: Color
    override val fg: Color
    val fgAlternate: Color
    val fgDisabled: Color
    val fgSuccess: Color
    val fgWarning: Color
    val fgError: Color
    val fgWaitingList: Color
    val fgNeutral: Color
    val fgInformation: Color
    val fgFeatured: Color
}

internal fun SurfaceColorSet(
    bg: Color,
    fgDefault: Color,
    fgAlternate: Color,
    fgDisabled: Color,
    fgSuccess: Color,
    fgWarning: Color,
    fgError: Color,
    fgWaitingList: Color,
    fgNeutral: Color,
    fgInformation: Color,
    fgFeatured: Color,
): SurfaceColorSet {
    return object : SurfaceColorSet {
        override val bg = bg
        override val fg = fgDefault
        override val fgAlternate = fgAlternate
        override val fgDisabled = fgDisabled
        override val fgSuccess = fgSuccess
        override val fgWarning = fgWarning
        override val fgError = fgError
        override val fgWaitingList = fgWaitingList
        override val fgNeutral = fgNeutral
        override val fgInformation = fgInformation
        override val fgFeatured = fgFeatured
    }
}
