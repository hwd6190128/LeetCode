package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: SingleNumberUnitTest
 * @Description: UnitTest for LeetCode 136. Single Number
 *              [https://leetcode.com/problems/single-number/]
 * @Date: 2019-10-24 17:58
 */
class SingleNumberUnitTest {

    private lateinit var mSingleNumber: SingleNumber

    @Before
    fun initTest() {
        mSingleNumber = SingleNumber()
    }

    @Test
    fun singleNumber_Test01() {
        val nums = intArrayOf(2, 2, 1)
        val result = mSingleNumber.singleNumber(nums)
        val result2 = mSingleNumber.singleNumber2(nums)

        val expected = 1
        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
    }

    @Test
    fun singleNumber_Test02() {
        val nums = intArrayOf(4, 1, 2, 1, 2)
        val result = mSingleNumber.singleNumber(nums)
        val result2 = mSingleNumber.singleNumber2(nums)

        val expected = 4
        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
    }

    @Test
    fun singleNumber_Test03() {
        val nums = intArrayOf(-1, -1, -2)
        val result = mSingleNumber.singleNumber(nums)
        val result2 = mSingleNumber.singleNumber2(nums)

        val expected = -2
        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
    }
}