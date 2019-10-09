package com.chlaung.leetcode.easy

/**
 * @ClassName: BestTimeToBuyAndSellStock
 * @Description: 121. Best Time to Buy and Sell
 *
 *               Stock Say you have an array for which the ith element is the price of a given stock on day i.
 *
 *               If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the
 *               stock), design an algorithm to find the maximum profit.
 *
 *               Note that you cannot sell a stock before you buy one.
 * @Date: 2019-10-01 19:55
 */
class BestTimeToBuyAndSellStock {

    fun maxProfit(prices: IntArray): Int {

        if (prices.isEmpty()) return 0
        var minPrice = prices[0]
        var profit = 0

        for (index in 1 until prices.size) {
            if (minPrice > prices[index] && index != prices.lastIndex) {
                minPrice = prices[index]
            } else {
                val currentProfit = prices[index] - minPrice
                if (currentProfit > profit) {
                    profit = currentProfit
                }
            }
        }

        return profit
    }
}