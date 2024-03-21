package com.example.login.ui.theme


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Forgotpage(
    navController: NavController, ) {

    var nemail by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .padding(horizontal = 0.dp, vertical = 50.dp)
            .fillMaxSize()
    ) {
        Column {
            OutlinedTextField(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                value = nemail,
                textStyle = TextStyle(color = Color.Black),
                onValueChange = { new -> nemail = new },
                label = { Text("Enter Your Mail ID") }
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                navController.navigate(Screen.Login.route)
            }
            ) {
                Text(
                    text = "Submit",
                    fontSize = 20.sp,
                )

            }
        }
    }
}