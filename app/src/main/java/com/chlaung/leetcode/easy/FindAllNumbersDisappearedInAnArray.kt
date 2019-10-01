package com.chlaung.leetcode.easy

/**
 * @ClassName: FindAllNumbersDisappearedInAnArray
 * @Description: 448. Find All Numbers Disappeared in an Array
 *
 *               Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 *               some elements appear twice and others appear once.
 *               Find all the elements of [1, n] inclusive that do not appear in this array.
 *               Could you do it without extra space and in O(n) runtime? You may assume the returned list does not
 *               count as extra space.
 * @Date: 2019-10-01 13:54
 */
class FindAllNumbersDisappearedInAnArray {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {

        /**
         * 由於 1 ≤ a[i] ≤ n (array 的值全都在 index 範圍內)
         * 建立ㄧ個與 nums 等長的 boolArray，預設為 false
         * iterator 整個 nums 的 item，將該值作為 boolArray 的 index 設為 true
         */
        val boolArray = BooleanArray(nums.size + 1)
        repeat(nums.size) {
            boolArray[nums[it]] = true
        }

        // iterator boolArray，只要為 false，則表示該 index 不曾出現在 nums 中
        val result = arrayListOf<Int>()
        repeat(boolArray.size) {
            if (it != 0 && !boolArray[it]) {
                result.add(it)
            }
        }

        return result
    }

    fun findDisappearedNumbers2(nums: IntArray): List<Int> {

        /**
         * 由於 1 ≤ a[i] ≤ n (array 的值全都在 index 範圍內)
         * 將 array 中的值作 index，將其 index 的值轉為負數
         */
        repeat(nums.size) {
            val num = Math.abs(nums[it])
            val newIndex = num - 1
            if (nums[newIndex] > 0) {
                nums[newIndex] = -nums[newIndex]
            }
        }

        // iterator 整個 nums 的 item，若為正數，即代表 nums 不曾出現過該值，取其 index
        val result = arrayListOf<Int>()
        repeat(nums.size) {
            if (nums[it] >= 0) {
                result.add(it + 1)
            }
        }

        return result
    }
}