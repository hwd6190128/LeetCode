package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: BestTimeToBuyAndSellStockUnitTest
 * @Description: UnitTest for LeetCode 121. Best Time to Buy and Sell Stock
 *              [https://leetcode.com/problems/best-time-to-buy-and-sell-stock/]
 * @Date: 2019-10-01 19:56
 */
class BestTimeToBuyAndSellStockUnitTest {

    private lateinit var mBestTimeToBuyAndSellStock: BestTimeToBuyAndSellStock

    @Before
    fun initTest() {
        mBestTimeToBuyAndSellStock = BestTimeToBuyAndSellStock()
    }

    @Test
    fun bestTimeToBuyAndSellStock_Test01() {
        val nums = intArrayOf(7, 1, 5, 3, 6, 4)
        val result = mBestTimeToBuyAndSellStock.maxProfit(nums)

        val expected = 5
        Assert.assertEquals(expected, result)
    }

    @Test
    fun bestTimeToBuyAndSellStock_Test02() {
        val nums = intArrayOf(7, 6, 4, 3, 1)
        val result = mBestTimeToBuyAndSellStock.maxProfit(nums)

        val expected = 0
        Assert.assertEquals(expected, result)
    }

    @Test
    fun bestTimeToBuyAndSellStock_Test03() {
        val nums = intArrayOf()
        val result = mBestTimeToBuyAndSellStock.maxProfit(nums)

        val expected = 0
        Assert.assertEquals(expected, result)
    }

    @Test
    fun bestTimeToBuyAndSellStock_Test04() {
        val nums = intArrayOf(2, 4, 1)
        val result = mBestTimeToBuyAndSellStock.maxProfit(nums)

        val expected = 2
        Assert.assertEquals(expected, result)
    }

    @Test
    fun bestTimeToBuyAndSellStock_Test05() {
        val nums = intArrayOf(3, 2, 6, 5, 0, 3)
        val result = mBestTimeToBuyAndSellStock.maxProfit(nums)

        val expected = 4
        Assert.assertEquals(expected, result)
    }

    @Test
    fun bestTimeToBuyAndSellStock_Test06() {
        val nums = intArrayOf(2, 1, 2, 1, 0, 1, 2)
        val result = mBestTimeToBuyAndSellStock.maxProfit(nums)

        val expected = 2
        Assert.assertEquals(expected, result)
    }
}