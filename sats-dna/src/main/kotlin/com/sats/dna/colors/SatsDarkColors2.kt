package com.sats.dna.colors

internal val SatsDarkColors2 = SatsColors2(
    buttons = SatsColors2.Buttons(
        primary = SatsColors2.Buttons.Primary(
            default = SatsColors2.Buttons.Primary.Default(
                bg = SatsColorPrimitives.BrightBlue110,
                fg = SatsColorPrimitives.White100,
            ),
            hover = SatsColors2.Buttons.Primary.Hover(
                bg = SatsColorPrimitives.BrightBlue100,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.Primary.Disabled(
                bg = SatsColorPrimitives.BrightBlue160,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        secondary = SatsColors2.Buttons.Secondary(
            default = SatsColors2.Buttons.Secondary.Default(
                bg = SatsColorPrimitives.BrightBlue110,
                fg = SatsColorPrimitives.White100,
            ),
            hover = SatsColors2.Buttons.Secondary.Hover(
                bg = SatsColorPrimitives.BrightBlue160,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.Secondary.Disabled(
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        clean = SatsColors2.Buttons.Clean(
            default = SatsColors2.Buttons.Clean.Default(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            hover = SatsColors2.Buttons.Clean.Hover(
                bg = SatsColorPrimitives.White90,
                fg = SatsColorPrimitives.SatsBlue,
            ),
            disabled = SatsColors2.Buttons.Clean.Disabled(
                bg = SatsColorPrimitives.White10,
                fg = SatsColorPrimitives.Black50,
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
                fg = SatsColorPrimitives.White70,
            ),
        ),
        cta = SatsColors2.Buttons.Cta(
            default = SatsColors2.Buttons.Cta.Default(
                bg = SatsColorPrimitives.SatsCoral,
                fg = SatsColorPrimitives.White100,
            ),
            hover = SatsColors2.Buttons.Cta.Hover(
                bg = SatsColorPrimitives.SatsCoral120,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.Cta.Disabled(
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.White70,
            ),
        ),
        action = SatsColors2.Buttons.Action(
            default = SatsColorPrimitives.SatsCoral,
            hover = SatsColorPrimitives.SatsCoral90,
            disabled = SatsColorPrimitives.Black50,
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
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        waitingListOutlined = SatsColors2.Buttons.WaitingListOutlined(
            default = SatsColorPrimitives.EgyptianPurple80,
            hover = SatsColorPrimitives.EgyptianPurple100,
            disabled = SatsColorPrimitives.Black50,
        ),
        deleteFilled = SatsColors2.Buttons.DeleteFilled(
            default = SatsColors2.Buttons.DeleteFilled.Default(
                bg = SatsColorPrimitives.ChiliRed80,
                fg = SatsColorPrimitives.White100,
            ),
            hover = SatsColors2.Buttons.DeleteFilled.Hover(
                bg = SatsColorPrimitives.ChiliRed60,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = SatsColors2.Buttons.DeleteFilled.Disabled(
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        deleteOutlined = SatsColors2.Buttons.DeleteOutlined(
            default = SatsColorPrimitives.ChiliRed80,
            hover = SatsColorPrimitives.ChiliRed60,
            disabled = SatsColorPrimitives.Black50,
        ),
    ),
    graphicalElements = SatsColors2.GraphicalElements(
        divider = SatsColors2.GraphicalElements.Divider(
            default = SatsColorPrimitives.Black80,
            alternate = SatsColorPrimitives.White40,
        ),
        skeleton = SatsColorPrimitives.Black80,
        navBar = SatsColors2.GraphicalElements.NavBar(
            selected = SatsColorPrimitives.White100,
            notSelected = SatsColorPrimitives.White100,
        ),
        progressBar = SatsColors2.GraphicalElements.ProgressBar(
            indicator = SatsColorPrimitives.SatsCoral90,
            bg = SatsColorPrimitives.Black70,
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
        ),
        chips = SatsColors2.GraphicalElements.Chips(
            unselected = SatsColors2.GraphicalElements.Chips.Unselected(
                default = SatsColors2.GraphicalElements.Chips.Unselected.Default(
                    bg = SatsColorPrimitives.White85,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = SatsColors2.GraphicalElements.Chips.Unselected.Disabled(
                    bg = SatsColorPrimitives.BrightBlue110,
                    fg = SatsColorPrimitives.White20,
                ),
            ),
            selected = SatsColors2.GraphicalElements.Chips.Selected(
                default = SatsColors2.GraphicalElements.Chips.Selected.Default(
                    bg = SatsColorPrimitives.BrightBlue110,
                    fg = SatsColorPrimitives.White100,
                ),
                hover = SatsColors2.GraphicalElements.Chips.Selected.Hover(
                    bg = SatsColorPrimitives.BrightBlue100,
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
            interactiveElement = SatsColorPrimitives.White100,
            selected = SatsColors2.GraphicalElements.Toggle.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
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
            pt = SatsColorPrimitives.UranianBlue70,
            gx = SatsColorPrimitives.SalmonPink70,
            treatments = SatsColorPrimitives.CaribbeanCurrent70,
            gymfloor = SatsColorPrimitives.Tangerine70,
            ownTrainingOther = SatsColorPrimitives.Celadon70,
        ),
    ),
    backgrounds = SatsColors2.Backgrounds(
        primary = SatsColors2.Backgrounds.Primary(
            bg = SatsColors2.Backgrounds.Primary.Bg(
                default = SatsColorPrimitives.Black,
                hover = SatsColorPrimitives.Black90,
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
                hover = SatsColorPrimitives.Black85,
                selected = SatsColorPrimitives.Black90,
            ),
            fg = SatsColors2.Backgrounds.Secondary.Fg(
                default = SatsColorPrimitives.White100,
                alternate = SatsColorPrimitives.Black20,
                disabled = SatsColorPrimitives.Black50,
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
                default = SatsColorPrimitives.Black85,
                hover = SatsColorPrimitives.BrightBlue170,
                selected = SatsColorPrimitives.BrightBlue160,
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
            ),
        ),
        secondary = SatsColors2.Surfaces.Secondary(
            bg = SatsColors2.Surfaces.Secondary.Bg(
                default = SatsColorPrimitives.Black90,
                hover = SatsColorPrimitives.Black85,
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
        waitlist = SatsColors2.SignalSurfaces.Waitlist(
            bg = SatsColorPrimitives.EgyptianPurple160,
            fg = SatsColors2.SignalSurfaces.Waitlist.Fg(
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
    ),

    isLightMode = true,
)
