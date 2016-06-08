package com.slashgear

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun <T : Comparable<T>> MutableList<T>.ksort(sortAlgorithm: SortAlgorithm): MutableList<T> {
    return sortAlgorithm.sort(this)
}