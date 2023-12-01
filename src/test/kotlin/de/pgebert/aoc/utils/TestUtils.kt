package de.pgebert.aoc.utils

import de.pgebert.aoc.Day
import io.mockk.every
import io.mockk.spyk
import org.junit.jupiter.api.Assertions


/**
 * Asserts that the receiver object is equal to the actual object.
 *
 * Usage:
 * actualValue shouldBe expectedValue
 *
 * @param actual The object to be compared with the receiver.
 *
 * @throws AssertionError if the receiver object is not equal to the actual object.
 */
infix fun <T> T.shouldBe(actual: T) = Assertions.assertEquals(this, actual)



/**
 * Sets the input for the current day and returns a spy object of the current day with the input set.
 *
 * This is useful when you want to use example input instead of the file input.
 *
 * @param input The input string to set for the day.
 * @return A spy object of the current day with the input set.
 */
fun Day.withInput(input: String): Day = spyk(this).also {
    every { it.getProperty("inputString") } answers { input }
    every { it.getProperty("inputList") } answers { input.toInputList() }
}
