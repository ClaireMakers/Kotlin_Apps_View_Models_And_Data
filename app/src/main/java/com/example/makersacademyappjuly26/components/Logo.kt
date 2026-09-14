package com.example.makersacademyappjuly26.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.makersacademyappjuly26.R

@Composable
fun Logo() {
    Image(
        painter = painterResource(id = R.drawable.makers_logo),
        contentDescription = "Makers Logo"
    )
}