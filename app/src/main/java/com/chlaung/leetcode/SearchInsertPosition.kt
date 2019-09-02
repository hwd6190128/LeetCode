package com.chlaung.leetcode

/**
 * @ClassName: SearchInsertPosition
 * @Description: 35. Search Insert Position
 *               Given a sorted array and a target value, return the index if the target is found.
 *               If not, return the index where it would be if it were inserted in order.
 * @Date: 2019-09-02 11:11
 */
class SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {
        for (num in nums) {
            return if (num >= target) {
                nums.indexOf(num)
            } else {
                continue
            }
        }
        return nums.size
    }

    fun searchInsert2(nums: IntArray, target: Int): Int {
        if (nums.last() < target) return nums.size
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = (right - left) / 2 + left
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> left = mid + 1
                nums[mid] > target -> right = mid - 1
            }
        }
        return left
    }
}