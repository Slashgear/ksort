package com.slashgear

interface SortAlgorithm {

     fun <T : Comparable<T>> sort(arr : MutableList<T>):MutableList<T>

}