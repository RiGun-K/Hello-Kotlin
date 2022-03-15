package com.example.hellokotlin

/* for 문 실습 */

// 2 ~ 9 사이의 값을 random 으로 생성한 뒤 for 문을 이용하여 해당 단의 구구단을 출력하라.
fun test7() {
    val dan = (2..9).random()
    for(i in 1..9){
        println("$dan x $i = ${dan*i}")
    }
}

fun test8() {
    val array = Array(5) { it+1 }
    for((index, value) in array.withIndex()){
        println("[${index}] $value")
    }

    // val array = intArrayOf(1, 2, 3, 4 ,5) 과도 같음
}

/* while 문 실습 */

/* 1. -5에서 5 사이의 수를 random 으로 생성
   2. 생성된 수를 출력하고 양수가 아닌 경우 양수가 나올 때 까지 생성
   3. 생성된 양수를 출력
 */

fun test9() {
    var value:Int
    do{
        value=(-5..5).random()
        print("$value")
    }while(value < 1)
    println("\n$value")
}

/* return 문 실습 */

// 기본 break 문 : 가장 가까운 반복문이 종료, 외부 for 문은 종료 X
fun test10() {
    for(i in 1..3){
        for(j in 5..7){
            print("$i x $j = ${i*j}")
            if(i*j > 10){
                println("->break")
                break
            } else
                println()
        }
    }
}

// label break 문 : label 이 붙은 반복문을 종료
fun test11() {
    loop@ for(i in 1..3){
        for(j in 5..7){
            print("$i x $j = ${i*j}")
            if(i*j > 10){
                println("->break")
                break@loop
            } else
                println()
        }
    }
}


fun main() {
//    test7()
//    test8()
//    test9()
//    test10()
    test11()
}
