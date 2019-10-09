package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: InvertBinaryTreeUnitTest
 * @Description: UnitTest for LeetCode 226. Invert Binary Tree
 *              [https://leetcode.com/problems/invert-binary-tree/]
 * @Date: 2019-10-07 19:14
 */
class InvertBinaryTreeUnitTest {

    private lateinit var mInvertBinaryTree: InvertBinaryTree

    @Before
    fun initTest() {
        mInvertBinaryTree = InvertBinaryTree()
    }

    @Test
    fun invertBinaryTree_Test01() {
        val root = InvertBinaryTree.TreeNode(4)

        root.left = InvertBinaryTree.TreeNode(2)
        root.left!!.left = InvertBinaryTree.TreeNode(1)
        root.left!!.right = InvertBinaryTree.TreeNode(3)

        root.right = InvertBinaryTree.TreeNode(7)
        root.right!!.left = InvertBinaryTree.TreeNode(6)
        root.right!!.right = InvertBinaryTree.TreeNode(9)


        val verify = InvertBinaryTree.TreeNode(4)

        verify.left = InvertBinaryTree.TreeNode(7)
        verify.left!!.right = InvertBinaryTree.TreeNode(6)
        verify.left!!.left = InvertBinaryTree.TreeNode(9)

        verify.right = InvertBinaryTree.TreeNode(2)
        verify.right!!.right = InvertBinaryTree.TreeNode(1)
        verify.right!!.left = InvertBinaryTree.TreeNode(3)

        val result = mInvertBinaryTree.invertTree(root)

        Assert.assertEquals(result!!, verify)
    }
}