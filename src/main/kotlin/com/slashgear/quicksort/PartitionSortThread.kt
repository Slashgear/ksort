package com.slashgear.quicksort

/**
 * @author Alexandre Galdeano
 * @date 06/06/2016
 */
class PartitionSortThread<T : Comparable<T>>(val quickSortAlgorithm: QuickSortAlgorithm, val arr: MutableList<T>, val lo: Int, val hi: Int) : Thread() {
    override fun run() {
        quickSortAlgorithm.sort(arr, lo, hi)
    }
}