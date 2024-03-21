package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.login.ui.theme.LoginTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.login.ui.theme.login.LoginScreen
import com.example.login.ui.theme.navigation
import com.example.login.ui.theme.signup.Signupscreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                navigation()
            }
        }
    }
}
