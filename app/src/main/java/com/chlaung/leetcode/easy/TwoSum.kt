package com.chlaung.leetcode.easy

/**
 * @ClassName: TwoSum
 * @Description: 1. Two Sum
 *
 *               Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *               You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * @Date: 2019-10-01 10:46
 */
class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        /**
         * 用 map 存下已經遍歷過的值 [key = item, value = index]
         * 用 target 減去 current value，若存在於 map，則表示前一個值已經存在 map
         * 取前一個值在 map 中的 index 與 current 的 index
         */
        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, item ->
            val value = target - item
            if (map.isNotEmpty() && map.containsKey(value)) {
                return intArrayOf(map[value]!!, index)
            } else {
                map[item] = index
            }
        }
        return intArrayOf()
    }
}