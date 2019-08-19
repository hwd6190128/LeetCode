package com.chlaung.leetcode

import org.junit.Assert
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * UnitTest for LeetCode 350. Intersection of Two Arrays II
 * [https://leetcode.com/problems/intersection-of-two-arrays-ii/]
 */
class IntersectionOfTwoArraysIIUnitTest {

    /** Example 1 */
    @Test
    fun intersectionOfTwoArraysII_Test01() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)
        val resultArray = intersectionOfTwoArraysII.intersect(nums1, nums2)

        val expected = intArrayOf(2, 2)
        assertArrayEquals(expected, resultArray)
    }

    @Test
    fun intersectionOfTwoArraysII_Test01_Improve() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)
        val resultArray = intersectionOfTwoArraysII.intersectImprove(nums1, nums2)

        val expected = intArrayOf(2, 2)
        assertArrayEquals(expected, resultArray)
    }

    /** Example 2 */
    @Test
    fun intersectionOfTwoArraysII_Test02() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(4, 9, 5)
        val nums2 = intArrayOf(9, 4, 9, 8, 4)
        val resultArray = intersectionOfTwoArraysII.intersect(nums1, nums2)

        val expected = intArrayOf(4, 9)
        assertTrue(expected.sort() == resultArray.sort())
    }

    @Test
    fun intersectionOfTwoArraysII_Test02_Improve() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(4, 9, 5)
        val nums2 = intArrayOf(9, 4, 9, 8, 4)
        val resultArray = intersectionOfTwoArraysII.intersectImprove(nums1, nums2)

        val expected = intArrayOf(4, 9)
        assertTrue(expected.sort() == resultArray.sort())
    }

    /** sorted array */
    @Test
    fun intersectionOfTwoArraysII_Test03() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(5, 7, 9)
        val nums2 = intArrayOf(1, 2, 3, 7, 9)
        val resultArray = intersectionOfTwoArraysII.intersect(nums1, nums2)

        val expected = intArrayOf(7, 9)
        assertArrayEquals(expected, resultArray)
    }

    @Test
    fun intersectionOfTwoArraysII_Test03_Improve() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(5, 7, 9)
        val nums2 = intArrayOf(1, 2, 3, 7, 9)
        val resultArray = intersectionOfTwoArraysII.intersectImprove(nums1, nums2)

        val expected = intArrayOf(7, 9)
        assertArrayEquals(expected, resultArray)
    }

    /** not equals */
    @Test
    fun intersectionOfTwoArraysII_Test04() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(7, 8, 9)
        val nums2 = intArrayOf(1, 2, 3, 4, 7)
        val resultArray = intersectionOfTwoArraysII.intersect(nums1, nums2)

        val expected = intArrayOf(7, 8, 9)
        Assert.assertNotEquals(expected, resultArray)
    }

    @Test
    fun intersectionOfTwoArraysII_Test04_Improve() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(7, 8, 9)
        val nums2 = intArrayOf(1, 2, 3, 4, 7)
        val resultArray = intersectionOfTwoArraysII.intersectImprove(nums1, nums2)

        val expected = intArrayOf(7, 8, 9)
        Assert.assertNotEquals(expected, resultArray)
    }

    /** submit 01 */
    @Test
    fun intersectionOfTwoArraysII_Test05() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2)
        val resultArray = intersectionOfTwoArraysII.intersect(nums1, nums2)

        val expected = intArrayOf(2)
        assertArrayEquals(expected, resultArray)
    }

    @Test
    fun intersectionOfTwoArraysII_Test05_Improve() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2)
        val resultArray = intersectionOfTwoArraysII.intersectImprove(nums1, nums2)

        val expected = intArrayOf(2)
        assertArrayEquals(expected, resultArray)
    }

    /** submit 02*/
    @Test
    fun intersectionOfTwoArraysII_Test06() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(
            61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86,
            58, 77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3, 41, 53, 26,
            66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92, 31, 43, 81,
            88, 60, 10, 55, 66, 82, 0, 79, 11, 81
        )
        val nums2 = intArrayOf(
            5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38,
            85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48
        )
        val resultArray = intersectionOfTwoArraysII.intersect(nums1, nums2)

        val expected = intArrayOf(5, 4, 57, 79, 7, 89, 88, 45, 34, 92, 38, 85, 6, 0, 77, 44, 61)
        assertTrue(expected.sort() == resultArray.sort())
    }

    @Test
    fun intersectionOfTwoArraysII_Test06_Improve() {
        val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()

        val nums1 = intArrayOf(
            61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86,
            58, 77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3, 41, 53, 26,
            66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92, 31, 43, 81,
            88, 60, 10, 55, 66, 82, 0, 79, 11, 81
        )
        val nums2 = intArrayOf(
            5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38,
            85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48
        )
        val resultArray = intersectionOfTwoArraysII.intersectImprove(nums1, nums2)

        val expected = intArrayOf(5, 4, 57, 79, 7, 89, 88, 45, 34, 92, 38, 85, 6, 0, 77, 44, 61)
        assertTrue(expected.sort() == resultArray.sort())
    }
}
