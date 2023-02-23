package com.example.cursoesencialdekotlin.simulacion

fun main() {
    val temperatura = 18;
    val number = 21.rangeTo(30)
    val grados = when{
        temperatura <= 20 -> "Usar un Abrigo hace frío"
        temperatura in number-> "Te irá bien si usas una Chaqueta, el clima es templado"
        temperatura > 30  -> "Es mejor que lleves algo ligero, hace calor"
        else -> "Mejor quedate en casa"

   }

    println("Recomendación de hoy : $grados")
}