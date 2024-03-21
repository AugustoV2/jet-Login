package com.example.login.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login.ui.theme.login.LoginScreen
import com.example.login.ui.theme.signup.Signupscreen



@Composable
fun navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Login.route ){
        composable(Screen.Login.route){
            LoginScreen(navController)
        }
        composable(Screen.Signup.route){
            Signupscreen(navController)
        }
        composable(Screen.Forgot.route){
            Forgotpage(navController)
        }
    }
    }



