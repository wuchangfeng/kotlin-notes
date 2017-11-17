package kotlin_know

// 闭包

fun justCount():() -> Unit{
    var count = 0
    return {
        println(count++)
    }
}

fun main(args: Array<String>) {

    fun f1(){
        var n = 999
    }
    //println(n) // 报错!!! n是函数内局部变量，外部无法调用

//    那么，如何在外部调取局部的变量呢？答案就是——闭包。
//    这里，我们给闭包下一个定义：闭包就是能够读取其他函数内部变量的函数。

    val list = listOf<Int>(1,2,3,4,-2,-3)
    var sum = 0
    list.filter { it > 0 }.forEach {
        sum += it
    }
    println(sum)

//    闭包可以用在许多地方。它的最大用处有两个，一个是前面提到的
//    可以读取函数内部的变量，另一个就是让这些变量的值始终保持在内存中

    val count = justCount()
    count()  // 输出结果：0
    count()  // 输出结果：1
    count()  // 输出结果：2
}