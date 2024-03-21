package com.example.login.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.io.File
import java.io.FileWriter

@Composable
fun loginbutton(username: String, password: String, check: Boolean): Boolean {

    Button(
        modifier = Modifier
            .clip(
                RoundedCornerShape(50)
            )
            .fillMaxWidth(),
                onClick = {
           try {
            val file = File("login.txt")
            val fileWriter = FileWriter(file)
            fileWriter.write(username)
            fileWriter.close()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Black
        )


    ) {
        Text(text = "Login")
        //fontSize = 10.sp,


    }
    return true

}