package com.example.cursoesencialdekotlin.funciones

fun main() {

    val welcome = getWelcomeText()

    println(cleanText(welcome))
}

private fun getWelcomeText() = "** Welcome to the best experience **"

fun cleanText(text: String): String =text
    .removePrefix(prefix = "**")
    .removeSuffix("**")
    .trim()