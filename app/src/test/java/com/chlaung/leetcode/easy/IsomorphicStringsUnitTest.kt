package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: IsomorphicStringsUnitTest
 * @Description: UnitTest for LeetCode 205. Isomorphic Strings
 *              [https://leetcode.com/problems/isomorphic-strings/]
 * @Date: 2019-10-07 20:12
 */
class IsomorphicStringsUnitTest {

    private lateinit var mIsomorphicStrings: IsomorphicStrings

    @Before
    fun initTest() {
        mIsomorphicStrings = IsomorphicStrings()
    }

    @Test
    fun isIsomorphic_Test01() {
        val s = "egg"
        val t = "add"
        val result = mIsomorphicStrings.isIsomorphic(s, t)

        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun isIsomorphic_Test02() {
        val s = "foo"
        val t = "bar"
        val result = mIsomorphicStrings.isIsomorphic(s, t)

        val expected = false
        Assert.assertEquals(expected, result)
    }

    @Test
    fun isIsomorphic_Test03() {
        val s = "paper"
        val t = "title"
        val result = mIsomorphicStrings.isIsomorphic(s, t)

        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun isIsomorphic_Test04() {
        val s = "ec"
        val t = "ee"
        val result = mIsomorphicStrings.isIsomorphic(s, t)

        val expected = false
        Assert.assertEquals(expected, result)
    }
}