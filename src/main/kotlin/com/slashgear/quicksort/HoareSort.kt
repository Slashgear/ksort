package com.slashgear.quicksort

import com.slashgear.swap

open class HoareSort : QuickSortAlgorithm() {

    override fun <T : Comparable<T>> callSortOnPartitions(arr: MutableList<T>, lo: Int, hi: Int, p: Int) {
        sort(arr, lo, p)
        sort(arr, p + 1, hi)
    }

    override fun <T : Comparable<T>> partition(arr: MutableList<T>, lo: Int, hi: Int): Int {
        val pivot = arr[lo]
        var i = lo - 1
        var j = hi + 1
        do {
            while (arr[++i] < pivot);
            while (arr[--j] > pivot);
            if (i >= j)
                return j
            arr.swap(i, j)
        } while (true)
        return -1
    }
}