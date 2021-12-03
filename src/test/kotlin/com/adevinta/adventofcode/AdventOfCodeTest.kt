package com.adevinta.adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdventOfCodeTest {

  @Test
  fun `should call advent of code`() {
    assertThat(AdventOfCode().saySomething()).isEqualTo("hello!")
  }
}
