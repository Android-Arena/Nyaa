package com.AndroidArena.nyaa

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.material.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.AndroidArena.nyaa.ui.theme.NyaaTheme
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.AndroidArena.nyaa.ui.theme.primaryColor

@Composable
fun Frame4(
    navController: NavController
) {

    Surface(
        modifier = Modifier

    ) {
        Image(
            painterResource(id = R.drawable.image_frame4),
            contentDescription = "background image for frame4",
            contentScale = ContentScale.FillBounds,
            alignment = Alignment.Center
        )
    }
    settings()


    }

@Composable
fun settings(){

    Column(
        horizontalAlignment = Alignment.End ,
        modifier = Modifier
          //  .fillMaxWidth()
            .padding( top = 14.dp,end = 14.dp, bottom = 90.dp, start = 125.dp )) {
        IconButton(
            modifier = Modifier.then(Modifier.size(19.dp)),
            onClick = {}
            //Spacer(modifier = Modifier.height(20.dp))
        ) {
            Image(
                painterResource(id = R.drawable.ic_ci_settings),
                contentDescription = "settings_button",
                //Spacer(modifier = Modifier.height(20.dp))
            )
        }

    }
    chats()
}

@Composable
fun chats(){
    Column(
        horizontalAlignment = Alignment.End ,
        modifier = Modifier
        .padding(top = 35.dp,end = 125.dp, bottom = 90.dp, start = 125.dp )
    ) {
        IconButton(
            modifier = Modifier.then(Modifier.size(24.dp)),
            onClick = {}
            //Spacer(modifier = Modifier.height(20.dp))
        ) {
            Image(
                painterResource(id = R.drawable.ic_imageforframe4),
                contentDescription = "back_button",
            )
        }
    }
}

@Composable
@Preview
fun Frame4Preview(){
    NyaaTheme {
        Frame4(navController = rememberNavController())
    }
}