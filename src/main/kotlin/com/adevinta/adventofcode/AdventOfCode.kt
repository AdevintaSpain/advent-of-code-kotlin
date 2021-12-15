package com.adevinta.adventofcode

class AdventOfCode {
    fun findLowestRisk(input: List<String>): Int {

        if ((input.size == 1 && input[0].length <= 2) || (input.size == 2 && input[0].length == 1)) return 0

        var riskPathRight = Int.MAX_VALUE
        if (input[0].length >= 2) {
            riskPathRight = (input[0][1].digitToInt()) + findLowestRisk(input.map { it.drop(1) })
        }

        return if (input.size >= 2) {
            val riskPathDown = (input[1][0].digitToInt()) + findLowestRisk(input.drop(1))
            minOf(riskPathDown, riskPathRight)
        } else {
            riskPathRight
        }
    }
}
