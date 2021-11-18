package com.AndroidArena.nyaa

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.AndroidArena.nyaa.ui.theme.NyaaTheme
import com.AndroidArena.nyaa.ui.theme.primaryColor


@Composable
fun Frame2(
    navController: NavController
){
    Surface(
        modifier = Modifier
    ) {
        Image(
            painterResource(id = R.drawable.image_frame1),
            contentDescription = "background image",
            contentScale = ContentScale.FillBounds,
            alignment= Alignment.Center,
        )
        
        Column {
            Text(text = "Welcome Back",
                color = primaryColor,
                style=MaterialTheme.typography.h1
            )
            Text(text="Login to your account",
            color=primaryColor,
            style=MaterialTheme.typography.body2
            )
            Button(onClick = { /*TODO*/ }) {

            }

        }

    }

}

@Composable
@Preview
fun Frame2Preview(){
    NyaaTheme {
        Frame2(navController = rememberNavController())
    }
}