package kotlin_know

//嵌套类
class Outer2{
    private val bar: Int = 1
    class Nested{
        fun foo() = 2
    }
}

fun main(args: Array<String>) {
    // 外部类可以轻易的访问嵌套类的内容
    val demo = Outer2.Nested().foo()
    println(demo)
}