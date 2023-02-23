package com.example.cursoesencialdekotlin.funciones

fun main() {

    val user = "John"

showWelcomeMessage("Hola")
showWelcomeMessage("Hi")
showWelcomeMessage("Buenos días")

    //Buenos días John
showWelcomeMessage("Welcome", user = user)


}

 fun showWelcomeMessage(text : String, user: String = ""){
     val  message = "$text $user".trim()
     println(message)
}