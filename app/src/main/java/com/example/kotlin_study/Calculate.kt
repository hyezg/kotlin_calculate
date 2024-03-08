package com.example.kotlin_study


fun main() {
    while(true) {
        var num1: Int = readLine()!!.toInt()
        var num2: Int = readLine()!!.toInt()
        var op: Int = readLine()!!.toInt()

        var cal = Calculator()

        if(num1 == -1 || num2 ==-1){
            println("예외")
            break
        }

        var result = when(op) {
            1 -> AddOperation().calculate(num1,num2,op)
            2 -> SubstractOperation().calculate(num1,num2,op)
            3 -> MultiplyOperation().calculate(num1,num2,op)
            4 -> DivideOperation().calculate(num1,num2,op)
            else -> throw IllegalAccessException("예외")
        }
        println("${result}")
    }
}


open class Calculator() {
    open fun calculate(num1: Int, num2: Int, op: Int): Int {
        return 0
    }

}

class AddOperation : Calculator() {
    override fun calculate(num1: Int, num2: Int, op: Int): Int {
        return num1+num2
    }
}

class SubstractOperation : Calculator() {
    override fun calculate(num1: Int, num2: Int, op: Int): Int {
        return num1-num2
    }
}
class MultiplyOperation : Calculator() {
    override fun calculate(num1: Int, num2: Int, op: Int): Int {
        return num1*num2
    }
}
class DivideOperation : Calculator() {
    override fun calculate(num1: Int, num2: Int, op: Int): Int {
        return num1/num2
    }
}



