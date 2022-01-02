package com.AndroidArena.nyaa

import androidx.compose.animation.*
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
import com.google.accompanist.navigation.animation.AnimatedNavHost
import androidx.compose.animation.core.tween
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.Alignment
import com.AndroidArena.nyaa.model.User
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@ExperimentalMaterialApi
@ExperimentalComposeUiApi
@ExperimentalMaterialApi
@ExperimentalAnimationApi
@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    AnimatedNavHost(
        navController = navController,
        startDestination = Screen.splashScreen.route,

    ) {
        composable(
            route= Screen.splashScreen.route,
            exitTransition = {
                slideOutHorizontally(targetOffsetX = {width -> -2*width}, animationSpec = tween(1000))},

        ){
            SplashScreen(navController)
        }
        composable(
            route = Screen.frame1.route,
        ) {
            Frame1(navController)
        }

        composable(
            route = Screen.frame2.route,
            /*enterTransition = {
                expandIn(
                    // Overwrites the default spring animation with tween
                    animationSpec = tween(500, easing = LinearOutSlowInEasing),
                    // Overwrites the corner of the content that is first revealed
                    expandFrom = Alignment.BottomEnd
                )
            }*/
        ) {
           // val useri=User(user.email,user.displayName)
          //  var
            Frame2( navController,  user= User("",""))
        }

        composable(
            route=Screen.frame3.route,
        ){
            Frame3(navController)
        }

    }
}