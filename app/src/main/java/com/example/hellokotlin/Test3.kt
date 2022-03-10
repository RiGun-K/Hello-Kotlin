package com.example.hellokotlin

// if 문 실습
fun test1(){
    val val1 = (1..5).random()
    val val2 = (1..5).random()
    if(val1>val2) print("$val1 > $val2")
    else print("$val2 > $val1")
}

fun test2(){
    val value = (1..5).random()
    val absValue = if (value < 0) value*-1 else value
    println("value=${value}, abs=${absValue}")
}

// When 문 실습

fun test3() {


}

fun main(){
    test1()
    test2()
}

