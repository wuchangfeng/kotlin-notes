package kotlin_know

/**
 * 在apply中，用this代表当前引用对象，并且调用其方法时，this可省略。
 * apply必有返回值，且返回值是当前引用对象
 */
fun main(args: Array<String>) {
    // mutableList 可以改变的list
    val list: MutableList<String> = mutableListOf("A","B","C")
    val change1: MutableList<String>
    change1 = list.apply {
        add("D")
        add("E")
        this.add("F")
        size
    }
    println("list = $list")
    println("change1 = $change1")
}

/**
list = [A, B, C, D, E, F]
change1 = [A, B, C, D, E, F]
 */