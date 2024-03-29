package com.sats.dna.colors

import androidx.compose.ui.graphics.Color

internal val SatsDarkColors = SatsColors(
    primary = SatsColors.Primary(
        default = Color(0xFF549BDE),
        disabled = Color(0xFF272729),
    ),
    onPrimary = SatsColors.OnPrimary(
        default = Color(0xFFFFFFFF),
        disabled = Color(0x99FFFFFF),
    ),
    secondary = SatsColors.Secondary(
        default = Color(0xFF3C3C41),
        disabled = Color(0xFF272729),
    ),
    onSecondary = SatsColors.OnSecondary(
        default = Color(0xFFFFFFFF),
        disabled = Color(0x99FFFFFF),
    ),
    cta = SatsColors.Cta(
        default = Color(0xFFE16259),
        disabled = Color(0xFF353535),
        nonText = Color(0xFFFD7459),
    ),
    action = SatsColors.Action(
        default = Color(0xFF549BDE),
        disabled = Color(0xFF272729),
    ),
    clean = SatsColors.Clean(
        default = Color(0xFFFFFFFF),
        disabled = Color(0x80FFFFFF),
    ),
    signalBackground = SatsColors.SignalBackground(
        success = Color(0xFF424846),
        warning = Color(0xFF484641),
        error = Color(0xFF4A4444),
        delete = Color(0xFF4B4343),
    ),
    signal = SatsColors.Signal(
        success = Color(0xFF8BBF9B),
        warning = Color(0xFFFCD36C),
        error = Color(0xFFE9698B),
        delete = Color(0xFFE5766E),
    ),
    signalText = SatsColors.SignalText(
        success = Color(0xFF8BBF9B),
        warning = Color(0xFFFCD36C),
        error = Color(0xFFE9698B),
        delete = Color(0xFFE5766E),
    ),
    ui = SatsColors.Ui(
        tabs = Color(0xFF101112),
        shimmer = Color(0xFF333438),
        border = Color(0x17FFFFFF),
        graphicalElements1 = Color(0xFFFFFFFF),
        graphicalElements2 = Color(0xE6FFFFFF),
        graphicalElements3 = Color(0x99FFFFFF),
        graphicalElements4 = Color(0xFF191C1E),
        graphicalElements5 = Color(0xFFFD7459),
        graphicalElements6 = Color(0xFF8BBF9B),
        graphicalElements7 = Color(0xFF686DB9),
    ),
    challenges = SatsColors.Challenges(
        inProgress = Color(0xFFFD7459),
        failed = Color(0xFFFFFFFF),
        success = Color(0xFF8BBF9B),
        notDone = Color(0xFF484849),
    ),
    background = SatsColors.Background(
        primary = Color(0xFF000000),
        secondary = Color(0xFF000000),
    ),
    onBackground = SatsColors.OnBackground(
        primary = Color(0xFFFFFFFF),
        secondary = Color(0x99FFFFFF),
        disabled = Color(0x66FFFFFF),
        controls = SatsColors.OnBackground.Controls(
            enabledOn = Color(0xFFFD7459),
            enabledOff = Color(0xFFFFFFFF),
            disabledOn = Color(0xB3FD7459),
            disabledOff = Color(0x66FFFFFF),
        ),
    ),
    surface = SatsColors.Surface(
        primary = Color(0xFF1A1A1C),
        secondary = Color(0xFF282E34),
    ),
    onSurface = SatsColors.OnSurface(
        primary = Color(0xFFFFFFFF),
        secondary = Color(0xADFFFFFF),
        disabled = Color(0x66FFFFFF),
        controls = SatsColors.OnSurface.Controls(
            enabledOn = Color(0xFFFD7459),
            enabledOff = Color(0xFFFFFFFF),
            disabledOn = Color(0xB3FD7459),
            disabledOff = Color(0x66FFFFFF),
        ),
    ),

    waitingList = SatsColors.WaitingList(
        background = Color(0xFF2E2F46),
        primary = Color(0xFF686DB9),
        text = Color(0xFFA0A5F1),
        disabled = Color(0xFF686DB9),
    ),

    onSignal = Color(0xFFFFFFFF),

    isLightMode = false,
)
