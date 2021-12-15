package com.adevinta.adventofcode

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class PolymerTemplateTest {

    private val polymerTemplate = Polymerization()

    @Test
    fun `generate the polymer`() {
        val template = "NNCB"
        val rules = mapOf(
            "CH" to "B",
            "HH" to "N",
            "CB" to "H",
            "NH" to "C",
            "HB" to "C",
            "HC" to "B",
            "HN" to "C",
            "NN" to "C",
            "BH" to "H",
            "NC" to "B",
            "NB" to "B",
            "BN" to "B",
            "BB" to "N",
            "BC" to "B",
            "CC" to "N",
            "CN" to "C")

        val result = polymerTemplate.findPolymerTemplate(template, rules)

        Assertions.assertThat(result).isEqualTo("NCNBCHB")
    }
}