package com.example.login.ui.theme.signup.componentssign

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun textfieldinfo(
    firstname: String,
    lastname: String,
    email: String,
    password: String,
    confirmpassword: String
) {

    var nfname by remember { mutableStateOf(firstname) }
    var nlname by remember { mutableStateOf(firstname) }
    var nemail by remember { mutableStateOf(firstname) }
    var npass by remember { mutableStateOf(firstname) }
    var ncpass by remember { mutableStateOf(firstname) }
    Row {
        OutlinedTextField(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            value = nfname,
            textStyle = TextStyle(color = Color.Black),
            onValueChange = { new -> nfname = new },
            label = { Text("First name") }
        )
    }
    Row {
        OutlinedTextField(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            value = nlname,
            textStyle = TextStyle(color = Color.Black),
            onValueChange = { new -> nlname = new },
            label = { Text("Last name") }
        )
    }
    Row {
        OutlinedTextField(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            value = nemail,
            textStyle = TextStyle(color = Color.Black),
            onValueChange = { new -> nemail = new },
            label = { Text("Email ID") }
        )
    }
    Row {
        OutlinedTextField(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            value = npass,
            textStyle = TextStyle(color = Color.Black),
            onValueChange = { new -> npass = new },
            visualTransformation = PasswordVisualTransformation(),
            label = { Text("Password") }
        )
    }
    Row {
        OutlinedTextField(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            value = ncpass,
            textStyle = TextStyle(color = Color.Black),
            onValueChange = { new -> ncpass = new },
            visualTransformation = PasswordVisualTransformation(),
            label = { Text("Confirm Password") }
        )
        if(ncpass != npass){
            Text("Password does not match")
        }
    }
}