package com.example.hellokotlin

// P34
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

// P37
class Student2(var id:String, year:Int){
    lateinit var name:String
    var entranceYear2:Int = 0
        set(year) {
            if(year < 1950) field = 1950
            else field = year
        }
    init {
        entranceYear2 = year
    }
    constructor(id:String, name:String, year:Int):this(id, year){
        this.name = name
    }
    fun initName(n:String){
        name = n
    }
    override fun toString():String{
        if(::name.isInitialized)
            return "$id, $name, $entranceYear2"
        else
            return "$id, $entranceYear2"
    }
}

fun main4(){
    val s = Student2("123", 2020)
    println(s)
    s.initName("ABC")
    println(s)
}