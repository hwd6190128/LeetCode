package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: ReverseLinkedListUnitTest
 * @Description: UnitTest for LeetCode 206. Reverse Linked List
 *              [https://leetcode.com/problems/reverse-linked-list/]
 * @Date: 2019-10-09 17:10
 */
class ReverseLinkedListUnitTest {

    private lateinit var mReverseLinkedList: ReverseLinkedList

    @Before
    fun initTest() {
        mReverseLinkedList = ReverseLinkedList()
    }

    @Test
    fun reverseLinkedList_Test01() {
        val l1 = ReverseLinkedList.ListNode(1)
        val l12 = ReverseLinkedList.ListNode(2)
        val l13 = ReverseLinkedList.ListNode(3)
        val l14 = ReverseLinkedList.ListNode(4)
        val l15 = ReverseLinkedList.ListNode(5)
        l14.next = l15
        l13.next = l14
        l12.next = l13
        l1.next = l12

        val result = mReverseLinkedList.reverseList(l1)

        val expected = ReverseLinkedList.ListNode(5)
        val expected2 = ReverseLinkedList.ListNode(4)
        val expected3 = ReverseLinkedList.ListNode(3)
        val expected4 = ReverseLinkedList.ListNode(2)
        val expected5 = ReverseLinkedList.ListNode(1)
        expected4.next = expected5
        expected3.next = expected4
        expected2.next = expected3
        expected.next = expected2

        Assert.assertArrayEquals(expected.transfer2Array(), result.transfer2Array())
    }

    private fun ReverseLinkedList.ListNode?.transfer2Array(): IntArray {
        var node = this
        val nodeList = mutableListOf<Int>()

        while (node != null) {
            nodeList.add(node.`val`)
            node = node.next
        }

        return nodeList.toIntArray()
    }
}