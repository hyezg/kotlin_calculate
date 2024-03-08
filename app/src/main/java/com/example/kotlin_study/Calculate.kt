package com.example.kotlin_study


fun main() {
    while(true) {
        val addcal = AddOperation()
        val subcal = SubstractOperation()
        val multical = MultiplyOperation()
        val divical = DivideOperation()

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
            1 -> addcal.calculate(num1,num2)
            2 -> subcal.calculate(num1,num2)
            3 -> multical.calculate(num1,num2)
            4 -> divical.calculate(num1,num2)
            else -> throw IllegalAccessException("1~4까지 범위안의 숫자를 입력해야합니다.")
        }
    }
}

open class Calculator() {
    open fun calculate(num1: Int, num2: Int){

    }

}

class AddOperation : Calculator() {
    override fun calculate(num1: Int, num2: Int)  {
        println("num1+num2 = ${num1+num2}")
    }
}

class SubstractOperation : Calculator() {
    override fun calculate(num1: Int, num2: Int) {
        println("num1-num2 = ${num1-num2}")
    }
}
class MultiplyOperation : Calculator() {
    override fun calculate(num1: Int, num2: Int) {
        println("num1*num2 = ${num1*num2}")
    }
}
class DivideOperation : Calculator() {
    override fun calculate(num1: Int, num2: Int) {
        println("num1/num2 = ${num1/num2}")
    }
}



