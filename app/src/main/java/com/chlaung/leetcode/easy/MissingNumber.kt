package com.chlaung.leetcode.easy

/**
 * @ClassName: MissingNumber
 * @Description: 268. Missing Number
 *
 *               Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing
 *               from the array.
 *               Your algorithm should run in linear runtime complexity.
 *               Could you implement it using only constant extra space complexity?
 * @Date: 2019-09-16 17:36
 */
class MissingNumber {

    fun missingNumber(nums: IntArray): Int {
        val expectedSum = (nums.size + 1) * nums.size / 2 // 梯形公式求預計和
        val actualSum = nums.sum() // 求實際和
        return expectedSum - actualSum // 相減求出缺少的數
    }

    /**
     * 任何整數和自己異或的結果為 0，任何整數與 0 異或其值不變
     */
    fun missingNumber2(nums: IntArray): Int {
        var sum = nums.size
        nums.forEachIndexed { index, i ->
            sum = sum.xor(index)
            sum = sum.xor(i)
        }
        return sum
    }
}