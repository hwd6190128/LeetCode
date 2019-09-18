package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: FirstBadVersionUnitTest
 * @Description: UnitTest for LeetCode 204. First Bad Version
 *              [https://leetcode.com/problems/first-bad-version/]
 * @Date: 2019-08-26 15:29
 */
class FirstBadVersionUnitTest {

    private var mFirstBadVersion: FirstBadVersion = FirstBadVersion()

    /** Example 1 */
    @Test
    fun firstBadVersion_Test01() {
        mFirstBadVersion.setBadVersion(4)

        val n = 5
        val result = mFirstBadVersion.firstBadVersion(n)

        val expected = 4
        Assert.assertEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun firstBadVersion_Test02() {
        mFirstBadVersion.setBadVersion(7)

        val n = 10
        val result = mFirstBadVersion.firstBadVersion(n)

        val expected = 7
        Assert.assertEquals(expected, result)
    }

    /** Example 3 */
    @Test
    fun firstBadVersion_Test03() {
        mFirstBadVersion.setBadVersion(2)

        val n = 2
        val result = mFirstBadVersion.firstBadVersion(n)

        val expected = 2
        Assert.assertEquals(expected, result)
    }
}