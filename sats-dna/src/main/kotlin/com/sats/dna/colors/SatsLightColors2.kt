package com.sats.dna.colors

internal val SatsLightColors2 = SatsColors2(
    buttons = SatsColors2.Buttons(
        primary = SatsColors2.Buttons.Primary(
            default = SatsColors2.Buttons.Primary.Default(
                bg = SatsColorPrimitives.SatsBlue,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.Primary.Disabled(
                bg = SatsColorPrimitives.Black20,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        secondary = SatsColors2.Buttons.Secondary(
            default = SatsColors2.Buttons.Secondary.Default(
                outline = SatsColorPrimitives.SatsBlue,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            disabled = SatsColors2.Buttons.Secondary.Disabled(
                outline = SatsColorPrimitives.Black20,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        clean = SatsColors2.Buttons.Clean(
            default = SatsColors2.Buttons.Clean.Default(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            disabled = SatsColors2.Buttons.Clean.Disabled(
                bg = SatsColorPrimitives.White20,
                fg = SatsColorPrimitives.White50,
            ),
        ),
        cleanSecondary = SatsColors2.Buttons.CleanSecondary(
            default = SatsColors2.Buttons.CleanSecondary.Default(
                bg = SatsColorPrimitives.White15,
                outline = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.CleanSecondary.Disabled(
                bg = SatsColorPrimitives.White5,
                outline = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.White60,
            ),
        ),
        action = SatsColors2.Buttons.Action(
            default = SatsColors2.Buttons.Action.Default(
                fg = SatsColorPrimitives.SatsCoral120,
            ),
            disabled = SatsColors2.Buttons.Action.Disabled(
                fg = SatsColorPrimitives.Black20,
            ),
        ),
        waitingListFilled = SatsColors2.Buttons.WaitingListFilled(
            default = SatsColors2.Buttons.WaitingListFilled.Default(
                bg = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.WaitingListFilled.Disabled(
                bg = SatsColorPrimitives.Black20,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        waitingListSecondary = SatsColors2.Buttons.WaitingListSecondary(
            default = SatsColors2.Buttons.WaitingListSecondary.Default(
                outline = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.EgyptianPurple80,
            ),
            disabled = SatsColors2.Buttons.WaitingListSecondary.Disabled(
                outline = SatsColorPrimitives.Black20,
                fg = SatsColorPrimitives.Black20,
            ),
        ),
        destructive = SatsColors2.Buttons.Destructive(
            default = SatsColors2.Buttons.Destructive.Default(
                default = SatsColors2.Buttons.Destructive.Default.Default(
                    bg = SatsColorPrimitives.ChiliRed100,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = SatsColors2.Buttons.Destructive.Default.Disabled(
                    bg = SatsColorPrimitives.Black20,
                    fg = SatsColorPrimitives.Black60,
                ),
            ),
            alternate = SatsColors2.Buttons.Destructive.Alternate(
                default = SatsColors2.Buttons.Destructive.Alternate.Default(
                    fg = SatsColorPrimitives.ChiliRed100,
                ),
                disabled = SatsColors2.Buttons.Destructive.Alternate.Disabled(
                    fg = SatsColorPrimitives.Black60,
                ),
            ),
        ),
    ),
    graphicalElements = SatsColors2.GraphicalElements(
        divider = SatsColors2.GraphicalElements.Divider(
            default = SatsColorPrimitives.SatsLightGrey15,
            alternate = SatsColorPrimitives.BlackO20,
        ),
        border = SatsColors2.GraphicalElements.Border(
            default = SatsColorPrimitives.SatsLightGrey15,
            focused = SatsColorPrimitives.SatsBlue40,
        ),
        signalBorder = SatsColors2.GraphicalElements.SignalBorder(
            success = SatsColorPrimitives.SpringGreen120,
            warning = SatsColorPrimitives.Gold140,
            error = SatsColorPrimitives.Cardinal120,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
            neutral = SatsColorPrimitives.Black60,
            information = SatsColorPrimitives.SatsBlue70,
            featured = SatsColorPrimitives.SatsCoral120,
        ),
        skeleton = SatsColorPrimitives.SatsLightGrey15,
        navBar = SatsColors2.GraphicalElements.NavBar(
            selected = SatsColorPrimitives.SatsBlue,
            notSelected = SatsColorPrimitives.SatsBlue,
        ),
        progressBar = SatsColors2.GraphicalElements.ProgressBar(
            indicator = SatsColorPrimitives.SatsCoral,
            indicatorAlternate = SatsColorPrimitives.SatsBlue,
            bg = SatsColorPrimitives.SatsLightGrey15,
        ),
        fixedProgressBar = SatsColors2.GraphicalElements.FixedProgressBar(
            indicator = SatsColorPrimitives.SatsCoral90,
            indicatorAlternate = SatsColorPrimitives.BrightBlue110,
            bg = SatsColorPrimitives.White40,
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
            indicator = SatsColorPrimitives.White100,
        ),
        selectorFixed = SatsColors2.GraphicalElements.SelectorFixed(
            unselected = SatsColors2.GraphicalElements.SelectorFixed.Unselected(
                default = SatsColorPrimitives.SatsBlueGrey80,
                disabled = SatsColorPrimitives.SatsLightGrey15,
            ),
            selected = SatsColors2.GraphicalElements.SelectorFixed.Selected(
                default = SatsColorPrimitives.SatsCoral,
                disabled = SatsColorPrimitives.SatsCoral40,
            ),
            indicator = SatsColorPrimitives.White100,
        ),
        chips = SatsColors2.GraphicalElements.Chips(
            unselected = SatsColors2.GraphicalElements.Chips.Unselected(
                default = SatsColors2.GraphicalElements.Chips.Unselected.Default(
                    bg = SatsColorPrimitives.SatsBlue40,
                    fg = SatsColorPrimitives.SatsBlue,
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
            handle = SatsColorPrimitives.White100,
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
                alternate = SatsColorPrimitives.SatsBlue20,
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
        badge = SatsColors2.GraphicalElements.Badge(
            primary = SatsColors2.GraphicalElements.Badge.Primary(
                bg = SatsColorPrimitives.SatsCoral120,
                fg = SatsColorPrimitives.White100,
            ),
            secondary = SatsColors2.GraphicalElements.Badge.Secondary(
                bg = SatsColorPrimitives.SatsBlue,
                fg = SatsColorPrimitives.White100,
            ),
            tertiary = SatsColors2.GraphicalElements.Badge.Tertiary(
                bg = SatsColorPrimitives.SatsBlue5,
                fg = SatsColorPrimitives.SatsBlue,
            ),
        ),
        fixedBadge = SatsColors2.GraphicalElements.FixedBadge(
            primary = SatsColors2.GraphicalElements.FixedBadge.Primary(
                bg = SatsColorPrimitives.SatsCoral120,
                fg = SatsColorPrimitives.White100,
            ),
            secondary = SatsColors2.GraphicalElements.FixedBadge.Secondary(
                bg = SatsColorPrimitives.BrightBlue10,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            tertiary = SatsColors2.GraphicalElements.FixedBadge.Tertiary(
                bg = SatsColorPrimitives.SatsBlueGrey80,
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
            pt = SatsColors2.GraphicalElements.Workouts.Pt(
                bg = SatsColorPrimitives.UranianBlue100,
                fg = SatsColorPrimitives.BrightBlue160,
            ),
            gx = SatsColors2.GraphicalElements.Workouts.Gx(
                bg = SatsColorPrimitives.SalmonPink100,
                fg = SatsColorPrimitives.ChiliRed170,
            ),
            treatments = SatsColors2.GraphicalElements.Workouts.Treatments(
                bg = SatsColorPrimitives.CaribbeanCurrent100,
                fg = SatsColorPrimitives.SpringGreen10,
            ),
            gymfloor = SatsColors2.GraphicalElements.Workouts.Gymfloor(
                bg = SatsColorPrimitives.Tangerine100,
                fg = SatsColorPrimitives.Gold170,
            ),
            other = SatsColors2.GraphicalElements.Workouts.Other(
                bg = SatsColorPrimitives.Celadon100,
                fg = SatsColorPrimitives.SpringGreen170,
            ),
            bootcamp = SatsColors2.GraphicalElements.Workouts.Bootcamp(
                bg = SatsColorPrimitives.TropicalIndigo100,
                fg = SatsColorPrimitives.EgyptianPurple160,
            ),
        ),
    ),
    backgrounds = SatsColors2.Backgrounds(
        primary = SatsColors2.Backgrounds.Primary(
            bg = SatsColors2.Backgrounds.Primary.Bg(
                default = SatsColorPrimitives.SatsBlue5,
                selected = SatsColorPrimitives.SatsBlue5,
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
                selected = SatsColorPrimitives.White100,
            ),
            fg = SatsColors2.Backgrounds.Secondary.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.SatsBlue70,
                disabled = SatsColorPrimitives.Black60,
            ),
        ),
        fixed = SatsColors2.Backgrounds.Fixed(
            primary = SatsColors2.Backgrounds.Fixed.Primary(
                bg = SatsColors2.Backgrounds.Fixed.Primary.Bg(
                    default = SatsColorPrimitives.SatsBlue110,
                    selected = SatsColorPrimitives.SatsBlue90,
                ),
                fg = SatsColors2.Backgrounds.Fixed.Primary.Fg(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.White60,
                    disabled = SatsColorPrimitives.White40,
                ),
            ),
            secondary = SatsColors2.Backgrounds.Fixed.Secondary(
                bg = SatsColors2.Backgrounds.Fixed.Secondary.Bg(
                    default = SatsColorPrimitives.SatsBlue,
                    selected = SatsColorPrimitives.SatsBlueGrey80,
                ),
                fg = SatsColors2.Backgrounds.Fixed.Secondary.Fg(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.White60,
                    disabled = SatsColorPrimitives.White40,
                ),
            ),
        ),
    ),
    surfaces = SatsColors2.Surfaces(
        primary = SatsColors2.Surfaces.Primary(
            bg = SatsColors2.Surfaces.Primary.Bg(
                default = SatsColorPrimitives.White100,
                selected = SatsColorPrimitives.BrightBlue20,
                disabled = SatsColorPrimitives.SatsBlue10,
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
                information = SatsColorPrimitives.BrightBlue110,
                featured = SatsColorPrimitives.SatsCoral120,
            ),
        ),
        secondary = SatsColors2.Surfaces.Secondary(
            bg = SatsColors2.Surfaces.Secondary.Bg(
                default = SatsColorPrimitives.Black5,
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
                information = SatsColorPrimitives.BrightBlue110,
                featured = SatsColorPrimitives.SatsCoral120,
            ),
        ),
        fixed = SatsColors2.Surfaces.Fixed(
            primary = SatsColors2.Surfaces.Fixed.Primary(
                bg = SatsColors2.Surfaces.Fixed.Primary.Bg(
                    default = SatsColorPrimitives.SatsBlue,
                    selected = SatsColorPrimitives.SatsBlueGrey80,
                ),
                fg = SatsColors2.Surfaces.Fixed.Primary.Fg(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.White65,
                    disabled = SatsColorPrimitives.White40,
                    success = SatsColorPrimitives.SpringGreen60,
                    warning = SatsColorPrimitives.Gold60,
                    error = SatsColorPrimitives.Cardinal60,
                    waitlist = SatsColorPrimitives.EgyptianPurple40,
                    neutral = SatsColorPrimitives.White60,
                    information = SatsColorPrimitives.BrightBlue60,
                    featured = SatsColorPrimitives.SatsCoral60,
                ),
            ),
            secondary = SatsColors2.Surfaces.Fixed.Secondary(
                bg = SatsColors2.Surfaces.Fixed.Secondary.Bg(
                    default = SatsColorPrimitives.SatsBlueGrey80,
                    selected = SatsColorPrimitives.SatsBlueGrey80,
                ),
                fg = SatsColors2.Surfaces.Fixed.Secondary.Fg(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.White65,
                    disabled = SatsColorPrimitives.White40,
                    success = SatsColorPrimitives.SpringGreen60,
                    warning = SatsColorPrimitives.Gold60,
                    error = SatsColorPrimitives.Cardinal60,
                    waitlist = SatsColorPrimitives.EgyptianPurple40,
                    neutral = SatsColorPrimitives.White60,
                    information = SatsColorPrimitives.BrightBlue60,
                    featured = SatsColorPrimitives.SatsCoral60,
                ),
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
        waitingList = SatsColors2.SignalSurfaces.WaitingList(
            bg = SatsColorPrimitives.EgyptianPurple10,
            fg = SatsColors2.SignalSurfaces.WaitingList.Fg(
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
                alternate = SatsColorPrimitives.BrightBlue110,
            ),
        ),
        featured = SatsColors2.SignalSurfaces.Featured(
            bg = SatsColorPrimitives.SatsCoral5,
            fg = SatsColors2.SignalSurfaces.Featured.Fg(
                default = SatsColorPrimitives.SatsBlue,
                alternate = SatsColorPrimitives.SatsCoral,
            ),
        ),
    ),

    isLightMode = true,
)
