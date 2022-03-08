package com.example.hellokotlin

// Test.kt 에서의 함수 sum,sum2가 선언되었으므로 중복사용 불가 !
fun sum3(first:Int=0, second:Int=0): Int{
    return first+second
}

fun main() {
    println(sum3(1,2))
    println(sum3(1))

    val arr = intArrayOf(1, 2, 3)
    arr.forEach {i -> println(i)}

    val arr2 = IntArray(3) { i -> i+10}
    arr2.forEach {i -> println(i) }

    val array = Array(5){i -> i} // i = index
    array.forEach { print("$it ") }
    println()
    println(array.any { it > 5 })
    println(array.find { it==1 })
    val filtered = array.filter { it > 2 }
    filtered.forEach{ print("$it ")}
}