package com.chlaung.leetcode.easy

/**
 * @ClassName: SumOfTwoIntegers
 * @Description: 371. Sum of Two Integers
 *
 *               Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * @Date: 2019-10-23 16:15
 */
class SumOfTwoIntegers {

    fun getSum(a: Int, b: Int): Int {
        return if (b == 0) a else getSum(a xor b, (a and b) shl 1)
    }
}