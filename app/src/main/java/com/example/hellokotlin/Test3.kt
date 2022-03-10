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
    val number = (-1..1).random()
    when(number) {
        0 ,1 -> println("$number - pass")
        -1 -> println("$number - fail")
    }

}

fun test4() {
    val score = (0..100).random()
    val grade = when(score){
        in 90..100 -> "A"
        in 80..90 -> "B"
        in 70..80 -> "C"
        in 60..70 -> "D"
        else -> "F"
    }
    println("Score:$score, Grade:$grade")
}

fun test5() {
    val test_5 = (-1..1).random()
    val str = when(test_5) {
        -1 -> "negative"
        0 -> "zero"
        else -> "positive"
    }
    println(str)
}

fun test6() {
    val array = arrayOf(1, 2, 3, "a", "b", "c")
    array.forEach { it -> when(it){
        is String -> println("$it is a String")
        else -> println("$it is a Integer")
        }
    }
}

fun main(){
//    test1()
//    test2()
//    test3()
//    test4()
//    test5()
    test6()
}

