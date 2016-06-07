package com.slashgear.quicksort

class LomutoParallelSort : LomutoSort() {

    override fun <T : Comparable<T>> callSortOnPartitions(arr: MutableList<T>, lo: Int, hi: Int, p: Int) {
        val leftThread = PartitionSortThread(LomutoParallelSort(), arr, lo, p - 1)
        val rightThread = PartitionSortThread(LomutoParallelSort(), arr, p + 1, hi)
        leftThread.start()
        rightThread.start()
        leftThread.join()
        rightThread.join()
    }
}