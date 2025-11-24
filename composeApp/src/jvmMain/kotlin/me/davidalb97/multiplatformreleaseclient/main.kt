package me.davidalb97.multiplatformreleaseclient

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MultiplatformReleaseClient",
    ) {
        App()
    }
}