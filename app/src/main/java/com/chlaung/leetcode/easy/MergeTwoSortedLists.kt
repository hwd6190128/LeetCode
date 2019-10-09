package com.chlaung.leetcode.easy

/**
 * @ClassName: MergeTwoSortedLists
 * @Description: 21. Merge Two Sorted Lists
 *
 *               Merge two sorted linked lists and return it as a new list.
 *               The new list should be made by splicing together the nodes of the first two lists.
 * @Date: 2019-10-08 15:48
 */
class MergeTwoSortedLists {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {

        return if (l1 == null && l2 == null) null
        else if (l1 == null) l2
        else if (l2 == null) l1
        else if (l1.`val` < l2.`val`) {
            l1.next = mergeTwoLists(l1.next, l2)
            l1
        } else {
            l2.next = mergeTwoLists(l2.next, l1)
            l2
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null

    }
}

