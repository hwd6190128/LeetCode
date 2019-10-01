package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: ValidParenthesesUnitTest
 * @Description: UnitTest for LeetCode 20. Valid Parentheses
 *              [https://leetcode.com/problems/valid-parentheses/]
 * @Date: 2019-09-27 17:29
 */
class ValidParenthesesUnitTest {

    private lateinit var mValidParentheses: ValidParentheses

    @Before
    fun initTest() {
        mValidParentheses = ValidParentheses()
    }

    /** Example 1 */
    @Test
    fun validParentheses_Test01() {
        val s = "()"
        val result = mValidParentheses.isValid(s)

        val expected = true
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun validParentheses_Test02() {
        val s = "()[]{}"
        val result = mValidParentheses.isValid(s)

        val expected = true
        Assert.assertEquals(expected, result)
    }

    /** Example 3 */
    @Test
    fun validParentheses_Test03() {
        val s = "(]"
        val result = mValidParentheses.isValid(s)

        val expected = false
        Assert.assertEquals(expected, result)
    }

    /** Example 4 */
    @Test
    fun validParentheses_Test04() {
        val s = "([)]"
        val result = mValidParentheses.isValid(s)

        val expected = false
        Assert.assertEquals(expected, result)
    }

    /** Example 5 */
    @Test
    fun validParentheses_Test05() {
        val s = "{[]}"
        val result = mValidParentheses.isValid(s)

        val expected = true
        Assert.assertEquals(expected, result)
    }

    /** Example 6 */
    @Test
    fun validParentheses_Test06() {
        val s = ""
        val result = mValidParentheses.isValid(s)

        val expected = true
        Assert.assertEquals(expected, result)
    }

    /** Example 7 */
    @Test
    fun validParentheses_Test07() {
        val s = " "
        val result = mValidParentheses.isValid(s)

        val expected = false
        Assert.assertEquals(expected, result)
    }
}