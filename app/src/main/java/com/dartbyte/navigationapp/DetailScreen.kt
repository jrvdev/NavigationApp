package com.dartbyte.navigationapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.dartbyte.navigationapp.core.navigation.SettingInfo

@Composable
fun DetailScreen(name:String, navigateToSettings:(SettingInfo) -> Unit, navigateBack: () -> Unit){
    Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "DETAIL SCREEN $name", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {
            val settingInfo = SettingInfo(
                name = "Johan",
                id = 1,
                darkMode = true
            )
            navigateToSettings(settingInfo)

        } ) {
            Text(text = "Navegar a los Ajustes")
        }
        Button(onClick = { navigateBack() }) {
            Text(text = "Logout")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}