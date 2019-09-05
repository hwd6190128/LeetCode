package com.chlaung.leetcode.easy

/**
 * @ClassName: MoveZeroes
 * @Description: 283. Move Zeroes
 *               Given an array nums, write a function to move all 0's to the end of it while maintaining the relative
 *               order of the non-zero elements.
 * @Date: 2019-08-26 15:15
 */
class MoveZeroes {

    fun moveZeroes(nums: IntArray): IntArray {
        if (nums.contains(0)) {
            var position = 0
            nums.forEachIndexed { index, element ->
                if (element != 0) {
                    nums[index] = 0
                    nums[position] = element
                    position += 1
                }
            }
        }
        return nums
    }

}