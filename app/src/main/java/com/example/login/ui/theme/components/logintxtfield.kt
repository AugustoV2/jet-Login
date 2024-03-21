package com.example.login.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun logintxtfield(username : String){
    var nusername by remember { mutableStateOf(username) }

    OutlinedTextField(
       modifier = Modifier.fillMaxWidth(),
        value = nusername,
        textStyle = TextStyle(color = Color.Black),
        leadingIcon = {
            Icon(Icons.Default.Person, contentDescription = "username")
        },
        onValueChange = {newText -> nusername = newText },


        label = { Text("Username")

        }
    )

    }
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun passwrodtxtfield(password : String){
    var npassword by remember { mutableStateOf(password) }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = npassword,
        leadingIcon = {
            Icon(Icons.Default.Lock, contentDescription = "password")
        },
        textStyle = TextStyle(color = Color.Black),
        onValueChange = {new -> npassword = new},
        visualTransformation = PasswordVisualTransformation(),
        label = { Text("Password") }
    )

}
