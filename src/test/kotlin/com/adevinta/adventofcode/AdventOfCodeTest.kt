package com.adevinta.adventofcode

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class AdventOfCodeTest {

  private val adventoOfCode = AdventOfCode()

  @Test
  fun `should call advent of code`() {
    assertThat(AdventOfCode().saySomething()).isEqualTo("hello!")
  }

  @ParameterizedTest
  @ValueSource(strings = ["()", "[]"])
  internal fun `search syntax scoring`(input: String) {

    val result = adventoOfCode.syntaxScoring(input)

    assertThat(result).isTrue

  }

  @ParameterizedTest
  @ValueSource(strings = ["())", "[[]", ")(", "{([(<{}[<>[]}>{[]{[(<()>"])
  internal fun `search incorrect syntax scoring`(input: String) {

    val result = adventoOfCode.syntaxScoring(input)

    assertThat(result).isFalse

  }
}
