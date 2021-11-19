package com.AndroidArena.nyaa

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.AndroidArena.nyaa.ui.theme.NyaaTheme
import com.AndroidArena.nyaa.ui.theme.frame1
import com.AndroidArena.nyaa.ui.theme.primaryColor
import com.AndroidArena.nyaa.ui.theme.primaryTextColor
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.navigation.animation.composable

@Composable
fun Frame1(
    navController: NavController
){
    Surface(
        modifier = Modifier
        // .padding(vertical = 40.dp)
    ) {
        Image(
            painterResource(id = R.drawable.image_frame1),
            contentDescription = "background image",
            contentScale = ContentScale.FillBounds, // or some other scale
            alignment= Alignment.Center,
        )

        Column( modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            //verticalArrangement = Arrangement.Center,


        ) {
            Spacer(modifier= Modifier.size(267.dp))
            Text(text = "Welcome to the chatting app for weebs",
                textAlign = TextAlign.Center,
                modifier= Modifier
                    .padding(horizontal = 22.dp),
                style= MaterialTheme.typography.body1
            )
            Spacer(modifier = Modifier.size(135.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier= Modifier
                    .size(width=361.dp, height =56.dp),
                //.padding(top = 573.dp),
                //contentPadding = PaddingValues(14.dp),
                shape= CircleShape,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = primaryColor,
                    contentColor = primaryTextColor,
                ),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 4.dp,
                    pressedElevation = 7.dp,
                ),
            ){
                Text(text = "Sign Up",
                    color= primaryTextColor,
                    style= MaterialTheme.typography.button
                )
            }
            Spacer(modifier = Modifier.size(38.dp))
            Button(
                onClick = {
                          navController.navigate(route=Screen.frame2.route)
                          },
                modifier= Modifier
                    .size(width=361.dp, height =56.dp),
                //.padding(top = 667.dp),

                //contentPadding = PaddingValues(14.dp),
                shape= CircleShape,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = primaryTextColor,
                    contentColor = primaryColor,
                ),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 4.dp,
                    pressedElevation = 7.dp,
                ),

                ) {
                Text(text = "Login",
                    color= primaryColor,
                    style= MaterialTheme.typography.body2
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NyaaTheme {
        Frame1(
            navController= rememberNavController()
        )
    }
}
