package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: DayOfTheYearUnitTest
 * @Description: UnitTest for LeetCode 1154. Day of the Year
 *              [https://leetcode.com/problems/day-of-the-year/]
 * @Date: 2019-10-16 15:59
 */
class DayOfTheYearUnitTest {

    private lateinit var mDayOfTheYear: DayOfTheYear

    @Before
    fun initTest() {
        mDayOfTheYear = DayOfTheYear()
    }

    @Test
    fun dayOfTheYear_Test01() {
        val date = "2019-01-09"
        val result = mDayOfTheYear.dayOfYear(date)
        val result2 = mDayOfTheYear.dayOfYear2(date)
        val result3 = mDayOfTheYear.dayOfYear3(date)
        val expected = 9

        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
        Assert.assertEquals(expected, result3)
    }

    @Test
    fun dayOfTheYear_Test02() {
        val date = "2019-02-10"
        val result = mDayOfTheYear.dayOfYear(date)
        val result2 = mDayOfTheYear.dayOfYear2(date)
        val result3 = mDayOfTheYear.dayOfYear3(date)

        val expected = 41

        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
        Assert.assertEquals(expected, result3)
    }

    @Test
    fun dayOfTheYear_Test03() {
        val date = "2003-03-01"
        val result = mDayOfTheYear.dayOfYear(date)
        val result2 = mDayOfTheYear.dayOfYear2(date)
        val result3 = mDayOfTheYear.dayOfYear3(date)

        val expected = 60

        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
        Assert.assertEquals(expected, result3)
    }

    @Test
    fun dayOfTheYear_Test04() {
        val date = "2004-03-01"
        val result = mDayOfTheYear.dayOfYear(date)
        val result2 = mDayOfTheYear.dayOfYear2(date)
        val result3 = mDayOfTheYear.dayOfYear3(date)

        val expected = 61

        Assert.assertEquals(expected, result)
        Assert.assertEquals(expected, result2)
        Assert.assertEquals(expected, result3)
    }
}