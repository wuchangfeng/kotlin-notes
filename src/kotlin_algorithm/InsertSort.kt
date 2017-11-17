package kotlin_algorithm

//1:从第一个元素开始，该元素可以认为已经被排序
//2:取出下一个元素，在已经排序的元素序列中从后向前扫描
//3:如果该元素（已排序）大于新元素，将该元素移到下一位置
//4:重复步骤 3，直到找到已排序的元素小于或者等于新元素的位置
//5:将新元素插入到该位置后
//6:重复步骤 2~5

fun <T:Comparable<T>> insertionsort(items:MutableList<T>):List<T>{
    if (items.isEmpty()){
        return items
    }
    for (count in 1..items.count() - 1){
        val item = items[count]
        var i = count
        while (i>0 && item < items[i - 1]){
            items[i] = items[i - 1]
            i -= 1
        }
        items[i] = item
    }
    return items
}


fun main(args: Array<String>) {
    val names = mutableListOf("John", "Tim", "Zack", "Daniel", "Adam")
    println(names)
    var ordered = insertionsort(names)
    println(ordered)
}