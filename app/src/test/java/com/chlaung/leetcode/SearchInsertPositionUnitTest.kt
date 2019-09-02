package com.chlaung.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: SearchInsertPositionUnitTest
 * @Description: UnitTest for LeetCode 35. Search Insert Position
 *              [https://leetcode.com/problems/search-insert-position/]
 * @Date: 2019-09-02 11:48
 */
class SearchInsertPositionUnitTest {

    private var mSearchInsertPosition: SearchInsertPosition = SearchInsertPosition()

    /** Example 1 */
    @Test
    fun searchInsertPosition_Test01() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 5
        val result = mSearchInsertPosition.searchInsert(nums, target)

        val expected = 2
        Assert.assertEquals(expected, result)
    }

    @Test
    fun searchInsertPosition2_Test01() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 5
        val result = mSearchInsertPosition.searchInsert2(nums, target)

        val expected = 2
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun searchInsertPosition_Test02() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 2
        val result = mSearchInsertPosition.searchInsert(nums, target)

        val expected = 1
        Assert.assertEquals(expected, result)
    }

    @Test
    fun searchInsertPosition2_Test02() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 2
        val result = mSearchInsertPosition.searchInsert2(nums, target)

        val expected = 1
        Assert.assertEquals(expected, result)
    }

    /** Example 3 */
    @Test
    fun searchInsertPosition_Test03() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 7
        val result = mSearchInsertPosition.searchInsert(nums, target)

        val expected = 4
        Assert.assertEquals(expected, result)
    }

    @Test
    fun searchInsertPosition3_Test03() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 7
        val result = mSearchInsertPosition.searchInsert2(nums, target)

        val expected = 4
        Assert.assertEquals(expected, result)
    }

    /** Example 4 */
    @Test
    fun searchInsertPosition_Test04() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 0
        val result = mSearchInsertPosition.searchInsert(nums, target)

        val expected = 0
        Assert.assertEquals(expected, result)
    }

    @Test
    fun searchInsertPosition2_Test04() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 0
        val result = mSearchInsertPosition.searchInsert2(nums, target)

        val expected = 0
        Assert.assertEquals(expected, result)
    }
}