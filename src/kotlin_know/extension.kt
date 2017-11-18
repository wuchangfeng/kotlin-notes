package kotlin_know

// 扩展函数 Int本身没有triple这个函数
// 可以简单的理解扩展类似于装饰者模式
// 反编译该代码，发现只是在Int类中添加了一个静态方法triple()
fun Int.triple(): Int{
    return this * 3
}

fun main(args: Array<String>) {
    var result = 3.triple()
    println(result)
}