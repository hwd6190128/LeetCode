package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: HappyNumberUnitTest
 * @Description: UnitTest for LeetCode 202. Happy Number
 *              [https://leetcode.com/problems/happy-number/]
 * @Date: 2019-09-27 19:10
 */
class HappyNumberUnitTest {

    private lateinit var mHappyNumber: HappyNumber

    @Before
    fun initTest() {
        mHappyNumber = HappyNumber()
    }

    /** Example 1 */
    @Test
    fun happyNumber_Test01() {
        val s = 19
        val result = mHappyNumber.isHappy(s)

        val expected = true
        Assert.assertEquals(expected, result)
    }
}