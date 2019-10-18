package com.chlaung.leetcode.easy

/**
 * @ClassName: RelativeRanks
 * @Description: 506. Relative Ranks
 *
 *               Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
 *               who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 *
 *               Note:
 *                  1. N is a positive integer and won't exceed 10,000.
 *                  2. All the scores of athletes are guaranteed to be unique.
 * @Date: 2019-10-16 18:35
 */
class RelativeRanks {

    fun findRelativeRanks(nums: IntArray): Array<String> {

        val map = hashMapOf<Int, Int>() // key = item, value = index
        nums.forEachIndexed { index, item ->
            map[item] = index
        }

        nums.sortDescending()

        val res = nums.map { it.toString() }.toTypedArray()
        nums.forEachIndexed { index, item ->
            res[map.getValue(item)] = when (index) {
                0 -> {
                    "Gold Medal"
                }
                1 -> {
                    "Silver Medal"
                }
                2 -> {
                    "Bronze Medal"
                }
                else -> (index + 1).toString()
            }
        }

        return res
    }
}