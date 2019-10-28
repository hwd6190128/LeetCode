package com.chlaung.leetcode.easy

/**
 * @ClassName: FirstUniqueCharacterInAString
 * @Description: 387. First Unique Character in a String
 *
 *               Given a string, find the first non-repeating character in it and return it's index.
 *               If it doesn't exist, return -1.
 *
 *               Note: You may assume the string contain only lowercase letters.
 * @Date: 2019-10-24 11:42
 */
class FirstUniqueCharacterInAString {

    fun firstUniqChar(s: String): Int {
        val set = hashSetOf<Char>()
        s.forEachIndexed { idx, item ->
            if (!set.add(item)) return@forEachIndexed
            var isUnique = true
            run breaking@{
                s.forEachIndexed { i, it ->
                    if (it == item && i != idx) {
                        isUnique = false
                        return@breaking
                    }
                }
            }
            if (isUnique) return idx
        }
        return -1
    }
}