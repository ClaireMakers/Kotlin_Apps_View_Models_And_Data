package com.example.makersacademyappjuly26.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.makersacademyappjuly26.components.Banner

@Composable
fun HomePageScreen() {
    Banner()
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Column content
        Text("Welcome to Makers Academy!")
        Button(onClick = {}) {
            Text("View the SD Course")
        }
    }
}