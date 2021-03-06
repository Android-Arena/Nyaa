package com.AndroidArena.nyaa.presentation

import android.view.Surface
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.AndroidArena.nyaa.ui.theme.Shapes
import java.awt.font.TextAttribute
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ContentAlpha.medium
import androidx.compose.ui.unit.sp
import com.AndroidArena.nyaa.R
import com.AndroidArena.nyaa.ui.theme.NyaaTheme
import com.AndroidArena.nyaa.ui.theme.primaryColor
import com.AndroidArena.nyaa.ui.theme.primaryTextColor

@ExperimentalMaterialApi
@Composable
fun GoogleSignInButtonUi(
    text : String="",
loadingText: String = "",
onClicked:() -> Unit){

    var clicked by remember { mutableStateOf(false) }
    Surface(
        onClick = {clicked=!clicked},
        shape = Shapes.medium,
        border = BorderStroke(width = 1.dp, color = primaryColor),
        color = primaryColor
    ) {
        Row(modifier = Modifier
            .padding(
                start = 10.dp,
                end = 13.dp,
                top = 10.dp,
                bottom = 10.dp,
            )
            .animateContentSize(
                animationSpec = tween(durationMillis = 300, easing = LinearOutSlowInEasing)
            ), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Icon(painter = painterResource(id = R.drawable.ic_google_icon), contentDescription = "Google sign button", tint = Color.White, )
            Spacer(modifier = Modifier.width(9.dp))
            Text(text = if (clicked) loadingText else text,
                color = primaryTextColor,
                fontSize = 22.sp



            )

            if (clicked){
                Spacer(modifier = Modifier.width(16.dp))
                CircularProgressIndicator(
                    modifier = Modifier.height(16.dp)
                        .width(16.dp),
                    strokeWidth = 2.dp,
                    color = MaterialTheme.colors.primary
                )
                onClicked()
            }


        }
    }



}
@ExperimentalMaterialApi
@Composable
@Preview
fun GoogleButtonPreview(){
    GoogleSignInButtonUi(

        text = "Sign up with Google",
        loadingText = "Signing In....",
        onClicked = {}
    )
}


