package com.sats.dna.colors

internal val SatsLightColors2 = SatsColors2(
    buttonColors = SatsButtonColors(
        primary = SatsButtonColors.Primary(
            background = SatsButtonColors.Primary.Background(
                default = SatsColorPrimitives.SatsBlue,
                hover = SatsColorPrimitives.SatsBlueGrey80,
                disabled = SatsColorPrimitives.Black20,
            ),
            content = SatsButtonColors.Primary.Content(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.Black60,
            ),
        ),
        secondary = SatsButtonColors.Secondary(
            background = SatsButtonColors.Secondary.Background(
                default = SatsColorPrimitives.SatsBlue,
                hover = SatsColorPrimitives.BrightBlue10,
                disabled = SatsColorPrimitives.Black20,
            ),
            content = SatsButtonColors.Secondary.Content(
                default = SatsColorPrimitives.SatsBlue,
                disabled = SatsColorPrimitives.Black60,
            ),
        ),
        clean = SatsButtonColors.Clean(
            background = SatsButtonColors.Clean.Background(
                default = SatsColorPrimitives.White100,
                hover = SatsColorPrimitives.SatsBlue5,
                disabled = SatsColorPrimitives.White20,
            ),
            content = SatsButtonColors.Clean.Content(
                default = SatsColorPrimitives.SatsBlue,
                disabled = SatsColorPrimitives.Black60,
            ),
        ),
        cleanSecondary = SatsButtonColors.CleanSecondary(
            background = SatsButtonColors.CleanSecondary.Background(
                default = SatsColorPrimitives.White15,
                hover = SatsColorPrimitives.White10,
                disabled = SatsColorPrimitives.White5,
            ),
            content = SatsButtonColors.CleanSecondary.Content(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White60,
            ),
        ),
        cta = SatsButtonColors.Cta(
            background = SatsButtonColors.Cta.Background(
                default = SatsColorPrimitives.SatsCoral120,
                hover = SatsColorPrimitives.SatsCoral130,
                disabled = SatsColorPrimitives.Black20,
            ),
            content = SatsButtonColors.Cta.Content(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White60,
            ),
        ),
        action = SatsButtonColors.Action(
            background = SatsButtonColors.Action.Background(
                default = SatsColorPrimitives.SatsCoral120,
                hover = SatsColorPrimitives.SatsCoral130,
                disabled = SatsColorPrimitives.Black20,
            ),
            // TODO: Not specified in design system.
            //  See https://www.figma.com/file/WzKCwRY09zn4rzRVfY0YvdRt?node-id=8530:43885&mode=design#642354885
            content = SatsButtonColors.Action.Content(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White60,
            ),
        ),
        waitingList = SatsButtonColors.WaitingList(
            background = SatsButtonColors.WaitingList.Background(
                default = SatsColorPrimitives.EgyptianPurple80,
                hover = SatsColorPrimitives.EgyptianPurple100,
                disabled = SatsColorPrimitives.Black20,
            ),
            content = SatsButtonColors.WaitingList.Content(
                default = SatsButtonColors.WaitingList.Content.Default(
                    default = SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.Black60,
                ),
                alternate = SatsButtonColors.WaitingList.Content.Alternate(
                    default = SatsColorPrimitives.EgyptianPurple80,
                    hover = SatsColorPrimitives.EgyptianPurple100,
                    disabled = SatsColorPrimitives.Black60,
                ),
            ),
        ),
        delete = SatsButtonColors.Delete(
            background = SatsButtonColors.Delete.Background(
                default = SatsColorPrimitives.ChiliRed100,
                hover = SatsColorPrimitives.ChiliRed120,
                disabled = SatsColorPrimitives.Black20,
            ),
            content = SatsButtonColors.Delete.Content(
                default = SatsButtonColors.Delete.Content.Default(
                    default = SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.Black60,
                ),
                alternate = SatsButtonColors.Delete.Content.Alternate(
                    default = SatsColorPrimitives.ChiliRed100,
                    hover = SatsColorPrimitives.ChiliRed120,
                    disabled = SatsColorPrimitives.Black60,
                ),
            ),
        ),
    ),
    graphicalElements = SatsGraphicalElementColors(
        divider = SatsGraphicalElementColors.Divider(
            default = SatsColorPrimitives.SatsLightGrey15,
            alternate = SatsColorPrimitives.BlackO20,
        ),
        skeleton = SatsColorPrimitives.SatsLightGrey15,
        navBar = SatsGraphicalElementColors.NavBar(
            selected = SatsColorPrimitives.SatsBlue,
            notSelected = SatsColorPrimitives.SatsBlue,
        ),
        progressBar = SatsGraphicalElementColors.ProgressBar(
            indicator = SatsColorPrimitives.SatsCoral,
            background = SatsColorPrimitives.SatsLightGrey15,
        ),
        graphs = SatsGraphicalElementColors.Graphs(
            bar = SatsGraphicalElementColors.Graphs.Bar(
                primary = SatsGraphicalElementColors.Graphs.Bar.Primary(
                    default = SatsColorPrimitives.SatsCoral,
                    background = SatsColorPrimitives.SatsLightGrey15,
                ),
                secondary = SatsGraphicalElementColors.Graphs.Bar.Secondary(
                    default = SatsColorPrimitives.SatsBlue40,
                    background = SatsColorPrimitives.SatsBlue5,
                ),
            ),
            trend = SatsGraphicalElementColors.Graphs.Trend(
                upwards = SatsColorPrimitives.SpringGreen80,
                neutral = SatsColorPrimitives.SatsCoral40,
                downwards = SatsColorPrimitives.Cardinal100,
            ),
        ),
        selector = SatsGraphicalElementColors.Selector(
            unselected = SatsGraphicalElementColors.Selector.Unselected(
                default = SatsColorPrimitives.SatsBlueGrey80,
                disabled = SatsColorPrimitives.SatsLightGrey15,
            ),
            selected = SatsGraphicalElementColors.Selector.Selected(
                default = SatsColorPrimitives.SatsCoral,
                disabled = SatsColorPrimitives.SatsCoral40,
            ),
        ),
        chips = SatsGraphicalElementColors.Chips(
            unselected = SatsGraphicalElementColors.Chips.Unselected(
                background = SatsGraphicalElementColors.Chips.Unselected.Background(
                    default = SatsColorPrimitives.SatsBlue40,
                    disabled = SatsColorPrimitives.SatsLightGrey15,
                ),
                content = SatsGraphicalElementColors.Chips.Unselected.Content(
                    default = SatsColorPrimitives.SatsBlue,
                    disabled = SatsColorPrimitives.Black40,
                ),
            ),
            selected = SatsGraphicalElementColors.Chips.Selected(
                background = SatsGraphicalElementColors.Chips.Selected.Background(
                    default = SatsColorPrimitives.SatsBlue,
                    hover = SatsColorPrimitives.BrightBlue10,
                    disabled = SatsColorPrimitives.SatsLightGrey15,
                ),
                content = SatsGraphicalElementColors.Chips.Selected.Content(
                    default = SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.SatsBlue70,
                ),
            ),
        ),
        toggle = SatsGraphicalElementColors.Toggle(
            unselected = SatsGraphicalElementColors.Toggle.Unselected(
                default = SatsColorPrimitives.SatsBlue40,
                disabled = SatsColorPrimitives.SatsLightGrey15,
            ),
            interactiveElement = SatsColorPrimitives.White100,
            selected = SatsGraphicalElementColors.Toggle.Selected(
                default = SatsColorPrimitives.SatsCoral,
                disabled = SatsColorPrimitives.SatsCoral40,
            ),
        ),
        icons = SatsGraphicalElementColors.Icons(
            primary = SatsColorPrimitives.SatsBlue,
            secondary = SatsColorPrimitives.SatsBlueGrey80,
            fixed = SatsColorPrimitives.White100,
            positive = SatsColorPrimitives.SpringGreen100,
            attention = SatsColorPrimitives.Gold100,
            negative = SatsColorPrimitives.Cardinal100,
            waitingList = SatsColorPrimitives.EgyptianPurple100,
            delete = SatsColorPrimitives.ChiliRed100,
        ),
        indicators = SatsGraphicalElementColors.Indicators(
            positive = SatsGraphicalElementColors.Indicators.Positive(
                default = SatsColorPrimitives.SpringGreen100,
                alternate = SatsColorPrimitives.SpringGreen30,
            ),
            attention = SatsGraphicalElementColors.Indicators.Attention(
                default = SatsColorPrimitives.Gold100,
                alternate = SatsColorPrimitives.Gold30,
            ),
            negative = SatsGraphicalElementColors.Indicators.Negative(
                default = SatsColorPrimitives.Cardinal100,
                alternate = SatsColorPrimitives.Cardinal30,
            ),
            neutral = SatsGraphicalElementColors.Indicators.Neutral(
                default = SatsColorPrimitives.SatsBlue70,
                alternate = SatsColorPrimitives.SatsBlue40,
            ),
        ),
        signal = SatsGraphicalElementColors.Signal(
            success = SatsColorPrimitives.SpringGreen100,
            warning = SatsColorPrimitives.Gold100,
            error = SatsColorPrimitives.Cardinal100,
            neutral = SatsColorPrimitives.SatsBlue70,
            waitingList = SatsColorPrimitives.EgyptianPurple100,
        ),
        tags = SatsGraphicalElementColors.Tags(
            primary = SatsGraphicalElementColors.Tags.Primary(
                background = SatsColorPrimitives.SatsBlue,
                content = SatsColorPrimitives.White100,
            ),
            secondary = SatsGraphicalElementColors.Tags.Secondary(
                background = SatsColorPrimitives.SatsBlue5,
                content = SatsColorPrimitives.SatsBlue,
            ),
            featured = SatsGraphicalElementColors.Tags.Featured(
                background = SatsColorPrimitives.SatsCoral120,
                content = SatsColorPrimitives.White100,
            ),
        ),
        rewards = SatsGraphicalElementColors.Rewards(
            background = SatsGraphicalElementColors.Rewards.Background(
                blue = SatsColorPrimitives.SatsBlue,
                silver = SatsColorPrimitives.Black50,
                gold = SatsColorPrimitives.Gold130,
                platinum = SatsColorPrimitives.SatsBlueGrey80,
            ),
            content = SatsColorPrimitives.White100,
        ),
        workouts = SatsGraphicalElementColors.Workouts(
            pt = SatsColorPrimitives.UranianBlue100,
            gx = SatsColorPrimitives.SalmonPink100,
            treatments = SatsColorPrimitives.CaribbeanCurrent100,
            gymfloor = SatsColorPrimitives.Tangerine100,
            ownTrainingOther = SatsColorPrimitives.Celadon100,
        ),
    ),
    backgrounds = SatsBackgroundColors(
        background = SatsBackgroundColors.Background(
            primary = SatsBackgroundColors.Background.Primary(
                background = SatsBackgroundColors.Background.Primary.Background(
                    default = SatsColorPrimitives.Black3,
                    hover = SatsColorPrimitives.White100,
                    selected = SatsColorPrimitives.Black3,
                ),
                content = SatsBackgroundColors.Background.Primary.Content(
                    default = SatsColorPrimitives.SatsBlue,
                    alternate = SatsColorPrimitives.SatsBlue70,
                    disabled = SatsColorPrimitives.Black60,
                ),
            ),
            secondary = SatsBackgroundColors.Background.Secondary(
                background = SatsBackgroundColors.Background.Secondary.Background(
                    default = SatsColorPrimitives.White100,
                    hover = SatsColorPrimitives.SatsBlue5,
                    selected = SatsColorPrimitives.White100,
                ),
                content = SatsBackgroundColors.Background.Secondary.Content(
                    default = SatsColorPrimitives.SatsBlue,
                    alternate = SatsColorPrimitives.SatsBlue70,
                    disabled = SatsColorPrimitives.Black60,
                ),
            ),
            fixed = SatsBackgroundColors.Background.Fixed(
                background = SatsBackgroundColors.Background.Fixed.Background(
                    default = SatsColorPrimitives.SatsBlue,
                    hover = SatsColorPrimitives.SatsBlue90,
                    selected = SatsColorPrimitives.SatsBlueGrey80,
                ),
                content = SatsBackgroundColors.Background.Fixed.Content(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.White80,
                    disabled = SatsColorPrimitives.White60,
                ),
            ),
        ),
        surface = SatsBackgroundColors.Surface(
            primary = SatsBackgroundColors.Surface.Primary(
                background = SatsBackgroundColors.Surface.Primary.Background(
                    default = SatsColorPrimitives.White100,
                    hover = SatsColorPrimitives.BrightBlue10,
                    selected = SatsColorPrimitives.BrightBlue20,
                ),
                content = SatsBackgroundColors.Surface.Primary.Content(
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
            secondary = SatsBackgroundColors.Surface.Secondary(
                background = SatsBackgroundColors.Surface.Secondary.Background(
                    default = SatsColorPrimitives.Black5,
                    hover = SatsColorPrimitives.White100,
                    selected = SatsColorPrimitives.Black5,
                ),
                content = SatsBackgroundColors.Surface.Secondary.Content(
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
            fixed = SatsBackgroundColors.Surface.Fixed(
                background = SatsBackgroundColors.Surface.Fixed.Background(
                    default = SatsColorPrimitives.SatsBlueGrey80,
                    hover = SatsColorPrimitives.SatsBlue90,
                    selected = SatsColorPrimitives.SatsBlueGrey80,
                ),
                content = SatsBackgroundColors.Surface.Fixed.Content(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.White85,
                    disabled = SatsColorPrimitives.White65,
                ),
            ),
        ),
        signalSurface = SatsBackgroundColors.SignalSurface(
            success = SatsBackgroundColors.SignalSurface.Success(
                background = SatsColorPrimitives.SpringGreen10,
                content = SatsBackgroundColors.SignalSurface.Success.Content(
                    default = SatsColorPrimitives.SatsBlue,
                    alternate = SatsColorPrimitives.SpringGreen120,
                ),
            ),
            warning = SatsBackgroundColors.SignalSurface.Warning(
                background = SatsColorPrimitives.Gold10,
                content = SatsBackgroundColors.SignalSurface.Warning.Content(
                    default = SatsColorPrimitives.SatsBlue,
                    alternate = SatsColorPrimitives.Gold140,
                ),
            ),
            error = SatsBackgroundColors.SignalSurface.Error(
                background = SatsColorPrimitives.Cardinal10,
                content = SatsBackgroundColors.SignalSurface.Error.Content(
                    default = SatsColorPrimitives.SatsBlue,
                    alternate = SatsColorPrimitives.Cardinal120,
                ),
            ),
            waitlist = SatsBackgroundColors.SignalSurface.Waitlist(
                background = SatsColorPrimitives.EgyptianPurple10,
                content = SatsBackgroundColors.SignalSurface.Waitlist.Content(
                    default = SatsColorPrimitives.SatsBlue,
                    alternate = SatsColorPrimitives.EgyptianPurple100,
                ),
            ),
            neutral = SatsBackgroundColors.SignalSurface.Neutral(
                background = SatsColorPrimitives.Black5,
                content = SatsBackgroundColors.SignalSurface.Neutral.Content(
                    default = SatsColorPrimitives.SatsBlue,
                    alternate = SatsColorPrimitives.Black60,
                ),
            ),
            information = SatsBackgroundColors.SignalSurface.Information(
                background = SatsColorPrimitives.BrightBlue10,
                content = SatsBackgroundColors.SignalSurface.Information.Content(
                    default = SatsColorPrimitives.SatsBlue,
                    alternate = SatsColorPrimitives.BrightBlue160,
                ),
            ),
        ),
    ),

    isLightMode = true,
)
