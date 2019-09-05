package com.chlaung.leetcode.easy

/**
 * @ClassName: MergeSortedArray
 * @Description: 88. Merge Sorted Array
 *               Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *               1. The number of elements initialized in nums1 and nums2 are m and n respectively.
 *               2. You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold
 *               additional elements from nums2.
 * @Date: 2019-08-26 16:33
 */
class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
        nums2.forEachIndexed { index, element ->
            nums1[m + index] = element
        }
        nums1.sort()
        return nums1
    }
}