package com.slashgear

class SelectionSort :SortAlgorithm{
    override fun <T : Comparable<T>> sort(arr: MutableList<T>): MutableList<T> {
        for (unsortedPartFirstIndex in 0..arr.size - 1){
            var minNumberIndex = unsortedPartFirstIndex;
            for (unsortedPartCurrentIndex in unsortedPartFirstIndex..arr.size - 1){
                if (arr[unsortedPartCurrentIndex] < arr[minNumberIndex]){
                    minNumberIndex = unsortedPartCurrentIndex;
                }
            }
            if (minNumberIndex != unsortedPartFirstIndex){
                arr.swap(unsortedPartFirstIndex, minNumberIndex);
            }
        }
        return arr;
    }
}