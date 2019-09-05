package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: RotateArrayUnitTest
 * @Description: UnitTest for LeetCode 189. Rotate Array
 *              [https://leetcode.com/problems/rotate-array/]
 * @Date: 2019-09-05 19:46
 */
class RotateArrayUnitTest {

    private var mRotateArray: RotateArray = RotateArray()

    /** Example 1 */
    @Test
    fun rotateArray_Test01() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val k = 3
        val result = mRotateArray.rotate(nums, k)

        val expected = intArrayOf(5, 6, 7, 1, 2, 3, 4)
        Assert.assertArrayEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun rotateArray_Test02() {
        val nums = intArrayOf(-1, -100, 3, 99)
        val k = 2
        val result = mRotateArray.rotate(nums, k)

        val expected = intArrayOf(3, 99, -1, -100)
        Assert.assertArrayEquals(expected, result)
    }
}