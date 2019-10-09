package com.chlaung.leetcode.easy

/**
 * @ClassName: CountAndSay
 * @Description: 38. Count and Say
 *
 *               The count-and-say sequence is the sequence of integers with the first five terms as following:
 *               1. 1
 *               2. 11
 *               3. 21
 *               4. 1211
 *               5. 111221
 *
 *               1 is read off as "one 1" or 11.
 *               11 is read off as "two 1s" or 21.
 *               21 is read off as "one 2, then one 1" or 1211.
 *
 *               Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 *
 *               Note: Each term of the sequence of integers will be represented as a string.
 * @Date: 2019-10-03 17:41
 */
class CountAndSay {

    fun countAndSay(n: Int): String {
        if (n == 1) return "1"

        var tempResult = "11"

        repeat(n - 2) {
            tempResult = parserNum(tempResult)
        }

        return tempResult
    }

    private fun parserNum(n: String): String {
        val result = StringBuilder()
        var num: String
        var numCount = 1

        for (i in 0 until n.count()) {
            num = n[i].toString()
            if (i != n.lastIndex && n[i] == n[i + 1]) {
                numCount += 1
            } else {
                result.append(numCount).append(num)
                numCount = 1
            }
        }

        return result.toString()
    }
}