package com.guanhong.tddpractice

class Math {

    fun addTwoNum(num1: Int, num2: Int): Int {

        return num1 + num2
    }

    fun getMin(num1: Int, num2: Int): Int {

        return if (num1 < num2) {
            num1
        } else {
            num2
        }
    }

    fun findComplement(num: Int): Int {

        val binary = decimalTransToBinary(num)

        var binaryReverse = ""

        for (c in binary) {

            when (c) {
                '0' -> {

                    binaryReverse += "1"
                }
                '1' -> {

                    binaryReverse += "0"
                }
                else -> {
                }
            }
        }

        return binaryTransToDecimal(binaryReverse)
    }

    fun binaryTransToDecimal(num: String): Int {

        var answer = 0

        for (i in 0 until num.count()) {

            answer += num[i].toString().toInt() * calculateRoot(2, num.count() - i - 1)
        }

        return answer
    }

    fun calculateRoot(num: Int, rootNum: Int): Int {

        var answer = 1

        for (i in 0 until rootNum) {

            answer *= num
        }

        return answer
    }

    fun decimalTransToBinary(num: Int): String {

        var temp = num
        var answer = ""

        while (temp / 2 > 0) {

            answer = "" + (temp % 2) + answer

            temp /= 2
        }
        answer = "" + (temp % 2) + answer
        return answer
    }
}