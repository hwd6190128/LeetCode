package com.chlaung.leetcode.easy

/**
 * @ClassName: CountPrimes
 * @Description: 204. Count Primes
 *               Count the number of prime numbers less than a non-negative number, n.
 * @Date: 2019-09-16 17:36
 */
class CountPrimes {

    fun countPrimes(n: Int): Int {
        if (n <= 2) return 0 // 題目為小於 n 的質數，若 n == 2，則 只有 0 和 1，皆不為質數

        /**
         * 建立長度為 n 的 BooleanArray
         * 依序將小於 n 的每個數其「倍數」位置改為 true
         * 最後剩下的 false 即為小於 n 的質數
         */

        val resultArray = BooleanArray(n)
        // 0, 1 不為質數
        resultArray[0] = true
        resultArray[1] = true

        var i = 2
        while (i < n) {
            var j = 2
            while (i * j < n) {
                // 將 i * 2, i * 3, etc. 設為 true
                resultArray[i * j] = true
                j += 1
            }
            i += 1
        }

        var countPrimes = 0
        repeat(resultArray.size) {
            if (!resultArray[it]) countPrimes += 1
        }

        return countPrimes
    }
}