package com.guanhong.tddpractice

class LeetCode {

    /**
     * 581
     */
    fun findUnsortedSubarray(nums: IntArray): Int {

        if (nums.count() == 0) return 0
        if (nums.count() == 1) return 0

        val minIndexOfArray = nums.indexOf(nums.min()!!)
        val maxIndexOfArray = nums.lastIndexOf(nums.max()!!)

        val isMinNumArrayFirst = minIndexOfArray == 0
        val isMaxNumArrayLast = maxIndexOfArray == nums.count() - 1

        if (!isMinNumArrayFirst && !isMaxNumArrayLast) {

            return nums.count()
        }

        val unsortedSubarrayFirstIndex = if (isMinNumArrayFirst) {

            1
        } else {
            0
        }

        val unsortedSubarrayLastIndex = if (isMaxNumArrayLast) {

            nums.count() - 2
        } else {
            nums.count() - 1
        }

        val intArray = IntArray(
            if (isMinNumArrayFirst && isMaxNumArrayLast) {
                nums.count() - 2
            } else {
                nums.count() - 1
            }
        )

        for (i in unsortedSubarrayFirstIndex until unsortedSubarrayLastIndex) {

            intArray[i - 1] = nums[i]
        }

        return findUnsortedSubarray(intArray)
    }

    /**
     * 476
     */
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

}