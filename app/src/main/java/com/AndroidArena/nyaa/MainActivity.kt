package com.AndroidArena.nyaa

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.unit.dp
import com.AndroidArena.nyaa.ui.theme.primaryColor
import com.AndroidArena.nyaa.ui.theme.primaryTextColor

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
            .padding(vertical = 40.dp)

    ) {
        Column( modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,


        ) {
            Text(text = "Welcome to chatting app for weebs")
            Button(
                onClick = { /*TODO*/ },
                modifier=Modifier
                    .size(width=361.dp, height =56.dp)
                    .padding(vertical = 135.dp),
                contentPadding = PaddingValues(16.dp),
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
                Text(text = "Sign Up")
            }
            Button(
                onClick = { /*TODO*/ },
                modifier= Modifier
                    .size(width=361.dp, height =56.dp)
                    .padding(vertical = 38.dp),

                contentPadding = PaddingValues(16.dp),
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
                Text(text = "Login")
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