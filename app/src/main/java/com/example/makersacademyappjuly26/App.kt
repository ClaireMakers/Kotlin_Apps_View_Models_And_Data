package com.example.makersacademyappjuly26

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.makersacademyappjuly26.screens.HomePageScreen
import com.example.makersacademyappjuly26.screens.SDCourseScreen

@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "homepagescreen") {

        // Here we declare all screens,
        // giving them a "route", which is a unique name
        // for each one.

        composable(route = "homepagescreen") {
            HomePageScreen(navController = navController)
        }

        composable(route = "sd-course-screen") {
            SDCourseScreen()
        }
    }
}