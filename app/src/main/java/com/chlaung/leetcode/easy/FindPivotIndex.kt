package com.chlaung.leetcode.easy

/**
 * @ClassName: FindPivotIndex
 * @Description: 724. Find Pivot Index
 *               Given an array of integers nums, write a method that returns the "pivot" index of this array.
 *               We define the pivot index as the index where the sum of the numbers to the left of the index is
 *               equal to the sum of the numbers to the right of the index.
 *               If no such index exists, we should return -1. If there are multiple pivot indexes,
 *               you should return the left-most pivot index.
 *
 *               1. The length of nums will be in the range [0, 10000].
 *               2. Each element nums[i] will be an integer in the range [-1000, 1000].
 * @Date: 2019-09-26 18:15
 * @History:
 * <date> <version> <desc>
 */
class FindPivotIndex {

    fun pivotIndex(nums: IntArray): Int {

        /**
         * 從左至右搜尋，先將左設為０，右為總和
         * 依次將 index 假設為 pivot(index 本身不可計入)，右減去 nums[index]，比較左右總和
         * 若相同，該 index 為 pivot
         * 若否，將該值加入左側，進行下一輪 index 計算
         */
        var left = 0
        var right = nums.sum()

        repeat(nums.size) {
            right -= nums[it]
            if (left == right) return it
            left += nums[it]
        }

        return -1
    }
}