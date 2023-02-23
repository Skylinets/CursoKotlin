package com.example.cursoesencialdekotlin.estructurascontrol

import kotlin.math.roundToInt

fun main() {


    val isLoggedIn = true

    when (isLoggedIn){
        true -> println("Usuario Logueado")
        false -> println("Usuario No Logueado")
    }

    println()

    //1  Logged In
    //0  Logged out
    //-1 Down
    // 10 - 20 Inactive time [10 - 20]
    val userStatus = 17
    val userStatusString = when (userStatus){
        0 -> "Logged Out"
        1 -> "Logged in"
        -1 -> "Down"
        in 10..20 ->"Inactive for $userStatus"
        else -> "Not Found"
    }
    println("Curso: $userStatusString")




    //1  Logged In
    //0  Logged out
    //-1 Down
    val userArray = arrayOf(2,1,0,"")
    val randomStatus = (Math.random() * userArray.size).toInt()
    val userStatus1 = userArray[randomStatus]
    val userStatusString1 = when (userStatus1){
        0 -> "Logged Out"
        1 -> "Logged in"
        2 -> "Down"
        else -> "Not Found"
    }
    println("\nPrueba Random Status: $userStatusString1")


    val producPrices: Any  = doubleArrayOf(15.99, 11.10, 45.99)
    val total = when (producPrices){
        is DoubleArray -> producPrices.sum().roundToInt().toString()
        is Double -> producPrices.roundToInt().toString()
        is Int ->   producPrices.toString()
        else ->   producPrices.toString()
    }
    println("Totals : $total")

    val hasAddress = false
    val user = "John"
    val message = when {
        isLoggedIn and hasAddress -> "Lista direcciones de : $user"
        isLoggedIn and !hasAddress -> "$user no tiene lista de direcciones"
        else ->""
    }
    println("message: $message")

}