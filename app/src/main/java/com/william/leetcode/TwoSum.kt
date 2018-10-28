package com.william.leetcode

fun main(args: Array<String>) {
    println("Answer: ${twoSumSolution1(intArrayOf(2, 7, 9, 11), 9).asList()}")
    println("Answer: ${twoSumSolution2(intArrayOf(2, 7, 9, 11), 9).asList()}")
}

fun twoSumSolution1(nums: IntArray, target: Int): IntArray {
    for (i in 0..nums.size - 2) {
        for (j in i + 1 until nums.size - 1) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    throw IllegalArgumentException("No solution!")
}

fun twoSumSolution2(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()

    for (i in 0..nums.size) {
        if (map.containsKey(nums[i])) {
            return intArrayOf(map[nums[i]]!!.toInt(), i)
        }
        map[target - nums[i]] = i
    }
    throw IllegalArgumentException("No solution!")
}