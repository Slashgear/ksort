package com.slashgear

class MergeSort : SortAlgorithm {

    override fun <T : Comparable<T>> sort(arr: MutableList<T>): MutableList<T> {
        cut(arr, 0, arr.size - 1)
        return arr
    }

    private fun <T : Comparable<T>> cut(arr: MutableList<T>, startIndex: Int, endIndex: Int) {
        val pieceSize = endIndex - startIndex + 1
        if (pieceSize == 1) {
            return //Single element piece case
        }
        val middleElementIndex = Math.floor((startIndex + endIndex) / 2.0).toInt()
        cut(arr, startIndex, middleElementIndex)
        cut(arr, middleElementIndex + 1, endIndex)
        merge(arr, startIndex, middleElementIndex, endIndex)
    }

    private fun <T : Comparable<T>> merge(arr: MutableList<T>, startIndex: Int, middleIndex: Int, endIndex: Int) {
        val leftArray = arr.subList(startIndex, middleIndex + 1).toMutableList()
        val rightArray = arr.subList(middleIndex + 1, endIndex + 1).toMutableList()
        var i = 0
        var j = 0
        for (k in startIndex..endIndex) {
            if ((i <= leftArray.size - 1) && ((j >= rightArray.size) || (leftArray[i] <= rightArray[j]))) {
                arr[k] = leftArray[i]
                i++
            } else {
                arr[k] = rightArray[j]
                j++
            }
        }
    }
}