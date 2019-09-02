package com.chlaung.leetcode

/**
 * @ClassName: PascalsTriangle
 * @Description: 118. Pascal's Triangle
 *               Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *               In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * @Date: 2019-09-02 16:53
 */
class PascalsTriangle {

    fun generate(numRows: Int): List<List<Int>> {
        if (numRows == 0) return arrayListOf()

        val result = arrayListOf(arrayListOf(1))

        for (i in 1 until numRows) {
            val prevRow = result[i - 1]
            val curRow = arrayListOf(1)

            for (j in 1 until i) {
                val pre = prevRow[j - 1]
                val cur = prevRow[j]
                curRow.add(pre + cur)
            }
            curRow.add(1)
            result.add(curRow)
        }

        return result
    }
}