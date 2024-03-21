package com.example.login.ui.theme.login

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
import androidx.compose.ui.unit.sp
import com.example.login.ui.theme.components.loginbutton
import com.example.login.ui.theme.signup.signtxt


@Composable
    fun LoginScreen(){
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var check by remember { mutableStateOf(false) }
    var enabled by rememberSaveable{ mutableStateOf(true)}
   // val qn = AnnotatedString("Dont have an acc? Sign UP!")
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
                //passwrodtxtfield(password = password)

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
            Row{
                signtxt()

            }
        }
    }
}







