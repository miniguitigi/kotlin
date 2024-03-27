fun main() {
    println("É nois no kotlin")
    println("Ai sim, mano!")

    //Tipagem dinâmica, a linguagem infere o tipo do cvalor
    var cidade = "São Paulo"
    var populacao = 10_000_000

    // Tipagem estática
    var clube:String = "Palmeiras"
    var torcedores:Int = 3_000_000
    var patrimonio: Double = 35_000_000.55
    var temMundial:Boolean = false;

    cidade = "campinas"

    val cpf = "46927015876"
    val saborPizza = "4 queijos"

    // Val é imutável, é mais performática

    println("Em $cidade moram $populacao pessoas")
//    println("Em${cidade.uppercase()} moram ${populacao*2} pessoas")

    val idadeStr = "33"
    val pesoStr = "80.5"

    // Metodos de conversão embarcados
//    val idade:Int = idadeStr.toInt()
//    val peso:Double = pesoStr.toDouble()

    






}