package com.sats.dna.colors

internal val SatsDarkColors = SatsColors(
    buttons = SatsColors.Buttons(
        primary = SatsColors.Buttons.Primary(
            default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.White100,
            disabled = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.White10,
        ),
        secondary = SatsColors.Buttons.Secondary(
            default = OutlinedColorSet(
                bg = SatsColorPrimitives.White0,
                outline = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = OutlinedColorSet(
                bg = SatsColorPrimitives.White0,
                outline = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        clean = SatsColors.Buttons.Clean(
            default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.White100,
            disabled = SatsColorPrimitives.White50 on SatsColorPrimitives.White10,
        ),
        cleanSecondary = SatsColors.Buttons.CleanSecondary(
            default = OutlinedColorSet(
                bg = SatsColorPrimitives.White15,
                outline = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = OutlinedColorSet(
                bg = SatsColorPrimitives.White5,
                outline = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.White70,
            ),
        ),
        action = SatsColors.Buttons.Action(
            default = SatsColorPrimitives.SatsCoral100 on SatsColorPrimitives.White0,
            disabled = SatsColorPrimitives.Black50 on SatsColorPrimitives.White0,
        ),
        cta = SatsColors.Buttons.Cta(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsCoral100,
            disabled = SatsColorPrimitives.White70 on SatsColorPrimitives.Black80,
        ),
        waitingListFilled = SatsColors.Buttons.WaitingListFilled(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.EgyptianPurple80,
            disabled = SatsColorPrimitives.Black50 on SatsColorPrimitives.Black80,
        ),
        waitingListOutlined = SatsColors.Buttons.WaitingListOutlined(
            default = OutlinedColorSet(
                bg = SatsColorPrimitives.White0,
                outline = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.EgyptianPurple80,
            ),
            disabled = OutlinedColorSet(
                bg = SatsColorPrimitives.White0,
                outline = SatsColorPrimitives.Black50,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        destructive = SatsColors.Buttons.Destructive(
            default = SatsColors.Buttons.Destructive.Default(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.ChiliRed80,
                disabled = SatsColorPrimitives.Black50 on SatsColorPrimitives.Black80,
            ),
            outlined = SatsColors.Buttons.Destructive.Outlined(
                default = OutlinedColorSet(
                    bg = SatsColorPrimitives.White0,
                    outline = SatsColorPrimitives.ChiliRed80,
                    fg = SatsColorPrimitives.ChiliRed80,
                ),
                disabled = OutlinedColorSet(
                    bg = SatsColorPrimitives.White0,
                    outline = SatsColorPrimitives.Black50,
                    fg = SatsColorPrimitives.Black50,
                ),
            ),
        ),
    ),
    graphicalElements = SatsColors.GraphicalElements(
        divider = SatsColors.GraphicalElements.Divider(
            default = SatsColorPrimitives.Black80,
            alternate = SatsColorPrimitives.White40,
        ),
        border = SatsColors.GraphicalElements.Border(
            default = SatsColorPrimitives.Black70,
            focused = SatsColorPrimitives.White40,
        ),
        signalBorder = SatsColors.GraphicalElements.SignalBorder(
            success = SatsColorPrimitives.SpringGreen30,
            warning = SatsColorPrimitives.Gold30,
            error = SatsColorPrimitives.Cardinal30,
            waitingList = SatsColorPrimitives.EgyptianPurple60,
            neutral = SatsColorPrimitives.Black20,
            information = SatsColorPrimitives.BrightBlue20,
            featured = SatsColorPrimitives.SatsCoral40,
        ),
        skeleton = SatsColorPrimitives.Black80,
        navBar = SatsColors.GraphicalElements.NavBar(
            selected = SatsColorPrimitives.White100,
            notSelected = SatsColorPrimitives.White100,
        ),
        progressBar = SatsColors.GraphicalElements.ProgressBar(
            default = SatsColorPrimitives.SatsCoral90 on SatsColorPrimitives.Black70,
            alternate = SatsColorPrimitives.SatsBlue10 on SatsColorPrimitives.Black70,
        ),
        fixedProgressBar = SatsColors.GraphicalElements.FixedProgressBar(
            default = SatsColorPrimitives.SatsCoral90 on SatsColorPrimitives.White40,
            alternate = SatsColorPrimitives.SatsBlue10 on SatsColorPrimitives.White40,
        ),
        graphs = SatsColors.GraphicalElements.Graphs(
            bar = SatsColors.GraphicalElements.Graphs.Bar(
                primary = SatsColors.GraphicalElements.Graphs.Bar.Primary(
                    default = SatsColorPrimitives.SatsCoral90,
                    bg = SatsColorPrimitives.Black80,
                ),
                secondary = SatsColors.GraphicalElements.Graphs.Bar.Secondary(
                    default = SatsColorPrimitives.SatsBlue40,
                    bg = SatsColorPrimitives.Black70,
                ),
            ),
            trend = SatsColors.GraphicalElements.Graphs.Trend(
                upwards = SatsColorPrimitives.SpringGreen80,
                neutral = SatsColorPrimitives.SatsCoral130,
                downwards = SatsColorPrimitives.Cardinal100,
            ),
        ),
        selector = SatsColors.GraphicalElements.Selector(
            primary = SatsColors.GraphicalElements.Selector.Primary(
                unselected = SatsColors.GraphicalElements.Selector.Primary.Unselected(
                    default = SatsColorPrimitives.White100 on SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.White20 on SatsColorPrimitives.White10,
                ),
                selected = SatsColors.GraphicalElements.Selector.Primary.Selected(
                    default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsCoral90,
                    disabled = SatsColorPrimitives.White60 on SatsColorPrimitives.SatsCoral130,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Primary.UnselectedSurface(
                    default = SatsColorPrimitives.White0,
                    disabled = SatsColorPrimitives.White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Primary.SelectedSurface(
                    default = SatsColorPrimitives.SatsCoral170,
                    disabled = SatsColorPrimitives.SatsCoral190,
                ),
            ),
            secondary = SatsColors.GraphicalElements.Selector.Secondary(
                unselected = SatsColors.GraphicalElements.Selector.Secondary.Unselected(
                    default = SatsColorPrimitives.White100 on SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.White20 on SatsColorPrimitives.White10,
                ),
                selected = SatsColors.GraphicalElements.Selector.Secondary.Selected(
                    default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.White60 on SatsColorPrimitives.White20,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Secondary.UnselectedSurface(
                    default = SatsColorPrimitives.White0,
                    disabled = SatsColorPrimitives.White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Secondary.SelectedSurface(
                    default = SatsColorPrimitives.BrightBlue160,
                    disabled = SatsColorPrimitives.BrightBlue170,
                ),
            ),
        ),
        selectorFixed = SatsColors.GraphicalElements.SelectorFixed(
            unselected = SatsColors.GraphicalElements.SelectorFixed.Unselected(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White50 on SatsColorPrimitives.White50,
            ),
            selected = SatsColors.GraphicalElements.SelectorFixed.Selected(
                default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral170 on SatsColorPrimitives.SatsCoral130,
            ),
            selectedBackground = SatsColors.GraphicalElements.SelectorFixed.SelectedBackground(
                default = SatsColorPrimitives.SatsCoral170,
                disabled = SatsColorPrimitives.SatsCoral190,
            ),
        ),
        chips = SatsColors.GraphicalElements.Chips(
            unselected = SatsColors.GraphicalElements.Chips.Unselected(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.White85,
                disabled = SatsColorPrimitives.White20 on SatsColorPrimitives.White10,
            ),
            selected = SatsColors.GraphicalElements.Chips.Selected(
                default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White60 on SatsColorPrimitives.Black80,
            ),
        ),
        toggle = SatsColors.GraphicalElements.Toggle(
            unselected = SatsColors.GraphicalElements.Toggle.Unselected(
                default = SatsColorPrimitives.Black70,
                disabled = SatsColorPrimitives.Black80,
            ),
            selected = SatsColors.GraphicalElements.Toggle.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
            handle = SatsColorPrimitives.White100,
        ),
        icons = SatsColors.GraphicalElements.Icons(
            primary = SatsColorPrimitives.White100,
            secondary = SatsColorPrimitives.Black20,
            fixed = SatsColorPrimitives.White100,
            positive = SatsColorPrimitives.SpringGreen80,
            attention = SatsColorPrimitives.Gold100,
            negative = SatsColorPrimitives.Cardinal100,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
            delete = SatsColorPrimitives.ChiliRed80,
        ),
        indicators = SatsColors.GraphicalElements.Indicators(
            positive = SatsColors.GraphicalElements.Indicators.Positive(
                default = SatsColorPrimitives.SpringGreen80,
                alternate = SatsColorPrimitives.SpringGreen170,
            ),
            attention = SatsColors.GraphicalElements.Indicators.Attention(
                default = SatsColorPrimitives.Gold100,
                alternate = SatsColorPrimitives.Gold170,
            ),
            negative = SatsColors.GraphicalElements.Indicators.Negative(
                default = SatsColorPrimitives.Cardinal100,
                alternate = SatsColorPrimitives.Cardinal170,
            ),
            neutral = SatsColors.GraphicalElements.Indicators.Neutral(
                default = SatsColorPrimitives.SatsBlue40,
                alternate = SatsColorPrimitives.Black80,
            ),
        ),
        signal = SatsColors.GraphicalElements.Signal(
            success = SatsColorPrimitives.SpringGreen80,
            warning = SatsColorPrimitives.Gold100,
            error = SatsColorPrimitives.Cardinal100,
            neutral = SatsColorPrimitives.SatsBlue40,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
        ),
        tags = SatsColors.GraphicalElements.Tags(
            primary = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsBlue10,
            secondary = SatsColorPrimitives.White100 on SatsColorPrimitives.Black80,
            featured = SatsColorPrimitives.SatsCoral170 on SatsColorPrimitives.SatsCoral90,
        ),
        indicatorTag = SatsColors.GraphicalElements.IndicatorTag(
            positive = SatsColors.GraphicalElements.IndicatorTag.Positive(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.SpringGreen100,
                alternate = SatsColorPrimitives.SpringGreen30 on SatsColorPrimitives.SpringGreen170,
            ),
            attention = SatsColors.GraphicalElements.IndicatorTag.Attention(
                default = SatsColorPrimitives.Gold170 on SatsColorPrimitives.Gold80,
                alternate = SatsColorPrimitives.Gold30 on SatsColorPrimitives.Gold170,
            ),
            negative = SatsColors.GraphicalElements.IndicatorTag.Negative(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.Cardinal100,
                alternate = SatsColorPrimitives.Cardinal30 on SatsColorPrimitives.Cardinal170,
            ),
            featured = SatsColors.GraphicalElements.IndicatorTag.Featured(
                default = SatsColorPrimitives.SatsCoral170 on SatsColorPrimitives.SatsCoral90,
                alternate = SatsColorPrimitives.SatsCoral40 on SatsColorPrimitives.SatsCoral170,
            ),
            neutral = SatsColors.GraphicalElements.IndicatorTag.Neutral(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.Black60,
                alternate = SatsColorPrimitives.Black20 on SatsColorPrimitives.Black90,
            ),
            information = SatsColors.GraphicalElements.IndicatorTag.Information(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.BrightBlue100,
                alternate = SatsColorPrimitives.BrightBlue20 on SatsColorPrimitives.BrightBlue160,
            ),
        ),
        badge = SatsColors.GraphicalElements.Badge(
            primary = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsCoral90,
            secondary = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsBlue10,
            tertiary = SatsColorPrimitives.White100 on SatsColorPrimitives.Black80,
        ),
        fixedBadge = SatsColors.GraphicalElements.FixedBadge(
            primary = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsCoral120,
            secondary = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.BrightBlue10,
            tertiary = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsBlueGrey80,
        ),
        rewards = SatsColors.GraphicalElements.Rewards(
            blue = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.BrightBlue100,
            silver = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsBlue20,
            gold = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.Gold110,
            platinum = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsBlue40,
        ),
        workouts = SatsColors.GraphicalElements.Workouts(
            pt = SatsColorPrimitives.BrightBlue160 on SatsColorPrimitives.UranianBlue70,
            gx = SatsColorPrimitives.ChiliRed170 on SatsColorPrimitives.SalmonPink70,
            treatments = SatsColorPrimitives.SpringGreen10 on SatsColorPrimitives.CaribbeanCurrent70,
            gymfloor = SatsColorPrimitives.Gold170 on SatsColorPrimitives.Tangerine70,
            other = SatsColorPrimitives.SpringGreen170 on SatsColorPrimitives.Celadon70,
            bootcamp = SatsColorPrimitives.EgyptianPurple160 on SatsColorPrimitives.TropicalIndigo70,
        ),
    ),
    backgrounds = SatsColors.Backgrounds(
        primary = SatsColors.Backgrounds.Primary(
            default = BackgroundColorSet(
                bg = SatsColorPrimitives.Black100,
                fg = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
            ),
            selected = BackgroundColorSet(
                bg = SatsColorPrimitives.Black100,
                fg = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
            ),
        ),
        secondary = SatsColors.Backgrounds.Secondary(
            default = BackgroundColorSet(
                bg = SatsColorPrimitives.Black90,
                fg = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
            ),
            selected = BackgroundColorSet(
                bg = SatsColorPrimitives.Black90,
                fg = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
            ),
        ),
        fixed = SatsColors.Backgrounds.Fixed(
            primary = SatsColors.Backgrounds.Fixed.Primary(
                default = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlue105,
                    fg = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
                selected = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlue90,
                    fg = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
            ),
            secondary = SatsColors.Backgrounds.Fixed.Secondary(
                default = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlue100,
                    fg = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
                selected = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlueGrey80,
                    fg = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
            ),
        ),
    ),
    surfaces = SatsColors.Surfaces(
        primary = SatsColors.Surfaces.Primary(
            default = SurfaceColorSet(
                bg = SatsColorPrimitives.Black85,
                fg = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
                fgSuccess = SatsColorPrimitives.SpringGreen80,
                fgWarning = SatsColorPrimitives.Gold80,
                fgError = SatsColorPrimitives.Cardinal60,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple60,
                fgNeutral = SatsColorPrimitives.Black40,
                fgInformation = SatsColorPrimitives.BrightBlue60,
                fgFeatured = SatsColorPrimitives.SatsCoral90,
            ),
            selected = SurfaceColorSet(
                bg = SatsColorPrimitives.BrightBlue160,
                fg = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
                fgSuccess = SatsColorPrimitives.SpringGreen80,
                fgWarning = SatsColorPrimitives.Gold80,
                fgError = SatsColorPrimitives.Cardinal60,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple60,
                fgNeutral = SatsColorPrimitives.Black40,
                fgInformation = SatsColorPrimitives.BrightBlue60,
                fgFeatured = SatsColorPrimitives.SatsCoral90,
            ),
            disabled = SurfaceColorSet(
                bg = SatsColorPrimitives.Black95,
                fg = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
                fgSuccess = SatsColorPrimitives.SpringGreen80,
                fgWarning = SatsColorPrimitives.Gold80,
                fgError = SatsColorPrimitives.Cardinal60,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple60,
                fgNeutral = SatsColorPrimitives.Black40,
                fgInformation = SatsColorPrimitives.BrightBlue60,
                fgFeatured = SatsColorPrimitives.SatsCoral90,
            ),
        ),
        secondary = SatsColors.Surfaces.Secondary(
            default = SurfaceColorSet(
                bg = SatsColorPrimitives.Black90,
                fg = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
                fgSuccess = SatsColorPrimitives.SpringGreen80,
                fgWarning = SatsColorPrimitives.Gold80,
                fgError = SatsColorPrimitives.Cardinal60,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple60,
                fgNeutral = SatsColorPrimitives.Black40,
                fgInformation = SatsColorPrimitives.BrightBlue60,
                fgFeatured = SatsColorPrimitives.SatsCoral90,
            ),
            selected = SurfaceColorSet(
                bg = SatsColorPrimitives.Black90,
                fg = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
                fgSuccess = SatsColorPrimitives.SpringGreen80,
                fgWarning = SatsColorPrimitives.Gold80,
                fgError = SatsColorPrimitives.Cardinal60,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple60,
                fgNeutral = SatsColorPrimitives.Black40,
                fgInformation = SatsColorPrimitives.BrightBlue60,
                fgFeatured = SatsColorPrimitives.SatsCoral90,
            ),
        ),
        fixed = SatsColors.Surfaces.Fixed(
            primary = SatsColors.Surfaces.Fixed.Primary(
                default = SurfaceColorSet(
                    bg = SatsColorPrimitives.SatsBlue100,
                    fg = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White65,
                    fgDisabled = SatsColorPrimitives.White40,
                    fgSuccess = SatsColorPrimitives.SpringGreen60,
                    fgWarning = SatsColorPrimitives.Gold60,
                    fgError = SatsColorPrimitives.Cardinal60,
                    fgWaitingList = SatsColorPrimitives.EgyptianPurple40,
                    fgNeutral = SatsColorPrimitives.White60,
                    fgInformation = SatsColorPrimitives.BrightBlue60,
                    fgFeatured = SatsColorPrimitives.SatsCoral60,
                ),
                selected = SurfaceColorSet(
                    bg = SatsColorPrimitives.SatsBlueGrey80,
                    fg = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White65,
                    fgDisabled = SatsColorPrimitives.White40,
                    fgSuccess = SatsColorPrimitives.SpringGreen60,
                    fgWarning = SatsColorPrimitives.Gold60,
                    fgError = SatsColorPrimitives.Cardinal60,
                    fgWaitingList = SatsColorPrimitives.EgyptianPurple40,
                    fgNeutral = SatsColorPrimitives.White60,
                    fgInformation = SatsColorPrimitives.BrightBlue60,
                    fgFeatured = SatsColorPrimitives.SatsCoral60,
                ),
            ),
            secondary = SatsColors.Surfaces.Fixed.Secondary(
                default = SurfaceColorSet(
                    bg = SatsColorPrimitives.SatsBlueGrey80,
                    fg = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White65,
                    fgDisabled = SatsColorPrimitives.White40,
                    fgSuccess = SatsColorPrimitives.SpringGreen60,
                    fgWarning = SatsColorPrimitives.Gold60,
                    fgError = SatsColorPrimitives.Cardinal60,
                    fgWaitingList = SatsColorPrimitives.EgyptianPurple40,
                    fgNeutral = SatsColorPrimitives.White60,
                    fgInformation = SatsColorPrimitives.BrightBlue60,
                    fgFeatured = SatsColorPrimitives.SatsCoral60,
                ),
                selected = SurfaceColorSet(
                    bg = SatsColorPrimitives.SatsBlueGrey80,
                    fg = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White65,
                    fgDisabled = SatsColorPrimitives.White40,
                    fgSuccess = SatsColorPrimitives.SpringGreen60,
                    fgWarning = SatsColorPrimitives.Gold60,
                    fgError = SatsColorPrimitives.Cardinal60,
                    fgWaitingList = SatsColorPrimitives.EgyptianPurple40,
                    fgNeutral = SatsColorPrimitives.White60,
                    fgInformation = SatsColorPrimitives.BrightBlue60,
                    fgFeatured = SatsColorPrimitives.SatsCoral60,
                ),
            ),
        ),
    ),
    signalSurfaces = SatsColors.SignalSurfaces(
        success = SatsColors.SignalSurfaces.Success(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.SpringGreen170,
            alternate = SatsColorPrimitives.SpringGreen80 on SatsColorPrimitives.SpringGreen170,
        ),
        warning = SatsColors.SignalSurfaces.Warning(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.Gold170,
            alternate = SatsColorPrimitives.Gold80 on SatsColorPrimitives.Gold170,
        ),
        error = SatsColors.SignalSurfaces.Error(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.Cardinal170,
            alternate = SatsColorPrimitives.Cardinal60 on SatsColorPrimitives.Cardinal170,
        ),
        waitingList = SatsColors.SignalSurfaces.WaitingList(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.EgyptianPurple160,
            alternate = SatsColorPrimitives.EgyptianPurple60 on SatsColorPrimitives.EgyptianPurple160,
        ),
        neutral = SatsColors.SignalSurfaces.Neutral(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.Black90,
            alternate = SatsColorPrimitives.Black40 on SatsColorPrimitives.Black90,
        ),
        information = SatsColors.SignalSurfaces.Information(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.BrightBlue160,
            alternate = SatsColorPrimitives.BrightBlue60 on SatsColorPrimitives.BrightBlue160,
        ),
        featured = SatsColors.SignalSurfaces.Featured(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsCoral190,
            alternate = SatsColorPrimitives.SatsCoral90 on SatsColorPrimitives.SatsCoral190,
        ),
    ),

    isLightMode = false,
)
