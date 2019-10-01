package com.chlaung.leetcode.easy

/**
 * @ClassName: HappyNumber
 * @Description: 202. Happy Number
 *
 *               Write an algorithm to determine if a number is "happy".
 *               A happy number is a number defined by the following process: Starting with any positive integer,
 *               replace the number by the sum of the squares of its digits,
 *               and repeat the process until the num ber equals 1 (where it will stay),
 *               or it loops endlessly in a cycle which does not include 1.
 *               Those numbers for which this process ends in 1 are happy numbers.
 * @Date: 2019-10-1 19:45
 */
class HappyNumber {

    fun isHappy(n: Int): Boolean {

        /**
         * 將算過的值存進 set，若出現 set 已有的數字，即代表出現無窮迴圈
         * 算到出現１為 return true 或是算到出現無窮迴圈 return false
         */
        var result = n
        val map = HashSet<Int>()

        while (!map.contains(result)) {
            map.add(result)
            val nArray = result.toString().map(Character::getNumericValue)
            result = 0
            for (i in nArray.indices) {
                result += nArray[i] * nArray[i]
            }

            if (result == 1) return true
        }

        return false
    }
}