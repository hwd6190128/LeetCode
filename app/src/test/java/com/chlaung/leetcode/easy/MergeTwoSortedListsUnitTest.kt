package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: MergeTwoSortedListsUnitTest
 * @Description: UnitTest for LeetCode 21. Merge Two Sorted Lists
 *              [https://leetcode.com/problems/merge-two-sorted-lists/]
 * @Date: 2019-10-08 15:50
 */
class MergeTwoSortedListsUnitTest {

    private lateinit var mMergeTwoSortedLists: MergeTwoSortedLists

    @Before
    fun initTest() {
        mMergeTwoSortedLists = MergeTwoSortedLists()
    }

    @Test
    fun mergeTwoSortedLists_Test01() {
        val l1 = MergeTwoSortedLists.ListNode(1)
        val l12 = MergeTwoSortedLists.ListNode(2)
        val l13 = MergeTwoSortedLists.ListNode(4)
        l12.next = l13
        l1.next = l12

        val l2 = MergeTwoSortedLists.ListNode(1)
        val l22 = MergeTwoSortedLists.ListNode(3)
        val l23 = MergeTwoSortedLists.ListNode(4)
        l22.next = l23
        l2.next = l22

        val result = mMergeTwoSortedLists.mergeTwoLists(l1, l2)

        val expected = MergeTwoSortedLists.ListNode(1)
        val expected2 = MergeTwoSortedLists.ListNode(1)
        val expected3 = MergeTwoSortedLists.ListNode(2)
        val expected4 = MergeTwoSortedLists.ListNode(3)
        val expected5 = MergeTwoSortedLists.ListNode(4)
        val expected6 = MergeTwoSortedLists.ListNode(4)
        expected5.next = expected6
        expected4.next = expected5
        expected3.next = expected4
        expected2.next = expected3
        expected.next = expected2

        Assert.assertArrayEquals(expected.transfer2Array(), result.transfer2Array())
    }

    private fun MergeTwoSortedLists.ListNode?.transfer2Array(): IntArray {
        var node = this
        val nodeList = mutableListOf<Int>()

        while (node != null) {
            nodeList.add(node.`val`)
            node = node.next
        }

        return nodeList.toIntArray()
    }
}