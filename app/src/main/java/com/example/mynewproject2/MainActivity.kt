//package com.example.mynewproject2
//
//import android.graphics.Color
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.SystemBarStyle
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.ui.Modifier
//import com.example.mynewproject2.ui.theme.MyNewProject2Theme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        enableEdgeToEdge(
//            statusBarStyle = SystemBarStyle.dark(
//                Color.TRANSPARENT,
//
//            )
//        )
//        super.onCreate(savedInstanceState)
//        setContent {
//            MyNewProject2Theme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    AppNavHost()
//                }
//            }
//        }
//    }
//}
