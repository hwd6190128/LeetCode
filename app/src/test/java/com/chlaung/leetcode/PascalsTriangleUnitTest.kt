package com.chlaung.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * @ClassName: PascalsTriangleUnitTest
 * @Description: UnitTest for LeetCode 118. Pascal's Triangle
 *              [https://leetcode.com/problems/pascals-triangle/]
 * @Date: 2019-09-02 16:55
 */
class PascalsTriangleUnitTest {

    private var mPascalsTriangle: PascalsTriangle = PascalsTriangle()

    /** Example 1 */
    @Test
    fun searchInsertPosition_Test01() {
        val num = 5
        val result = mPascalsTriangle.generate(num)

        val expected = arrayListOf(
            arrayListOf(1), arrayListOf(1, 1), arrayListOf(1, 2, 1),
            arrayListOf(1, 3, 3, 1), arrayListOf(1, 4, 6, 4, 1)
        )
        Assert.assertEquals(expected, result)
    }
}