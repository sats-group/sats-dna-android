package com.sats.dna.colors

internal val SatsLightColors = SatsColors(
    buttons = SatsColors.Buttons(
        primary = SatsColors.Buttons.Primary(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsBlue100,
            disabled = SatsColorPrimitives.Black60 on SatsColorPrimitives.Black10,
        ),
        secondary = SatsColors.Buttons.Secondary(
            default = OutlinedColorSet(
                bg = SatsColorPrimitives.White0,
                outline = SatsColorPrimitives.SatsBlue100,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            disabled = OutlinedColorSet(
                bg = SatsColorPrimitives.White0,
                outline = SatsColorPrimitives.Black10,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        clean = SatsColors.Buttons.Clean(
            default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.White100,
            disabled = SatsColorPrimitives.White50 on SatsColorPrimitives.White20,
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
                fg = SatsColorPrimitives.White60,
            ),
        ),
        action = SatsColors.Buttons.Action(
            default = SatsColorPrimitives.SatsCoral120 on SatsColorPrimitives.White0,
            disabled = SatsColorPrimitives.Black50 on SatsColorPrimitives.White0,
        ),
        cta = SatsColors.Buttons.Cta(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsCoral120,
            disabled = SatsColorPrimitives.Black60 on SatsColorPrimitives.Black10,
        ),
        waitingListFilled = SatsColors.Buttons.WaitingListFilled(
            default = SatsColorPrimitives.White100 on SatsColorPrimitives.EgyptianPurple80,
            disabled = SatsColorPrimitives.Black60 on SatsColorPrimitives.Black10,
        ),
        waitingListOutlined = SatsColors.Buttons.WaitingListOutlined(
            default = OutlinedColorSet(
                bg = SatsColorPrimitives.White0,
                outline = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.EgyptianPurple80,
            ),
            disabled = OutlinedColorSet(
                bg = SatsColorPrimitives.White0,
                outline = SatsColorPrimitives.Black60,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        destructive = SatsColors.Buttons.Destructive(
            default = SatsColors.Buttons.Destructive.Default(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.ChiliRed100,
                disabled = SatsColorPrimitives.Black60 on SatsColorPrimitives.Black10,
            ),
            outlined = SatsColors.Buttons.Destructive.Outlined(
                default = OutlinedColorSet(
                    bg = SatsColorPrimitives.White0,
                    outline = SatsColorPrimitives.ChiliRed100,
                    fg = SatsColorPrimitives.ChiliRed100,
                ),
                disabled = OutlinedColorSet(
                    bg = SatsColorPrimitives.White0,
                    outline = SatsColorPrimitives.Black60,
                    fg = SatsColorPrimitives.Black60,
                ),
            ),
        ),
    ),
    graphicalElements = SatsColors.GraphicalElements(
        divider = SatsColors.GraphicalElements.Divider(
            default = SatsColorPrimitives.SatsLightGrey15,
            alternate = SatsColorPrimitives.BlackO20,
        ),
        border = SatsColors.GraphicalElements.Border(
            default = SatsColorPrimitives.SatsLightGrey15,
            focused = SatsColorPrimitives.SatsBlue40,
        ),
        signalBorder = SatsColors.GraphicalElements.SignalBorder(
            success = SatsColorPrimitives.SpringGreen120,
            warning = SatsColorPrimitives.Gold140,
            error = SatsColorPrimitives.Cardinal120,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
            neutral = SatsColorPrimitives.Black60,
            information = SatsColorPrimitives.SatsBlue70,
            featured = SatsColorPrimitives.SatsCoral120,
        ),
        skeleton = SatsColorPrimitives.SatsLightGrey15,
        navBar = SatsColors.GraphicalElements.NavBar(
            selected = SatsColorPrimitives.SatsBlue100,
            notSelected = SatsColorPrimitives.SatsBlue100,
        ),
        progressBar = SatsColors.GraphicalElements.ProgressBar(
            default = SatsColorPrimitives.SatsCoral100 on SatsColorPrimitives.SatsLightGrey15,
            alternate = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsLightGrey15,
        ),
        fixedProgressBar = SatsColors.GraphicalElements.FixedProgressBar(
            default = SatsColorPrimitives.SatsCoral90 on SatsColorPrimitives.White40,
            alternate = SatsColorPrimitives.SatsBlue10 on SatsColorPrimitives.White40,
        ),
        graphs = SatsColors.GraphicalElements.Graphs(
            bar = SatsColors.GraphicalElements.Graphs.Bar(
                primary = SatsColors.GraphicalElements.Graphs.Bar.Primary(
                    default = SatsColorPrimitives.SatsCoral100,
                    bg = SatsColorPrimitives.SatsLightGrey15,
                ),
                secondary = SatsColors.GraphicalElements.Graphs.Bar.Secondary(
                    default = SatsColorPrimitives.SatsBlue40,
                    bg = SatsColorPrimitives.SatsBlue5,
                ),
            ),
            trend = SatsColors.GraphicalElements.Graphs.Trend(
                upwards = SatsColorPrimitives.SpringGreen80,
                neutral = SatsColorPrimitives.SatsCoral40,
                downwards = SatsColorPrimitives.Cardinal100,
            ),
        ),
        selector = SatsColors.GraphicalElements.Selector(
            primary = SatsColors.GraphicalElements.Selector.Primary(
                unselected = SatsColors.GraphicalElements.Selector.Primary.Unselected(
                    default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.Black80,
                    disabled = SatsColorPrimitives.Black40 on SatsColorPrimitives.SatsLightGrey15,
                ),
                selected = SatsColors.GraphicalElements.Selector.Primary.Selected(
                    default = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsCoral100,
                    disabled = SatsColorPrimitives.SatsCoral10 on SatsColorPrimitives.SatsCoral40,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Primary.UnselectedSurface(
                    default = SatsColorPrimitives.White0,
                    disabled = SatsColorPrimitives.White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Primary.SelectedSurface(
                    default = SatsColorPrimitives.SatsCoral10,
                    disabled = SatsColorPrimitives.SatsCoral5,
                ),
            ),
            secondary = SatsColors.GraphicalElements.Selector.Secondary(
                unselected = SatsColors.GraphicalElements.Selector.Secondary.Unselected(
                    default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsBlue70,
                    disabled = SatsColorPrimitives.Black40 on SatsColorPrimitives.SatsLightGrey15,
                ),
                selected = SatsColors.GraphicalElements.Selector.Secondary.Selected(
                    default = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsBlue100,
                    disabled = SatsColorPrimitives.SatsBlue70 on SatsColorPrimitives.SatsLightGrey15,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Secondary.UnselectedSurface(
                    default = SatsColorPrimitives.White0,
                    disabled = SatsColorPrimitives.White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Secondary.SelectedSurface(
                    default = SatsColorPrimitives.SatsBlue10,
                    disabled = SatsColorPrimitives.SatsBlue5,
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
                default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsBlue40,
                disabled = SatsColorPrimitives.Black40 on SatsColorPrimitives.SatsLightGrey15,
            ),
            selected = SatsColors.GraphicalElements.Chips.Selected(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsBlue100,
                disabled = SatsColorPrimitives.SatsBlue70 on SatsColorPrimitives.SatsLightGrey15,
            ),
        ),
        toggle = SatsColors.GraphicalElements.Toggle(
            unselected = SatsColors.GraphicalElements.Toggle.Unselected(
                default = SatsColorPrimitives.SatsBlue40,
                disabled = SatsColorPrimitives.SatsLightGrey15,
            ),
            handle = SatsColorPrimitives.White100,
            selected = SatsColors.GraphicalElements.Toggle.Selected(
                default = SatsColorPrimitives.SatsCoral100,
                disabled = SatsColorPrimitives.SatsCoral40,
            ),
        ),
        icons = SatsColors.GraphicalElements.Icons(
            primary = SatsColorPrimitives.SatsBlue100,
            secondary = SatsColorPrimitives.SatsBlueGrey80,
            fixed = SatsColorPrimitives.White100,
            positive = SatsColorPrimitives.SpringGreen100,
            attention = SatsColorPrimitives.Gold100,
            negative = SatsColorPrimitives.Cardinal100,
            waitingList = SatsColorPrimitives.EgyptianPurple100,
            delete = SatsColorPrimitives.ChiliRed100,
        ),
        indicators = SatsColors.GraphicalElements.Indicators(
            positive = SatsColors.GraphicalElements.Indicators.Positive(
                default = SatsColorPrimitives.SpringGreen100,
                alternate = SatsColorPrimitives.SpringGreen30,
            ),
            attention = SatsColors.GraphicalElements.Indicators.Attention(
                default = SatsColorPrimitives.Gold100,
                alternate = SatsColorPrimitives.Gold30,
            ),
            negative = SatsColors.GraphicalElements.Indicators.Negative(
                default = SatsColorPrimitives.Cardinal100,
                alternate = SatsColorPrimitives.Cardinal30,
            ),
            neutral = SatsColors.GraphicalElements.Indicators.Neutral(
                default = SatsColorPrimitives.SatsBlue70,
                alternate = SatsColorPrimitives.SatsBlue20,
            ),
        ),
        signal = SatsColors.GraphicalElements.Signal(
            success = SatsColorPrimitives.SpringGreen100,
            warning = SatsColorPrimitives.Gold100,
            error = SatsColorPrimitives.Cardinal100,
            neutral = SatsColorPrimitives.SatsBlue70,
            waitingList = SatsColorPrimitives.EgyptianPurple100,
        ),
        tags = SatsColors.GraphicalElements.Tags(
            primary = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsBlue100,
            secondary = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsBlue5,
            featured = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsCoral120,
        ),
        indicatorTag = SatsColors.GraphicalElements.IndicatorTag(
            positive = SatsColors.GraphicalElements.IndicatorTag.Positive(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.SpringGreen100,
                alternate = SatsColorPrimitives.SpringGreen120 on SatsColorPrimitives.SpringGreen10,
            ),
            attention = SatsColors.GraphicalElements.IndicatorTag.Attention(
                default = SatsColorPrimitives.Gold170 on SatsColorPrimitives.Gold80,
                alternate = SatsColorPrimitives.Gold140 on SatsColorPrimitives.Gold10,
            ),
            negative = SatsColors.GraphicalElements.IndicatorTag.Negative(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.Cardinal100,
                alternate = SatsColorPrimitives.Cardinal120 on SatsColorPrimitives.Cardinal10,
            ),
            featured = SatsColors.GraphicalElements.IndicatorTag.Featured(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsCoral120,
                alternate = SatsColorPrimitives.SatsCoral120 on SatsColorPrimitives.SatsCoral10,
            ),
            neutral = SatsColors.GraphicalElements.IndicatorTag.Neutral(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.Black60,
                alternate = SatsColorPrimitives.Black60 on SatsColorPrimitives.SatsBlue5,
            ),
            information = SatsColors.GraphicalElements.IndicatorTag.Information(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.BrightBlue100,
                alternate = SatsColorPrimitives.SatsBlue70 on SatsColorPrimitives.BrightBlue10,
            ),
        ),
        badge = SatsColors.GraphicalElements.Badge(
            primary = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsCoral120,
            secondary = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsBlue100,
            tertiary = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsBlue5,
        ),
        fixedBadge = SatsColors.GraphicalElements.FixedBadge(
            primary = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsCoral120,
            secondary = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.BrightBlue10,
            tertiary = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsBlueGrey80,
        ),
        rewards = SatsColors.GraphicalElements.Rewards(
            blue = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsBlue100,
            silver = SatsColorPrimitives.White100 on SatsColorPrimitives.Black50,
            gold = SatsColorPrimitives.White100 on SatsColorPrimitives.Gold130,
            platinum = SatsColorPrimitives.White100 on SatsColorPrimitives.SatsBlueGrey80,
        ),
        workouts = SatsColors.GraphicalElements.Workouts(
            pt = SatsColorPrimitives.BrightBlue160 on SatsColorPrimitives.UranianBlue100,
            gx = SatsColorPrimitives.ChiliRed170 on SatsColorPrimitives.SalmonPink100,
            treatments = SatsColorPrimitives.SpringGreen10 on SatsColorPrimitives.CaribbeanCurrent100,
            gymfloor = SatsColorPrimitives.Gold170 on SatsColorPrimitives.Tangerine100,
            other = SatsColorPrimitives.SpringGreen170 on SatsColorPrimitives.Celadon100,
            bootcamp = SatsColorPrimitives.EgyptianPurple160 on SatsColorPrimitives.TropicalIndigo100,
        ),
    ),
    backgrounds = SatsColors.Backgrounds(
        primary = SatsColors.Backgrounds.Primary(
            default = BackgroundColorSet(
                bg = SatsColorPrimitives.SatsBlue5,
                fg = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
            ),
            selected = BackgroundColorSet(
                bg = SatsColorPrimitives.SatsBlue5,
                fg = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
            ),
        ),
        secondary = SatsColors.Backgrounds.Secondary(
            default = BackgroundColorSet(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
            ),
            selected = BackgroundColorSet(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
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
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
                fgSuccess = SatsColorPrimitives.SpringGreen120,
                fgWarning = SatsColorPrimitives.Gold140,
                fgError = SatsColorPrimitives.Cardinal120,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple100,
                fgNeutral = SatsColorPrimitives.Black60,
                fgInformation = SatsColorPrimitives.BrightBlue110,
                fgFeatured = SatsColorPrimitives.SatsCoral120,
            ),
            selected = SurfaceColorSet(
                bg = SatsColorPrimitives.BrightBlue20,
                fg = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
                fgSuccess = SatsColorPrimitives.SpringGreen120,
                fgWarning = SatsColorPrimitives.Gold140,
                fgError = SatsColorPrimitives.Cardinal120,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple100,
                fgNeutral = SatsColorPrimitives.Black60,
                fgInformation = SatsColorPrimitives.BrightBlue110,
                fgFeatured = SatsColorPrimitives.SatsCoral120,
            ),
            disabled = SurfaceColorSet(
                bg = SatsColorPrimitives.SatsBlue10,
                fg = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
                fgSuccess = SatsColorPrimitives.SpringGreen120,
                fgWarning = SatsColorPrimitives.Gold140,
                fgError = SatsColorPrimitives.Cardinal120,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple100,
                fgNeutral = SatsColorPrimitives.Black60,
                fgInformation = SatsColorPrimitives.BrightBlue110,
                fgFeatured = SatsColorPrimitives.SatsCoral120,
            ),
        ),
        secondary = SatsColors.Surfaces.Secondary(
            default = SurfaceColorSet(
                bg = SatsColorPrimitives.Black5,
                fg = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
                fgSuccess = SatsColorPrimitives.SpringGreen120,
                fgWarning = SatsColorPrimitives.Gold140,
                fgError = SatsColorPrimitives.Cardinal120,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple100,
                fgNeutral = SatsColorPrimitives.Black60,
                fgInformation = SatsColorPrimitives.BrightBlue110,
                fgFeatured = SatsColorPrimitives.SatsCoral120,
            ),
            selected = SurfaceColorSet(
                bg = SatsColorPrimitives.Black5,
                fg = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
                fgSuccess = SatsColorPrimitives.SpringGreen120,
                fgWarning = SatsColorPrimitives.Gold140,
                fgError = SatsColorPrimitives.Cardinal120,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple100,
                fgNeutral = SatsColorPrimitives.Black60,
                fgInformation = SatsColorPrimitives.BrightBlue110,
                fgFeatured = SatsColorPrimitives.SatsCoral120,
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
            default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SpringGreen10,
            alternate = SatsColorPrimitives.SpringGreen120 on SatsColorPrimitives.SpringGreen10,
        ),
        warning = SatsColors.SignalSurfaces.Warning(
            default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.Gold10,
            alternate = SatsColorPrimitives.Gold140 on SatsColorPrimitives.Gold10,
        ),
        error = SatsColors.SignalSurfaces.Error(
            default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.Cardinal10,
            alternate = SatsColorPrimitives.Cardinal120 on SatsColorPrimitives.Cardinal10,
        ),
        waitingList = SatsColors.SignalSurfaces.WaitingList(
            default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.EgyptianPurple10,
            alternate = SatsColorPrimitives.EgyptianPurple100 on SatsColorPrimitives.EgyptianPurple10,
        ),
        neutral = SatsColors.SignalSurfaces.Neutral(
            default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.Black5,
            alternate = SatsColorPrimitives.Black60 on SatsColorPrimitives.Black5,
        ),
        information = SatsColors.SignalSurfaces.Information(
            default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.BrightBlue10,
            alternate = SatsColorPrimitives.BrightBlue110 on SatsColorPrimitives.BrightBlue10,
        ),
        featured = SatsColors.SignalSurfaces.Featured(
            default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsCoral5,
            alternate = SatsColorPrimitives.SatsCoral100 on SatsColorPrimitives.SatsCoral5,
        ),
    ),

    isLightMode = true,
)
