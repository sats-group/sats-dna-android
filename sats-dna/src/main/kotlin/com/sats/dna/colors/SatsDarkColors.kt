package com.sats.dna.colors

import com.sats.dna.colors.SatsColorPrimitives.Black100
import com.sats.dna.colors.SatsColorPrimitives.Black20
import com.sats.dna.colors.SatsColorPrimitives.Black40
import com.sats.dna.colors.SatsColorPrimitives.Black50
import com.sats.dna.colors.SatsColorPrimitives.Black60
import com.sats.dna.colors.SatsColorPrimitives.Black70
import com.sats.dna.colors.SatsColorPrimitives.Black80
import com.sats.dna.colors.SatsColorPrimitives.Black85
import com.sats.dna.colors.SatsColorPrimitives.Black90
import com.sats.dna.colors.SatsColorPrimitives.Black95
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue100
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue160
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue170
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue20
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue60
import com.sats.dna.colors.SatsColorPrimitives.Cardinal100
import com.sats.dna.colors.SatsColorPrimitives.Cardinal170
import com.sats.dna.colors.SatsColorPrimitives.Cardinal30
import com.sats.dna.colors.SatsColorPrimitives.Cardinal60
import com.sats.dna.colors.SatsColorPrimitives.CaribbeanCurrent180
import com.sats.dna.colors.SatsColorPrimitives.CaribbeanCurrent60
import com.sats.dna.colors.SatsColorPrimitives.Celadon100
import com.sats.dna.colors.SatsColorPrimitives.Celadon160
import com.sats.dna.colors.SatsColorPrimitives.Celadon180
import com.sats.dna.colors.SatsColorPrimitives.Celadon60
import com.sats.dna.colors.SatsColorPrimitives.ChiliRed80
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple160
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple60
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple80
import com.sats.dna.colors.SatsColorPrimitives.Gold100
import com.sats.dna.colors.SatsColorPrimitives.Gold110
import com.sats.dna.colors.SatsColorPrimitives.Gold170
import com.sats.dna.colors.SatsColorPrimitives.Gold30
import com.sats.dna.colors.SatsColorPrimitives.Gold80
import com.sats.dna.colors.SatsColorPrimitives.SalmonPink100
import com.sats.dna.colors.SatsColorPrimitives.SalmonPink180
import com.sats.dna.colors.SatsColorPrimitives.SalmonPink60
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue10
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue100
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue20
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue40
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral100
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral130
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral170
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral190
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral40
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral90
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen100
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen170
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen30
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen80
import com.sats.dna.colors.SatsColorPrimitives.Tangerine100
import com.sats.dna.colors.SatsColorPrimitives.Tangerine160
import com.sats.dna.colors.SatsColorPrimitives.Tangerine180
import com.sats.dna.colors.SatsColorPrimitives.Tangerine60
import com.sats.dna.colors.SatsColorPrimitives.TropicalIndigo100
import com.sats.dna.colors.SatsColorPrimitives.TropicalIndigo160
import com.sats.dna.colors.SatsColorPrimitives.TropicalIndigo180
import com.sats.dna.colors.SatsColorPrimitives.TropicalIndigo60
import com.sats.dna.colors.SatsColorPrimitives.UranianBlue100
import com.sats.dna.colors.SatsColorPrimitives.UranianBlue160
import com.sats.dna.colors.SatsColorPrimitives.UranianBlue180
import com.sats.dna.colors.SatsColorPrimitives.UranianBlue60
import com.sats.dna.colors.SatsColorPrimitives.White0
import com.sats.dna.colors.SatsColorPrimitives.White10
import com.sats.dna.colors.SatsColorPrimitives.White100
import com.sats.dna.colors.SatsColorPrimitives.White20
import com.sats.dna.colors.SatsColorPrimitives.White40
import com.sats.dna.colors.SatsColorPrimitives.White60
import com.sats.dna.colors.SatsColorPrimitives.White70
import com.sats.dna.colors.SatsColorPrimitives.White85

internal val SatsDarkColors = SatsColors(
    buttons = SatsColors.Buttons(
        primary = SatsColors.Buttons.Primary(
            default = SatsBlue100 on White100,
            disabled = Black50 on White10,
        ),
        secondary = SatsColors.Buttons.Secondary(
            default = OutlinedColorSet(
                bg = White0,
                outline = White100,
                fg = White100,
            ),
            disabled = OutlinedColorSet(
                bg = White0,
                outline = Black80,
                fg = Black50,
            ),
        ),
        action = SatsColors.Buttons.Action(
            default = SatsCoral100 on White0,
            disabled = Black50 on White0,
        ),
        cta = SatsColors.Buttons.Cta(
            default = White100 on SatsCoral100,
            disabled = White70 on Black80,
        ),
        waitingListFilled = SatsColors.Buttons.WaitingListFilled(
            default = White100 on EgyptianPurple80,
            disabled = Black50 on Black80,
        ),
        waitingListOutlined = SatsColors.Buttons.WaitingListOutlined(
            default = OutlinedColorSet(
                bg = White0,
                outline = EgyptianPurple80,
                fg = EgyptianPurple80,
            ),
            disabled = OutlinedColorSet(
                bg = White0,
                outline = Black50,
                fg = Black50,
            ),
        ),
        destructive = SatsColors.Buttons.Destructive(
            default = SatsColors.Buttons.Destructive.Default(
                default = White100 on ChiliRed80,
                disabled = Black50 on Black80,
            ),
            outlined = SatsColors.Buttons.Destructive.Outlined(
                default = OutlinedColorSet(
                    bg = White0,
                    outline = ChiliRed80,
                    fg = ChiliRed80,
                ),
                disabled = OutlinedColorSet(
                    bg = White0,
                    outline = Black50,
                    fg = Black50,
                ),
            ),
        ),
    ),
    graphicalElements = SatsColors.GraphicalElements(
        divider = SatsColors.GraphicalElements.Divider(
            default = Black80,
            alternate = White40,
        ),
        border = SatsColors.GraphicalElements.Border(
            default = Black70,
            focused = White40,
        ),
        signalBorder = SatsColors.GraphicalElements.SignalBorder(
            success = SpringGreen30,
            warning = Gold30,
            error = Cardinal30,
            waitingList = EgyptianPurple60,
            neutral = Black20,
            information = BrightBlue20,
            featured = SatsCoral40,
        ),
        skeleton = Black80,
        navBar = SatsColors.GraphicalElements.NavBar(
            selected = White100,
            notSelected = White100,
        ),
        progressBar = SatsColors.GraphicalElements.ProgressBar(
            indicatorDefault = SatsCoral90 on Black70,
            indicatorAlternate = SatsBlue10 on Black70,
            indicatorDisabled = White20 on Black70,
        ),
        graphs = SatsColors.GraphicalElements.Graphs(
            bar = SatsColors.GraphicalElements.Graphs.Bar(
                primary = SatsColors.GraphicalElements.Graphs.Bar.Primary(
                    default = SatsCoral90,
                    bg = Black80,
                ),
                secondary = SatsColors.GraphicalElements.Graphs.Bar.Secondary(
                    default = SatsBlue40,
                    bg = Black70,
                ),
            ),
            trend = SatsColors.GraphicalElements.Graphs.Trend(
                upwards = SpringGreen80,
                neutral = SatsCoral130,
                downwards = Cardinal100,
            ),
        ),
        selector = SatsColors.GraphicalElements.Selector(
            primary = SatsColors.GraphicalElements.Selector.Primary(
                unselected = SatsColors.GraphicalElements.Selector.Primary.Unselected(
                    default = OutlinedColorSet(outline = White100, bg = White0, fg = White100),
                    disabled = OutlinedColorSet(outline = White10, bg = White0, fg = White20),
                ),
                selected = SatsColors.GraphicalElements.Selector.Primary.Selected(
                    default = SatsBlue100 on SatsCoral90,
                    disabled = White60 on SatsCoral130,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Primary.UnselectedSurface(
                    default = White0,
                    disabled = White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Primary.SelectedSurface(
                    default = SatsCoral170,
                    disabled = SatsCoral190,
                ),
            ),
            secondary = SatsColors.GraphicalElements.Selector.Secondary(
                unselected = SatsColors.GraphicalElements.Selector.Secondary.Unselected(
                    default = OutlinedColorSet(outline = White100, bg = White0, fg = White100),
                    disabled = OutlinedColorSet(outline = White10, bg = White0, fg = White20),
                ),
                selected = SatsColors.GraphicalElements.Selector.Secondary.Selected(
                    default = SatsBlue100 on White100,
                    disabled = White60 on White20,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Secondary.UnselectedSurface(
                    default = White0,
                    disabled = White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Secondary.SelectedSurface(
                    default = BrightBlue160,
                    disabled = BrightBlue170,
                ),
            ),
        ),
        chips = SatsColors.GraphicalElements.Chips(
            unselected = SatsColors.GraphicalElements.Chips.Unselected(
                default = OutlinedColorSet(outline = White85, bg = White0, fg = White100),
                disabled = OutlinedColorSet(outline = White10, bg = White0, fg = White20),
            ),
            selected = SatsColors.GraphicalElements.Chips.Selected(
                default = SatsBlue100 on White100,
                disabled = White60 on Black80,
            ),
        ),
        toggle = SatsColors.GraphicalElements.Toggle(
            unselected = SatsColors.GraphicalElements.Toggle.Unselected(
                default = Black70,
                disabled = Black80,
            ),
            selected = SatsColors.GraphicalElements.Toggle.Selected(
                default = SatsCoral90,
                disabled = SatsCoral130,
            ),
            handle = White100,
        ),
        icons = SatsColors.GraphicalElements.Icons(
            primary = White100,
            secondary = Black20,
            positive = SpringGreen80,
            attention = Gold100,
            negative = Cardinal100,
            waitingList = EgyptianPurple80,
            delete = ChiliRed80,
        ),
        indicators = SatsColors.GraphicalElements.Indicators(
            positive = SatsColors.GraphicalElements.Indicators.Positive(
                default = SpringGreen80,
                alternate = SpringGreen170,
            ),
            attention = SatsColors.GraphicalElements.Indicators.Attention(
                default = Gold100,
                alternate = Gold170,
            ),
            negative = SatsColors.GraphicalElements.Indicators.Negative(
                default = Cardinal100,
                alternate = Cardinal170,
            ),
            neutral = SatsColors.GraphicalElements.Indicators.Neutral(
                default = SatsBlue40,
                alternate = Black80,
            ),
        ),
        signal = SatsColors.GraphicalElements.Signal(
            success = SpringGreen80,
            warning = Gold100,
            error = Cardinal100,
            neutral = SatsBlue40,
            waitingList = EgyptianPurple80,
        ),
        tags = SatsColors.GraphicalElements.Tags(
            primary = SatsBlue100 on SatsBlue10,
            secondary = White100 on Black80,
            featured = SatsCoral170 on SatsCoral90,
        ),
        indicatorTag = SatsColors.GraphicalElements.IndicatorTag(
            positive = SatsColors.GraphicalElements.IndicatorTag.Positive(
                default = White100 on SpringGreen100,
                alternate = SpringGreen30 on SpringGreen170,
            ),
            attention = SatsColors.GraphicalElements.IndicatorTag.Attention(
                default = Gold170 on Gold80,
                alternate = Gold30 on Gold170,
            ),
            negative = SatsColors.GraphicalElements.IndicatorTag.Negative(
                default = White100 on Cardinal100,
                alternate = Cardinal30 on Cardinal170,
            ),
            featured = SatsColors.GraphicalElements.IndicatorTag.Featured(
                default = SatsCoral170 on SatsCoral90,
                alternate = SatsCoral40 on SatsCoral170,
            ),
            neutral = SatsColors.GraphicalElements.IndicatorTag.Neutral(
                default = White100 on Black60,
                alternate = Black20 on Black90,
            ),
            information = SatsColors.GraphicalElements.IndicatorTag.Information(
                default = White100 on BrightBlue100,
                alternate = BrightBlue20 on BrightBlue160,
            ),
        ),
        badge = SatsColors.GraphicalElements.Badge(
            primary = SatsBlue100 on SatsCoral90,
            secondary = SatsBlue100 on SatsBlue10,
            tertiary = White100 on Black80,
        ),
        rewards = SatsColors.GraphicalElements.Rewards(
            blue = SatsBlue100 on BrightBlue100,
            silver = SatsBlue100 on SatsBlue20,
            gold = SatsBlue100 on Gold110,
            platinum = SatsBlue100 on SatsBlue40,
        ),
        workouts = SatsColors.GraphicalElements.Workouts(
            pt = UranianBlue160 on UranianBlue60,
            gx = SalmonPink180 on SalmonPink60,
            treatments = CaribbeanCurrent180 on CaribbeanCurrent60,
            gymfloor = Tangerine160 on Tangerine60,
            other = Celadon160 on Celadon60,
            bootcamp = TropicalIndigo160 on TropicalIndigo60,
        ),
    ),
    backgrounds = SatsColors.Backgrounds(
        primary = SatsColors.Backgrounds.Primary(
            default = BackgroundColorSet(
                bg = Black100,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
            ),
            selected = BackgroundColorSet(
                bg = Black100,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
            ),
        ),
        secondary = SatsColors.Backgrounds.Secondary(
            default = BackgroundColorSet(
                bg = Black90,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
            ),
            selected = BackgroundColorSet(
                bg = Black90,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
            ),
        ),
    ),
    surfaces = SatsColors.Surfaces(
        primary = SatsColors.Surfaces.Primary(
            default = SurfaceColorSet(
                bg = Black85,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
            selected = SurfaceColorSet(
                bg = BrightBlue160,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
            disabled = SurfaceColorSet(
                bg = Black95,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
        ),
        secondary = SatsColors.Surfaces.Secondary(
            default = SurfaceColorSet(
                bg = Black90,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
            selected = SurfaceColorSet(
                bg = Black90,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
            disabled = SurfaceColorSet(
                bg = Black100,
                fg = Black50,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
        ),
    ),
    signalSurfaces = SatsColors.SignalSurfaces(
        success = SatsColors.SignalSurfaces.Success(
            default = White100 on SpringGreen170,
            alternate = SpringGreen80 on SpringGreen170,
        ),
        warning = SatsColors.SignalSurfaces.Warning(
            default = White100 on Gold170,
            alternate = Gold80 on Gold170,
        ),
        error = SatsColors.SignalSurfaces.Error(
            default = White100 on Cardinal170,
            alternate = Cardinal60 on Cardinal170,
        ),
        waitingList = SatsColors.SignalSurfaces.WaitingList(
            default = White100 on EgyptianPurple160,
            alternate = EgyptianPurple60 on EgyptianPurple160,
        ),
        neutral = SatsColors.SignalSurfaces.Neutral(
            default = White100 on Black90,
            alternate = Black40 on Black90,
        ),
        information = SatsColors.SignalSurfaces.Information(
            default = White100 on BrightBlue160,
            alternate = BrightBlue60 on BrightBlue160,
        ),
        featured = SatsColors.SignalSurfaces.Featured(
            default = White100 on SatsCoral190,
            alternate = SatsCoral90 on SatsCoral190,
        ),
    ),
    workoutSurfaces = SatsColors.WorkoutSurfaces(
        gx = SatsColors.WorkoutSurfaces.GX(
            default = White100 on SalmonPink180,
            alternate = SalmonPink100 on SalmonPink180,
        ),
        pt = SatsColors.WorkoutSurfaces.PT(
            default = White100 on UranianBlue180,
            alternate = UranianBlue100 on UranianBlue180,
        ),
        gymfloor = SatsColors.WorkoutSurfaces.Gymfloor(
            default = White100 on Tangerine180,
            alternate = Tangerine100 on Tangerine180,
        ),
        treatments = SatsColors.WorkoutSurfaces.Treatments(
            default = White100 on CaribbeanCurrent180,
            alternate = CaribbeanCurrent60 on CaribbeanCurrent180,
        ),
        bootcamp = SatsColors.WorkoutSurfaces.Bootcamp(
            default = White100 on TropicalIndigo180,
            alternate = TropicalIndigo100 on TropicalIndigo180,
        ),
        other = SatsColors.WorkoutSurfaces.Other(
            default = White100 on Celadon180,
            alternate = Celadon100 on Celadon180,
        ),
    ),
    isLightMode = false,
)
