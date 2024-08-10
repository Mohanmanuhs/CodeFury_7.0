package com.hackathon.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


val txtHintColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color.LightGray else Color.DarkGray


val txtColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color.White else Color.Black
val rowBgColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF1B1F23) else Color.White

val backgroundColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color.Black else Color(0xFFECECEC)