package com.example.projeto06

import com.google.gson.annotations.SerializedName

data class Filme(
    var id:Int?=null,
    var nome:String ? =null,
    @field:SerializedName("custo_producao") var custoProducao:Double? = null
){}
