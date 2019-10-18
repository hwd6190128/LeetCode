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

    /**
     * iteratively
     *
     * [4, 3, 2, 1], 將指標放在 3, 將前者 4 移到 3 之後，變成 [3, 4, 2, 1]
     * [3, 4, 2, 1], 將指標放在 2, 將前者 [3, 4] 移到 2 之後，變成 [2, 3, 4, 1]
     * [2, 3, 4, 1], 將指標放在 1, 將前者 [2, 3, 4] 移到 1 之後，變成 [1, 2, 3, 4]
     */
    fun reverseListIteratively(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        var resultNode: ListNode? = null // 最後移動過後的節點
        var newNode = head // 新的節點 [4, 3, 2, 1]
        while (newNode != null) {
            val temp = newNode.next // 指標 3 -> 2 -> 1
            newNode.next = resultNode // 取 3 -> 2 -> 1 以前的, 第一次為 null -> 4 -> [3, 4] -> [2, 3, 4]
            resultNode = newNode // 移動 resultNode 指標，第一次為 4 -> 3 -> 2 -> 1
            newNode = temp // 移動 newNode 指標，第一次為 3 -> 2 -> 1
        }
        return resultNode
    }

    // recursively
    fun reverseListRecursively(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        val newHead = reverseListRecursively(head.next)
        head.next?.next = head
        head.next = null
        return newHead
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}