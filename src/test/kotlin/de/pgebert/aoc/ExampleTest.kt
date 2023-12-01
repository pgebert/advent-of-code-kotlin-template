package de.pgebert.aoc

import de.pgebert.aoc.days.Day01
import de.pgebert.aoc.utils.shouldBe
import de.pgebert.aoc.utils.withInput
import org.junit.jupiter.api.Test


class ExampleTest {

    @Test
    fun `testing day 01 example`() {
        val example = """
            1abc2
            3abc4
        """

        val day = Day01.withInput(example)

        day.partOne() shouldBe NOT_IMPLEMENTED
    }
}
