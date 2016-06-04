package com.slashgear

class InsertionSort : SortAlgorithm {

    override fun <T : Comparable<T>> sort(arr: MutableList<T>): MutableList<T> {
        for (j in 1..arr.size - 1){
            var i = j - 1;
            val temp = arr[j];
            while ( (i >= 0) && (arr[i] > temp) ){
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = temp;
        }
        return arr;
    }
}