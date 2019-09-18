package com.chlaung.leetcode.easy

/**
 * @ClassName: MissingNumber
 * @Description: 268. Missing Number
 *               Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing
 *               from the array.
 *               Your algorithm should run in linear runtime complexity.
 *               Could you implement it using only constant extra space complexity?
 * @Date: 2019-09-16 17:36
 */
class MissingNumber {

    fun missingNumber(nums: IntArray): Int {
        var expectedSum = 0
        var actualSum = 0
        for (i in 1..nums.size) {
            expectedSum += i
        }
        for (element in nums) {
            actualSum += element
        }
        return expectedSum - actualSum
    }
}