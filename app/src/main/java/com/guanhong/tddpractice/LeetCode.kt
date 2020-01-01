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

        for ((index, i) in (unsortedSubarrayFirstIndex..unsortedSubarrayLastIndex).withIndex()) {

            intArray[index] = nums[i]
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

    /**
     * 414
     */
    fun thirdMax(nums: IntArray): Int {

        if (nums.count() == 0) return 0
        val removeDuplicateElementArray = removeDuplicateElement(nums)
        if (removeDuplicateElementArray.count() < 3) return removeDuplicateElementArray.max()!!

        return recursiveThirdMax(removeDuplicateElementArray, 0)
    }

    fun recursiveThirdMax(nums: IntArray, recursiveTime: Int): Int {

        if (recursiveTime == 2) return nums.max()!!

        val mutableListOf = mutableListOf<Int>()

        for (i in 0 until nums.count()) {

            if (nums[i] != nums.max()) {

                mutableListOf.add(nums[i])
            }
        }

        return recursiveThirdMax(mutableListOf.toIntArray(), recursiveTime + 1)
    }

    fun removeDuplicateElement(nums: IntArray): IntArray {

        val mutableMap = mutableMapOf<Int, Int>()

        for (element in nums) {
            mutableMap[element] = element
        }

        val intArray = IntArray(mutableMap.count())

        var index = 0
        for (mutableEntry in mutableMap) {

            intArray[index] = mutableEntry.value
            index++
        }

        return intArray
    }

    /**
     * 728
     */
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {

        val answerList = mutableListOf<Int>()

        for (num in left..right) {

            if (num > 0) {

                val numToString = num.toString()
                var isSelfDividingNumber = true

                for (char in numToString) {

                    val charToInt = char.toInt() - 48

                    if (charToInt == 0) {

                        isSelfDividingNumber = false
                        break
                    }

                    if (charToInt != 0 && num % charToInt != 0) {

                        isSelfDividingNumber = false
                        break
                    }
                }

                if (isSelfDividingNumber) {

                    answerList.add(num)
                }
            }
        }

        return answerList
    }
}