package de.pgebert.aoc.utils

/**
 * Converts a multi-line string into a list of strings.
 *
 * This function splits the given string by newline characters ('\n'), and then trims leading and trailing whitespaces
 * from each resulting line.
 *
 * @return A list of strings generated by splitting the input string and trimming leading and trailing whitespaces.
 */
fun String.toInputList(): List<String> = split("\n").mapNotNull { it.trimIndent().takeIf { it.isNotEmpty() } }
