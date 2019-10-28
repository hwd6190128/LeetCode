package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: FirstUniqueCharacterInAStringUnitTest
 * @Description: UnitTest for LeetCode 387. First Unique Character in a String
 *              [https://leetcode.com/problems/sum-of-two-integers/]
 * @Date: 2019-10-24 12:00
 */
class FirstUniqueCharacterInAStringUnitTest {

    private lateinit var mFirstUniqueCharacterInAString: FirstUniqueCharacterInAString

    @Before
    fun initTest() {
        mFirstUniqueCharacterInAString = FirstUniqueCharacterInAString()
    }

    @Test
    fun firstUniqueCharacterInAString_Test01() {
        val s = "leetcode"
        val result = mFirstUniqueCharacterInAString.firstUniqChar(s)

        val expected = 0
        Assert.assertEquals(expected, result)
    }

    @Test
    fun firstUniqueCharacterInAString_Test02() {
        val s = "loveleetcode"
        val result = mFirstUniqueCharacterInAString.firstUniqChar(s)

        val expected = 2
        Assert.assertEquals(expected, result)
    }

    @Test
    fun firstUniqueCharacterInAString_Test03() {
        val s = "aabbcdecdefghfghx"
        val result = mFirstUniqueCharacterInAString.firstUniqChar(s)

        val expected = 16
        Assert.assertEquals(expected, result)
    }
}