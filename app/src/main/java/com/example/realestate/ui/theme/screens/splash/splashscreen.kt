package com.example.realestate.ui.theme.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.ui.theme.mybackground

@Composable
fun splashscreen(navController: NavController){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(mybackground),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

    }


}

@Composable
@Preview(showBackground = true)
fun splashscreenPreview(){

    splashscreen(rememberNavController() )

}