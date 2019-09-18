package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: CountPrimesUnitTest
 * @Description: UnitTest for LeetCode 204. Count Primes
 *              [https://leetcode.com/problems/count-primes/]
 * @Date: 2019-08-26 15:29
 */
class CountPrimesUnitTest {

    private var mCountPrimes: CountPrimes = CountPrimes()

    /** Example 1 */
    @Test
    fun countPrimes_Test01() {
        val nums = 10
        val result = mCountPrimes.countPrimes(nums)

        val expected = 4
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun countPrimes_Test02() {
        val nums = 25
        val result = mCountPrimes.countPrimes(nums)

        val expected = 9
        Assert.assertEquals(expected, result)
    }

    /** Example 3 */
    @Test
    fun countPrimes_Test03() {
        val nums = 2
        val result = mCountPrimes.countPrimes(nums)

        val expected = 0
        Assert.assertEquals(expected, result)
    }
}