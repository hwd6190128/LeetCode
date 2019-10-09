package com.chlaung.leetcode.easy

/**
 * @ClassName: MinStack
 * @Description: 155. Min Stack
 *
 *               Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *                  push(x) -- Push element x onto stack.
 *                  pop() -- Removes the element on top of the stack.
 *                  top() -- Get the top element.
 *                  getMin() -- Retrieve the minimum element in the stack.
 *
 * @Date: 2019-10-08 18:27
 */
class MinStack {

    private val mQueue = arrayListOf<Pair<Int, Int>>()

    fun push(x: Int) {
        mQueue.add(
            if (mQueue.isEmpty()) {
                Pair(x, x)
            } else {
                val lastMin = mQueue.last().second
                val currentMin = Math.min(lastMin, x)
                Pair(x, currentMin)
            }
        )
    }

    fun pop() {
        mQueue.removeAt(mQueue.lastIndex)
    }

    fun top(): Int {
        return mQueue.last().first
    }

    fun getMin(): Int {
        return if (mQueue.isEmpty()) 0 else mQueue.last().second
    }
}