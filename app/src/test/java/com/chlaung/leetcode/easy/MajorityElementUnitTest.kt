package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: MajorityElementUnitTest
 * @Description: UnitTest for LeetCode 169. Majority Element
 *              [https://leetcode.com/problems/majority-element/]
 * @Date: 2019-08-26 15:29
 */
class MajorityElementUnitTest {

    private var mMajorityElement: MajorityElement = MajorityElement()

    /** Example 1 */
    @Test
    fun majorityElement_Test01() {
        val nums = intArrayOf(3, 2, 3)
        val expected = 3

        val result = mMajorityElement.majorityElement(nums)
        Assert.assertEquals(expected, result)

        val result2 = mMajorityElement.majorityElement2(nums)
        Assert.assertEquals(expected, result2)

        val result3 = mMajorityElement.majorityElement3(nums)
        Assert.assertEquals(expected, result3)
    }

    /** Example 2 */
    @Test
    fun majorityElement_Test02() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        val expected = 2

        val result = mMajorityElement.majorityElement(nums)
        Assert.assertEquals(expected, result)

        val result2 = mMajorityElement.majorityElement2(nums)
        Assert.assertEquals(expected, result2)

        val result3 = mMajorityElement.majorityElement3(nums)
        Assert.assertEquals(expected, result3)
    }

    /** Example 3 */
    @Test
    fun majorityElement_Test03() {
        val nums = intArrayOf(3, 3, 4)
        val expected = 3

        val result = mMajorityElement.majorityElement(nums)
        Assert.assertEquals(expected, result)

        val result2 = mMajorityElement.majorityElement2(nums)
        Assert.assertEquals(expected, result2)

        val result3 = mMajorityElement.majorityElement3(nums)
        Assert.assertEquals(expected, result3)
    }
}