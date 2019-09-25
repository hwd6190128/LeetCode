package com.chlaung.leetcode.easy

/**
 * @ClassName: ContainsDuplicate
 * @Description: 217. Contains Duplicate
 *               Given an array of integers, find if the array contains any duplicates.
 *               Your function should return true if any value appears at least twice in the array,
 *               and it should return false if every element is distinct.
 * @Date: 2019-09-18 14:36
 */
class ContainsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.size <= 1) return false
        val tempSet = hashSetOf<Int>()
        for (item in nums) {
            if (!tempSet.add(item)) return true
        }
        return false
    }
}