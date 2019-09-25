package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: ContainsDuplicateUnitTest
 * @Description: UnitTest for LeetCode 217. Contains Duplicate
 *              [https://leetcode.com/problems/contains-duplicate/]
 * @Date: 2019-08-26 15:29
 */
class ContainsDuplicateUnitTest {

    private var mContainsDuplicate: ContainsDuplicate = ContainsDuplicate()

    /** Example 1 */
    @Test
    fun containsDuplicate_Test01() {
        val nums = intArrayOf(1, 2, 3, 1)
        val result = mContainsDuplicate.containsDuplicate(nums)

        val expected = true
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun containsDuplicate_Test02() {
        val nums = intArrayOf(1, 2, 3, 4)
        val result = mContainsDuplicate.containsDuplicate(nums)

        val expected = false
        Assert.assertEquals(expected, result)
    }

    /** Example 3 */
    @Test
    fun containsDuplicate_Test03() {
        val nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
        val result = mContainsDuplicate.containsDuplicate(nums)

        val expected = true
        Assert.assertEquals(expected, result)
    }
}