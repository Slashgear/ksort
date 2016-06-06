package com.slashgear

class BubbleSort : SortAlgorithm {

    override fun <T : Comparable<T>> sort(arr: MutableList<T>): MutableList<T> {
        var swappedElements: Boolean
        do {
            swappedElements = false
            for (i in 0..arr.size - 2) {
                if (arr[i] > arr[i + 1]) {
                    arr.swap(i, i + 1)
                    swappedElements = true
                }
            }
        } while (swappedElements)
        return arr;
    }


}