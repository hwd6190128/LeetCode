package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: RangeAdditionIIUnitTest
 * @Description: UnitTest for LeetCode 724. Find Pivot Index
 *              [https://leetcode.com/problems/find-pivot-index/]
 * @Date: 2019-08-26 15:29
 */
class FindPivotIndexUnitTest {

    private lateinit var mFindPivotIndex: FindPivotIndex

    @Before
    fun initTest() {
        mFindPivotIndex = FindPivotIndex()
    }

    /** Example 1 */
    @Test
    fun pivotIndex_Test01() {
        val nums = intArrayOf(1, 7, 3, 6, 5, 6)
        val result = mFindPivotIndex.pivotIndex(nums)

        val expected = 3
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun pivotIndex_Test02() {
        val nums = intArrayOf(1, 2, 3)
        val result = mFindPivotIndex.pivotIndex(nums)

        val expected = -1
        Assert.assertEquals(expected, result)
    }
}