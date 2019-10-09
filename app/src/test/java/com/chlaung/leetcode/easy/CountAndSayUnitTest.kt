package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: CountAndSayUnitTest
 * @Description: UnitTest for LeetCode 38. Count and Say
 *              [https://leetcode.com/problems/count-and-say/]
 * @Date: 2019-10-03 17:43
 */
class CountAndSayUnitTest {

    private lateinit var mCountAndSay: CountAndSay

    @Before
    fun initTest() {
        mCountAndSay = CountAndSay()
    }

    @Test
    fun countAndSay_Test01() {
        val nums = 1
        val result = mCountAndSay.countAndSay(nums)

        val expected = "1"
        Assert.assertEquals(expected, result)
    }

    @Test
    fun countAndSay_Test02() {
        val nums = 4
        val result = mCountAndSay.countAndSay(nums)

        val expected = "1211"
        Assert.assertEquals(expected, result)
    }

    @Test
    fun countAndSay_Test03() {
        val nums = 6
        val result = mCountAndSay.countAndSay(nums)

        val expected = "312211"
        Assert.assertEquals(expected, result)
    }

    @Test
    fun countAndSay_Test04() {
        val nums = 8
        val result = mCountAndSay.countAndSay(nums)

        val expected = "1113213211"
        Assert.assertEquals(expected, result)
    }

    @Test
    fun countAndSay_Test05() {
        val nums = 10
        val result = mCountAndSay.countAndSay(nums)

        val expected = "13211311123113112211"
        Assert.assertEquals(expected, result)
    }
}