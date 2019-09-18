package com.chlaung.leetcode.easy

/**
 * @ClassName: ValidAnagram
 * @Description: 242. Valid Anagram Given two strings s and t , write a function to determine if t is an anagram of s.
 *               a. You may assume the string contains only lowercase alphabets.
 *               b. What if the inputs contain unicode characters? How would you adapt your solution to such case?
 * @Date: 2019-09-17 18:28
 */
class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        return s.toCharArray().apply { sort() }.contentEquals(t.toCharArray().apply { sort() })
    }
}