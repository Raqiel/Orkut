package com.example.orkut.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.orkut.R
import com.example.orkut.ui.theme.Blue03
import com.example.orkut.ui.theme.OrkutTheme
import com.example.orkut.ui.theme.Pink01

class CreateAccount : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContentCreateAccount()


                

        
    }
}
}

@Composable
 fun ContentCreateAccount(){
     Column(
         modifier = Modifier
         .background(Blue03)
         .fillMaxSize(),
         horizontalAlignment = Alignment.CenterHorizontally){
            Column() {
                Image(painter = painterResource(R.drawable.logo),
                contentDescription = "text",
                    modifier = Modifier.size(150.dp)
            )

            }
     }

 }






