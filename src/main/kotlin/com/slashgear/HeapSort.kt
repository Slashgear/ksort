package com.slashgear

class HeapSort : SortAlgorithm {
    override fun <T : Comparable<T>> sort(arr: MutableList<T>): MutableList<T> {
        for (i in arr.size / 2 downTo 0) {
            sift(arr, i, arr.size - 1)
        }
        for (i in arr.size - 1 downTo 1) {
            arr.swap(i, 0)
            sift(arr, 0, i - 1)
        }
        return arr
    }

    private fun <T : Comparable<T>> sift(arr: MutableList<T>, start: Int, end: Int): MutableList<T> {
        var k = start
        var j = 2 * k
        while (j <= end) {
            if (j < end && arr[j] < arr[j + 1]) {
                j += 1
            }
            if (arr[k] >= arr[j])
                return arr
            arr.swap(k, j);
            k = j
            j = 2 * k
        }
        return arr
    }
}
