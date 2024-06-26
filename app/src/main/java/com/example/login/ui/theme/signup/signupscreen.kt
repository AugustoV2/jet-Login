package com.example.login.ui.theme.signup

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.login.ui.theme.Screen
import com.example.login.ui.theme.signup.componentssign.textfieldinfo


//@Preview
@Composable
public fun Signupscreen(navController: NavHostController){
    var firstname by remember{
        mutableStateOf("")
    }
    var lastname by remember{
        mutableStateOf("")
    }
    var email by remember{
        mutableStateOf("")
    }
    var password by remember{
        mutableStateOf("")
    }
    var confirmpassword by remember{
        mutableStateOf("")
    }
    Column(modifier = Modifier
        .padding(30.dp)
        .fillMaxSize(),
        ){
        Text(
            text = "Sign Up",
            fontSize = 30.sp
        )
        textfieldinfo(firstname,lastname,email,password,confirmpassword)

        Button(
            modifier = Modifier
                .padding(horizontal = 0.dp, vertical = 20.dp)
                .clip(
                    RoundedCornerShape(50)
                )
                .fillMaxWidth(),
            onClick = {
                navController.navigate(Screen.Login.route)

        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black
            )
        ) {
            Text(
                text="Submit",

                style = TextStyle(
                    fontSize = 20.sp,
                    ),
                )
        }
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center
        ){
            Text(
                modifier = Modifier
                    .clickable { navController.navigate(Screen.Login.route) },
                text ="Already have an account? Login!"



            )

        }
    }


}