package com.chlaung.leetcode.easy

/**
 * @ClassName: SingleNumber
 * @Description: 136. Single Number
 *
 *              Given a non-empty array of integers, every element appears twice except for one.
 *              Find that single one.
 *
 *              Note:
 *                  Your algorithm should have a linear runtime complexity.
 *                  Could you implement it without using extra memory?
 * @Date: 2019-10-24 17:56
 */
class SingleNumber {

    fun singleNumber(nums: IntArray): Int {
        return nums.toTypedArray().groupingBy { it }.eachCount().filter { it.value == 1 }.toList()[0].first
    }

    fun singleNumber2(nums: IntArray): Int {
        val map = hashMapOf<Int, Boolean>()
        nums.forEach {
            map[it] = map.containsKey(it)
        }
        map.forEach {
            if (!it.value) return it.key
        }
        return -1
    }
}