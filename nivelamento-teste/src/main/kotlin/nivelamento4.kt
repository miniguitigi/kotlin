import kotlin.math.pow

fun main() {
    println("potencia: ${potencia(2.0,3.0)}")
    println("potencia: ${potencia(2.0)}")

}

    fun potencia(base:Double, potencia:Double = 3.0): Double{
        return base.pow(potencia);

    }
