package com.sats.dna.sample.screens

import com.sats.dna.sample.components.SnackbarScreen

data object SnackbarSampleScreen : SampleScreen(
    name = "Snackbar",
    route = "/components/snackbar",
    screen = { SnackbarScreen(it::navigateUp) },
)
