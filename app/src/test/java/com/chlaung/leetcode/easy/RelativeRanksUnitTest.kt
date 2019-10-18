package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: RelativeRanksUnitTest
 * @Description: UnitTest for LeetCode 506. Relative Ranks
 *              [https://leetcode.com/problems/relative-ranks/]
 * @Date: 2019-10-16 18:38
 */
class RelativeRanksUnitTest {

    private lateinit var mRelativeRanks: RelativeRanks

    @Before
    fun initTest() {
        mRelativeRanks = RelativeRanks()
    }

    @Test
    fun relativeRanks_Test01() {
        val nums = intArrayOf(5, 4, 3, 2, 1)
        val result = mRelativeRanks.findRelativeRanks(nums)
        val expected = arrayOf("Gold Medal", "Silver Medal", "Bronze Medal", "4", "5")

        Assert.assertEquals(expected, result)
    }

    @Test
    fun relativeRanks_Test02() {
        val nums = intArrayOf(10, 3, 8, 9, 4)
        val result = mRelativeRanks.findRelativeRanks(nums)
        val expected = arrayOf("Gold Medal", "5", "Bronze Medal", "Silver Medal", "4")

        Assert.assertEquals(expected, result)
    }
}