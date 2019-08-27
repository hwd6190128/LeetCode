package com.chlaung.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: MoveZeroesUnitTest
 * @Description: UnitTest for LeetCode 283. Move Zeroes
 *              [https://leetcode.com/problems/move-zeroes/]
 * @Date: 2019-08-26 15:29
 */
class MoveZeroesUnitTest {

    private var mMoveZeroes: MoveZeroes = MoveZeroes()

    /** Example 1 */
    @Test
    fun moveZeroes_Test01() {
        val nums = intArrayOf(0, 1, 0, 3, 12)
        val result = mMoveZeroes.moveZeroes(nums)

        val expected = intArrayOf(1, 3, 12, 0, 0)
        Assert.assertArrayEquals(expected, result)
    }

    /** Example 2 */
    @Test
    fun moveZeroes_Test02() {
        val nums = intArrayOf(2, 1)
        val result = mMoveZeroes.moveZeroes(nums)

        val expected = intArrayOf(2, 1)
        Assert.assertArrayEquals(expected, result)
    }
}