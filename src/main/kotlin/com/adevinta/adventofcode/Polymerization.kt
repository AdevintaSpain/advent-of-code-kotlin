package com.adevinta.adventofcode

class Polymerization {
    fun findPolymerTemplate(template: String, rules: Map<String, String>): String {
        var finalFormula = ""
        for (index in 0 until template.count() -1) {
            val firstChar = template[index]
            val secondChar = template[index + 1]
            val keyToEvaluate = "$firstChar$secondChar"
            if (rules.containsKey(keyToEvaluate)) {
                finalFormula += "$firstChar${rules[keyToEvaluate]}$secondChar"
            }
        }
        return finalFormula
    }

    fun findAllStep(template: String, rules: Map<String, String>){


        val result  = findPolymerTemplate(template, rules)


    }
}

