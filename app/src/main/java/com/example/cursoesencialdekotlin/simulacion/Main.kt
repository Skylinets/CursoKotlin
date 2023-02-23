package com.example.cursoesencialdekotlin.simulacion

fun main() {

    val isLoggedIn = true
    val verificar = arrayOf("John","1234")
    var respuesta = false
    var i=0
    do {
        print("Ingrese Usuario :")
        val user = readLine()
        print("Ingrese Contraseña :")
        val pass = readLine()

        respuesta = when(verificar){
            verificar-> user.equals("John")
            verificar-> pass.equals("1234")
            else -> false
        }
        if(respuesta){
            print("Bienvenido $user")
        }else{
            println("Usuario o contraseña incorrecta")
        }
        i++
    }while (isLoggedIn && verificar.size <= i)





}