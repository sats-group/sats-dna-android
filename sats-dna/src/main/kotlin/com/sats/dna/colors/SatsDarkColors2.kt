package com.sats.dna.colors

internal val SatsDarkColors2 = SatsColors2(
    buttonColors = SatsButtonColors(
        primary = SatsButtonColors.Primary(
            background = SatsButtonColors.Primary.Background(
                default = SatsColorPrimitives.BrightBlue110,
                hover = SatsColorPrimitives.BrightBlue100,
                disabled = SatsColorPrimitives.BrightBlue160,
            ),
            content = SatsButtonColors.Primary.Content(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.Black50,
            ),
        ),
        secondary = SatsButtonColors.Secondary(
            background = SatsButtonColors.Secondary.Background(
                default = SatsColorPrimitives.BrightBlue110,
                hover = SatsColorPrimitives.BrightBlue160,
                disabled = SatsColorPrimitives.Black80,
            ),
            content = SatsButtonColors.Secondary.Content(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.Black50,
            ),
        ),
        clean = SatsButtonColors.Clean(
            background = SatsButtonColors.Clean.Background(
                default = SatsColorPrimitives.White100,
                hover = SatsColorPrimitives.White90,
                disabled = SatsColorPrimitives.White10,
            ),
            content = SatsButtonColors.Clean.Content(
                default = SatsColorPrimitives.SatsBlue,
                disabled = SatsColorPrimitives.Black50,
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
                disabled = SatsColorPrimitives.White70,
            ),
        ),
        cta = SatsButtonColors.Cta(
            background = SatsButtonColors.Cta.Background(
                default = SatsColorPrimitives.SatsCoral,
                hover = SatsColorPrimitives.SatsCoral120,
                disabled = SatsColorPrimitives.Black80,
            ),
            content = SatsButtonColors.Cta.Content(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White70,
            ),
        ),
        action = SatsButtonColors.Action(
            background = SatsButtonColors.Action.Background(
                default = SatsColorPrimitives.SatsCoral,
                hover = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.Black50,
            ),
            // TODO: Not specified in design system.
            //  See https://www.figma.com/file/WzKCwRY09zn4rzRVfY0YvdRt?node-id=8530:43885&mode=design#642354885
            content = SatsButtonColors.Action.Content(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White70,
            ),
        ),
        waitingList = SatsButtonColors.WaitingList(
            background = SatsButtonColors.WaitingList.Background(
                default = SatsColorPrimitives.EgyptianPurple80,
                hover = SatsColorPrimitives.EgyptianPurple100,
                disabled = SatsColorPrimitives.Black80,
            ),
            content = SatsButtonColors.WaitingList.Content(
                default = SatsButtonColors.WaitingList.Content.Default(
                    default = SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.Black50,
                ),
                alternate = SatsButtonColors.WaitingList.Content.Alternate(
                    default = SatsColorPrimitives.EgyptianPurple80,
                    hover = SatsColorPrimitives.EgyptianPurple100,
                    disabled = SatsColorPrimitives.Black50,
                ),
            ),
        ),
        delete = SatsButtonColors.Delete(
            background = SatsButtonColors.Delete.Background(
                default = SatsColorPrimitives.ChiliRed80,
                hover = SatsColorPrimitives.ChiliRed60,
                disabled = SatsColorPrimitives.Black80,
            ),
            content = SatsButtonColors.Delete.Content(
                default = SatsButtonColors.Delete.Content.Default(
                    default = SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.Black50,
                ),
                alternate = SatsButtonColors.Delete.Content.Alternate(
                    default = SatsColorPrimitives.ChiliRed80,
                    hover = SatsColorPrimitives.ChiliRed60,
                    disabled = SatsColorPrimitives.Black50,
                ),
            ),
        ),
    ),
    graphicalElements = SatsGraphicalElementColors(
        divider = SatsGraphicalElementColors.Divider(
            default = SatsColorPrimitives.Black80,
            alternate = SatsColorPrimitives.White40,
        ),
        skeleton = SatsColorPrimitives.Black80,
        navBar = SatsGraphicalElementColors.NavBar(
            selected = SatsColorPrimitives.White100,
            notSelected = SatsColorPrimitives.White100,
        ),
        progressBar = SatsGraphicalElementColors.ProgressBar(
            indicator = SatsColorPrimitives.SatsCoral90,
            background = SatsColorPrimitives.Black70,
        ),
        graphs = SatsGraphicalElementColors.Graphs(
            bar = SatsGraphicalElementColors.Graphs.Bar(
                primary = SatsGraphicalElementColors.Graphs.Bar.Primary(
                    default = SatsColorPrimitives.SatsCoral90,
                    background = SatsColorPrimitives.Black80,
                ),
                secondary = SatsGraphicalElementColors.Graphs.Bar.Secondary(
                    default = SatsColorPrimitives.SatsBlue40,
                    background = SatsColorPrimitives.Black70,
                ),
            ),
            trend = SatsGraphicalElementColors.Graphs.Trend(
                upwards = SatsColorPrimitives.SpringGreen80,
                neutral = SatsColorPrimitives.SatsCoral130,
                downwards = SatsColorPrimitives.Cardinal100,
            ),
        ),
        selector = SatsGraphicalElementColors.Selector(
            unselected = SatsGraphicalElementColors.Selector.Unselected(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White10,
            ),
            selected = SatsGraphicalElementColors.Selector.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
        ),
        chips = SatsGraphicalElementColors.Chips(
            unselected = SatsGraphicalElementColors.Chips.Unselected(
                background = SatsGraphicalElementColors.Chips.Unselected.Background(
                    default = SatsColorPrimitives.White85,
                    disabled = SatsColorPrimitives.White10,
                ),
                content = SatsGraphicalElementColors.Chips.Unselected.Content(
                    default = SatsColorPrimitives.BrightBlue110,
                    disabled = SatsColorPrimitives.White20,
                ),
            ),
            selected = SatsGraphicalElementColors.Chips.Selected(
                background = SatsGraphicalElementColors.Chips.Selected.Background(
                    default = SatsColorPrimitives.BrightBlue110,
                    hover = SatsColorPrimitives.BrightBlue100,
                    disabled = SatsColorPrimitives.Black80,
                ),
                content = SatsGraphicalElementColors.Chips.Selected.Content(
                    default = SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.White60,
                ),
            ),
        ),
        toggle = SatsGraphicalElementColors.Toggle(
            unselected = SatsGraphicalElementColors.Toggle.Unselected(
                default = SatsColorPrimitives.Black70,
                disabled = SatsColorPrimitives.Black80,
            ),
            interactiveElement = SatsColorPrimitives.White100,
            selected = SatsGraphicalElementColors.Toggle.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
        ),
        icons = SatsGraphicalElementColors.Icons(
            primary = SatsColorPrimitives.White100,
            secondary = SatsColorPrimitives.Black20,
            fixed = SatsColorPrimitives.White100,
            positive = SatsColorPrimitives.SpringGreen80,
            attention = SatsColorPrimitives.Gold100,
            negative = SatsColorPrimitives.Cardinal100,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
            delete = SatsColorPrimitives.ChiliRed80,
        ),
        indicators = SatsGraphicalElementColors.Indicators(
            positive = SatsGraphicalElementColors.Indicators.Positive(
                default = SatsColorPrimitives.SpringGreen80,
                alternate = SatsColorPrimitives.SpringGreen170,
            ),
            attention = SatsGraphicalElementColors.Indicators.Attention(
                default = SatsColorPrimitives.Gold100,
                alternate = SatsColorPrimitives.Gold170,
            ),
            negative = SatsGraphicalElementColors.Indicators.Negative(
                default = SatsColorPrimitives.Cardinal100,
                alternate = SatsColorPrimitives.Cardinal170,
            ),
            neutral = SatsGraphicalElementColors.Indicators.Neutral(
                default = SatsColorPrimitives.SatsBlue40,
                alternate = SatsColorPrimitives.Black80,
            ),
        ),
        signal = SatsGraphicalElementColors.Signal(
            success = SatsColorPrimitives.SpringGreen80,
            warning = SatsColorPrimitives.Gold100,
            error = SatsColorPrimitives.Cardinal100,
            neutral = SatsColorPrimitives.SatsBlue40,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
        ),
        tags = SatsGraphicalElementColors.Tags(
            primary = SatsGraphicalElementColors.Tags.Primary(
                background = SatsColorPrimitives.BrightBlue110,
                content = SatsColorPrimitives.White100,
            ),
            secondary = SatsGraphicalElementColors.Tags.Secondary(
                background = SatsColorPrimitives.Black80,
                content = SatsColorPrimitives.White100,
            ),
            featured = SatsGraphicalElementColors.Tags.Featured(
                background = SatsColorPrimitives.SatsCoral90,
                content = SatsColorPrimitives.SatsBlue,
            ),
        ),
        rewards = SatsGraphicalElementColors.Rewards(
            background = SatsGraphicalElementColors.Rewards.Background(
                blue = SatsColorPrimitives.BrightBlue100,
                silver = SatsColorPrimitives.SatsBlue20,
                gold = SatsColorPrimitives.Gold110,
                platinum = SatsColorPrimitives.SatsBlue40,
            ),
            content = SatsColorPrimitives.SatsBlue,
        ),
        workouts = SatsGraphicalElementColors.Workouts(
            pt = SatsColorPrimitives.UranianBlue70,
            gx = SatsColorPrimitives.SalmonPink70,
            treatments = SatsColorPrimitives.CaribbeanCurrent70,
            gymfloor = SatsColorPrimitives.Tangerine70,
            ownTrainingOther = SatsColorPrimitives.Celadon70,
        ),
    ),
    backgrounds = SatsBackgroundColors(
        background = SatsBackgroundColors.Background(
            primary = SatsBackgroundColors.Background.Primary(
                background = SatsBackgroundColors.Background.Primary.Background(
                    default = SatsColorPrimitives.Black,
                    hover = SatsColorPrimitives.Black90,
                    selected = SatsColorPrimitives.Black,
                ),
                content = SatsBackgroundColors.Background.Primary.Content(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.Black20,
                    disabled = SatsColorPrimitives.Black50,
                ),
            ),
            secondary = SatsBackgroundColors.Background.Secondary(
                background = SatsBackgroundColors.Background.Secondary.Background(
                    default = SatsColorPrimitives.Black90,
                    hover = SatsColorPrimitives.Black85,
                    selected = SatsColorPrimitives.Black90,
                ),
                content = SatsBackgroundColors.Background.Secondary.Content(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.Black20,
                    disabled = SatsColorPrimitives.Black50,
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
                    default = SatsColorPrimitives.Black85,
                    hover = SatsColorPrimitives.BrightBlue170,
                    selected = SatsColorPrimitives.BrightBlue160,
                ),
                content = SatsBackgroundColors.Surface.Primary.Content(
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
            secondary = SatsBackgroundColors.Surface.Secondary(
                background = SatsBackgroundColors.Surface.Secondary.Background(
                    default = SatsColorPrimitives.Black90,
                    hover = SatsColorPrimitives.Black85,
                    selected = SatsColorPrimitives.Black90,
                ),
                content = SatsBackgroundColors.Surface.Secondary.Content(
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
                background = SatsColorPrimitives.SpringGreen170,
                content = SatsBackgroundColors.SignalSurface.Success.Content(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.SpringGreen80,
                ),
            ),
            warning = SatsBackgroundColors.SignalSurface.Warning(
                background = SatsColorPrimitives.Gold170,
                content = SatsBackgroundColors.SignalSurface.Warning.Content(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.Gold80,
                ),
            ),
            error = SatsBackgroundColors.SignalSurface.Error(
                background = SatsColorPrimitives.Cardinal170,
                content = SatsBackgroundColors.SignalSurface.Error.Content(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.Cardinal60,
                ),
            ),
            waitlist = SatsBackgroundColors.SignalSurface.Waitlist(
                background = SatsColorPrimitives.EgyptianPurple160,
                content = SatsBackgroundColors.SignalSurface.Waitlist.Content(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.EgyptianPurple60,
                ),
            ),
            neutral = SatsBackgroundColors.SignalSurface.Neutral(
                background = SatsColorPrimitives.Black90,
                content = SatsBackgroundColors.SignalSurface.Neutral.Content(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.Black40,
                ),
            ),
            information = SatsBackgroundColors.SignalSurface.Information(
                background = SatsColorPrimitives.BrightBlue160,
                content = SatsBackgroundColors.SignalSurface.Information.Content(
                    default = SatsColorPrimitives.White100,
                    alternate = SatsColorPrimitives.BrightBlue60,
                ),
            ),
        ),
    ),

    isLightMode = true,
)
