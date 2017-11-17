package kotlin_know

//flatmap用法 通过遍历每个元素创建一个新集合，最后，把所有集合整合到包含所有元素的唯一列表中。
fun main(args: Array<String>) {
    val list = listOf<Int>(1,2,3,4,5,6)
    println(list.flatMap { listOf(it, it + 1) })
}

//[1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7]