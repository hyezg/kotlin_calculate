package com.example.kotlin_study


fun main() {
    while(true) {
        val cal = Calculator()

        println("num1을 입력하세요.")
        val num1: Int = readLine()!!.toInt()
        if(num1 == -1) {
            println("-1을 입력해 중단되었습니다.")
            break
        }

        println("num2을 입력하세요.")
        val num2: Int = readLine()!!.toInt()
        if(num2 == -1) {
            println("-1을 입력해 중단되었습니다.")
            break
        }

        println("연산을 선택하세요 [+ : 1], [- : 2], [* : 3], [/ : 4] 입니다.")
        val op: Int = readLine()!!.toInt()

        when(op) {
            1 -> AddOperation().add(num1,num2,op)
            2 -> SubstractOperation().sub(num1,num2,op)
            3 -> MultiplyOperation().mul(num1,num2,op)
            4 -> DivideOperation().div(num1,num2,op)
            else -> throw IllegalAccessException("1~4까지 범위안의 숫자를 입력해야합니다.")
        }
    }
}

open class Calculator {
    open fun calculate(num1: Int, num2: Int, op: Int): Int {
        return 0
    }
}


class AddOperation : Calculator() {
    fun add(num1: Int, num2: Int, op :Int) : Int {
        return num1+num2
    }
}

class SubstractOperation : Calculator() {
    fun sub(num1: Int, num2: Int, op :Int) : Int {
        return num1-num2
    }
}
class MultiplyOperation : Calculator() {
    fun mul(num1: Int, num2: Int, op :Int) : Int {
        return num1*num2
    }
}
class DivideOperation : Calculator() {
    fun div(num1: Int, num2: Int, op :Int) : Int {
        return num1/num2
    }
}



