package com.sats.dna.colors

import androidx.compose.ui.graphics.Color

class SatsColors2(
    val buttonColors: SatsButtonColors,
    val graphicalElements: SatsGraphicalElementColors,
    val backgrounds: SatsBackgroundColors,
    val isLightMode: Boolean,
)

class SatsButtonColors(
    val primary: Primary,
    val secondary: Secondary,
    val clean: Clean,
    val cleanSecondary: CleanSecondary,
    val cta: Cta,
    val action: Action,
    val waitingList: WaitingList,
    val delete: Delete,
) {
    class Primary(
        val background: Background,
        val content: Content,
    ) {
        class Background(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )

        class Content(
            val default: Color,
            val disabled: Color,
        )
    }

    class Secondary(
        val background: Background,
        val content: Content,
    ) {
        class Background(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )

        class Content(
            val default: Color,
            val disabled: Color,
        )
    }

    class Clean(
        val background: Background,
        val content: Content,
    ) {
        class Background(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )

        class Content(
            val default: Color,
            val disabled: Color,
        )
    }

    class CleanSecondary(
        val background: Background,
        val content: Content,
    ) {
        class Background(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )

        class Content(
            val default: Color,
            val disabled: Color,
        )
    }

    class Cta(
        val background: Background,
        val content: Content,
    ) {
        class Background(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )

        class Content(
            val default: Color,
            val disabled: Color,
        )
    }

    class Action(
        val background: Background,
        val content: Content,
    ) {
        class Background(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )

        class Content(
            val default: Color,
            val disabled: Color,
        )
    }

    class WaitingList(
        val background: Background,
        val content: Content,
    ) {
        class Background(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )

        class Content(
            val default: Default,
            val alternate: Alternate,
        ) {
            class Default(
                val default: Color,
                val disabled: Color,
            )

            class Alternate(
                val default: Color,
                val hover: Color,
                val disabled: Color,
            )
        }
    }

    class Delete(
        val background: Background,
        val content: Content,
    ) {
        class Background(
            val default: Color,
            val hover: Color,
            val disabled: Color,
        )

        class Content(
            val default: Default,
            val alternate: Alternate,
        ) {
            class Default(
                val default: Color,
                val disabled: Color,
            )

            class Alternate(
                val default: Color,
                val hover: Color,
                val disabled: Color,
            )
        }
    }
}

class SatsGraphicalElementColors(
    val divider: Divider,
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

    class NavBar(
        val selected: Color,
        val notSelected: Color,
    )

    class ProgressBar(
        val indicator: Color,
        val background: Color,
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
                val background: Color,
            )

            class Secondary(
                val default: Color,
                val background: Color,
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
            val background: Background,
            val content: Content,
        ) {
            class Background(
                val default: Color,
                val disabled: Color,
            )

            class Content(
                val default: Color,
                val disabled: Color,
            )
        }

        class Selected(
            val background: Background,
            val content: Content,
        ) {
            class Background(
                val default: Color,
                val hover: Color,
                val disabled: Color,
            )

            class Content(
                val default: Color,
                val disabled: Color,
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
            val background: Color,
            val content: Color,
        )

        class Secondary(
            val background: Color,
            val content: Color,
        )

        class Featured(
            val background: Color,
            val content: Color,
        )
    }

    class Rewards(
        val background: Background,
        val content: Color,
    ) {
        class Background(
            val blue: Color,
            val silver: Color,
            val gold: Color,
            val platinum: Color,
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

class SatsBackgroundColors(
    val background: Background,
    val surface: Surface,
    val signalSurface: SignalSurface,
) {
    class Background(
        val primary: Primary,
        val secondary: Secondary,
        val fixed: Fixed,
    ) {
        class Primary(
            val background: Background,
            val content: Content,
        ) {
            class Background(
                val default: Color,
                val hover: Color,
                val selected: Color,
            )

            class Content(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
            )
        }

        class Secondary(
            val background: Background,
            val content: Content,
        ) {
            class Background(
                val default: Color,
                val hover: Color,
                val selected: Color,
            )

            class Content(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
            )
        }

        class Fixed(
            val background: Background,
            val content: Content,
        ) {
            class Background(
                val default: Color,
                val hover: Color,
                val selected: Color,
            )

            class Content(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
            )
        }
    }

    class Surface(
        val primary: Primary,
        val secondary: Secondary,
        val fixed: Fixed,
    ) {
        class Primary(
            val background: Background,
            val content: Content,
        ) {
            class Background(
                val default: Color,
                val hover: Color,
                val selected: Color,
            )

            class Content(
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
            val background: Background,
            val content: Content,
        ) {
            class Background(
                val default: Color,
                val hover: Color,
                val selected: Color,
            )

            class Content(
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
            val background: Background,
            val content: Content,
        ) {
            class Background(
                val default: Color,
                val hover: Color,
                val selected: Color,
            )

            class Content(
                val default: Color,
                val alternate: Color,
                val disabled: Color,
            )
        }
    }

    class SignalSurface(
        val success: Success,
        val warning: Warning,
        val error: Error,
        val waitlist: Waitlist,
        val neutral: Neutral,
        val information: Information,
    ) {
        class Success(
            val background: Color,
            val content: Content,
        ) {
            class Content(
                val default: Color,
                val alternate: Color,
            )
        }

        class Warning(
            val background: Color,
            val content: Content,
        ) {
            class Content(
                val default: Color,
                val alternate: Color,
            )
        }

        class Error(
            val background: Color,
            val content: Content,
        ) {
            class Content(
                val default: Color,
                val alternate: Color,
            )
        }

        class Waitlist(
            val background: Color,
            val content: Content,
        ) {
            class Content(
                val default: Color,
                val alternate: Color,
            )
        }

        class Neutral(
            val background: Color,
            val content: Content,
        ) {
            class Content(
                val default: Color,
                val alternate: Color,
            )
        }

        class Information(
            val background: Color,
            val content: Content,
        ) {
            class Content(
                val default: Color,
                val alternate: Color,
            )
        }
    }
}
