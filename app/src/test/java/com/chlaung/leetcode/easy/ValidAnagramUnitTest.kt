package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: ValidAnagramUnitTest
 * @Description: UnitTest for LeetCode 242. Valid Anagram
 *              [https://leetcode.com/problems/valid-anagram/]
 * @Date: 2019-08-26 15:29
 */
class ValidAnagramUnitTest {

    private var mValidAnagram: ValidAnagram = ValidAnagram()

    /** Example 1 */
    @Test
    fun isAnagram_Test01() {
        val s = "anagram"
        val t = "nagaram"
        val result = mValidAnagram.isAnagram(s, t)

        val expected = true
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun isAnagram_Test02() {
        val s = "rat"
        val t = "car"
        val result = mValidAnagram.isAnagram(s, t)

        val expected = false
        Assert.assertEquals(expected, result)
    }

    /** Example 3 */
    @Test
    fun isAnagram_Test03() {
        val s = "aacc"
        val t = "ccac"
        val result = mValidAnagram.isAnagram(s, t)

        val expected = false
        Assert.assertEquals(expected, result)
    }
}