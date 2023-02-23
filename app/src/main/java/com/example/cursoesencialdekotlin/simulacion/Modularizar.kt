package com.example.cursoesencialdekotlin.simulacion


    fun main() {

        // Greeting:  Hello, Hi, Welcome, Good Morning, Hallo
        val greetings = arrayOf("Hello", "Hi", "Welcome", "Good Morning", "Hallo")
        // Introduction: my name is, you can call me, I use named, I'm
        val introductions = arrayOf("my name is", "you can call me", "I use named", "I'm")
        // Name
        val names = arrayOf("Ann", "Anahi", "anncode", "Irene", "Ani")

        val phrase = "${greetings[random(greetings)]} ${introductions[random(introductions)]} ${names[random(names)]}"
        println(phrase)
    }

fun random(array: Array<String>) : Int{
    val rand =(Math.random() * array.size).toInt()

    return rand
}

/*fun main() {

    // Greeting:  Hello, Hi, Welcome, Good Morning, Hallo
    val greetings = arrayOf("Hello", "Hi", "Welcome", "Good Morning", "Hallo")

    // Introduction: my name is, you can call me, I use named, I'm
    val introductions = arrayOf("my name is", "you can call me", "I use named", "I'm")

    // Name
    val names = arrayOf("Ann", "Anahi", "anncode", "Irene", "Ani")

    val randIndexGreeting = (Math.random() * greetings.size).toInt()
    val randIndexIntro = (Math.random() * introductions.size).toInt()
    val randIndexSize = (Math.random() * names.size).toInt()

    val greeting = greetings[randIndexGreeting]

    val phrase = "$greeting ${introductions[randIndexIntro]} ${names[randIndexSize]}"

    println(phrase)
}*/
