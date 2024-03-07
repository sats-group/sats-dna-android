package com.sats.dna.colors

internal val SatsDarkColors2 = SatsColors2(
    buttons = SatsColors2.Buttons(
        primary = SatsColors2.Buttons.Primary(
            default = SatsColors2.Buttons.Primary.Default(
                bg = SatsColorPrimitives.BrightBlue110,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.Primary.Disabled(
                bg = SatsColorPrimitives.BrightBlue160,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        secondary = SatsColors2.Buttons.Secondary(
            default = SatsColors2.Buttons.Secondary.Default(
                outline = SatsColorPrimitives.BrightBlue110,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.Secondary.Disabled(
                outline = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        clean = SatsColors2.Buttons.Clean(
            default = SatsColors2.Buttons.Clean.Default(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            disabled = SatsColors2.Buttons.Clean.Disabled(
                bg = SatsColorPrimitives.White10,
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
                fg = SatsColorPrimitives.White70,
            ),
        ),
        action = SatsColors2.Buttons.Action(
            default = SatsColors2.Buttons.Action.Default(
                fg = SatsColorPrimitives.SatsCoral,
            ),
            disabled = SatsColors2.Buttons.Action.Disabled(
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        waitingListFilled = SatsColors2.Buttons.WaitingListFilled(
            default = SatsColors2.Buttons.WaitingListFilled.Default(
                bg = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.WaitingListFilled.Disabled(
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        waitingListSecondary = SatsColors2.Buttons.WaitingListSecondary(
            default = SatsColors2.Buttons.WaitingListSecondary.Default(
                outline = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.EgyptianPurple80,
            ),
            disabled = SatsColors2.Buttons.WaitingListSecondary.Disabled(
                outline = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        destructive = SatsColors2.Buttons.Destructive(
            default = SatsColors2.Buttons.Destructive.Default(
                default = SatsColors2.Buttons.Destructive.Default.Default(
                    bg = SatsColorPrimitives.ChiliRed80,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = SatsColors2.Buttons.Destructive.Default.Disabled(
                    bg = SatsColorPrimitives.Black80,
                    fg = SatsColorPrimitives.Black50,
                ),
            ),
            alternate = SatsColors2.Buttons.Destructive.Alternate(
                default = SatsColors2.Buttons.Destructive.Alternate.Default(
                    fg = SatsColorPrimitives.ChiliRed80,
                ),
                disabled = SatsColors2.Buttons.Destructive.Alternate.Disabled(
                    fg = SatsColorPrimitives.Black50,
                ),
            ),
        ),
    ),
    graphicalElements = SatsColors2.GraphicalElements(
        divider = SatsColors2.GraphicalElements.Divider(
            default = SatsColorPrimitives.Black80,
            alternate = SatsColorPrimitives.White40,
        ),
        border = SatsColors2.GraphicalElements.Border(
            default = SatsColorPrimitives.Black70,
            focused = SatsColorPrimitives.White40,
        ),
        signalBorder = SatsColors2.GraphicalElements.SignalBorder(
            success = SatsColorPrimitives.SpringGreen30,
            warning = SatsColorPrimitives.Gold30,
            error = SatsColorPrimitives.Cardinal30,
            waitingList = SatsColorPrimitives.EgyptianPurple60,
            neutral = SatsColorPrimitives.Black20,
            information = SatsColorPrimitives.BrightBlue20,
            featured = SatsColorPrimitives.SatsCoral40,
        ),
        skeleton = SatsColorPrimitives.Black80,
        navBar = SatsColors2.GraphicalElements.NavBar(
            selected = SatsColorPrimitives.White100,
            notSelected = SatsColorPrimitives.White100,
        ),
        progressBar = SatsColors2.GraphicalElements.ProgressBar(
            indicator = SatsColorPrimitives.SatsCoral90,
            indicatorAlternate = SatsColorPrimitives.BrightBlue110,
            bg = SatsColorPrimitives.Black70,
        ),
        fixedProgressBar = SatsColors2.GraphicalElements.FixedProgressBar(
            indicator = SatsColorPrimitives.SatsCoral90,
            indicatorAlternate = SatsColorPrimitives.BrightBlue110,
            bg = SatsColorPrimitives.White40,
        ),
        graphs = SatsColors2.GraphicalElements.Graphs(
            bar = SatsColors2.GraphicalElements.Graphs.Bar(
                primary = SatsColors2.GraphicalElements.Graphs.Bar.Primary(
                    default = SatsColorPrimitives.SatsCoral90,
                    bg = SatsColorPrimitives.Black80,
                ),
                secondary = SatsColors2.GraphicalElements.Graphs.Bar.Secondary(
                    default = SatsColorPrimitives.SatsBlue40,
                    bg = SatsColorPrimitives.Black70,
                ),
            ),
            trend = SatsColors2.GraphicalElements.Graphs.Trend(
                upwards = SatsColorPrimitives.SpringGreen80,
                neutral = SatsColorPrimitives.SatsCoral130,
                downwards = SatsColorPrimitives.Cardinal100,
            ),
        ),
        selector = SatsColors2.GraphicalElements.Selector(
            unselected = SatsColors2.GraphicalElements.Selector.Unselected(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White10,
            ),
            selected = SatsColors2.GraphicalElements.Selector.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
            indicator = SatsColorPrimitives.Black90,
        ),
        selectorFixed = SatsColors2.GraphicalElements.SelectorFixed(
            unselected = SatsColors2.GraphicalElements.SelectorFixed.Unselected(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White50,
            ),
            selected = SatsColors2.GraphicalElements.SelectorFixed.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
            indicator = SatsColorPrimitives.SatsBlue,
        ),
        chips = SatsColors2.GraphicalElements.Chips(
            unselected = SatsColors2.GraphicalElements.Chips.Unselected(
                default = SatsColors2.GraphicalElements.Chips.Unselected.Default(
                    bg = SatsColorPrimitives.White85,
                    fg = SatsColorPrimitives.BrightBlue110,
                ),
                disabled = SatsColors2.GraphicalElements.Chips.Unselected.Disabled(
                    bg = SatsColorPrimitives.White10,
                    fg = SatsColorPrimitives.White20,
                ),
            ),
            selected = SatsColors2.GraphicalElements.Chips.Selected(
                default = SatsColors2.GraphicalElements.Chips.Selected.Default(
                    bg = SatsColorPrimitives.BrightBlue110,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = SatsColors2.GraphicalElements.Chips.Selected.Disabled(
                    bg = SatsColorPrimitives.Black80,
                    fg = SatsColorPrimitives.White60,
                ),
            ),
        ),
        toggle = SatsColors2.GraphicalElements.Toggle(
            unselected = SatsColors2.GraphicalElements.Toggle.Unselected(
                default = SatsColorPrimitives.Black70,
                disabled = SatsColorPrimitives.Black80,
            ),
            selected = SatsColors2.GraphicalElements.Toggle.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
            handle = SatsColorPrimitives.White100,
        ),
        icons = SatsColors2.GraphicalElements.Icons(
            primary = SatsColorPrimitives.White100,
            secondary = SatsColorPrimitives.Black20,
            fixed = SatsColorPrimitives.White100,
            positive = SatsColorPrimitives.SpringGreen80,
            attention = SatsColorPrimitives.Gold100,
            negative = SatsColorPrimitives.Cardinal100,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
            delete = SatsColorPrimitives.ChiliRed80,
        ),
        indicators = SatsColors2.GraphicalElements.Indicators(
            positive = SatsColors2.GraphicalElements.Indicators.Positive(
                default = SatsColorPrimitives.SpringGreen80,
                alternate = SatsColorPrimitives.SpringGreen170,
            ),
            attention = SatsColors2.GraphicalElements.Indicators.Attention(
                default = SatsColorPrimitives.Gold100,
                alternate = SatsColorPrimitives.Gold170,
            ),
            negative = SatsColors2.GraphicalElements.Indicators.Negative(
                default = SatsColorPrimitives.Cardinal100,
                alternate = SatsColorPrimitives.Cardinal170,
            ),
            neutral = SatsColors2.GraphicalElements.Indicators.Neutral(
                default = SatsColorPrimitives.SatsBlue40,
                alternate = SatsColorPrimitives.Black80,
            ),
        ),
        signal = SatsColors2.GraphicalElements.Signal(
            success = SatsColorPrimitives.SpringGreen80,
            warning = SatsColorPrimitives.Gold100,
            error = SatsColorPrimitives.Cardinal100,
            neutral = SatsColorPrimitives.SatsBlue40,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
        ),
        tags = SatsColors2.GraphicalElements.Tags(
            primary = SatsColors2.GraphicalElements.Tags.Primary(
                bg = SatsColorPrimitives.BrightBlue110,
                fg = SatsColorPrimitives.White100,
            ),
            secondary = SatsColors2.GraphicalElements.Tags.Secondary(
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.White100,
            ),
            featured = SatsColors2.GraphicalElements.Tags.Featured(
                bg = SatsColorPrimitives.SatsCoral90,
                fg = SatsColorPrimitives.SatsBlue,
            ),
        ),
        rewards = SatsColors2.GraphicalElements.Rewards(
            blue = SatsColors2.GraphicalElements.Rewards.Blue(
                bg = SatsColorPrimitives.BrightBlue100,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            silver = SatsColors2.GraphicalElements.Rewards.Silver(
                bg = SatsColorPrimitives.SatsBlue20,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            gold = SatsColors2.GraphicalElements.Rewards.Gold(
                bg = SatsColorPrimitives.Gold110,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            platinum = SatsColors2.GraphicalElements.Rewards.Platinum(
                bg = SatsColorPrimitives.SatsBlue40,
                fg = SatsColorPrimitives.SatsBlue,
            ),
        ),
        workouts = SatsColors2.GraphicalElements.Workouts(
            pt = SatsColors2.GraphicalElements.Workouts.Pt(
                bg = SatsColorPrimitives.UranianBlue70,
                fg = SatsColorPrimitives.BrightBlue160,
            ),
            gx = SatsColors2.GraphicalElements.Workouts.Gx(
                bg = SatsColorPrimitives.SalmonPink70,
                fg = SatsColorPrimitives.ChiliRed170,
            ),
            treatments = SatsColors2.GraphicalElements.Workouts.Treatments(
                bg = SatsColorPrimitives.CaribbeanCurrent70,
                fg = SatsColorPrimitives.SpringGreen10,
            ),
            gymfloor = SatsColors2.GraphicalElements.Workouts.Gymfloor(
                bg = SatsColorPrimitives.Tangerine70,
                fg = SatsColorPrimitives.Gold170,
            ),
            other = SatsColors2.GraphicalElements.Workouts.Other(
                bg = SatsColorPrimitives.Celadon70,
                fg = SatsColorPrimitives.SpringGreen170,
            ),
            bootcamp = SatsColors2.GraphicalElements.Workouts.Bootcamp(
                bg = SatsColorPrimitives.TropicalIndigo70,
                fg = SatsColorPrimitives.EgyptianPurple160,
            ),
        ),
    ),
    backgrounds = SatsColors2.Backgrounds(
        primary = SatsColors2.Backgrounds.Primary(
            bg = SatsColors2.Backgrounds.Primary.Bg(
                default = SatsColorPrimitives.Black,
                selected = SatsColorPrimitives.Black,
            ),
            fg = SatsColors2.Backgrounds.Primary.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.Black20,
                disabled = SatsColorPrimitives.Black50,
            ),
        ),
        secondary = SatsColors2.Backgrounds.Secondary(
            bg = SatsColors2.Backgrounds.Secondary.Bg(
                default = SatsColorPrimitives.Black90,
                selected = SatsColorPrimitives.Black90,
            ),
            fg = SatsColors2.Backgrounds.Secondary.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.Black20,
                disabled = SatsColorPrimitives.Black50,
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
                default = SatsColorPrimitives.Black85,
                selected = SatsColorPrimitives.BrightBlue160,
                disabled = SatsColorPrimitives.Black95,
            ),
            fg = SatsColors2.Surfaces.Primary.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.Black20,
                disabled = SatsColorPrimitives.Black50,
                success = SatsColorPrimitives.SpringGreen80,
                warning = SatsColorPrimitives.Gold80,
                error = SatsColorPrimitives.Cardinal60,
                waitlist = SatsColorPrimitives.EgyptianPurple60,
                neutral = SatsColorPrimitives.Black40,
                information = SatsColorPrimitives.BrightBlue60,
                featured = SatsColorPrimitives.SatsCoral90,
            ),
        ),
        secondary = SatsColors2.Surfaces.Secondary(
            bg = SatsColors2.Surfaces.Secondary.Bg(
                default = SatsColorPrimitives.Black90,
                selected = SatsColorPrimitives.Black90,
            ),
            fg = SatsColors2.Surfaces.Secondary.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.Black20,
                disabled = SatsColorPrimitives.Black50,
                success = SatsColorPrimitives.SpringGreen80,
                warning = SatsColorPrimitives.Gold80,
                error = SatsColorPrimitives.Cardinal60,
                waitlist = SatsColorPrimitives.EgyptianPurple60,
                neutral = SatsColorPrimitives.Black40,
                information = SatsColorPrimitives.BrightBlue60,
                featured = SatsColorPrimitives.SatsCoral90,
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
            bg = SatsColorPrimitives.SpringGreen170,
            fg = SatsColors2.SignalSurfaces.Success.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.SpringGreen80,
            ),
        ),
        warning = SatsColors2.SignalSurfaces.Warning(
            bg = SatsColorPrimitives.Gold170,
            fg = SatsColors2.SignalSurfaces.Warning.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.Gold80,
            ),
        ),
        error = SatsColors2.SignalSurfaces.Error(
            bg = SatsColorPrimitives.Cardinal170,
            fg = SatsColors2.SignalSurfaces.Error.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.Cardinal60,
            ),
        ),
        waitingList = SatsColors2.SignalSurfaces.WaitingList(
            bg = SatsColorPrimitives.EgyptianPurple160,
            fg = SatsColors2.SignalSurfaces.WaitingList.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.EgyptianPurple60,
            ),
        ),
        neutral = SatsColors2.SignalSurfaces.Neutral(
            bg = SatsColorPrimitives.Black90,
            fg = SatsColors2.SignalSurfaces.Neutral.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.Black40,
            ),
        ),
        information = SatsColors2.SignalSurfaces.Information(
            bg = SatsColorPrimitives.BrightBlue160,
            fg = SatsColors2.SignalSurfaces.Information.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.BrightBlue60,
            ),
        ),
        featured = SatsColors2.SignalSurfaces.Featured(
            bg = SatsColorPrimitives.BrightBlue160,
            fg = SatsColors2.SignalSurfaces.Featured.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.SatsCoral90,
            ),
        ),
    ),

    isLightMode = false,
)
