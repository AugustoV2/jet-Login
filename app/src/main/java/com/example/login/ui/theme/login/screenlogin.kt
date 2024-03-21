package com.example.login.ui.theme.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.login.ui.theme.components.checked
import com.example.login.ui.theme.components.logintxtfield
import com.example.login.ui.theme.components.passwrodtxtfield
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.login.ui.theme.Screen
import com.example.login.ui.theme.components.loginbutton


@Composable
    fun LoginScreen(navController: NavHostController){
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var check by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
        //.background(Color(0xFF1A237E)),
    )
    {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
        ) {
            Row {
                Text(
                    text = "Login",
                    fontSize = 30.sp,
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                logintxtfield(username = username)

            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

                passwrodtxtfield(password = password)

            }
            Row(modifier = Modifier.fillMaxWidth()) {
                checked(check = check)
                Text(
                    modifier = Modifier.padding(horizontal = 0.dp, vertical = 12.dp),
                    text = "Remember me",
                    //fontSize = 10.sp,
                    color = Color.Black
                )


                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 50.dp, vertical = 12.dp),
                    text = "ForgotPassword?",
                    //fontSize = 10.sp,
                    color = Color.Black
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                loginbutton(username ,password ,check)
            }
            Row (modifier = Modifier
                    .fillMaxSize(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center,
            ) {
            Text(
                modifier = Modifier
                    .clickable {
                        navController.navigate(Screen.Signup.route)
                    },
                text = "Dont have an account? Signup!"
            )
        }
        }
        }
    }








