package com.chlaung.leetcode.easy

/**
 * @ClassName: BinaryTreeTilt
 * @Description: 563. Binary Tree Tilt
 *
 *               Given a binary tree, return the tilt of the whole tree.
 *
 *               The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node
 *               values and the sum of all right subtree node values.
 *               Null node has tilt 0.
 *
 *               The tilt of the whole tree is defined as the sum of all nodes' tilt.
 *
 *               Note:
 *                  The sum of node values in any subtree won't exceed the range of 32-bit integer.
 *                  All the tilt values won't exceed the range of 32-bit integer.
 * @Date: 2019-10-14 17:33
 */
class BinaryTreeTilt {

    private var sum = 0

    fun findTilt(root: TreeNode?): Int {
        if (root == null) return 0
        countSum(root)
        return sum
    }

    private fun countSum(root: TreeNode?): Int {
        if (root == null) return 0
        val left = countSum(root.left)
        val right = countSum(root.right)
        sum += Math.abs(left - right)
        return root.`val` + left + right
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}