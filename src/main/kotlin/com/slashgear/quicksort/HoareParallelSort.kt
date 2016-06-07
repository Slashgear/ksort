package com.slashgear.quicksort

class HoareParallelSort : HoareSort() {

    override fun <T : Comparable<T>> callSortOnPartitions(arr: MutableList<T>, lo: Int, hi: Int, p: Int) {
        val leftThread = PartitionSortThread(HoareParallelSort(), arr, lo, p)
        val rightThread = PartitionSortThread(HoareParallelSort(), arr, p + 1, hi)
        leftThread.start()
        rightThread.start()
        leftThread.join()
        rightThread.join()
    }
}
