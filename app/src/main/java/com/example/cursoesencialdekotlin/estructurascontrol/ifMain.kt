package com.example.cursoesencialdekotlin.estructurascontrol

fun main() {

    val isLoggedIn = true
    val hasAddress = false


    //if user is Logged in
    //if hasAddress
    //Mostrar lista de direcciones

    //!hasAddress
      //El usuario no tiene direccion
    //user is not logged in
      //usuario no logeado


    if (isLoggedIn){
        println("Usuario está logueado")

        if(hasAddress){
            println("Mostrar lista de direcciones")
        } else{
            println("El usuario no tiene direcciones")
        }
    } else {
        println("Usuario no logueado")
    }


    val userLoggedInStatus = if(isLoggedIn) "Logueado" else "No Logueado"

    println(" Usuario :  $userLoggedInStatus")

}