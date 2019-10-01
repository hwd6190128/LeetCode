package com.chlaung.leetcode.easy

/**
 * @ClassName: BestTimetoBuyandSellStockII
 * @Description: 122. Best Time to Buy and Sell Stock II
 *
 *               Say you have an array for which the ith element is the price of a given stock on day i.
 *               Design an algorithm to find the maximum profit.
 *               You may complete as many transactions as you like (i.e., buy one and sell one share of the stock
 *               multiple times).
 *
 *               Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock
 *               before you buy again).
 * @Date: 2019-10-01 11:29
 */
class BestTimeToBuyAndSellStockII {

    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var lastPrice = -1

        // 取 current 值減去上一個值，只要是正的，即代表有賺錢，便將淨賺加入 result
        for (index in prices.indices) {
            val value = prices[index] - lastPrice
            if (lastPrice >= 0 && value > 0) {
                result += value
            }
            lastPrice = prices[index]
        }

        return result
    }
}