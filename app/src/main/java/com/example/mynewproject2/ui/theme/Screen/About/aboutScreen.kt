package com.example.mynewproject2.ui.theme.Screen.About

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.mynewproject2.Navigation.ROUTE_HOME

@Composable
fun AboutScreen(navController: NavController){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Welcome to the About Us Screen")
            Button(onClick = { navController.navigate(ROUTE_HOME) },
                colors = ButtonDefaults.buttonColors(Color.Blue)) {
                Text(text = "Go to Home Screen")
            }
        }

}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun AboutPre(){
//    AboutScreen()
}