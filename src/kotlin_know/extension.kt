package kotlin_know

// 扩展函数 Int本身没有triple这个函数
fun Int.triple(): Int{
    return this * 3
}

fun main(args: Array<String>) {
    var result = 3.triple()
    println(result)
}