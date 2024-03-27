package apps

import Boletim
import Carro
import Heroi

fun main() {
    val meuCarro = Carro();

    println(meuCarro.fabricacao)
    meuCarro.fabricante = "fiat"

    println(meuCarro.fabricante)

    val meuBoletim = Boletim("XYZ", 9.5,8.5);
    println(meuBoletim.nota1)

    println(meuBoletim)

    val heroi1 = Heroi("Superman", "Clark", mutableListOf("Voar, Super forca"))

    val heroi2 = Heroi("Superman", "Clark", mutableListOf("Voar, Super forca"))


}