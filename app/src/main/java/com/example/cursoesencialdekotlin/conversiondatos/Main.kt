package com.example.cursoesencialdekotlin.conversiondatos

fun main() {

    val productLowStock : Byte = 20
    val productStock : Int = productLowStock.toInt()
    println(productStock)


    val numberString = "1"
    val numberByte: Byte = numberString.toByte()
    println(" El numero en byte es : $numberByte")


    val numberDouble = numberString.toDouble()
    println(" El numero en byte es : $numberDouble")


    //☻
    val unicodeInt = 0x263B
    val unicodeChar = unicodeInt.toChar()
    val unicode = unicodeChar.toString()
    println(unicode)


       /* println("Introduce tu edad")
        val edad = readLine()
        println("Tienes $edad años")*/


}