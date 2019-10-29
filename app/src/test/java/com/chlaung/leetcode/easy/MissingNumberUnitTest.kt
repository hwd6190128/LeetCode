package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: MissingNumberUnitTest
 * @Description: UnitTest for LeetCode 268. Missing Number
 *              [https://leetcode.com/problems/missing-number/]
 * @Date: 2019-08-26 15:29
 */
class MissingNumberUnitTest {

    private var mMissingNumber: MissingNumber = MissingNumber()

    /** Example 1 */
    @Test
    fun missingNumber_Test01() {
        val nums = intArrayOf(3, 0, 1)
        val result = mMissingNumber.missingNumber(nums)
        val result2 = mMissingNumber.missingNumber2(nums)

        val expected = 2
        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
    }

    /** Example 2 */
    @Test
    fun missingNumber_Test02() {
        val nums = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)
        val result = mMissingNumber.missingNumber(nums)
        val result2 = mMissingNumber.missingNumber2(nums)

        val expected = 8
        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
    }

    /** Example 3 */
    @Test
    fun missingNumber_Test03() {
        val nums = intArrayOf(0)
        val result = mMissingNumber.missingNumber(nums)
        val result2 = mMissingNumber.missingNumber2(nums)

        val expected = 1
        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
    }

    /** Example 4 */
    @Test
    fun missingNumber_Test04() {
        val nums = intArrayOf(0, 1)
        val result = mMissingNumber.missingNumber(nums)
        val result2 = mMissingNumber.missingNumber2(nums)

        val expected = 2
        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
    }

    /** Example 5 */
    @Test
    fun missingNumber_Test05() {
        val nums = intArrayOf(0, 1, 2)
        val result = mMissingNumber.missingNumber(nums)
        val result2 = mMissingNumber.missingNumber2(nums)

        val expected = 3
        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
    }
}