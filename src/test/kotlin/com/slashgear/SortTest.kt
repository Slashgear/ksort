package com.slashgear

import org.junit.Test
import kotlin.test.assertEquals

abstract class SortTest(private val algorithm: SortAlgorithm) : LoadValues() {

    @Test
    fun sort() {
        assertEquals(algorithm.sort(values),sortedValues)
    }

}