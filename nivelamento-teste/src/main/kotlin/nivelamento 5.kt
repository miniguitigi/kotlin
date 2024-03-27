fun main() {
    var idade = 15;
    val resultado = if(idade >= 15) "pode namorar" else "não pode"

    idade = 222;

    //para execução de instruções
    when (idade){
        in 0..1 -> println("bebê")
        2 -> println("criancinha")
        10 -> {println("pré-adolescente")
                println("vai se preparando")
                println("Muitas espinhas")
        }
        in 19..89 -> println("adulto")
        90 -> println("idoso")
        else -> println("Idade inválida")

    }

    val gols = 6;

    val tipo = when (gols){
        0 -> "péssimo"
        in 1..2 -> "meia boca"
        in 3..5 -> "bom"
        in 6..Int.MAX_VALUE -> "õtimo"
        else-> "valor inválido"
    }

    println(tipo)
}