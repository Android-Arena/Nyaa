package com.AndroidArena.nyaa

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import androidx.compose.ui.tooling.preview.Preview
import com.AndroidArena.nyaa.ui.theme.NyaaTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.AndroidArena.nyaa.ui.theme.primaryColor
import com.AndroidArena.nyaa.ui.theme.primaryTextColor
import com.AndroidArena.nyaa.ui.theme.robotoFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NyaaTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    frame1()
                }
            }
        }
    }
}

@Composable
private fun frame1(){
    Surface(
        modifier = Modifier
           // .padding(vertical = 40.dp)
    ) {
        Image(
            painterResource(id = R.drawable.image_frame1),
            contentDescription = "background image",
            contentScale = ContentScale.FillBounds, // or some other scale
            //modifier = Modifier.matchParentSize()
        )
        Column( modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            //verticalArrangement = Arrangement.Center,


        ) {
            Spacer(modifier=Modifier.size(267.dp))
            Text(text = "Welcome to the chatting app for weebs",
                textAlign = TextAlign.Center,
            modifier=Modifier
                .padding(horizontal = 22.dp),
                style=MaterialTheme.typography.body1
            )
            Spacer(modifier = Modifier.size(135.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier=Modifier
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
                    style=MaterialTheme.typography.button
                )
            }
            Spacer(modifier = Modifier.size(38.dp))
            Button(
                onClick = { /*TODO*/ },
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
                    style=MaterialTheme.typography.body2
                )
            }
        }
    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NyaaTheme {
        frame1()
    }
}
