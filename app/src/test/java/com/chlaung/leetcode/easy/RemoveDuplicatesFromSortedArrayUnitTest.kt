package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: RemoveDuplicatesFromSortedArrayUnitTest
 * @Description: UnitTest for LeetCode 26. Remove Duplicates from Sorted Array
 *              [https://leetcode.com/problems/remove-duplicates-from-sorted-array/]
 * @Date: 2019-09-05 16:43
 */
class RemoveDuplicatesFromSortedArrayUnitTest {

    private var mRemoveDuplicatesFromSortedArray: RemoveDuplicatesFromSortedArray =
        RemoveDuplicatesFromSortedArray()

    /** Example 1 */
    @Test
    fun removeDuplicatesFromSortedArray_Test01() {
        val nums = intArrayOf(1, 1, 2)
        val result = mRemoveDuplicatesFromSortedArray.removeDuplicates(nums)

        val expected = 2
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun removeDuplicatesFromSortedArray_Test02() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val result = mRemoveDuplicatesFromSortedArray.removeDuplicates(nums)

        val expected = 5
        Assert.assertEquals(expected, result)
    }

    /** Example 3 */
    @Test
    fun removeDuplicatesFromSortedArray_Test03() {
        val nums = intArrayOf()
        val result = mRemoveDuplicatesFromSortedArray.removeDuplicates(nums)

        val expected = 0
        Assert.assertEquals(expected, result)
    }

    /** Example 4 */
    @Test
    fun removeDuplicatesFromSortedArray_Test04() {
        val nums = intArrayOf(2)
        val result = mRemoveDuplicatesFromSortedArray.removeDuplicates(nums)

        val expected = 1
        Assert.assertEquals(expected, result)
    }
}