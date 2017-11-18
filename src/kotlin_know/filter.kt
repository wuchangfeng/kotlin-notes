package kotlin_know

//filter过滤操作符
fun main(args: Array<String>) {
    val items = listOf(1, 2, 3, 4)
    items.first() == 1
    items.last() == 4
    items.filter { it % 2 == 0 }   // 返回 [2, 4]
}