package com.example.login.ui.theme

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Signup : Screen("signup")
}