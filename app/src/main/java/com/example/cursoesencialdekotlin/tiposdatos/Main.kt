package com.example.cursoesencialdekotlin.tiposdatos

fun main() {

    // Byte -127 a 128
    val age : Byte =20
    val newAge : Byte =127

    //Int
    val productId = 2147483747
    val productId2 : Int = 2_147_483_647
    //val productId3 : Int = 2_147_483_647


    //Long
    // 9 trillones

    val userId : Long = 9_223_372_036_854_775_807
    val userId2  = 9_223_372_036_854_775_807L
    val myDouble = 2.12345678911234567 //18
    val myFloat = 2.12345678911234567F

    println(myDouble)
    println(myFloat)

    val isLoggedIn = true
    val hasAddress = false

    println(isLoggedIn && hasAddress)
    println(isLoggedIn.and(hasAddress))
    println(isLoggedIn and hasAddress)
    println(!isLoggedIn) // false
    println(isLoggedIn.not())

   /* val keyInserted = 'a'
    println(keyInserted)
    println('\$')*/

    val firstname = "John"
    val lastname = "hansen"
    val fullName = "NAME : $firstname $lastname"
    println(fullName)


}




