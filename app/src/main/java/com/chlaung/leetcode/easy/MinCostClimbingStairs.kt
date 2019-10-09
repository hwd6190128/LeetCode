package com.chlaung.leetcode.easy

/**
 * @ClassName: MinCostClimbingStairs
 * @Description: 746. Min Cost Climbing Stairs
 *
 *               On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
 *
 *               Once you pay the cost, you can either climb one or two steps.
 *               You need to find minimum cost to reach the top of the floor,
 *               and you can either start from the step with index 0, or the step with index 1.
 *
 *               Note:
 *                  1. cost will have a length in the range [2, 1000].
 *                  2. Every cost[i] will be an integer in the range [0, 999].
 * @Date: 2019-10-02 19:12
 */
class MinCostClimbingStairs {

    fun minCostClimbingStairs(cost: IntArray): Int {

        /**
         * 尋找花最少錢爬到 n 階樓梯
         * 比較從 n-1 階（加上該階過路費）爬上來，或從 n-2 階（加上該階過路費）爬上來，誰花費少
         * 因此 dp[i] = min(dp[i-2] + cost[i-2], dp[i-1] + cost[i-1])
         */
        val length = cost.size + 1
        val dp = IntArray(length)
        dp[0] = 0
        dp[1] = 0
        for (index in 2 until length) {
            dp[index] = Math.min(dp[index - 2] + cost[index - 2], dp[index - 1] + cost[index - 1])
        }
        return dp[length - 1]
    }

    fun minCostClimbingStairs2(cost: IntArray): Int {

        /**
         * 從第 n 階開始往下計算，用兩個值暫存下一階與兩階的cost
         * 每下一階，取前兩階花費較低的值，並加上該階本身所需的cost
         * 最後取最低
         */
        var downOne = cost[cost.size - 1]
        var downTwo = 0

        for (i in cost.size - 2 downTo 0) {
            val temp = cost[i] + Math.min(downOne, downTwo)
            downTwo = downOne
            downOne = temp
        }

        return Math.min(downOne, downTwo)
    }
}