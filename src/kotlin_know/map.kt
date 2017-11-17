package kotlin_know

fun main(args: Array<String>) {
    val map = mapOf("key" to 24,"name" to "zhangsan","age" to 25)
    val list = listOf<Int>(1,2,3)

    println(list.map { it*2 }) // [2, 4, 6] 可见是对每一个元素的操作
    // 等同于 list.map{value -> value * 2}
}