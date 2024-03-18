package com.sats.dna.colors

import androidx.compose.ui.graphics.Color

internal val SatsLightColors2 = SatsColors2(
    buttons = SatsColors2.Buttons(
        primary = SatsColors2.Buttons.Primary(
            default = ColorSet(
                bg = SatsColorPrimitives.SatsBlue100,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.Black10,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        secondary = SatsColors2.Buttons.Secondary(
            default = OutlinedColorSet(
                bg = Color.Transparent,
                outline = SatsColorPrimitives.SatsBlue100,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            disabled = OutlinedColorSet(
                bg = Color.Transparent,
                outline = SatsColorPrimitives.Black10,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        clean = SatsColors2.Buttons.Clean(
            default = ColorSet(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.White20,
                fg = SatsColorPrimitives.White50,
            ),
        ),
        cleanSecondary = SatsColors2.Buttons.CleanSecondary(
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
        action = SatsColors2.Buttons.Action(
            default = ColorSet(
                bg = Color.Transparent,
                fg = SatsColorPrimitives.SatsCoral120,
            ),
            disabled = ColorSet(
                bg = Color.Transparent,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        waitingListFilled = SatsColors2.Buttons.WaitingListFilled(
            default = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.Black10,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        waitingListOutlined = SatsColors2.Buttons.WaitingListOutlined(
            default = OutlinedColorSet(
                bg = Color.Transparent,
                outline = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.EgyptianPurple80,
            ),
            disabled = OutlinedColorSet(
                bg = Color.Transparent,
                outline = SatsColorPrimitives.Black60,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        destructive = SatsColors2.Buttons.Destructive(
            default = SatsColors2.Buttons.Destructive.Default(
                default = ColorSet(
                    bg = SatsColorPrimitives.ChiliRed100,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = ColorSet(
                    bg = SatsColorPrimitives.Black10,
                    fg = SatsColorPrimitives.Black60,
                ),
            ),
            outlined = SatsColors2.Buttons.Destructive.Outlined(
                default = OutlinedColorSet(
                    bg = Color.Transparent,
                    outline = SatsColorPrimitives.ChiliRed100,
                    fg = SatsColorPrimitives.ChiliRed100,
                ),
                disabled = OutlinedColorSet(
                    bg = Color.Transparent,
                    outline = SatsColorPrimitives.Black60,
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
            selected = SatsColorPrimitives.SatsBlue100,
            notSelected = SatsColorPrimitives.SatsBlue100,
        ),
        progressBar = SatsColors2.GraphicalElements.ProgressBar2(
            default = ColorSet(
                bg = SatsColorPrimitives.SatsLightGrey15,
                fg = SatsColorPrimitives.SatsCoral100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.SatsLightGrey15,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
        ),
        fixedProgressBar = SatsColors2.GraphicalElements.FixedProgressBar2(
            default = ColorSet(
                bg = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.SatsCoral90,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.SatsBlue10,
            ),
        ),
        graphs = SatsColors2.GraphicalElements.Graphs(
            bar = SatsColors2.GraphicalElements.Graphs.Bar(
                primary = SatsColors2.GraphicalElements.Graphs.Bar.Primary(
                    default = SatsColorPrimitives.SatsCoral100,
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
                default = SatsColorPrimitives.SatsCoral100,
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
                default = SatsColorPrimitives.SatsCoral100,
                disabled = SatsColorPrimitives.SatsCoral40,
            ),
            indicator = SatsColorPrimitives.White100,
        ),
        chips = SatsColors2.GraphicalElements.Chips(
            unselected = SatsColors2.GraphicalElements.Chips.Unselected(
                default = ColorSet(
                    bg = SatsColorPrimitives.SatsBlue40,
                    fg = SatsColorPrimitives.SatsBlue100,
                ),
                disabled = ColorSet(
                    bg = SatsColorPrimitives.SatsLightGrey15,
                    fg = SatsColorPrimitives.Black40,
                ),
            ),
            selected = SatsColors2.GraphicalElements.Chips.Selected(
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
        toggle = SatsColors2.GraphicalElements.Toggle(
            unselected = SatsColors2.GraphicalElements.Toggle.Unselected(
                default = SatsColorPrimitives.SatsBlue40,
                disabled = SatsColorPrimitives.SatsLightGrey15,
            ),
            handle = SatsColorPrimitives.White100,
            selected = SatsColors2.GraphicalElements.Toggle.Selected(
                default = SatsColorPrimitives.SatsCoral100,
                disabled = SatsColorPrimitives.SatsCoral40,
            ),
        ),
        icons = SatsColors2.GraphicalElements.Icons(
            primary = SatsColorPrimitives.SatsBlue100,
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
        badge = SatsColors2.GraphicalElements.Badge(
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
        fixedBadge = SatsColors2.GraphicalElements.FixedBadge(
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
        rewards = SatsColors2.GraphicalElements.Rewards(
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
        workouts = SatsColors2.GraphicalElements.Workouts(
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
    backgrounds = SatsColors2.Backgrounds2(
        primary = SatsColors2.Backgrounds2.Primary(
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
        secondary = SatsColors2.Backgrounds2.Secondary(
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
        fixed = SatsColors2.Backgrounds2.Fixed(
            primary = SatsColors2.Backgrounds2.Fixed.Primary(
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
            secondary = SatsColors2.Backgrounds2.Fixed.Secondary(
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
    surfaces = SatsColors2.Surfaces2(
        primary = SatsColors2.Surfaces2.Primary(
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
        secondary = SatsColors2.Surfaces2.Secondary(
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
        fixed = SatsColors2.Surfaces2.Fixed(
            primary = SatsColors2.Surfaces2.Fixed.Primary(
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
            secondary = SatsColors2.Surfaces2.Fixed.Secondary(
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
    signalSurfaces = SatsColors2.SignalSurfaces2(
        success = SatsColors2.SignalSurfaces2.Success(
            default = ColorSet(
                bg = SatsColorPrimitives.SpringGreen10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.SpringGreen10,
                fg = SatsColorPrimitives.SpringGreen120,
            ),
        ),
        warning = SatsColors2.SignalSurfaces2.Warning(
            default = ColorSet(
                bg = SatsColorPrimitives.Gold10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Gold10,
                fg = SatsColorPrimitives.Gold140,
            ),
        ),
        error = SatsColors2.SignalSurfaces2.Error(
            default = ColorSet(
                bg = SatsColorPrimitives.Cardinal10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Cardinal10,
                fg = SatsColorPrimitives.Cardinal120,
            ),
        ),
        waitingList = SatsColors2.SignalSurfaces2.WaitingList(
            default = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple10,
                fg = SatsColorPrimitives.EgyptianPurple100,
            ),
        ),
        neutral = SatsColors2.SignalSurfaces2.Neutral(
            default = ColorSet(
                bg = SatsColorPrimitives.Black5,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Black5,
                fg = SatsColorPrimitives.Black60,
            ),
        ),
        information = SatsColors2.SignalSurfaces2.Information(
            default = ColorSet(
                bg = SatsColorPrimitives.BrightBlue10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.BrightBlue10,
                fg = SatsColorPrimitives.BrightBlue110,
            ),
        ),
        featured = SatsColors2.SignalSurfaces2.Featured(
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
