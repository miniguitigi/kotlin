package com.example.projeto06

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projeto06.ui.theme.Projeto06Theme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projeto06Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tela("Android")
                }
            }
        }
    }
}

@Composable
fun Tela(name: String, modifier: Modifier = Modifier) {

    val filmes = remember { mutableStateListOf<Filme>() }

    val erroApi= remember {mutableStateOf("")}

    Column {
        if(erroApi.value.isNotBlank()){
            Text(erroApi.value, color= Color.Red)
        }
    }
    if(filmes.isEmpty()){
        TextButton(onClick = {
            atualizarFilme(filmes,erroApi)
        }) {
            Text("Sem filmes - clique para atualizar")
        }

    } else{
        LazyColumn(modifier = Modifier.verticalScroll(rememberScrollState()).height(200.dp)){
            items(items =filmes.toList()){
                Text("Filme ${it.nome}. Custo: ${it.custoProducao}")
            }
        }

    }
}


fun atualizarFilme(
    filmes:MutableList<Filme>,
    erroApi: MutableState<String>
){
    val apiFilmes = RetrofitService.getApiFilmesService()
    val get = apiFilmes.get()

    get.enqueue(object : Callback<List<Filme>>{
        override fun onResponse(call: Call<List<Filme>>, response: Response<List<Filme>>) {
            if(response.isSuccessful){
                val corpoResposta = response.body()
                if(corpoResposta != null){
                    filmes.clear()
                    filmes.addAll(corpoResposta)
                }
            } else{
                erroApi.value = response.errorBody()!!.string()
            }


        }

        override fun onFailure(call: Call<List<Filme>>, t: Throwable) {
            TODO("Not yet implemented")
        }
    })

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Projeto06Theme {
        Tela("Android")
    }
}