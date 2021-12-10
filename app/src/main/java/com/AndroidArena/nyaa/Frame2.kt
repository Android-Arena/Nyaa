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
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.AndroidArena.nyaa.model.User
import com.AndroidArena.nyaa.ui.theme.Black2
import com.AndroidArena.nyaa.ui.theme.NyaaTheme
import com.AndroidArena.nyaa.ui.theme.primaryColor
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.navigation.animation.composable



@Composable
fun Frame2(
   // navController: NavController,
    user: User
){
    Surface(
        modifier = Modifier

    ) {
        Image(
            painterResource(id = R.drawable.image_frame2),
            contentDescription = "background image for frame2",
            contentScale = ContentScale.FillBounds,

            alignment= Alignment.Center,
        )
       /* IconButton(
            modifier = Modifier
                .padding(start = 14.dp, top = 40.dp),
            onClick = {navController.navigate(Screen.frame1.route)}
        ) {
            Image(painterResource(id = R.drawable.ic_ion_arrow_back_circle_outline ),
                contentDescription = "back_button",
            )
        }*/
        Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()

        ) {
            Spacer(modifier = Modifier.padding(top = 450.dp))
            Text(text="Please enter your username!",
            color=primaryColor,
            style=MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.padding(top=90.dp))
            var text by remember { mutableStateOf(TextFieldValue(""))}
            OutlinedTextField(
                value = text,
                label = { Text(text = "Username") },
                onValueChange = {
                    text = it
                }
            )
            Spacer(modifier = Modifier.padding(top = 50.dp))
            Text(text = user.email)

        }

    }

}

@Composable
@Preview
fun Frame2Preview(){
    NyaaTheme {
        Frame2(
           // navController = rememberNavController(),
            user = User(email= "arena.andrd@gmail.com", displayName = "nyaa-63678")
            )
    }
}