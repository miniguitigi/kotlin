package com.example.projeto05

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projeto05.ui.theme.Projeto05Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projeto05Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tela(rememberNavController())
                }
            }
        }
    }
}

@Composable
fun Tela(navController: NavHostController, modifier: Modifier = Modifier) {
    Column {
        NavHost(
            modifier= modifier,
            navController = navController,
            startDestination = "UVA"
        ){
            composable("UVA"){
                TelaFruta1(9.50)
            }
            composable("KIWI"){
               TelaFruta2()
            }
            composable("LARANJA"){
                TelaFruta3()
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Row {
            Card(modifier = Modifier.weight(1f)) {
                TextButton(onClick = {navController.navigate("UVA")}) {
                    Image(painter = painterResource(id = R.mipmap.uva), contentDescription = "Tela da uva")
                }

            }
            Card(modifier = Modifier.weight(1f)) {
                TextButton(onClick = {  navController.navigate("KIWI")}) {
                    Image(painter = painterResource(id = R.mipmap.kiwi), contentDescription = "Tela do kiwi")
                }

            }
            Card(modifier = Modifier.weight(1f)){
                TextButton(onClick = {navController.navigate("LARANJA")}) {
                    Image(painter = painterResource(id = R.mipmap.laranja), contentDescription = "Tela da Laranja")
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Projeto05Theme {
        Tela(rememberNavController())
    }
}