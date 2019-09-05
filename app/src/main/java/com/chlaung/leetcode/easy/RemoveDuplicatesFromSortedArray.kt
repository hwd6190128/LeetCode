package com.chlaung.leetcode.easy

/**
 * @ClassName: RemoveDuplicatesFromSortedArray
 * @Description: 26. Remove Duplicates from Sorted Array
 *               Given a sorted array nums, remove the duplicates in-place such that each element appear only once
 *               and return the new length.
 *               Do not allocate extra space for another array, you must do this by modifying the input array in-place
 *               with O(1) extra memory.
 * @Date: 2019-09-05 16:42
 */
class RemoveDuplicatesFromSortedArray {

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return 1
        var last = nums.first()
        var index = 1
        repeat(nums.size) {
            if (nums[it] != last) {
                nums[index] = nums[it]
                last = nums[it]
                index += 1
            }
        }
        return index
    }
}