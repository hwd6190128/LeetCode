package com.chlaung.leetcode.easy

/**
 * @ClassName: RangeAdditionII
 * @Description: 598. Range Addition II
 *               Given an m * n matrix M initialized with all 0's and several update operations.
 *               Operations are represented by a 2D array, and each operation is represented by an array with
 *               two positive integers a and b,
 *               which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.
 *               You need to count and return the number of maximum integers in the matrix after performing all the
 *               operations.
 *
 *               1. The range of m and n is [1,40000].
 *               2. The range of a is [1,m], and the range of b is [1,n].
 *               3. The range of operations size won't exceed 10,000.
 * @Date: 2019-09-26 16:30
 */
class RangeAdditionII {

    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {

        var minA = m // 直的最小交集
        var minB = n // 橫的最小交集

        // 一定是交集才會形成最大 maximum integers，取直、橫的最小交集
        for (i in ops.indices) {
            minA = Math.min(ops[i][0], minA)
            minB = Math.min(ops[i][1], minB)
        }

        return minA * minB // 相乘取得數量 maximum integers 的數量
    }
}