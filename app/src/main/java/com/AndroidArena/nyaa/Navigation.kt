package com.AndroidArena.nyaa

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController= navController, startDestination = Screen.frame1.route){
        composable(route=Screen.frame1.route) {
            Frame1(navController = navController)
        }
       /* composable(Screen.frame2.route){
            Frame2(navController = navController)
        }
        composable( TODO() ) {
        } */
    }
}
//https://www.youtube.com/watch?v=4gUeyNkGE3g