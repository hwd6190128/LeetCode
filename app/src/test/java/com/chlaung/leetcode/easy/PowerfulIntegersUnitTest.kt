package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: PowerfulIntegersUnitTest
 * @Description: UnitTest for LeetCode 970. Powerful Integers
 *              [https://leetcode.com/problems/powerful-integers/]
 * @Date: 2019-08-26 15:29
 */
class PowerfulIntegersUnitTest {

    private var mPowerfulIntegers: PowerfulIntegers = PowerfulIntegers()

    /** Example 1 */
    @Test
    fun powerfulIntegers_Test01() {
        val x = 2
        val y = 3
        val bound = 10
        val result = mPowerfulIntegers.powerfulIntegers(x, y, bound)

        val expected = listOf(2, 3, 4, 5, 7, 9, 10)
        Assert.assertEquals(expected.sorted(), result.sorted())
    }

    /** Example 2 */
    @Test
    fun powerfulIntegers_Test02() {
        val x = 3
        val y = 5
        val bound = 15
        val result = mPowerfulIntegers.powerfulIntegers(x, y, bound)

        val expected = listOf(2, 4, 6, 8, 10, 14)
        Assert.assertEquals(expected.sorted(), result.sorted())
    }
}