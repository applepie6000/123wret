package com.example.mynewproject2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


//class CardsActivity2 : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MyNewProject2Theme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//
//                }
//            }
//        }
//    }
//}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(){
        TopAppBar(title = { Text( text = "DASHBOARD")},
            navigationIcon = { },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.DarkGray,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.Green
            ),
            actions ={
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Rounded.Notifications, contentDescription = "Search", tint = Color.Blue,)
                }

            }
        )
    Spacer(modifier = Modifier.height(100.dp))
    Card(modifier = Modifier
        .height(800.dp)
        .padding(top = 30.dp)
        .fillMaxWidth(),   colors = CardDefaults.cardColors(Color.Gray),  ) {
        Row (modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
            Card(modifier = Modifier
                .width(160.dp)
                .height(150.dp)) {
                Text(text = "We are looking for a frontend Developer to work full time", style = TextStyle(
                    Brush.horizontalGradient(colors = listOf(Color.Cyan, Color.Blue, Color.Magenta))))
            }
            Card(modifier = Modifier
                .width(160.dp)
                .height(150.dp)) {

            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp), horizontalAlignment = Alignment.CenterHorizontally){
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.Left) {
                    Box (modifier = Modifier
                        .height(100.dp)
                        .width(190.dp)
//                        .background(Color.Red)
                        .padding(start = 10.dp, top = 10.dp)){
                        Column {
                            Text(text = "No.of Tires")
                            Text(text = "486")
                        }
                    }
                    Box (modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
//                        .background(Color.Yellow)
                        .padding(start = 10.dp, top = 10.dp)){
                        Column {
                            Text(text = "Reorder level")
                            Text(text = "1/14")
                        }
                    }
                }
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 20.dp), colors = ButtonDefaults.buttonColors(
                    Color.White)) {
                    Text(text = "View Stock", color = Color.Black)
                }
            }

            Spacer(modifier = Modifier.height(30.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.Left) {
                    Box (modifier = Modifier
                        .height(100.dp)
                        .width(190.dp)
//                        .background(Color.Red)
                        .padding(start = 10.dp, top = 10.dp)){
                        Column {
                            Text(text = "No.of Wheels")
                            Text(text = "300")
                        }
                    }
                    Box (modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
//                        .background(Color.Yellow)
                        .padding(start = 10.dp, top = 10.dp)){
                        Column {
                            Text(text = "Reorder level")
                            Text(text = "2/14")
                        }
                    }
                }
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 20.dp), colors = ButtonDefaults.buttonColors(
                    Color.White)) {
                    Text(text = "View Stock", color = Color.Black)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 110.dp), colors = ButtonDefaults.buttonColors(
            Color.Black)) {
            Text(text = "ADD TO STOCK", color = Color.White)
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun pre(){
    Home()
}


