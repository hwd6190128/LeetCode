package com.chlaung.leetcode.easy

/**
 * @ClassName: InvertBinaryTree
 * @Description: 226. Invert Binary Tree
 *
 *               Invert a binary tree.
 *
 *               Example:
 *               var ti = TreeNode(5)
 *               var v = ti.`val`
 *               Definition for a binary tree node.
 *
 *               class TreeNode(var `val`: Int) {
 *                  var left: TreeNode? = null
 *                  var right: TreeNode? = null
 *               }
 * @Date: 2019-10-07 19:01
 */
class InvertBinaryTree {

    fun invertTree(root: TreeNode?): TreeNode? {
        return if (root == null || (root.left == null && root.right == null)) root
        else {
            val temp = root.right
            root.right = invertTree(root.left)
            root.left = invertTree(temp)
            root
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}