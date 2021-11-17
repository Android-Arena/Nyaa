package com.AndroidArena.nyaa

sealed class Screen(val route:String){
    object splashScreen :Screen("splash_screen")
    object frame1 : Screen("frame1")
    object frame2 : Screen("frame2")
}
