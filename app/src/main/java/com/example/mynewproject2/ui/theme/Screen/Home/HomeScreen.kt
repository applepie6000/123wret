package com.example.mynewproject2.ui.theme.Screen.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mynewproject2.Navigation.ROUTE_LOGIN
import com.example.mynewproject2.Navigation.ROUTE_REGISTER
import com.example.mynewproject2.R


@Composable
fun HomeScreen(navController: NavController) {
    Image(
        painter = painterResource(id = R.drawable.sunset3),
        contentDescription = "HOME",
        contentScale = ContentScale.Crop
    )
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Welcome")
        Spacer(modifier = Modifier.height(450.dp))
        Button(onClick = { navController.navigate(ROUTE_LOGIN)}, modifier = Modifier.width(290.dp), colors = ButtonDefaults.buttonColors(
            Color.Transparent), border = ButtonDefaults.outlinedButtonBorder
        ) {
            Text(text = "LogIn to your Account", color = Color.White)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_REGISTER) }, modifier = Modifier.width(290.dp), colors = ButtonDefaults.buttonColors(
            Color.Transparent), border = ButtonDefaults.outlinedButtonBorder) {
            Text(text = "Create an Account", color = Color.White)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Don't Have an Account? Sign In", fontSize = 10.sp)
    }

}
