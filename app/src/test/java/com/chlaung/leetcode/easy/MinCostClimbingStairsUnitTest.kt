package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: MinCostClimbingStairsUnitTest
 * @Description: UnitTest for LeetCode 746. Min Cost Climbing Stairs
 *              [https://leetcode.com/problems/min-cost-climbing-stairs/]
 * @Date: 2019-10-02 19:14
 */
class MinCostClimbingStairsUnitTest {

    private lateinit var mMinCostClimbingStairs: MinCostClimbingStairs

    @Before
    fun initTest() {
        mMinCostClimbingStairs = MinCostClimbingStairs()
    }

    @Test
    fun minCostClimbingStairs_Test01() {
        val cost = intArrayOf(10, 15, 20)
        val result = mMinCostClimbingStairs.minCostClimbingStairs(cost)
        val result2 = mMinCostClimbingStairs.minCostClimbingStairs2(cost)

        val expected = 15
        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
    }

    @Test
    fun minCostClimbingStairs_Test02() {
        val cost = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)
        val result = mMinCostClimbingStairs.minCostClimbingStairs(cost)
        val result2 = mMinCostClimbingStairs.minCostClimbingStairs2(cost)

        val expected = 6
        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
    }
}