package com.example.cursoesencialdekotlin.arrays

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import java.util.Locale
import kotlin.random.Random

fun main() {
flowOperatorMap()
}

fun flowOperatorMap() {
    runBlocking {
        getDataByFlow()
            .map {
                //setFormat(it)
                setFormat(convertCelsToFahr(it),"F")
            }
            .collect{
                println(it)
            }
    }
}

fun getDataByFlow(): Flow<Float>{
    return flow {
        (1..5).forEach {
            println("procesado datos ...")
            delay(2000)
            emit(20 +it + Random.nextFloat())
        }
    }
}

fun convertCelsToFahr(cels: Float): Float =
    ((cels * 9) / 5) + 32

fun setFormat(temp: Float, degree: String = "C"): String=
    String.format(Locale.getDefault(),
        "%.1f°$degree", temp)