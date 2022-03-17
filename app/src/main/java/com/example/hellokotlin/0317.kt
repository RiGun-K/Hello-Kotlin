package com.example.hellokotlin

/* Overriding methods */

// Position 클래스에 printValue 함수를 추가하라. 함수는 (x,y) 형태로 값을 출력한다.
// TPosition 클래스에서는 printValue 함수를 override 하여 (x,y,z)의 형태로 값이 출력되도록 한다.

open class Position3(var x:Int, var y:Int) {
    constructor(n:Int):this(n,n)
    open fun printValue() {
        println("($x, $y)")
    }
}

class TPosition4(x: Int, y:Int, var z:Int): Position3(x, y){
    override fun printValue(){
        println("($x, $y, $z)")
    }
}

fun main(){
    val p = Position3(1,1)
    p.printValue()
    val t = TPosition4(0,0,0)
    t.printValue()
}

// Position 클래스에 dimension 값을 추가하고 2로 초기화한다.
// TPosition 클래스는 해당 값을 override 하여 3으로 초기화
// 각각의 printValue 함수에서 좌표 출력전에 해당 값을 출력하도록 수정

open class Position4(var x: Int, var y: Int) {
    open val dimension = 2
    constructor(n:Int):this(n, n)
    open fun printValue(){
        println("${dimension}D - ($x, $y)")
    }
}

class TPosition5(x:Int, y:Int, var z:Int): Position4(x, y) {
    override val dimension = 3
    override fun printValue(){
        println("${dimension}D - ($x, $y, $z)")
    }
}

fun main3(){
    val p = Position4(1,1)
    p.printValue()
    val t = TPosition5(0,0,0)
    t.printValue()
}


