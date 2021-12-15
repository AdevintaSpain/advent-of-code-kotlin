package com.adevinta.adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class AdventOfCodeTest {

    @ParameterizedTest
    @CsvSource(value =
    [
        "28;11, 1",
        "21;81, 1",
        "5, 0",
        "1;1, 0",
        "11, 0",
        "111, 1",
        "639;521;581, 6"
    ])
    fun `find lowest risk`(input: String, expectedResult: Int) {
        val result = AdventOfCode().findLowestRisk(input.split(";"))

        assertThat(result).isEqualTo(expectedResult)
    }
}
