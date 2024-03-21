package com.example.login.ui.theme.components

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp


@Composable
fun checked(check : Boolean){
    var ncheck by remember { mutableStateOf(check) }
    Checkbox(checked = ncheck, onCheckedChange = {nch -> ncheck = nch} )
}