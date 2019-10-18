package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: BinaryTreeTiltUnitTest
 * @Description: UnitTest for LeetCode 563. Binary Tree Tilt
 *              [https://leetcode.com/problems/binary-tree-tilt/]
 * @Date: 2019-10-14 17:36
 */
class BinaryTreeTiltUnitTest {

    private lateinit var mBinaryTreeTilt: BinaryTreeTilt

    @Before
    fun initTest() {
        mBinaryTreeTilt = BinaryTreeTilt()
    }

    @Test
    fun binaryTreeTilt_Test01() {
        val tn = BinaryTreeTilt.TreeNode(1)
        val tn2 = BinaryTreeTilt.TreeNode(2)
        val tn3 = BinaryTreeTilt.TreeNode(3)
        tn.left = tn2
        tn.right = tn3

        val result = mBinaryTreeTilt.findTilt(tn)

        val expected = 1

        Assert.assertEquals(expected, result)
    }

    @Test
    fun binaryTreeTilt_Test02() {
        val tn = BinaryTreeTilt.TreeNode(1)
        val tn2 = BinaryTreeTilt.TreeNode(2)
        val tn3 = BinaryTreeTilt.TreeNode(3)
        val tn4 = BinaryTreeTilt.TreeNode(9)
        val tn5 = BinaryTreeTilt.TreeNode(4)
        val tn6 = BinaryTreeTilt.TreeNode(6)
        val tn7 = BinaryTreeTilt.TreeNode(2)
        tn.left = tn2
        tn.right = tn3
        tn2.left = tn4
        tn2.right = tn5
        tn3.left = tn6
        tn3.right = tn7

        val result = mBinaryTreeTilt.findTilt(tn)

        val expected = 13

        Assert.assertEquals(expected, result)
    }
}