package com.william.leetcode

// Note: $rev need to be Long cause the $rev in calculation might overflow
fun main(args: Array<String>) {
    println("Answer: ${reverseInteger1(-2147483648)}")
    println("Answer: ${reverseInteger2(-2147483648)}")
}

// Note：Math.abs(Int.MIN_VALE) will cause overflow
fun reverseInteger1(num: Int): Int {
    var rev = kotlin.math.abs(num.toLong()).toString().reversed().toLong()
    rev = if (num < 0) -rev else rev

    return if (rev < Int.MIN_VALUE || rev > Int.MAX_VALUE) 0 else rev.toInt()
}

fun reverseInteger2(num: Int): Int {
    var x = num
    var rev: Long = 0
    while (x != 0) {
        rev = rev * 10 + x % 10
        x /= 10
    }

    return if (rev < Int.MIN_VALUE || rev > Int.MAX_VALUE) 0 else rev.toInt()
}