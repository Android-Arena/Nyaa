package com.AndroidArena.nyaa

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController


@Composable
fun Frame2(
    navController: NavController
){
    Surface(
        modifier = Modifier
    ) {
        Text(text = "You're at frame 2")
    }

}

