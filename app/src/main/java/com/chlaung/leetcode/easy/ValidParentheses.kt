package com.chlaung.leetcode.easy

import java.util.*

/**
 * @ClassName: ValidParentheses
 * @Description: 20. Valid Parentheses
 *               Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 *               determine if the input string is valid.
 *
 *               An input string is valid if:
 *                  1. Open brackets must be closed by the same type of brackets.
 *                  2. Open brackets must be closed in the correct order.
 *                  3. Note that an empty string is also considered valid.
 * @Date: 2019-09-27 16:11
 */
class ValidParentheses {

    fun isValid(s: String): Boolean {

        // 將成對的符號轉為等值的正負數，並使用 LIFO 的 stack 判斷是否滿足條件
        if (s.isEmpty()) return true
        if (s[0] == ')' || s[0] == '}' || s[0] == ']') return false
        val deque = ArrayDeque<Int>()

        for (index in s.indices) {
            if (deque.isEmpty()) deque.add(getValue(s[index]))
            else {
                if (getValue(s[index]) + deque.peekLast() == 0) deque.pollLast()
                else deque.add(getValue(s[index]))
            }
        }

        return deque.isEmpty()
    }

    private fun getValue(c: Char): Int {
        return when (c) {
            '(' -> 1
            ')' -> -1
            '{' -> 2
            '}' -> -2
            '[' -> 3
            else -> -3 // ']'
        }
    }
}