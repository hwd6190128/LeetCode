package com.chlaung.leetcode.easy

/**
 * @ClassName: PowerfulIntegers
 * @Description: 970. Powerful Integers
 *               Given two positive integers x and y, an integer is powerful if it is equal to x^i + y^j for some
 *               integers i >= 0 and j >= 0.
 *               Return a list of all powerful integers that have value less than or equal to bound.
 *               You may return the answer in any order.  In your answer, each value should occur at most once.
 *
 *               1 <= x <= 100
 *               1 <= y <= 100
 *               0 <= bound <= 10^6
 *
 * @Date: 2019-09-25 14:40
 */
class PowerfulIntegers {

    fun powerfulIntegers(x: Int, y: Int, bound: Int): List<Int> {

        // 將 x 小於 bound 的次方結果用一個 set 存起來
        val xSet = HashSet<Int>()
        var xIndex = 0.0
        while (xIndex <= bound) {
            val value = Math.pow(x.toDouble(), xIndex).toInt()
            xIndex += 1.0
            if (value <= bound) xSet.add(value)
            else break
        }

        // 將 y 小於 bound 的次方結果用一個 set 存起來
        val ySet = HashSet<Int>()
        var yIndex = 0.0
        while (yIndex <= bound) {
            val value = Math.pow(y.toDouble(), yIndex).toInt()
            yIndex += 1.0
            if (value <= bound) ySet.add(value)
            else break
        }

        // 將 x+y 小於 bound 的結果存入 result set
        val result = HashSet<Int>()
        for (xItem in xSet) {
            for (yItem in ySet) {
                val sum = xItem + yItem
                if (sum <= bound) result.add(sum)
            }
        }

        return result.toList()
    }
}