package com.sats.dna.colors

import androidx.compose.ui.graphics.Color

class SatsColors2(
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
        val waitingListFilled: WaitingListFilled,
        val waitingListSecondary: WaitingListSecondary,
        val destructive: Destructive,
    ) {
        class Primary(
            val default: Default,
            val disabled: Disabled,
        ) {
            class Default(
                val bg: Color,
                val fg: Color,
            )

            class Disabled(
                val bg: Color,
                val fg: Color,
            )
        }

        class Secondary(
            val default: Default,
            val disabled: Disabled,
        ) {
            class Default(
                val outline: Color,
                val fg: Color,
            ) {
                val bg: Color = Color.Transparent
            }

            class Disabled(
                val outline: Color,
                val fg: Color,
            ) {
                val bg: Color = Color.Transparent
            }
        }

        class Clean(
            val default: Default,
            val disabled: Disabled,
        ) {
            class Default(
                val bg: Color,
                val fg: Color,
            )

            class Disabled(
                val bg: Color,
                val fg: Color,
            )
        }

        class CleanSecondary(
            val default: Default,
            val disabled: Disabled,
        ) {
            class Default(
                val bg: Color,
                val outline: Color,
                val fg: Color,
            )

            class Disabled(
                val bg: Color,
                val outline: Color,
                val fg: Color,
            )
        }

        class Action(
            val default: Default,
            val disabled: Disabled,
        ) {
            class Default(
                val fg: Color,
            ) {
                val bg = Color.Transparent
            }

            class Disabled(
                val fg: Color,
            ) {
                val bg = Color.Transparent
            }
        }

        class WaitingListFilled(
            val default: Default,
            val disabled: Disabled,
        ) {
            class Default(
                val bg: Color,
                val fg: Color,
            )

            class Disabled(
                val bg: Color,
                val fg: Color,
            )
        }

        class WaitingListSecondary(
            val default: Default,
            val disabled: Disabled,
        ) {
            class Default(
                val outline: Color,
                val fg: Color,
            ) {
                val bg = Color.Transparent
            }

            class Disabled(
                val outline: Color,
                val fg: Color,
            ) {
                val bg = Color.Transparent
            }
        }

        class Destructive(
            val default: Default,
            val alternate: Alternate,
        ) {
            class Default(
                val default: Default,
                val disabled: Disabled,
            ) {
                class Default(
                    val bg: Color,
                    val fg: Color,
                )

                class Disabled(
                    val bg: Color,
                    val fg: Color,
                )
            }

            class Alternate(
                val default: Default,
                val disabled: Disabled,
            ) {
                class Default(
                    val fg: Color,
                ) {
                    val outline: Color = fg
                    val bg: Color = Color.Transparent
                }

                class Disabled(
                    val fg: Color,
                ) {
                    val bg: Color = Color.Transparent
                    val outline: Color = fg
                }
            }
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
            val indicator: Color,
            val indicatorAlternate: Color,
            val bg: Color,
        )

        class FixedProgressBar(
            val indicator: Color,
            val indicatorAlternate: Color,
            val bg: Color,
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
                val default: Default,
                val disabled: Disabled,
            ) {
                class Default(
                    val bg: Color,
                    val fg: Color,
                )

                class Disabled(
                    val bg: Color,
                    val fg: Color,
                )
            }

            class Selected(
                val default: Default,
                val disabled: Disabled,
            ) {
                class Default(
                    val bg: Color,
                    val fg: Color,
                )

                class Hover(
                    val bg: Color,
                    val fg: Color,
                )

                class Disabled(
                    val bg: Color,
                    val fg: Color,
                )
            }
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
            val primary: Primary,
            val secondary: Secondary,
            val featured: Featured,
        ) {
            class Primary(
                val bg: Color,
                val fg: Color,
            )

            class Secondary(
                val bg: Color,
                val fg: Color,
            )

            class Featured(
                val bg: Color,
                val fg: Color,
            )
        }

        class Rewards(
            val blue: Blue,
            val silver: Silver,
            val gold: Gold,
            val platinum: Platinum,
        ) {
            class Blue(
                val bg: Color,
                val fg: Color,
            )

            class Silver(
                val bg: Color,
                val fg: Color,
            )

            class Gold(
                val bg: Color,
                val fg: Color,
            )

            class Platinum(
                val bg: Color,
                val fg: Color,
            )
        }

        class Workouts(
            val pt: Pt,
            val gx: Gx,
            val treatments: Treatments,
            val gymfloor: Gymfloor,
            val other: Other,
            val bootcamp: Bootcamp,
        ) {
            class Pt(
                val bg: Color,
                val fg: Color,
            )

            class Gx(
                val bg: Color,
                val fg: Color,
            )

            class Treatments(
                val bg: Color,
                val fg: Color,
            )

            class Gymfloor(
                val bg: Color,
                val fg: Color,
            )

            class Other(
                val bg: Color,
                val fg: Color,
            )

            class Bootcamp(
                val bg: Color,
                val fg: Color,
            )
        }
    }

    class Backgrounds(
        val primary: Primary,
        val secondary: Secondary,
        val fixed: Fixed,
    ) {
        class Primary(
            val bg: Bg,
            val fg: Fg,
        ) {
            class Bg(
                val default: Color,
                val selected: Color,
            )

            class Fg(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
            )
        }

        class Secondary(
            val bg: Bg,
            val fg: Fg,
        ) {
            class Bg(
                val default: Color,
                val selected: Color,
            )

            class Fg(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
            )
        }

        class Fixed(
            val primary: Primary,
            val secondary: Secondary,
        ) {
            class Primary(
                val bg: Bg,
                val fg: Fg,
            ) {
                class Bg(
                    val default: Color,
                    val selected: Color,
                )

                class Fg(
                    val default: Color,
                    val alternate: Color,
                    val disabled: Color,
                )
            }

            class Secondary(
                val bg: Bg,
                val fg: Fg,
            ) {
                class Bg(
                    val default: Color,
                    val selected: Color,
                )

                class Fg(
                    val default: Color,
                    val alternate: Color,
                    val disabled: Color,
                )
            }
        }
    }

    class Surfaces(
        val primary: Primary,
        val secondary: Secondary,
        val fixed: Fixed,
    ) {
        class Primary(
            val bg: Bg,
            val fg: Fg,
        ) {
            class Bg(
                val default: Color,
                val selected: Color,
                val disabled: Color,
            )

            class Fg(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
                val success: Color,
                val warning: Color,
                val error: Color,
                val waitlist: Color,
                val neutral: Color,
                val information: Color,
                val featured: Color,
            )
        }

        class Secondary(
            val bg: Bg,
            val fg: Fg,
        ) {
            class Bg(
                val default: Color,
                val selected: Color,
            )

            class Fg(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
                val success: Color,
                val warning: Color,
                val error: Color,
                val waitlist: Color,
                val neutral: Color,
                val information: Color,
                val featured: Color,
            )
        }

        class Fixed(
            val primary: Primary,
            val secondary: Secondary,
        ) {
            class Primary(
                val bg: Bg,
                val fg: Fg,
            ) {
                class Bg(
                    val default: Color,
                    val selected: Color,
                )

                class Fg(
                    val default: Color,
                    val alternate: Color,
                    val disabled: Color,
                    val success: Color,
                    val warning: Color,
                    val error: Color,
                    val waitlist: Color,
                    val neutral: Color,
                    val information: Color,
                    val featured: Color,
                )
            }

            class Secondary(
                val bg: Bg,
                val fg: Fg,
            ) {
                class Bg(
                    val default: Color,
                    val selected: Color,
                )

                class Fg(
                    val default: Color,
                    val alternate: Color,
                    val disabled: Color,
                    val success: Color,
                    val warning: Color,
                    val error: Color,
                    val waitlist: Color,
                    val neutral: Color,
                    val information: Color,
                    val featured: Color,
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
            val bg: Color,
            val fg: Fg,
        ) {
            class Fg(
                val default: Color,
                val alternate: Color,
            )
        }

        class Warning(
            val bg: Color,
            val fg: Fg,
        ) {
            class Fg(
                val default: Color,
                val alternate: Color,
            )
        }

        class Error(
            val bg: Color,
            val fg: Fg,
        ) {
            class Fg(
                val default: Color,
                val alternate: Color,
            )
        }

        class WaitingList(
            val bg: Color,
            val fg: Fg,
        ) {
            class Fg(
                val default: Color,
                val alternate: Color,
            )
        }

        class Neutral(
            val bg: Color,
            val fg: Fg,
        ) {
            class Fg(
                val default: Color,
                val alternate: Color,
            )
        }

        class Information(
            val bg: Color,
            val fg: Fg,
        ) {
            class Fg(
                val default: Color,
                val alternate: Color,
            )
        }

        class Featured(
            val bg: Color,
            val fg: Fg,
        ) {
            class Fg(
                val default: Color,
                val alternate: Color,
            )
        }
    }
}
