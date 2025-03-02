package com.dartbyte.navigationapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.dartbyte.navigationapp.core.navigation.SettingInfo

@Composable
fun SettingScreen(settingInfo: SettingInfo){
    Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "SETTING SCREEN ", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f))
        Text(text = settingInfo.name)
        Text(text = settingInfo.id.toString())
        Text(text = settingInfo.darkMode.toString())
        Spacer(modifier = Modifier.weight(1f))
    }
}