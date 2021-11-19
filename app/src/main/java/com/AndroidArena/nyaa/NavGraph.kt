package com.AndroidArena.nyaa

import androidx.compose.animation.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
import com.google.accompanist.navigation.animation.AnimatedNavHost
import androidx.compose.animation.core.tween
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@ExperimentalComposeUiApi
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
            route = Screen.frame1.route

        ) {
            Frame1(navController)
        }

        composable(
            route = Screen.frame2.route

        ) {
            Frame2( navController)
        }

    }
}