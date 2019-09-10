package com.chlaung.leetcode.easy

/**
 * @ClassName: RotateArray
 * @Description: 189. Rotate Array
 *               Given an array, rotate the array to the right by k steps, where k is non-negative.
 * @Date: 2019-09-05 19:44
 */
class RotateArray {

    fun rotate(nums: IntArray, k: Int): IntArray {
        val rotateCount = k % nums.size // 取 k mod size()，因為如果 k = size 代表換了一輪，則 nums 不變
        if (rotateCount == 0) return nums

        // 將 array 分成兩部分，分別獨立 reverse 兩個部分，最後再將整個 array reverse 一次
        nums.reverse(0, nums.size - rotateCount - 1) // 第一部分 0 in size-rotateCount
        nums.reverse(nums.size - rotateCount, nums.size - 1) // 第二部分 rotateCount in size
        nums.reverse() // 整個翻轉
        return nums
    }

    private fun IntArray.reverse(start: Int = 0, end: Int = this.size - 1) {
        var i = start
        var j = end
        while (i < j) {
            val temp = this[i]
            this[i] = this[j]
            this[j] = temp
            i++
            j--
        }
    }
}