package com.chlaung.leetcode.easy

/**
 * @ClassName: ReverseLinkedList
 * @Description: 206. Reverse Linked List
 *
 *               Reverse a singly linked list.
 *
 *               Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 * @Date: 2019-10-09 16:58
 */
class ReverseLinkedList {

    fun reverseList(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        val newHead = reverseList(head.next)
        head.next?.next = head
        head.next = null
        return newHead
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}