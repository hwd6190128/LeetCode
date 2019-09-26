package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: RangeAdditionIIUnitTest
 * @Description: UnitTest for LeetCode 598. Range Addition II
 *              [https://leetcode.com/problems/range-addition-ii/]
 * @Date: 2019-08-26 15:29
 */
class RangeAdditionIIUnitTest {

    private lateinit var mRangeAdditionII: RangeAdditionII

    @Before
    fun initTest() {
        mRangeAdditionII = RangeAdditionII()
    }

    /** Example 1 */
    @Test
    fun maxCount_Test01() {
        val m = 2
        val n = 3
        val operations = arrayOf(intArrayOf(2, 2), intArrayOf(3, 3))
        val result = mRangeAdditionII.maxCount(m, n, operations)

        val expected = 4
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun maxCount_Test02() {
        val m = 6
        val n = 4
        val operations = arrayOf(intArrayOf(5, 2), intArrayOf(4, 7))
        val result = mRangeAdditionII.maxCount(m, n, operations)

        val expected = 8
        Assert.assertEquals(expected, result)
    }
}