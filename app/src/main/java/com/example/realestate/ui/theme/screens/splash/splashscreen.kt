package com.example.realestate.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.ROUT_LOGIN
import com.example.realestate.ui.theme.Pink80
import com.example.realestate.ui.theme.lightpurple
import com.example.realestate.ui.theme.mybackground
import com.example.realestate.ui.theme.teal
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun splashscreen(navController: NavController){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(teal),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        var coroutineScope = rememberCoroutineScope()
        coroutineScope.launch {
            delay(4000)
            navController.navigate(ROUT_LOGIN)
        }


        Image(

            painter = painterResource(id = R.drawable.property) ,
            contentDescription = "home",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )



    }

}

@Composable
@Preview(showBackground = true)
fun splashscreenPreview(){

    splashscreen(rememberNavController() )

}