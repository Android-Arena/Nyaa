package com.AndroidArena.nyaa

sealed class Screen(val route:String){
    object splashScreen :Screen("splash_screen")
    object frame1 : Screen("frame_1")
    object frame2 : Screen("frame_2")
}
