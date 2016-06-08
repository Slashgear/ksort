package com.slashgear.quicksort

import com.slashgear.swap

object LomutoSort : QuickSortAlgorithm() {

    override fun <T : Comparable<T>> callSortOnPartitions(arr: MutableList<T>, lo: Int, hi: Int, p: Int) {
        sort(arr, lo, p - 1)
        sort(arr, p + 1, hi)
    }

    override fun <T : Comparable<T>> partition(arr: MutableList<T>, lo: Int, hi: Int): Int {
        val pivot = arr[hi]
        var i = lo
        for (j in lo..hi - 1)
            if (arr[j] <= pivot)
                arr.swap(i++, j)
        arr.swap(i, hi)
        return i
    }
}