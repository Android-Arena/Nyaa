package com.AndroidArena.nyaa

import androidx.compose.animation.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.AndroidArena.nyaa.ui.theme.Black2
import com.AndroidArena.nyaa.ui.theme.NyaaTheme
import com.AndroidArena.nyaa.ui.theme.primaryColor
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.navigation.animation.composable



@Composable
fun Frame3(
    navController: NavController
){
    Surface(
        modifier = Modifier

    ) {
        Image(
            painterResource(id = R.drawable.image_frame3),
            contentDescription = "background image for frame3",
            contentScale = ContentScale.FillBounds,
            alignment= Alignment.Center,
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()

        ) {
            Spacer(modifier = Modifier.padding(top = 420.dp))
            Text(text="It seems so lonely in here!",
                color=primaryColor,
                style=MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.padding(top=90.dp))
            Button(onClick = { /*TODO*/ }) {
            }
            //Spacer(modifier = Modifier.weight(.3f))
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
fun Frame3Preview(){
    NyaaTheme {
        Frame3(navController = rememberNavController())
    }
}