package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: SumOfTwoIntegersUnitTest
 * @Description: UnitTest for LeetCode 371. Sum of Two Integers
 *              [https://leetcode.com/problems/sum-of-two-integers/]
 * @Date: 2019-10-23 16:18
 */
class SumOfTwoIntegersUnitTest {

    private lateinit var mSumOfTwoIntegers: SumOfTwoIntegers

    @Before
    fun initTest() {
        mSumOfTwoIntegers = SumOfTwoIntegers()
    }

    @Test
    fun sumOfTwoIntegers_Test01() {
        val a = 1
        val b = 2
        val result = mSumOfTwoIntegers.getSum(a, b)

        val expected = 3
        Assert.assertEquals(expected, result)
    }

    @Test
    fun sumOfTwoIntegers_Test02() {
        val a = -2
        val b = 3
        val result = mSumOfTwoIntegers.getSum(a, b)

        val expected = 1
        Assert.assertEquals(expected, result)
    }
}