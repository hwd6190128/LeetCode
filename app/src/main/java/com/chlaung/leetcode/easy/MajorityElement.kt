package com.chlaung.leetcode.easy

/**
 * @ClassName: MajorityElement
 * @Description: 169. Majority Element Given an array of size n, find the majority element.
 *               The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *               You may assume that the array is non-empty and the majority element always exist in the array.
 * @Date: 2019-09-18 16:30
 */
class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        val tempMap = hashMapOf<Int, Int>()
        for (element in nums) {
            if (!tempMap.containsKey(element)) {
                tempMap[element] = nums.count { it == element }
            }
        }

        val appears = nums.size / 2
        var result = 0
        for (item in tempMap) {
            item.takeIf { it.value > appears && it.value > result }?.apply { result = this.key }
        }

        return result
    }

    fun majorityElement2(nums: IntArray): Int {
        var result = nums[0]
        var count = 0
        nums.forEachIndexed { index, _ ->
            if (count == 0 || result == nums[index]) {
                result = nums[index]
                count += 1
            } else {
                count -= 1
            }
        }
        return result
    }

    fun majorityElement3(nums: IntArray): Int {
        nums.sort()
        return nums[nums.size / 2]
    }
}