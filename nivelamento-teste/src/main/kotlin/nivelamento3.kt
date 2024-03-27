fun main() {

}

//função sem parametros e nem retorno
fun cumprimentar() {
    println("Olá, bem vindos")

}

//Função com 1 parametro
fun bomDia(quem:String){
    println("Bom dia $quem")
}

//Função com 2 parametros e sem retorno
fun boaTarde(quem:String, temperatura:Double){
    println("Boa tarde, $quem. Temp: $temperatura")
}

//Função com um parametro e com retorno
fun boaNoite(quem: String) : String{
    println("Executando a funçõ")

    return "Olá $quem. Durma com os anjos e sonhe comigo. Um dia vai dormir comigo e sonhar com os anjos."
}
