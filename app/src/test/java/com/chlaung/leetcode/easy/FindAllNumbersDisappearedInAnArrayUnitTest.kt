package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: TwoSumUnitTest
 * @Description: UnitTest for LeetCode 448. Find All Numbers Disappeared in an Array
 *              [https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/]
 * @Date: 2019-10-01 11:30
 */
class FindAllNumbersDisappearedInAnArrayUnitTest {

    private lateinit var mFindAllNumbersDisappearedInAnArray: FindAllNumbersDisappearedInAnArray

    @Before
    fun initTest() {
        mFindAllNumbersDisappearedInAnArray = FindAllNumbersDisappearedInAnArray()
    }

    /** Example 1 */
    @Test
    fun findDisappearedNumbers_Test01() {
        val nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
        val result = mFindAllNumbersDisappearedInAnArray.findDisappearedNumbers(nums)
        val result2 = mFindAllNumbersDisappearedInAnArray.findDisappearedNumbers2(nums)

        val expected = intArrayOf(5, 6)
        Assert.assertEquals(expected.sorted(), result.sorted())
        Assert.assertEquals(expected.sorted(), result2.sorted())
    }
}