package com.example.cursoesencialdekotlin.funciones

fun main() {
    //"My Fabulous App"
    // "Welcome to the best experience"
    // "John Hansen"

    //"**** My Fabulous App ****"
    // "* * Welcome to the best experience * *"
    // "* John Hansen *"

    val appName = "My Fabulous App"
    val appNameFormater = addStarsFormat(appName,5)

    println(appNameFormater)
    val welcome =  "Welcome to the best experience"
    println(addStarsFormat(welcome,3))

    val name =  "John Hansen"
    println(addStarsFormat(name))

}


fun addStarsFormat(text: String, starsNumber : Int) : String{

    val textBuilder = StringBuilder(text)
    textBuilder.insert(0, " ")
    textBuilder.insert(textBuilder.length, " ")
    for (i in 0 until starsNumber){
        textBuilder.insert(0,"*")
        textBuilder.insert(textBuilder.length, "*")
    }
    return textBuilder.toString()
}


fun addStarsFormat(text : String) : String = addStarsFormat(text , 2)
