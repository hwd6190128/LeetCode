package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: TwoSumUnitTest
 * @Description: UnitTest for LeetCode 122. Best Time to Buy and Sell Stock II
 *              [https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/]
 * @Date: 2019-10-01 11:30
 */
class BestTimeToBuyAndSellStockIIUnitTest {

    private lateinit var mBestTimeToBuyAndSellStockII: BestTimeToBuyAndSellStockII

    @Before
    fun initTest() {
        mBestTimeToBuyAndSellStockII = BestTimeToBuyAndSellStockII()
    }

    /** Example 1 */
    @Test
    fun bestTimeToBuyAndSellStockII_Test01() {
        val nums = intArrayOf(7, 1, 5, 3, 6, 4)
        val result = mBestTimeToBuyAndSellStockII.maxProfit(nums)

        val expected = 7
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun bestTimeToBuyAndSellStockII_Test02() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val result = mBestTimeToBuyAndSellStockII.maxProfit(nums)

        val expected = 4
        Assert.assertEquals(expected, result)
    }

    /** Example 3 */
    @Test
    fun bestTimeToBuyAndSellStockII_Test03() {
        val nums = intArrayOf(7, 6, 4, 3, 1)
        val result = mBestTimeToBuyAndSellStockII.maxProfit(nums)

        val expected = 0
        Assert.assertEquals(expected, result)
    }
}