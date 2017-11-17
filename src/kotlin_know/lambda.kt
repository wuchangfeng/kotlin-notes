package kotlin_know

fun main(args: Array<String>) {
    val lambda = {
        left: Int,right: Int
                ->
        left + right
    }
    println(lambda(2,3))
    println(lambda.invoke(2,3))

    val b: String? = null
    println(b?.length)

    val list = listOf(1,2,3,4,5,6)
    val listRepate = listOf(2,2,3,4,5,6)

    // any 如果至少有一个元素符合给出的判断条件，则返回true。
    println(list.any { it % 2 == 0 })

    // all 如果全部的元素符合给出的判断条件，则返回true。
    println(list.all { it < 10 })

    // foreach
    list.forEach {
        print(it)
    }

    // reduce
    println(
            list.reduce { total, next -> total + next }
    )

    // take 返回第一个到第n个元素
    println(list.take(2))

    // takewhile操作
    println(list.takeWhile { it < 3 })

    // flatMap 遍历所有的元素，为每一个创建一个集合，最后把所有的集合放在一个集合中。
    // [1,2,3,4,5,6] 产生
    // [1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7]
    println(list.flatMap { listOf(it,it + 1) })

}