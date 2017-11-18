package kotlin_algorithm

import sun.nio.cs.Surrogate.high
import sun.nio.cs.Surrogate.low

/**
 * kotlin特性实现快速排序
 */
fun <T:Comparable<T>> quickSort(items:List<T>): List<T>{
    if(items.count() < 2) return items

    val middle = items[items.count()/2]
    val equal = items.filter { it == middle }
    val less = items.filter { it < middle }
    val greater = items.filter { it > middle }
    return quickSort(less) + equal + quickSort(greater)
}

/**
 * Java翻译版
 */
fun <T:Comparable<T>> quickSort2(items:Array<T>,low: Int,high: Int){
    if (low < high) {
        val pivot = partition(items, low, high)                  //将数组分为两部分
        quickSort2(items, low, pivot - 1)                   //递归排序左子数组
        quickSort2(items, pivot + 1, high)                  //递归排序右子数组
    }
}

fun <T:Comparable<T>>partition(arr: Array<T>,low: Int, high: Int): Int {
    var low = low
    var high = high
    val pivot = arr[low]     //枢轴记录
    while (low < high) {
        while (low < high && arr[high] >= pivot) --high
        arr[low] = arr[high]             //交换比枢轴小的记录到左端
        while (low < high && arr[low] <= pivot) ++low
        arr[high] = arr[low]           //交换比枢轴小的记录到右端
    }
    //扫描完成，枢轴到位
    arr[low] = pivot
    //返回的是枢轴的位置
    return low
}

fun main(args: Array<String>) {
    // kotlin的特性，获取新的list
    val list = listOf<Int>(3,4,5,-2,-1,0)
    var list2 = list.filter { it > 0 }
    println(list2) // [3,4,5]
}