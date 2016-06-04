package com.slashgear.ksort

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun <T :Comparable<T>> MutableList<T>.bubbleSort(){
    val reversedList = this.asReversed()
    reversedList.forEachIndexed { i, rElem ->
        this.subList(0,i).forEachIndexed { j, elem ->
            if(this[i]<this[j]){
                this.swap(i,j)
            }
        }
    }
}

fun <T :Comparable<T>> MutableList<T>.insertionSort(){
    this.forEachIndexed { i, elem ->
        var j = i
        while( j>0 && this[j - 1]> elem){
            this[j] = this[j-1]
            j--
        }
        this[j] = elem
    }
}