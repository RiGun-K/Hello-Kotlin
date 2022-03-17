package com.example.hellokotlin

/* Overriding methods */

//
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