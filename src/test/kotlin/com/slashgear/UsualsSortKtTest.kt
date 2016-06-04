package com.slashgear

import com.slashgear.ksort.bubbleSort
import com.slashgear.ksort.insertionSort
import com.slashgear.ksort.swap
import org.junit.Test
import kotlin.test.assertEquals

class UsualsSortKtTest : LoadValues() {

    @Test
    fun swap() {
        var list = mutableListOf(3, 2, 1)
        list.swap(0, 2)
        assertEquals(mutableListOf(1, 2, 3), list)
    }

    @Test
    fun bubbleSort() {
        var copyValues = values.toMutableList()
        copyValues.bubbleSort()
        assertEquals(copyValues, sortedValues)
    }

    @Test
    fun insertionSort() {
        var copyValues = values.toMutableList()
        copyValues.insertionSort()
        assertEquals(copyValues, sortedValues)
    }
}