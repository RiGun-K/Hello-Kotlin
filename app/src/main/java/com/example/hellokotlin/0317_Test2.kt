package com.example.hellokotlin

class Student(var id:String, var name:String, year:Int) {
    var entranceYear:Int = 0
        set(year) {
            if(year < 1950) field = 1950
            else field = year
        }
    init {
        entranceYear = year
    }

    override fun toString():String{
        return "$id, $name, $entranceYear"
    }
}

fun main(){
    val s = Student("123","std",1800)
    println(s)
    val s2 = Student("123","std",2020)
    println(s2)
}