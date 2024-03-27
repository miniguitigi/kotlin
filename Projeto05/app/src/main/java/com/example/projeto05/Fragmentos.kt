package com.example.projeto05

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp


@Composable
fun TelaFruta1(preco: Double){

    Text("Eu sou uma uva que custa R$preco",
        style = TextStyle(fontSize = 35.sp,
            color = Color.Blue
        ))
}


@Composable
fun TelaFruta2(){
    Text("Eu sou um kiwi",
        style = TextStyle(fontSize = 35.sp,
            color = Color.Magenta
        ))
}

@Composable
fun TelaFruta3(){
    Text("Eu sou uma laranja",
        style = TextStyle(fontSize = 35.sp,
            color = Color.Green
        ))
}