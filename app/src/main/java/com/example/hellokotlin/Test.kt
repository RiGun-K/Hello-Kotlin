package com.example.hellokotlin

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun main(){
    println("Hello")
    println(sum(2,3))
    println(sum2(3,5))

    // null 허용하는 변수선언시 타입 이름뒤에 ? 사용
    val str:String? = "ABC"
    println(str?.length)

    val str2:String? = null
    println(str2?.length)
}