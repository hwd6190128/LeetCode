package com.chlaung.leetcode

/**
 * @ClassName: IntersectionOfTwoArraysII
 * @Description: 350. Given two arrays, write a function to compute their intersection.
1. Each element in the result should appear as many times as it shows in both arrays.
2. The result can be in any order.
 *
 * @Date: 2019-08-19 11:52
 * @History:
 * <date> <version> <desc>
 */
class IntersectionOfTwoArraysII {

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {

        val resultArray = arrayListOf<Int>() // 結果暫存 array

        // iterator nums1
        nums1.forEach { target ->
            run breaking@{
                val intersectionCount = run {
                    val num1TargetCount = nums1.count { it == target } // 計算 target 在 nums1 中出現的次數
                    val num2TargetCount = nums2.count { it == target } // 計算 target 在 nums2 中出現的次數
                    if (num1TargetCount < num2TargetCount) num1TargetCount else num2TargetCount // 取最小的交集數量
                }

                if (intersectionCount == 0) return@breaking // 如果為零，代表此數沒有交集，跳出

                val resultCount = resultArray.count { it == target } // 取出此數在 result array 中已有數量
                if (resultCount < intersectionCount) {                   // result array 尚未滿足最小的交集數量
                    resultArray.add(target)                              // 將 value 加入 result array
                }
            }
        }

        return resultArray.toIntArray()
    }

    fun intersectImprove(nums1: IntArray, nums2: IntArray): IntArray {

        // new 一個 map，以 nums1 的每個 value 為 key，並計算其出現的次數
        val nums1Map = hashMapOf<Int, Int>()
        for (num in nums1) {
            nums1Map[num] = nums1Map.getOrDefault(num, 0) + 1
        }

        val result = arrayListOf<Int>() // result array

        for (num in nums2) {
            // 確認 nums2 中是否有 map 中的值，有的話放入 result array，並減一次 map 中的 value，直到該 value 為 0
            if (nums1Map.containsKey(num) && nums1Map[num] != 0) {
                result.add(num)
                nums1Map[num] = nums1Map[num]!! - 1
            }
        }

        return result.toIntArray()
    }
}