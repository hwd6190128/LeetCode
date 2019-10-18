package com.chlaung.leetcode.easy

import java.time.LocalDate

/**
 * @ClassName: DayOfTheYear
 * @Description: 1154. Day of the Year
 *
 *               Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD,
 *               return the day number of the year.
 *
 *               Constraints:
 *                  a. date.length == 10
 *                  b. date[4] == date[7] == '-', and all other date[i]'s are digits
 *                  c. date represents a calendar date between Jan 1st, 1900 and Dec 31, 2019.
 * @Date: 2019-10-16 15:57
 */
class DayOfTheYear {

    fun dayOfYear(date: String): Int {
        return LocalDate.parse(date).getDayOfYear()
    }

    fun dayOfYear2(date: String): Int {
        val d = date.split("-")
        val isLeap = isLeapYear(d[0].toInt())
        var day = 0
        repeat(d[1].toInt()) {
            day += getMonth(it, isLeap)
        }
        return day + d[2].toInt()
    }

    private fun getMonth(m: Int, isLeapYear: Boolean): Int {
        return when (m) {
            0 -> 0
            1, 3, 5, 7, 8, 10, 12 -> 31
            2 -> if (isLeapYear) 29 else 28
            else -> 30
        }
    }

    fun dayOfYear3(date: String): Int {
        val d = date.split("-")
        return getMonth2(d[1], isLeapYear(d[0].toInt())) + d[2].toInt()
    }

    private fun getMonth2(m: String, isLeapYear: Boolean): Int {
        val leap = if (isLeapYear) 1 else 0
        return when (m) {
            "01" -> 0
            "02" -> 31
            "03" -> 59 + leap
            "04" -> 90 + leap
            "05" -> 120 + leap
            "06" -> 151 + leap
            "07" -> 181 + leap
            "08" -> 212 + leap
            "09" -> 243 + leap
            "10" -> 273 + leap
            "11" -> 304 + leap
            else -> 334 + leap
        }
    }

    private fun isLeapYear(y: Int): Boolean {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)
    }
}