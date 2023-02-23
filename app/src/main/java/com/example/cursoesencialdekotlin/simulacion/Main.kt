package com.example.cursoesencialdekotlin.simulacion

fun main() {

    var isLoggedIn = false
    val verificar = arrayOf("John","1234")
    var respuesta = false
    var i=3
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
            isLoggedIn = true
        }else{
            i--
            println("Usuario o contraseña incorrecta \n te quedan ($i) intentos")
        }
        if(i==0){
            println("Se te acabaron los intentos, contactese con el administrador")
            i=-1
        }
    }while (i > 0 && !isLoggedIn)







}