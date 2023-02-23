package com.example.cursoesencialdekotlin.funciones

fun main() {

    val isValid = isValid(5) {
        it > 4
    }
    println(isValid)

}

fun isValid(x: Int, validate: (x: Int) -> Boolean): Boolean = validate(x)


fun consultProductId(){
    //BD
    // Api
    val productId = "WERT123"
}
