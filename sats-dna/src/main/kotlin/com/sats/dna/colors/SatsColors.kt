package com.sats.dna.colors

import androidx.compose.ui.graphics.Color
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue10
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue60
import com.sats.dna.colors.SatsColorPrimitives.Cardinal60
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple40
import com.sats.dna.colors.SatsColorPrimitives.Gold60
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue10
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue100
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue105
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue90
import com.sats.dna.colors.SatsColorPrimitives.SatsBlueGrey80
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral100
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral120
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral130
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral170
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral190
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral90
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen60
import com.sats.dna.colors.SatsColorPrimitives.White0
import com.sats.dna.colors.SatsColorPrimitives.White10
import com.sats.dna.colors.SatsColorPrimitives.White100
import com.sats.dna.colors.SatsColorPrimitives.White15
import com.sats.dna.colors.SatsColorPrimitives.White40
import com.sats.dna.colors.SatsColorPrimitives.White5
import com.sats.dna.colors.SatsColorPrimitives.White50
import com.sats.dna.colors.SatsColorPrimitives.White60
import com.sats.dna.colors.SatsColorPrimitives.White65
import com.sats.dna.colors.SatsColorPrimitives.White70

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
        val action: Action,
        val cta: Cta,
        val waitingListFilled: WaitingListFilled,
        val waitingListOutlined: WaitingListOutlined,
        val destructive: Destructive,
    ) {
        val clean: Clean = Clean()
        val cleanSecondary: CleanSecondary = CleanSecondary()
        val fixedAction: FixedAction = FixedAction()

        class Primary(
            val default: ColorSet,
            val disabled: ColorSet,
        )

        class Secondary(
            val default: OutlinedColorSet,
            val disabled: OutlinedColorSet,
        )

        class Clean {
            val default: ColorSet = SatsBlue100 on White100
            val disabled: ColorSet = White50 on White10
        }

        class CleanSecondary {
            val default: OutlinedColorSet = OutlinedColorSet(
                bg = White15,
                outline = White100,
                fg = White100,
            )

            val disabled: OutlinedColorSet = OutlinedColorSet(
                bg = White5,
                outline = White40,
                fg = White70,
            )
        }

        class Action(
            val default: ColorSet,
            val disabled: ColorSet,
        )

        class FixedAction {
            val default = SatsCoral100 on White0
            val disabled = White50 on White0
        }

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
        val graphs: Graphs,
        val selector: Selector,
        val chips: Chips,
        val toggle: Toggle,
        val icons: Icons,
        val indicators: Indicators,
        val signal: Signal,
        val tags: Tags,
        val indicatorTag: IndicatorTag,
        val badge: Badge,
        val rewards: Rewards,
        val workouts: Workouts,
    ) {
        val fixedProgressBar: FixedProgressBar = FixedProgressBar()
        val selectorFixed: SelectorFixed = SelectorFixed()
        val fixedBadge: FixedBadge = FixedBadge()

        class Divider(
            val default: Color,
            val alternate: Color,
        ) {
            val fixed: Color = SatsColorPrimitives.White20
        }

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

        class FixedProgressBar {
            val default: ColorSet = SatsCoral90 on White40
            val alternate: ColorSet = SatsBlue10 on White40
        }

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

        class SelectorFixed {
            val unselected: Unselected = Unselected()
            val selected: Selected = Selected()
            val selectedBackground: SelectedBackground = SelectedBackground()

            class Unselected {
                val default = OutlinedColorSet(outline = White100, bg = White0, fg = White100)
                val disabled = OutlinedColorSet(outline = White50, bg = White0, fg = White50)
            }

            class Selected {
                val default: ColorSet = SatsBlue100 on SatsCoral90
                val disabled: ColorSet = SatsCoral170 on SatsCoral130
            }

            class SelectedBackground {
                val default: Color = SatsCoral170
                val disabled: Color = SatsCoral190
            }
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
            val positive: Color,
            val attention: Color,
            val negative: Color,
            val waitingList: Color,
            val delete: Color,
        ) {
            val fixed: Color = White100
        }

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

        class FixedBadge {
            val primary: ColorSet = White100 on SatsCoral120
            val secondary: ColorSet = SatsBlue100 on BrightBlue10
            val tertiary: ColorSet = White100 on SatsBlueGrey80
        }

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
    ) {
        val fixed: Fixed = Fixed()

        class Primary(
            val default: BackgroundColorSet,
            val selected: BackgroundColorSet,
        )

        class Secondary(
            val default: BackgroundColorSet,
            val selected: BackgroundColorSet,
        )

        class Fixed {
            val primary: Primary = Primary()
            val secondary: Secondary = Secondary()

            class Primary {
                val default: BackgroundColorSet = BackgroundColorSet(
                    bg = SatsBlue105,
                    fg = White100,
                    fgAlternate = White60,
                    fgDisabled = White50,
                )

                val selected: BackgroundColorSet = BackgroundColorSet(
                    bg = SatsBlue90,
                    fg = White100,
                    fgAlternate = White60,
                    fgDisabled = White50,
                )
            }

            class Secondary {
                val default: BackgroundColorSet = BackgroundColorSet(
                    bg = SatsBlue100,
                    fg = White100,
                    fgAlternate = White60,
                    fgDisabled = White50,
                )

                val selected: BackgroundColorSet = BackgroundColorSet(
                    bg = SatsBlueGrey80,
                    fg = White100,
                    fgAlternate = White60,
                    fgDisabled = White50,
                )
            }
        }
    }

    class Surfaces(
        val primary: Primary,
        val secondary: Secondary,
    ) {
        val fixed: Fixed = Fixed()

        class Primary(
            val default: SurfaceColorSet,
            val selected: SurfaceColorSet,
            val disabled: SurfaceColorSet,
        )

        class Secondary(
            val default: SurfaceColorSet,
            val selected: SurfaceColorSet,
        )

        class Fixed {
            val primary: Primary = Primary()
            val secondary: Secondary = Secondary()

            class Primary {
                val default: SurfaceColorSet = SurfaceColorSet(
                    bg = SatsBlue100,
                    fg = White100,
                    fgAlternate = White65,
                    fgDisabled = White50,
                    fgSuccess = SpringGreen60,
                    fgWarning = Gold60,
                    fgError = Cardinal60,
                    fgWaitingList = EgyptianPurple40,
                    fgNeutral = White60,
                    fgInformation = BrightBlue60,
                    fgFeatured = SatsCoral90,
                )

                val selected: SurfaceColorSet = SurfaceColorSet(
                    bg = SatsBlueGrey80,
                    fg = White100,
                    fgAlternate = White65,
                    fgDisabled = White50,
                    fgSuccess = SpringGreen60,
                    fgWarning = Gold60,
                    fgError = Cardinal60,
                    fgWaitingList = EgyptianPurple40,
                    fgNeutral = White60,
                    fgInformation = BrightBlue60,
                    fgFeatured = SatsCoral90,
                )
            }

            class Secondary {
                val default: SurfaceColorSet = SurfaceColorSet(
                    bg = SatsBlueGrey80,
                    fg = White100,
                    fgAlternate = White65,
                    fgDisabled = White40,
                    fgSuccess = SpringGreen60,
                    fgWarning = Gold60,
                    fgError = Cardinal60,
                    fgWaitingList = EgyptianPurple40,
                    fgNeutral = White60,
                    fgInformation = BrightBlue60,
                    fgFeatured = SatsCoral90,
                )

                val selected: SurfaceColorSet = SurfaceColorSet(
                    bg = SatsBlueGrey80,
                    fg = White100,
                    fgAlternate = White65,
                    fgDisabled = White40,
                    fgSuccess = SpringGreen60,
                    fgWarning = Gold60,
                    fgError = Cardinal60,
                    fgWaitingList = EgyptianPurple40,
                    fgNeutral = White60,
                    fgInformation = BrightBlue60,
                    fgFeatured = SatsCoral90,
                )
            }
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
