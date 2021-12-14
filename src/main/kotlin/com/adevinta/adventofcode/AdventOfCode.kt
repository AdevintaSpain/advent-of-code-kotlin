package com.adevinta.adventofcode

import kotlin.system.exitProcess

enum class Result {
    COMPLETE,
    INCOMPLETE,
    CORRUPTED
}

class AdventOfCode {
    fun saySomething() = "hello!"

    fun syntaxScoring(firstInput: String): Boolean {

        var parentesis = 0
        var llave = 0
        var masmenos = 0
        var corchete = 0


        firstInput.forEach {
            when (it) {
                '(' -> parentesis += 1
                ')' -> parentesis -= 1
                '{' -> llave += 1
                '}' -> llave -= 1
                '<' -> masmenos += 1
                '>' -> masmenos -= 1
                '[' -> corchete += 1
                ']' -> corchete -= 1
            }

            if (parentesis < 0 || llave < 0 || masmenos < 0 || corchete < 0) return false
        }

        return parentesis == 0 && llave == 0 && masmenos == 0 && corchete == 0

    }
}

enum class characterçtype(simbol: Char){
    PARENTESIS('(')




}

data class Character(
    val open: Int = 0,
    val close: Int = 0
) {
    companion object {
        fun incress(character: Character) = Character(
            open = character.open + 1
        )

        fun decress(character: Character): Character {
            if (character.close - 1 < 0) throw exitProcess(0)
            return Character(close = character.close - 1)
        }
    }
}


/*
data class character(
    val open: Int = 0,
    val close: Int = 0
) {
    fun incress() {
        this.copy(open = open + 1)
    }

    fun decress() {
        if (close -1 < 0) throw exitProcess(0)
        this.copy(close = close -1)
    }
}


 */
