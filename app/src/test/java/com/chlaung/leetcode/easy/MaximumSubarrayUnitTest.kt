package com.chlaung.leetcode.easy

import com.chlaung.leetcode.easy.MaximumSubarray
import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: MaximumSubarrayUnitTest
 * @Description: UnitTest for LeetCode 53. Maximum Subarray
 *              [https://leetcode.com/problems/maximum-subarray/]
 * @Date: 2019-09-02 15:52
 */
class MaximumSubarrayUnitTest {
    private var mMaximumSubarray: MaximumSubarray =
        MaximumSubarray()

    /** Example 1 */
    @Test
    fun maximumSubarray_Test01() {
        val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        val result = mMaximumSubarray.maxSubArray(nums)

        val expected = 6
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun maximumSubarray_Test02() {
        val nums = intArrayOf(-1)
        val result = mMaximumSubarray.maxSubArray(nums)

        val expected = -1
        Assert.assertEquals(expected, result)
    }
}