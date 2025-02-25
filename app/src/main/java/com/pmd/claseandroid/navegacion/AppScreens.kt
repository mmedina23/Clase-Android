package com.pmd.claseandroid.navegacion

sealed class AppScreens(val ruta: String) {
    object SplashScreen : AppScreens("splash_screen")
    object MainScreen : AppScreens("main_screen")
}