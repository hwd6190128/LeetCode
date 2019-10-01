package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: TwoSumUnitTest
 * @Description: UnitTest for LeetCode 1. Two Sum
 *              [https://leetcode.com/problems/two-sum/]
 * @Date: 2019-10-01 10:49
 */
class TwoSumUnitTest {

    private lateinit var mTwoSum: TwoSum

    @Before
    fun initTest() {
        mTwoSum = TwoSum()
    }

    /** Example 1 */
    @Test
    fun twoSum_Test01() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = mTwoSum.twoSum(nums, target)

        val expected = intArrayOf(0, 1)
        Assert.assertArrayEquals(expected, result)
    }
}