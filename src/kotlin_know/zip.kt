package kotlin_know

fun main(args: Array<String>) {
    val list1 = listOf<Int>(1,2,3)
    val list2 = listOf<Int>(3,4,5)
    // 将给定的集合按照条件分成两个
    println(list1.partition { it % 2 == 0 })
    // 两个集合组合
    println(list1.plus(list2))
    // 返回由 pair 组成的List，每个 pair 由两个集合中相同index的元素组成。这个返回的List的大小由最小的那个集合决定。
    println(list1.zip(list2))
    // unzip
    println(listOf(Pair(1, 2), Pair(3, 4)).unzip())//([1, 3], [2, 4])
}