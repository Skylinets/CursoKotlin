package com.example.cursoesencialdekotlin.arrays

fun main() {

    // Saludo + introduccion + Nombres
    // Saludo : hola,  hi, bienvenido, buenos días, hallo
    //Introduccion : Mi nombre es, Puedes llamarme, Usualmente me llaman, Yo soy
    //Nombres : John, Hansen, Johny


    val greetings = arrayOf("Hola", "Hi", "Bienvenido", "Buenos días", "Hallo")

    val introductions = arrayOf("mi nombre es", "puedes llamarme", "usualmente me llaman", "yo soy")
    val names = arrayOf("John", "Hansen", "Johny")

    val randIndexGreeting = (Math.random() * greetings.size).toInt()
    val randIndexIntroduction = (Math.random() * introductions.size).toInt()
    val randIndexNames = (Math.random() * names.size).toInt()


    val phrase = "${greetings[randIndexGreeting]} ${introductions[randIndexIntroduction]} ${names[randIndexNames]}"
    println(phrase)

}