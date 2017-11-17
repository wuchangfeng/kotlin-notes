package kotlin_know

class TestClass

fun isOdd(x: Int) = x % 2 != 0

fun main(args: Array<String>) {
    // 类引用
    val c = TestClass::class
    println(c) // class kotlin_know.TestClass

    // 函数引用
    val numbers = listOf(1,2,3)
    println(numbers.filter(::isOdd))

    // 属性引用
    val y = 1
    //println(::y.get())
    //println(::y.name)
}