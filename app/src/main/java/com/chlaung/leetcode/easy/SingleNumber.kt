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

    /**
     * 任何整數和自己異或的結果為 0，任何整數與 0 異或其值不變
     */
    fun singleNumber3(nums: IntArray): Int {
        var result = 0
        nums.forEach {
            result = result.xor(it)
        }
        return result
    }

    /**
     * 此方法建立在一個數字最多重複 2 次的特性
     * (每個數乘 2 後加總) - (所有的數加總) = 剩下單一個數
     *
     * 1. 利用 set 特性將重複的數捨去
     * 2. 將 set 中的每個數 * 2 後加總
     * 3. 把總數減去 mums 的總和
     */
    fun singleNumber4(nums: IntArray): Int {
        val set = nums.toHashSet()
        val setSum = set.sumBy { it * 2 }
        val numsSum = nums.sum()
        return setSum - numsSum
    }
}