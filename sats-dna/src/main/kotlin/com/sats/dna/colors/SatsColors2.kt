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
        val cta: Cta,
        val action: Action,
        val waitingListFilled: WaitingListFilled,
        val waitingListOutlined: WaitingListOutlined,
        val deleteFilled: DeleteFilled,
        val deleteOutlined: DeleteOutlined,
    ) {
        class Primary(
            val default: Default,
            val hover: Hover,
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

        class Secondary(
            val default: Default,
            val hover: Hover,
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

        class Clean(
            val default: Default,
            val hover: Hover,
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

        class CleanSecondary(
            val default: Default,
            val hover: Hover,
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

        class Cta(
            val default: Default,
            val hover: Hover,
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

        class Action(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )

        class WaitingListFilled(
            val default: Default,
            val hover: Hover,
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

        class WaitingListOutlined(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )

        class DeleteFilled(
            val default: Default,
            val hover: Hover,
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

        class DeleteOutlined(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )
    }

    class GraphicalElements(
        val divider: Divider,
        val border: Border,
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

        class NavBar(
            val selected: Color,
            val notSelected: Color,
        )

        class ProgressBar(
            val indicator: Color,
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
                val hover: Hover,
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
            val interactiveElement: Color,
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
            val pt: Color,
            val gx: Color,
            val treatments: Color,
            val gymfloor: Color,
            val ownTrainingOther: Color,
        )
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
                val hover: Color,
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
                val hover: Color,
                val selected: Color,
            )

            class Fg(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
            )
        }

        class Fixed(
            val bg: Bg,
            val fg: Fg,
        ) {
            class Bg(
                val default: Color,
                val hover: Color,
                val selected: Color,
            )

            class Fg(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
            )
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
                val hover: Color,
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
            )
        }

        class Secondary(
            val bg: Bg,
            val fg: Fg,
        ) {
            class Bg(
                val default: Color,
                val hover: Color,
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
            )
        }

        class Fixed(
            val bg: Bg,
            val fg: Fg,
        ) {
            class Bg(
                val default: Color,
                val hover: Color,
                val selected: Color,
            )

            class Fg(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
            )
        }
    }

    class SignalSurfaces(
        val success: Success,
        val warning: Warning,
        val error: Error,
        val waitlist: Waitlist,
        val neutral: Neutral,
        val information: Information,
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

        class Waitlist(
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
    }
}
