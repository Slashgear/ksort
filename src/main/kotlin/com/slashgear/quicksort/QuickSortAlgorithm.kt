package com.slashgear.quicksort

import com.slashgear.SortAlgorithm

abstract class QuickSortAlgorithm : SortAlgorithm {

    override fun <T : Comparable<T>> sort(arr: MutableList<T>) = sort(arr, 0, arr.size - 1)

    fun <T : Comparable<T>> sort(arr: MutableList<T>, lo: Int, hi: Int): MutableList<T> {
        if (lo >= hi)
            return arr
        val p = partition(arr, lo, hi)
        callSortOnPartitions(arr, lo, hi, p)
        return arr
    }

    abstract fun <T : Comparable<T>> callSortOnPartitions(arr: MutableList<T>, lo: Int, hi: Int, p: Int)

    abstract fun <T : Comparable<T>> partition(arr: MutableList<T>, lo: Int, hi: Int): Int
}