package com.chlaung.leetcode

import kotlin.math.max


/**
 * @ClassName: MaximumSubarray
 * @Description: 53. Maximum Subarray
 *               Given an integer array nums, find the contiguous subarray (containing at least one number) which has
 *               the largest sum and return its sum.
 * @Date: 2019-09-02 15:14
 */
class MaximumSubarray {

    fun maxSubArray(nums: IntArray): Int {

        // 確認 nums 是否皆為負數，是的話取最大值
        run breaking@{
            var tempMax = nums.first()
            for (item in nums) {
                if (item >= 0) return@breaking
                else {
                    tempMax = max(item, tempMax)
                }
            }
            if (tempMax < 0) return tempMax
        }

        var sum = 0
        var max = 0
        for (item in nums) {
            sum += item
            sum = Math.max(0, sum)
            max = Math.max(sum, max)
        }
        return max
    }
}