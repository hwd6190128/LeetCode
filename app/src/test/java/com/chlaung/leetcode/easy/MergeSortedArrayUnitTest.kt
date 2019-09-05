package com.chlaung.leetcode.easy

import com.chlaung.leetcode.easy.MergeSortedArray
import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: MergeSortedArrayUnitTest
 * @Description: UnitTest for LeetCode 88. Merge Sorted Array
 *              [https://leetcode.com/problems/merge-sorted-array/]
 * @Date: 2019-08-26 16:53
 */
class MergeSortedArrayUnitTest {

    private var mMergeSortedArray: MergeSortedArray =
        MergeSortedArray()

    /** Example 1 */
    @Test
    fun searchInsertPosition_Test01() {
        val nums1 = intArrayOf(3, 2, 1, 0, 0, 0)
        val m = 3
        val nums2 = intArrayOf(2, 5, 6)
        val n = 3
        val result = mMergeSortedArray.merge(nums1, m, nums2, n)

        val expected = intArrayOf(1, 2, 2, 3, 5, 6)
        Assert.assertArrayEquals(expected, result)
    }
}