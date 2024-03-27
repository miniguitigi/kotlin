fun main() {
    val frutas = listOf("maça", "abacaxi", "banana", "cereja")

    println(frutas[2])

    println("Primeiro: ${frutas.first()}");

    println("Última: ${frutas.last()}");

    println("Quantas frutas: ${frutas.size}")

    val paises = mutableListOf("Chile", "Mexico", "Argentina")

    paises.add("Uruguai");
    println(paises)

    // Listof() > cria uma lista somente de leitura, não add, remove ou edita
    //mutableListOf() > cria uma lista de leitura e escrita, ou seja, podemos alterar os seus elementos avontade
    // remove por valor ou por posição

    paises.add("Bolivia")

    paises.remove("Argentina")
    paises.removeAt(0)
    println(paises)

    frutas.forEach {
        println(it)
    }

    frutas.forEach { frutaDaVez ->
        println(frutaDaVez)
    }

    frutas.forEachIndexed { i, fruta ->
        println("Fruta $i - $fruta")

    }

    val contagem1= frutas.count() {it.contains("b")}
    println(contagem1)

    println(paises)
    paises.sort()
    println(paises)

    val listaLoka = mutableListOf(22,1,9,7,15)

    listaLoka.sort()
    println(listaLoka)

    listaLoka.sortDescending();

    println(listaLoka)

    
}