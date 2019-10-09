package com.chlaung.leetcode.easy

/**
 * @ClassName: IsomorphicStrings
 * @Description: 205. Isomorphic Strings
 *
 *               Given two strings s and t, determine if they are isomorphic.
 *
 *               Two strings are isomorphic if the characters in s can be replaced to get t.
 *               All occurrences of a character must be replaced with another character while preserving the order of
 *               characters. No two characters may map to the same character but a character may map to itself.
 *
 *               Note: You may assume both s and t have the same length.
 * @Date: 2019-10-07 20:11
 */
class IsomorphicStrings {

    fun isIsomorphic(s: String, t: String): Boolean {

        /**
         * 兩個 map，分別儲存兩者之間的關係
         *  1. s 對 t (key = s[i], value = t[i])
         *  2. t 對 s (key = t[i], value = s[i])
         *
         * 不存在 map 中的加入，已存在的取出比對是否相同
         */
        val sMap = mutableMapOf<Char, Char>()
        val tMap = mutableMapOf<Char, Char>()

        s.forEachIndexed { index, it ->
            if (sMap.containsKey(it) && sMap[it] != t[index]) {
                return false
            } else {
                sMap[it] = t[index]
            }
        }

        t.forEachIndexed { index, it ->
            if (tMap.containsKey(it) && tMap[it] != s[index]) {
                return false
            } else {
                tMap[it] = s[index]
            }
        }

        return true
    }
}