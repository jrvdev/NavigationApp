package com.dartbyte.navigationapp.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.dartbyte.navigationapp.DetailScreen
import com.dartbyte.navigationapp.HomeScreen
import com.dartbyte.navigationapp.LoginScreen
import com.dartbyte.navigationapp.SettingScreen
import com.dartbyte.navigationapp.core.navigation.type.createNavType
import kotlin.reflect.typeOf

@Composable
fun NavigationComponent(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login){
        composable<Login> {
            LoginScreen {navController.navigate(Home)}
        }

        composable<Home> {
            HomeScreen{name -> navController.navigate(Detail(name = name))}
        }

        composable<Detail>{ backStackEntry ->
            val detail:Detail = backStackEntry.toRoute()
            DetailScreen(name = detail.name,
                navigateBack = { navController.navigateUp() },
                navigateToSettings = {navController.navigate(Settings(it))})
        }

        composable<Settings>(typeMap = mapOf(typeOf<SettingInfo>() to createNavType<SettingInfo>())) { backStackEntry ->
            val settings:Settings = backStackEntry.toRoute()
            SettingScreen(settings.info)
        }
    }


}