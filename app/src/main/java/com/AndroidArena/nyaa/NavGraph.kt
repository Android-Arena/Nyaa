package com.AndroidArena.nyaa

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.splashScreen.route
    ) {
        composable(
            route= Screen.splashScreen.route
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