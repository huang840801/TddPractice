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

    fun sortArrayMaxToMin(list: IntArray): IntArray {

        return list.sortedDescending().toIntArray()
    }
}