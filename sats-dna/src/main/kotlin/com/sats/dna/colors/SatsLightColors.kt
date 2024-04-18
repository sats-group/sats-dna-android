package com.sats.dna.colors

internal val SatsLightColors = SatsColors(
    buttons = SatsColors.Buttons(
        primary = SatsColors.Buttons.Primary(
            default = ColorSet(
                bg = SatsColorPrimitives.SatsBlue100,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.Black10,
                fg = SatsColorPrimitives.Black60,
            ),
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
            default = ColorSet(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.White20,
                fg = SatsColorPrimitives.White50,
            ),
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
            default = ColorSet(
                bg = SatsColorPrimitives.SatsCoral120,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.Black10,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        waitingListFilled = SatsColors.Buttons.WaitingListFilled(
            default = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.Black10,
                fg = SatsColorPrimitives.Black60,
            ),
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
                default = ColorSet(
                    bg = SatsColorPrimitives.ChiliRed100,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = ColorSet(
                    bg = SatsColorPrimitives.Black10,
                    fg = SatsColorPrimitives.Black60,
                ),
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
            default = ColorSet(
                bg = SatsColorPrimitives.SatsLightGrey15,
                fg = SatsColorPrimitives.SatsCoral100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.SatsLightGrey15,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
        ),
        fixedProgressBar = SatsColors.GraphicalElements.FixedProgressBar(
            default = ColorSet(
                bg = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.SatsCoral90,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.SatsBlue10,
            ),
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
                default = ColorSet(
                    bg = SatsColorPrimitives.SatsBlue40,
                    fg = SatsColorPrimitives.SatsBlue100,
                ),
                disabled = ColorSet(
                    bg = SatsColorPrimitives.SatsLightGrey15,
                    fg = SatsColorPrimitives.Black40,
                ),
            ),
            selected = SatsColors.GraphicalElements.Chips.Selected(
                default = ColorSet(
                    bg = SatsColorPrimitives.SatsBlue100,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = ColorSet(
                    bg = SatsColorPrimitives.SatsLightGrey15,
                    fg = SatsColorPrimitives.SatsBlue70,
                ),
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
            primary = ColorSet(
                bg = SatsColorPrimitives.SatsBlue100,
                fg = SatsColorPrimitives.White100,
            ),
            secondary = ColorSet(
                bg = SatsColorPrimitives.SatsBlue5,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            featured = ColorSet(
                bg = SatsColorPrimitives.SatsCoral120,
                fg = SatsColorPrimitives.White100,
            ),
        ),
        badge = SatsColors.GraphicalElements.Badge(
            primary = ColorSet(
                bg = SatsColorPrimitives.SatsCoral120,
                fg = SatsColorPrimitives.White100,
            ),
            secondary = ColorSet(
                bg = SatsColorPrimitives.SatsBlue100,
                fg = SatsColorPrimitives.White100,
            ),
            tertiary = ColorSet(
                bg = SatsColorPrimitives.SatsBlue5,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
        ),
        fixedBadge = SatsColors.GraphicalElements.FixedBadge(
            primary = ColorSet(
                bg = SatsColorPrimitives.SatsCoral120,
                fg = SatsColorPrimitives.White100,
            ),
            secondary = ColorSet(
                bg = SatsColorPrimitives.BrightBlue10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            tertiary = ColorSet(
                bg = SatsColorPrimitives.SatsBlueGrey80,
                fg = SatsColorPrimitives.White100,
            ),
        ),
        rewards = SatsColors.GraphicalElements.Rewards(
            blue = ColorSet(
                bg = SatsColorPrimitives.SatsBlue100,
                fg = SatsColorPrimitives.White100,
            ),
            silver = ColorSet(
                bg = SatsColorPrimitives.Black50,
                fg = SatsColorPrimitives.White100,
            ),
            gold = ColorSet(
                bg = SatsColorPrimitives.Gold130,
                fg = SatsColorPrimitives.White100,
            ),
            platinum = ColorSet(
                bg = SatsColorPrimitives.SatsBlueGrey80,
                fg = SatsColorPrimitives.White100,
            ),
        ),
        workouts = SatsColors.GraphicalElements.Workouts(
            pt = ColorSet(
                bg = SatsColorPrimitives.UranianBlue100,
                fg = SatsColorPrimitives.BrightBlue160,
            ),
            gx = ColorSet(
                bg = SatsColorPrimitives.SalmonPink100,
                fg = SatsColorPrimitives.ChiliRed170,
            ),
            treatments = ColorSet(
                bg = SatsColorPrimitives.CaribbeanCurrent100,
                fg = SatsColorPrimitives.SpringGreen10,
            ),
            gymfloor = ColorSet(
                bg = SatsColorPrimitives.Tangerine100,
                fg = SatsColorPrimitives.Gold170,
            ),
            other = ColorSet(
                bg = SatsColorPrimitives.Celadon100,
                fg = SatsColorPrimitives.SpringGreen170,
            ),
            bootcamp = ColorSet(
                bg = SatsColorPrimitives.TropicalIndigo100,
                fg = SatsColorPrimitives.EgyptianPurple160,
            ),
        ),
    ),
    backgrounds = SatsColors.Backgrounds(
        primary = SatsColors.Backgrounds.Primary(
            default = BackgroundColorSet(
                bg = SatsColorPrimitives.SatsBlue5,
                fgDefault = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
            ),
            selected = BackgroundColorSet(
                bg = SatsColorPrimitives.SatsBlue5,
                fgDefault = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
            ),
        ),
        secondary = SatsColors.Backgrounds.Secondary(
            default = BackgroundColorSet(
                bg = SatsColorPrimitives.White100,
                fgDefault = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
            ),
            selected = BackgroundColorSet(
                bg = SatsColorPrimitives.White100,
                fgDefault = SatsColorPrimitives.SatsBlue100,
                fgAlternate = SatsColorPrimitives.SatsBlue70,
                fgDisabled = SatsColorPrimitives.Black60,
            ),
        ),
        fixed = SatsColors.Backgrounds.Fixed(
            primary = SatsColors.Backgrounds.Fixed.Primary(
                default = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlue105,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
                selected = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlue90,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
            ),
            secondary = SatsColors.Backgrounds.Fixed.Secondary(
                default = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlue100,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
                selected = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlueGrey80,
                    fgDefault = SatsColorPrimitives.White100,
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
                fgDefault = SatsColorPrimitives.SatsBlue100,
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
                fgDefault = SatsColorPrimitives.SatsBlue100,
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
                fgDefault = SatsColorPrimitives.SatsBlue100,
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
                fgDefault = SatsColorPrimitives.SatsBlue100,
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
                fgDefault = SatsColorPrimitives.SatsBlue100,
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
                    fgDefault = SatsColorPrimitives.White100,
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
                    fgDefault = SatsColorPrimitives.White100,
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
                    fgDefault = SatsColorPrimitives.White100,
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
                    fgDefault = SatsColorPrimitives.White100,
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
            default = ColorSet(
                bg = SatsColorPrimitives.SpringGreen10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.SpringGreen10,
                fg = SatsColorPrimitives.SpringGreen120,
            ),
        ),
        warning = SatsColors.SignalSurfaces.Warning(
            default = ColorSet(
                bg = SatsColorPrimitives.Gold10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Gold10,
                fg = SatsColorPrimitives.Gold140,
            ),
        ),
        error = SatsColors.SignalSurfaces.Error(
            default = ColorSet(
                bg = SatsColorPrimitives.Cardinal10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Cardinal10,
                fg = SatsColorPrimitives.Cardinal120,
            ),
        ),
        waitingList = SatsColors.SignalSurfaces.WaitingList(
            default = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple10,
                fg = SatsColorPrimitives.EgyptianPurple100,
            ),
        ),
        neutral = SatsColors.SignalSurfaces.Neutral(
            default = ColorSet(
                bg = SatsColorPrimitives.Black5,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Black5,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        information = SatsColors.SignalSurfaces.Information(
            default = ColorSet(
                bg = SatsColorPrimitives.BrightBlue10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.BrightBlue10,
                fg = SatsColorPrimitives.BrightBlue110,
            ),
        ),
        featured = SatsColors.SignalSurfaces.Featured(
            default = ColorSet(
                bg = SatsColorPrimitives.SatsCoral5,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.SatsCoral5,
                fg = SatsColorPrimitives.SatsCoral100,
            ),
        ),
    ),

    isLightMode = true,
)
