package com.example.cursoesencialdekotlin.estructurascontrol

fun main() {

    val greetings = arrayOf("Hola", "Bienvenido","Hi","Buenos días", "Hallo")

    greetings[0]
    greetings[1]
    greetings[2]
    greetings[3]
    greetings[4]

    var i = 0
    while(i <= greetings.size - 1){
        println(greetings[i])
        i++ //5
    }
    println("")

    var j = 0
    do{
        val greeting =greetings[j]
        j++
        println(greeting)
    }while (greeting.length > 2 && j < greetings.size - 1 )
    println("Continuando...")


    var k=0
    while(k < greetings.size -1){
        val greeting = greetings[k]
        println(greeting)
        k++
        if (greeting.length <= 2 ) continue
        println("Continunando en el While")
    }
    println("Termino WHILE")


}