package com.sats.dna.colors

internal val SatsLightColors2 = SatsColors2(

    buttons = SatsColors2.Buttons(
        primary = SatsColors2.Buttons.Primary(
            default = SatsColors2.Buttons.Primary.Default(
                bg = SatsColorPrimitives.SatsBlue,
                fg = SatsColorPrimitives.White100,
            ),
            hover = SatsColors2.Buttons.Primary.Hover(
                bg = SatsColorPrimitives.SatsBlueGrey80,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.Primary.Disabled(
                bg = SatsColorPrimitives.Black20,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        secondary = SatsColors2.Buttons.Secondary(
            default = SatsColors2.Buttons.Secondary.Default(
                bg = SatsColorPrimitives.SatsBlue,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            hover = SatsColors2.Buttons.Secondary.Hover(
                bg = SatsColorPrimitives.BrightBlue10,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            disabled = SatsColors2.Buttons.Secondary.Disabled(
                bg = SatsColorPrimitives.Black20,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        clean = SatsColors2.Buttons.Clean(
            default = SatsColors2.Buttons.Clean.Default(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            hover = SatsColors2.Buttons.Clean.Hover(
                bg = SatsColorPrimitives.SatsBlue5,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            disabled = SatsColors2.Buttons.Clean.Disabled(
                bg = SatsColorPrimitives.White20,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        cleanSecondary = SatsColors2.Buttons.CleanSecondary(
            default = SatsColors2.Buttons.CleanSecondary.Default(
                bg = SatsColorPrimitives.White15,
                fg = SatsColorPrimitives.White100,
            ),
            hover = SatsColors2.Buttons.CleanSecondary.Hover(
                bg = SatsColorPrimitives.White10,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.CleanSecondary.Disabled(
                bg = SatsColorPrimitives.White5,
                fg = SatsColorPrimitives.White60,
            ),
        ),
        cta = SatsColors2.Buttons.Cta(
            default = SatsColors2.Buttons.Cta.Default(
                bg = SatsColorPrimitives.SatsCoral120,
                fg = SatsColorPrimitives.White100,
            ),
            hover = SatsColors2.Buttons.Cta.Hover(
                bg = SatsColorPrimitives.SatsCoral130,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.Cta.Disabled(
                bg = SatsColorPrimitives.Black20,
                fg = SatsColorPrimitives.White60,
            ),
        ),
        action = SatsColors2.Buttons.Action(
            default = SatsColorPrimitives.SatsCoral120,
            hover = SatsColorPrimitives.SatsCoral130,
            disabled = SatsColorPrimitives.Black20,
        ),
        waitingListFilled = SatsColors2.Buttons.WaitingListFilled(
            default = SatsColors2.Buttons.WaitingListFilled.Default(
                bg = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.White100,
            ),
            hover = SatsColors2.Buttons.WaitingListFilled.Hover(
                bg = SatsColorPrimitives.EgyptianPurple100,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.WaitingListFilled.Disabled(
                bg = SatsColorPrimitives.Black20,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        waitingListOutlined = SatsColors2.Buttons.WaitingListOutlined(
            default = SatsColorPrimitives.EgyptianPurple80,
            hover = SatsColorPrimitives.EgyptianPurple100,
            disabled = SatsColorPrimitives.Black60,
        ),
        deleteFilled = SatsColors2.Buttons.DeleteFilled(
            default = SatsColors2.Buttons.DeleteFilled.Default(
                bg = SatsColorPrimitives.ChiliRed100,
                fg = SatsColorPrimitives.White100,
            ),
            hover = SatsColors2.Buttons.DeleteFilled.Hover(
                bg = SatsColorPrimitives.ChiliRed120,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.DeleteFilled.Disabled(
                bg = SatsColorPrimitives.Black20,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        deleteOutlined = SatsColors2.Buttons.DeleteOutlined(
            default = SatsColorPrimitives.ChiliRed100,
            hover = SatsColorPrimitives.ChiliRed120,
            disabled = SatsColorPrimitives.Black60,
        ),
    ),
    graphicalElements = SatsColors2.GraphicalElements(
        divider = SatsColors2.GraphicalElements.Divider(
            default = SatsColorPrimitives.SatsLightGrey15,
            alternate = SatsColorPrimitives.BlackO20,
        ),
        skeleton = SatsColorPrimitives.SatsLightGrey15,
        navBar = SatsColors2.GraphicalElements.NavBar(
            selected = SatsColorPrimitives.SatsBlue,
            notSelected = SatsColorPrimitives.SatsBlue,
        ),
        progressBar = SatsColors2.GraphicalElements.ProgressBar(
            indicator = SatsColorPrimitives.SatsCoral,
            bg = SatsColorPrimitives.SatsLightGrey15,
        ),
        graphs = SatsColors2.GraphicalElements.Graphs(
            bar = SatsColors2.GraphicalElements.Graphs.Bar(
                primary = SatsColors2.GraphicalElements.Graphs.Bar.Primary(
                    default = SatsColorPrimitives.SatsCoral,
                    bg = SatsColorPrimitives.SatsLightGrey15,
                ),
                secondary = SatsColors2.GraphicalElements.Graphs.Bar.Secondary(
                    default = SatsColorPrimitives.SatsBlue40,
                    bg = SatsColorPrimitives.SatsBlue5,
                ),
            ),
            trend = SatsColors2.GraphicalElements.Graphs.Trend(
                upwards = SatsColorPrimitives.SpringGreen80,
                neutral = SatsColorPrimitives.SatsCoral40,
                downwards = SatsColorPrimitives.Cardinal100,
            ),
        ),
        selector = SatsColors2.GraphicalElements.Selector(
            unselected = SatsColors2.GraphicalElements.Selector.Unselected(
                default = SatsColorPrimitives.SatsBlueGrey80,
                disabled = SatsColorPrimitives.SatsLightGrey15,
            ),
            selected = SatsColors2.GraphicalElements.Selector.Selected(
                default = SatsColorPrimitives.SatsCoral,
                disabled = SatsColorPrimitives.SatsCoral40,
            ),
        ),
        chips = SatsColors2.GraphicalElements.Chips(
            unselected = SatsColors2.GraphicalElements.Chips.Unselected(
                default = SatsColors2.GraphicalElements.Chips.Unselected.Default(
                    bg = SatsColorPrimitives.SatsBlue40,
                    fg = SatsColorPrimitives.SatsLightGrey15,
                ),
                disabled = SatsColors2.GraphicalElements.Chips.Unselected.Disabled(
                    bg = SatsColorPrimitives.SatsLightGrey15,
                    fg = SatsColorPrimitives.Black40,
                ),
            ),
            selected = SatsColors2.GraphicalElements.Chips.Selected(
                default = SatsColors2.GraphicalElements.Chips.Selected.Default(
                    bg = SatsColorPrimitives.SatsBlue,
                    fg = SatsColorPrimitives.White100,
                ),
                hover = SatsColors2.GraphicalElements.Chips.Selected.Hover(
                    bg = SatsColorPrimitives.BrightBlue10,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = SatsColors2.GraphicalElements.Chips.Selected.Disabled(
                    bg = SatsColorPrimitives.SatsLightGrey15,
                    fg = SatsColorPrimitives.SatsBlue70,
                ),
            ),
        ),
        toggle = SatsColors2.GraphicalElements.Toggle(
            unselected = SatsColors2.GraphicalElements.Toggle.Unselected(
                default = SatsColorPrimitives.SatsBlue40,
                disabled = SatsColorPrimitives.SatsLightGrey15,
            ),
            interactiveElement = SatsColorPrimitives.White100,
            selected = SatsColors2.GraphicalElements.Toggle.Selected(
                default = SatsColorPrimitives.SatsCoral,
                disabled = SatsColorPrimitives.SatsCoral40,
            ),
        ),
        icons = SatsColors2.GraphicalElements.Icons(
            primary = SatsColorPrimitives.SatsBlue,
            secondary = SatsColorPrimitives.SatsBlueGrey80,
            fixed = SatsColorPrimitives.White100,
            positive = SatsColorPrimitives.SpringGreen100,
            attention = SatsColorPrimitives.Gold100,
            negative = SatsColorPrimitives.Cardinal100,
            waitingList = SatsColorPrimitives.EgyptianPurple100,
            delete = SatsColorPrimitives.ChiliRed100,
        ),
        indicators = SatsColors2.GraphicalElements.Indicators(
            positive = SatsColors2.GraphicalElements.Indicators.Positive(
                default = SatsColorPrimitives.SpringGreen100,
                alternate = SatsColorPrimitives.SpringGreen30,
            ),
            attention = SatsColors2.GraphicalElements.Indicators.Attention(
                default = SatsColorPrimitives.Gold100,
                alternate = SatsColorPrimitives.Gold30,
            ),
            negative = SatsColors2.GraphicalElements.Indicators.Negative(
                default = SatsColorPrimitives.Cardinal100,
                alternate = SatsColorPrimitives.Cardinal30,
            ),
            neutral = SatsColors2.GraphicalElements.Indicators.Neutral(
                default = SatsColorPrimitives.SatsBlue70,
                alternate = SatsColorPrimitives.SatsBlue40,
            ),
        ),
        signal = SatsColors2.GraphicalElements.Signal(
            success = SatsColorPrimitives.SpringGreen100,
            warning = SatsColorPrimitives.Gold100,
            error = SatsColorPrimitives.Cardinal100,
            neutral = SatsColorPrimitives.SatsBlue70,
            waitingList = SatsColorPrimitives.EgyptianPurple100,
        ),
        tags = SatsColors2.GraphicalElements.Tags(
            primary = SatsColors2.GraphicalElements.Tags.Primary(
                bg = SatsColorPrimitives.SatsBlue,
                fg = SatsColorPrimitives.White100,
            ),
            secondary = SatsColors2.GraphicalElements.Tags.Secondary(
                bg = SatsColorPrimitives.SatsBlue5,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            featured = SatsColors2.GraphicalElements.Tags.Featured(
                bg = SatsColorPrimitives.SatsCoral120,
                fg = SatsColorPrimitives.White100,
            ),
        ),
        rewards = SatsColors2.GraphicalElements.Rewards(
            blue = SatsColors2.GraphicalElements.Rewards.Blue(
                bg = SatsColorPrimitives.SatsBlue,
                fg = SatsColorPrimitives.White100,
            ),
            silver = SatsColors2.GraphicalElements.Rewards.Silver(
                bg = SatsColorPrimitives.Black50,
                fg = SatsColorPrimitives.White100,
            ),
            gold = SatsColors2.GraphicalElements.Rewards.Gold(
                bg = SatsColorPrimitives.Gold130,
                fg = SatsColorPrimitives.White100,
            ),
            platinum = SatsColors2.GraphicalElements.Rewards.Platinum(
                bg = SatsColorPrimitives.SatsBlueGrey80,
                fg = SatsColorPrimitives.White100,
            ),
        ),
        workouts = SatsColors2.GraphicalElements.Workouts(
            pt = SatsColorPrimitives.UranianBlue100,
            gx = SatsColorPrimitives.SalmonPink100,
            treatments = SatsColorPrimitives.CaribbeanCurrent100,
            gymfloor = SatsColorPrimitives.Tangerine100,
            ownTrainingOther = SatsColorPrimitives.Celadon100,
        ),
    ),
    backgrounds = SatsColors2.Backgrounds(
        primary = SatsColors2.Backgrounds.Primary(
            bg = SatsColors2.Backgrounds.Primary.Bg(
                default = SatsColorPrimitives.Black3,
                hover = SatsColorPrimitives.White100,
                selected = SatsColorPrimitives.Black3,
            ),
            fg = SatsColors2.Backgrounds.Primary.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.SatsBlue70,
                disabled = SatsColorPrimitives.Black60,
            ),
        ),
        secondary = SatsColors2.Backgrounds.Secondary(
            bg = SatsColors2.Backgrounds.Secondary.Bg(
                default = SatsColorPrimitives.White100,
                hover = SatsColorPrimitives.SatsBlue5,
                selected = SatsColorPrimitives.White100,
            ),
            fg = SatsColors2.Backgrounds.Secondary.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.SatsBlue70,
                disabled = SatsColorPrimitives.Black60,
            ),
        ),
        fixed = SatsColors2.Backgrounds.Fixed(
            bg = SatsColors2.Backgrounds.Fixed.Bg(
                default = SatsColorPrimitives.SatsBlue,
                hover = SatsColorPrimitives.SatsBlue90,
                selected = SatsColorPrimitives.SatsBlueGrey80,
            ),
            fg = SatsColors2.Backgrounds.Fixed.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.White80,
                disabled = SatsColorPrimitives.White60,
            ),
        ),
    ),
    surfaces = SatsColors2.Surfaces(
        primary = SatsColors2.Surfaces.Primary(
            bg = SatsColors2.Surfaces.Primary.Bg(
                default = SatsColorPrimitives.White100,
                hover = SatsColorPrimitives.BrightBlue10,
                selected = SatsColorPrimitives.BrightBlue20,
            ),
            fg = SatsColors2.Surfaces.Primary.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.SatsBlue70,
                disabled = SatsColorPrimitives.Black60,
                success = SatsColorPrimitives.SpringGreen120,
                warning = SatsColorPrimitives.Gold140,
                error = SatsColorPrimitives.Cardinal120,
                waitlist = SatsColorPrimitives.EgyptianPurple100,
                neutral = SatsColorPrimitives.Black60,
                information = SatsColorPrimitives.BrightBlue160,
            ),
        ),
        secondary = SatsColors2.Surfaces.Secondary(
            bg = SatsColors2.Surfaces.Secondary.Bg(
                default = SatsColorPrimitives.Black5,
                hover = SatsColorPrimitives.White100,
                selected = SatsColorPrimitives.Black5,
            ),
            fg = SatsColors2.Surfaces.Secondary.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.SatsBlue70,
                disabled = SatsColorPrimitives.Black60,
                success = SatsColorPrimitives.SpringGreen120,
                warning = SatsColorPrimitives.Gold140,
                error = SatsColorPrimitives.Cardinal120,
                waitlist = SatsColorPrimitives.EgyptianPurple100,
                neutral = SatsColorPrimitives.Black60,
                information = SatsColorPrimitives.BrightBlue160,
            ),
        ),
        fixed = SatsColors2.Surfaces.Fixed(
            bg = SatsColors2.Surfaces.Fixed.Bg(
                default = SatsColorPrimitives.SatsBlueGrey80,
                hover = SatsColorPrimitives.SatsBlue90,
                selected = SatsColorPrimitives.SatsBlueGrey80,
            ),
            fg = SatsColors2.Surfaces.Fixed.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.White85,
                disabled = SatsColorPrimitives.White65,
            ),
        ),
    ),
    signalSurfaces = SatsColors2.SignalSurfaces(
        success = SatsColors2.SignalSurfaces.Success(
            bg = SatsColorPrimitives.SpringGreen10,
            fg = SatsColors2.SignalSurfaces.Success.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.SpringGreen120,
            ),
        ),
        warning = SatsColors2.SignalSurfaces.Warning(
            bg = SatsColorPrimitives.Gold10,
            fg = SatsColors2.SignalSurfaces.Warning.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.Gold140,
            ),
        ),
        error = SatsColors2.SignalSurfaces.Error(
            bg = SatsColorPrimitives.Cardinal10,
            fg = SatsColors2.SignalSurfaces.Error.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.Cardinal120,
            ),
        ),
        waitlist = SatsColors2.SignalSurfaces.Waitlist(
            bg = SatsColorPrimitives.EgyptianPurple10,
            fg = SatsColors2.SignalSurfaces.Waitlist.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.EgyptianPurple100,
            ),
        ),
        neutral = SatsColors2.SignalSurfaces.Neutral(
            bg = SatsColorPrimitives.Black5,
            fg = SatsColors2.SignalSurfaces.Neutral.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.Black60,
            ),
        ),
        information = SatsColors2.SignalSurfaces.Information(
            bg = SatsColorPrimitives.BrightBlue10,
            fg = SatsColors2.SignalSurfaces.Information.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.BrightBlue160,
            ),
        ),
    ),

    isLightMode = true,
)
