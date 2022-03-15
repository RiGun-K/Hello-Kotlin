package com.example.hellokotlin

/*
    정수형 숫자 2개를 받아서 생성자에서 변수 x,y를 초기화 하고
    (x,y)의 형식으로 출력하는 Position 클래스를 선언하고 그 객체를 2개이상 생성하라.
 */
class Position(n1:Int, n2:Int) {
    var x=n1
    var y=n2
    init{
        println("($x, $y)")
    }
}

fun main() {
    val p1 = Position(0,0)
    val p2 = Position(10,10)
}
