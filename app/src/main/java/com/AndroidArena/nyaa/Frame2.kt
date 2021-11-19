package com.AndroidArena.nyaa

import androidx.compose.animation.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.AndroidArena.nyaa.ui.theme.NyaaTheme
import com.AndroidArena.nyaa.ui.theme.primaryColor
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.navigation.animation.composable


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

           /* var visible by remember { mutableStateOf(true) }
            val density = LocalDensity.current
            AnimatedVisibility(
                visible = visible,
                enter = slideInVertically(
                    // Slide in from 40 dp from the top.
                    initialOffsetY = { with(density) { -40.dp.roundToPx() } }
                ) + expandVertically(
                    // Expand from the top.
                    expandFrom = Alignment.Top
                ) + fadeIn(
                    // Fade in with the initial alpha of 0.3f.
                    initialAlpha = 0.3f
                ),
                exit = slideOutVertically() + shrinkVertically() + fadeOut()
            ) {
                Text("Hello", Modifier.fillMaxWidth().height(200.dp))
            }*/
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