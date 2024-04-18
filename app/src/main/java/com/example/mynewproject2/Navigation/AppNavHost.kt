package com.example.mynewproject2.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.morningmvvm.ui.theme.screens.home.HomeScreenView
import com.example.morningmvvm.ui.theme.screens.login.LoginScreen
import com.example.morningmvvm.ui.theme.screens.register.RegisterScreen
import com.example.mynewproject2.ui.theme.Screen.About.AboutScreen
import com.example.mynewproject2.ui.theme.Screen.Home.HomeScreen
import com.example.mynewproject2.ui.theme.Screen.Products.AddProductsScreen
import com.example.mynewproject2.ui.theme.Screen.Products.PreviewScreens
import com.example.mynewproject2.ui.theme.Screen.Products.UpdateProductsScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),startDestination: String= ROUTE_HOME
               ){
    NavHost(navController =navController, modifier = Modifier, startDestination = startDestination ){
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_DASH){
            HomeScreenView(navController)
        }
        composable(ROUTE_ADD_PRODUCT){
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            PreviewScreens(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
    }
}