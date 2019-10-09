package com.chlaung.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @ClassName: MinStackUnitTest
 * @Description: UnitTest for LeetCode 155. Min Stack
 *              [https://leetcode.com/problems/min-stack/]
 * @Date: 2019-10-08 18:50
 */
class MinStackUnitTest {

    private lateinit var mMinStack: MinStack

    @Before
    fun initTest() {
        mMinStack = MinStack()
    }

    @Test
    fun minStack_Test01() {
        mMinStack.push(-2)
        mMinStack.push(0)
        mMinStack.push(-3)

        var minResult = mMinStack.getMin()
        var minExpected = -3
        Assert.assertEquals(minResult, minExpected)

        mMinStack.pop()

        val topResult = mMinStack.top()
        val topExpected = 0
        Assert.assertEquals(topResult, topExpected)


        minResult = mMinStack.getMin()
        minExpected = -2
        Assert.assertEquals(minResult, minExpected)
    }

    @Test
    fun minStack_Test02() {
        mMinStack.push(-2)
        mMinStack.push(0)
        mMinStack.push(-1)

        var minResult = mMinStack.getMin()
        var minExpected = -2
        Assert.assertEquals(minResult, minExpected)

        val topResult = mMinStack.top()
        val topExpected = -1
        Assert.assertEquals(topResult, topExpected)

        mMinStack.pop()

        minResult = mMinStack.getMin()
        minExpected = -2
        Assert.assertEquals(minResult, minExpected)
    }

    @Test
    fun minStack_Test03() {
        mMinStack.push(2)
        mMinStack.push(0)
        mMinStack.push(3)
        mMinStack.push(0)

        var minResult = mMinStack.getMin()
        var minExpected = 0
        Assert.assertEquals(minResult, minExpected)

        mMinStack.pop()

        minResult = mMinStack.getMin()
        minExpected = 0
        Assert.assertEquals(minResult, minExpected)

        mMinStack.pop()

        minResult = mMinStack.getMin()
        minExpected = 0
        Assert.assertEquals(minResult, minExpected)

        mMinStack.pop()

        minResult = mMinStack.getMin()
        minExpected = 2
        Assert.assertEquals(minResult, minExpected)
    }

    @Test
    fun minStack_Test04() {
        mMinStack.push(512)
        mMinStack.push(-1024)
        mMinStack.push(-1024)
        mMinStack.push(512)

        mMinStack.pop()

        var minResult = mMinStack.getMin()
        var minExpected = -1024
        Assert.assertEquals(minResult, minExpected)

        mMinStack.pop()

        minResult = mMinStack.getMin()
        minExpected = -1024
        Assert.assertEquals(minResult, minExpected)

        mMinStack.pop()

        minResult = mMinStack.getMin()
        minExpected = 512
        Assert.assertEquals(minResult, minExpected)
    }

    @Test
    fun minStack_Test05() {
        mMinStack.push(1)
        mMinStack.push(2)

        var topResult = mMinStack.top()
        var topExpected = 2
        Assert.assertEquals(topResult, topExpected)

        var minResult = mMinStack.getMin()
        var minExpected = 1
        Assert.assertEquals(minResult, minExpected)

        mMinStack.pop()

        minResult = mMinStack.getMin()
        minExpected = 1
        Assert.assertEquals(minResult, minExpected)

        topResult = mMinStack.top()
        topExpected = 1
        Assert.assertEquals(topResult, topExpected)
    }
}